import pandas as pd
from vald import Client 

vald_client = Client(host="localhost", port=8081)
collection_name = "ScienceCourses"

vald_client.create_index(
    collection=collection_name,
    field="courseDescription",
    index_type="HNSW",
    metric_type="COSINE"
)


df = pd.read_csv("/data/science/courses.csv")
for _, row in df.iterrows():
    doc_id = str(row["courseId"])
    vector = [float(x) for x in row["courseDescription"].split()]
    payload = {
        "courseName": row["courseName"],
        "creditHours": int(row["creditHours"]),
        "courseDescription": row["courseDescription"]
    }

    vald_client.upsert(collection=collection_name, id=doc_id, vector=vector, payload=payload)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        doc_id = str(row["courseId"])
        new_vector = [float(x) for x in row["courseDescription"].split()]
        existing = vald_client.get(collection=collection_name, id=doc_id)
        if existing:
            payload = existing.get("payload", {})
            payload["courseDescription"] = row["courseDescription"]
            vald_client.upsert(collection=collection_name, id=doc_id, vector=new_vector, payload=payload)

docs_to_delete = vald_client.query(collection=collection_name, filter={"creditHours": {"$gt": 5}})
for doc in docs_to_delete:
    vald_client.remove(collection=collection_name, id=doc["id"])

query_vector = [0.01] * 768
search_results = vald_client.search(
    collection=collection_name,
    query_vector=query_vector,
    topk=10,
    filter={"creditHours": {"$gte": 3}},
    return_fields=["courseName", "courseDescription"]
)
print("Vald Vector Search Results:")
print(search_results)

non_vector_results = vald_client.query(
    collection=collection_name,
    filter={"courseId": {"$regex": "^CS"}}
)
print("Vald Non-Vector Query Results:")
print(non_vector_results)

docs_to_delete = vald_client.query(collection=collection_name, filter={"creditHours": {"$gt": 5}})
for doc in docs_to_delete:
    vald_client.remove(collection=collection_name, id=doc["id"])

all_docs = vald_client.get_all(collection=collection_name)
for doc in all_docs:
    payload = doc.get("payload", {})
    if "creditHours" in payload:
        del payload["creditHours"]
        vald_client.upsert(collection=collection_name, id=doc["id"], vector=doc["vector"], payload=payload)

vald_client.drop_collection(collection=collection_name)
