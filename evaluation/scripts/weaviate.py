import weaviate
import pandas as pd

client = weaviate.Client("http://localhost:8081")
client.schema.create({
    "classes": [{
        "class": "ScienceCourses",
        "vectorIndexType": "HNSW",
        "vectorizer": "none",
        "properties": [
            {"name": "courseId", "dataType": ["int"], "indexInverted": True},
            {"name": "courseName", "dataType": ["string"], "indexInverted": True},
            {"name": "courseDescription", "dataType": ["number"], "vector": True},
            {"name": "creditHours", "dataType": ["int"], "indexInverted": True}
        ]
    }]
})

df = pd.read_csv("/data/science/courses.csv")
for _, row in df.iterrows():
    client.data_object.create({"courseId": row["courseId"], "courseName": row["courseName"], "courseDescription": [float(i) for i in row["courseDescription"].split()], "creditHours": row["creditHours"]}, "ScienceCourses")

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        client.data_object.update({"courseDescription": [float(i) for i in row["courseDescription"].split()]}, "ScienceCourses", str(row["courseId"]))

client.data_object.delete(where={"path": ["creditHours"], "operator": "GreaterThan", "valueInt": 5}, class_name="ScienceCourses")

results = client.query.get("ScienceCourses", ["courseName", "courseDescription"]).with_near_vector({"vector": [0.01] * 768}).with_limit(10).do()

non_vector_results = client.query.get("ScienceCourses", ["courseId", "courseName"]).with_where({"path": ["courseId"], "operator": "Like", "valueText": "CS%"}).with_limit(5).do()

client.schema.delete_property("ScienceCourses", "creditHours")

client.schema.delete_class("ScienceCourses")
