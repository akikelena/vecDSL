import pandas as pd
from transwarp_hippo import HippoClient, CollectionSchema, FieldSchema, DataType

client = HippoClient(host="localhost", port=9090)

schema = CollectionSchema([
    FieldSchema(name="courseId", dtype=DataType.INT64, is_primary=True),
    FieldSchema(name="courseName", dtype=DataType.STRING, max_length=255),
    FieldSchema(name="courseDescription", dtype=DataType.FLOAT_VECTOR, dim=768),
    FieldSchema(name="creditHours", dtype=DataType.INT64)
])

collection = client.create_collection("ScienceCourses", schema)

collection.create_index(field="courseDescription", index_type="HNSW", metric_type="COSINE")

df = pd.read_csv("/data/science/courses.csv")
data = {
    "courseId": df["courseId"].tolist(),
    "courseName": df["courseName"].tolist(),
    "courseDescription": df["courseDescription"].apply(lambda x: [float(i) for i in x.split()]).tolist(),
    "creditHours": df["creditHours"].tolist()
}
collection.insert(data)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(i) for i in row["courseDescription"].split()]
        collection.update(
            filter_expr=f"courseId == {row['courseId']}",
            update_fields={"courseDescription": new_vector}
        )

collection.delete(filter_expr="creditHours > 5")

search_params = {"metric_type": "COSINE", "params": {"ef": 64}}
results = collection.search(
    query_vectors=[[0.01] * 768],
    vector_field="courseDescription",
    search_params=search_params,
    limit=10,
    output_fields=["courseName", "courseDescription"],
    filter_expr="creditHours >= 3"
)
print("Transwarp Hippo Vector Search Results:")
print(results)

non_vector_results = collection.query(
    filter_expr="courseId LIKE 'CS%'",
    output_fields=["courseId", "courseName"],
    limit=5
)
print("Transwarp Hippo Non-Vector Query Results:")
print(non_vector_results)

collection.delete(filter_expr="creditHours > 5")
collection.drop_field("creditHours")
client.drop_collection("ScienceCourses")
