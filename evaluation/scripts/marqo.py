import pandas as pd
from marqo import Client 

mq = Client(url="http://localhost:8882")
index_name = "sciencecourses"

try:
    mq.index(index_name).delete()
except Exception:
    pass

mq.create_index(index_name)

df = pd.read_csv("/data/science/courses.csv")
docs = []
for _, row in df.iterrows():
    doc = {
        "courseId": str(row["courseId"]),
        "courseName": row["courseName"],
        "courseDescription": row["courseDescription"],  
        "creditHours": int(row["creditHours"])
    }
    docs.append(doc)
mq.index(index_name).add_documents(docs)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        doc = {
            "courseId": str(row["courseId"]),
            "courseDescription": row["courseDescription"]
        }
        mq.index(index_name).update_documents([doc])

search_res = mq.index(index_name).search(q="", filter_string="creditHours > 5")
ids_to_delete = [doc["_id"] for doc in search_res.get("hits", [])]
for doc_id in ids_to_delete:
    mq.index(index_name).delete_document(doc_id)

search_results = mq.index(index_name).search(
    q="",
    filter_string="creditHours >= 3",
    result_count=10,
    return_fields=["courseName", "courseDescription"]
)
print("Marqo Vector Search Results:")
print(search_results)

non_vector_results = mq.index(index_name).search(
    q="CS",
    filter_string="courseId:CS*",
    result_count=5,
    return_fields=["courseId", "courseName"]
)
print("Marqo Non-Vector Query Results:")
print(non_vector_results)

search_res = mq.index(index_name).search(q="", filter_string="creditHours > 5")
ids_to_delete = [doc["_id"] for doc in search_res.get("hits", [])]
for doc_id in ids_to_delete:
    mq.index(index_name).delete_document(doc_id)

all_docs = mq.index(index_name).get_all_documents()  
for doc in all_docs.get("hits", []):
    if "creditHours" in doc:
        del doc["creditHours"]
        mq.index(index_name).update_documents([doc])

mq.index(index_name).delete()
