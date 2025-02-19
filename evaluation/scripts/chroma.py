import chromadb
import pandas as pd

client = chromadb.Client()
collection = client.create_collection(name="ScienceCourses")

df = pd.read_csv("/data/science/courses.csv")

ids = df["courseId"].astype(str).tolist()
embeddings = [ [float(x) for x in row.split()] for row in df["courseDescription"].tolist() ]
metadatas = [
    {
        "courseId": str(row["courseId"]),
        "courseName": row["courseName"],
        "creditHours": int(row["creditHours"]),
        "courseDescription": row["courseDescription"]
    }
    for _, row in df.iterrows()
]

documents = [""] * len(ids)
collection.add(
    ids=ids,
    embeddings=embeddings,
    metadatas=metadatas,
    documents=documents
)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        doc_id = str(row["courseId"])
        new_embedding = [float(x) for x in row["courseDescription"].split()]
        existing = collection.get(ids=[doc_id])
        if existing["ids"]:
            current_metadata = existing["metadatas"][0]
            current_metadata["courseDescription"] = row["courseDescription"]
            collection.add(
                ids=[doc_id],
                embeddings=[new_embedding],
                metadatas=[current_metadata],
                documents=[existing["documents"][0]] if existing["documents"] else [""]
            )

collection.delete(where={"creditHours": {"$gt": 5}})

query_vector = [0.01] * 768
results = collection.query(
    query_embeddings=[query_vector],
    n_results=10,
    where={"creditHours": {"$gte": 3}},
    include=["metadatas", "distances"]
)
print("Chroma Vector Search Results:")
print(results)

non_vector_results = collection.get(
    where={"courseId": {"$regex": "^CS"}},
    limit=5,
    include=["metadatas"]
)
print("Chroma Non-Vector Query Results:")
print(non_vector_results)

collection.delete(where={"creditHours": {"$gt": 5}})

all_docs = collection.get()
updated_ids = []
updated_embeddings = []
updated_metadatas = []
updated_documents = []

for doc_id, emb, meta, doc in zip(
        all_docs["ids"],
        all_docs["embeddings"],
        all_docs["metadatas"],
        all_docs["documents"]
    ):
    if "creditHours" in meta:
        del meta["creditHours"]
    updated_ids.append(doc_id)
    updated_embeddings.append(emb)
    updated_metadatas.append(meta)
    updated_documents.append(doc)

collection.add(
    ids=updated_ids,
    embeddings=updated_embeddings,
    metadatas=updated_metadatas,
    documents=updated_documents
)

client.delete_collection("ScienceCourses")
