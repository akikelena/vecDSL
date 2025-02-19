import pinecone
import pandas as pd

pinecone.init(api_key="YOUR_API_KEY", environment="YOUR_ENVIRONMENT")
pinecone.create_index("sciencecourses", dimension=768, metric="cosine")

index = pinecone.Index("sciencecourses")
df = pd.read_csv("/data/science/courses.csv")
vectors = [(str(row["courseId"]), [float(i) for i in row["courseDescription"].split()], {"courseName": row["courseName"], "creditHours": row["creditHours"]}) for _, row in df.iterrows()]
index.upsert(vectors=vectors)

update_df = pd.read_csv("/data/science/courses_update.csv")
update_vectors = [(str(row["courseId"]), [float(i) for i in row["courseDescription"].split()], {"courseName": row["courseName"]}) for _, row in update_df.iterrows() if "CS" in str(row["courseId"])]
index.upsert(vectors=update_vectors)

index.delete(filter={"creditHours": {"$gt": 5}})

query_vector = [0.01] * 768
results = index.query(query_vector, top_k=10, include_metadata=True, filter={"creditHours": {"$gte": 3}})

non_vector_results = index.query([], top_k=5, include_metadata=True, filter={"courseId": {"$regex": "CS.*"}})

pinecone.delete_index("sciencecourses")

index.delete(delete_all=True)
