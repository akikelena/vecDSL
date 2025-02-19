from qdrant_client import QdrantClient, models
import pandas as pd

client = QdrantClient("localhost", port=6333)
client.recreate_collection("ScienceCourses", vectors_config=models.VectorParams(size=768, distance=models.Distance.COSINE))

df = pd.read_csv("/data/science/courses.csv")
points = [{"id": row["courseId"], "vector": [float(i) for i in row["courseDescription"].split()], "payload": {"courseName": row["courseName"], "creditHours": row["creditHours"]}} for _, row in df.iterrows()]
client.upsert("ScienceCourses", points)

update_df = pd.read_csv("/data/science/courses_update.csv")
update_points = [{"id": row["courseId"], "vector": [float(i) for i in row["courseDescription"].split()], "payload": {"courseName": row["courseName"]}} for _, row in update_df.iterrows() if "CS" in str(row["courseId"])]
client.upsert("ScienceCourses", update_points)

client.delete("ScienceCourses", filter=models.Filter(must=[models.FieldCondition(key="creditHours", range=models.Range(gt=5))]))

results = client.search("ScienceCourses", query_vector=[0.01] * 768, limit=10, filter=models.Filter(must=[models.FieldCondition(key="creditHours", range=models.Range(gte=3))]))
client.update_collection(
    collection_name="ScienceCourses",
    optimizer_config=models.OptimizersConfigDiff(delete_payload_keys=["creditHours"])
)

non_vector_results = client.scroll("ScienceCourses", limit=5, filter=models.Filter(must=[models.FieldCondition(key="courseId", match=models.MatchValue(value="CS%"))]))

client.delete_collection("ScienceCourses")