import pandas as pd
from pymilvus import connections, utility, Collection, CollectionSchema, FieldSchema, DataType

connections.connect(host="localhost", port="8081")

schema = CollectionSchema([
    FieldSchema(name="courseId", dtype=DataType.INT64, is_primary=True),
    FieldSchema(name="courseName", dtype=DataType.VARCHAR, max_length=255),
    FieldSchema(name="courseDescription", dtype=DataType.FLOAT_VECTOR, dim=768),
    FieldSchema(name="creditHours", dtype=DataType.INT64)
])

collection = Collection("ScienceCourses", schema)
collection.create_index("courseDescription", {"index_type": "HNSW", "metric_type": "COSINE"})

df = pd.read_csv("/data/science/courses.csv")
data = [
    df["courseId"].tolist(),
    df["courseName"].tolist(),
    df["courseDescription"].apply(lambda x: [float(i) for i in x.split()]).tolist(),
    df["creditHours"].tolist()
]
collection.insert(data)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        collection.update(expr=f"courseId == {row['courseId']}", data={"courseDescription": [float(i) for i in row["courseDescription"].split()]})

collection.delete("creditHours > 5")

search_params = {"metric_type": "COSINE", "params": {"ef": 64}}
results = collection.search([[0.01] * 768], "courseDescription", search_params, limit=10, output_fields=["courseName", "courseDescription"], expr="creditHours >= 3")

non_vector_results = collection.query(expr="courseId LIKE 'CS%'", output_fields=["courseId", "courseName"], limit=5)

collection.load()
collection.delete("creditHours > 5")
collection.drop_field("creditHours")

utility.drop_collection("ScienceCourses")
