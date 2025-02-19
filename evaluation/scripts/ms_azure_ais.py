import pandas as pd
from azure.core.credentials import AzureKeyCredential
from azure.search.documents import SearchClient, SearchIndexClient
from azure.search.documents.indexes.models import (
    SearchIndex,
    SimpleField,
    SearchFieldDataType,
    SearchableField,
    VectorSearch,
    VectorSearchAlgorithmConfiguration,
    VectorSearchAlgorithmConfigurationType
)

endpoint = "https://<your-search-service>.search.windows.net"
admin_key = "<your-admin-key>"
index_name = "sciencecourses"

index_client = SearchIndexClient(endpoint, AzureKeyCredential(admin_key))

try:
    index_client.delete_index(index_name)
except Exception:
    pass

fields = [
    SimpleField(name="courseId", type=SearchFieldDataType.String, key=True, filterable=True),
    SearchableField(name="courseName", type=SearchFieldDataType.String),
    # courseDescription will hold the vector (Collection(Edm.Single))
    SimpleField(name="courseDescription", type="Collection(Edm.Single)", filterable=False, searchable=False),
    SimpleField(name="creditHours", type=SearchFieldDataType.Int32, filterable=True)
]

vector_config = VectorSearch(
    algorithm_configurations=[
        VectorSearchAlgorithmConfiguration(
            name="default",
            algorithm_config_type=VectorSearchAlgorithmConfigurationType.HNSW,
            parameters={"efSearch": 64}
        )
    ]
)

index = SearchIndex(name=index_name, fields=fields, vector_search=vector_config)
index_client.create_index(index)

search_client = SearchClient(endpoint, index_name, AzureKeyCredential(admin_key))

df = pd.read_csv("/data/science/courses.csv")
docs = []
for _, row in df.iterrows():
    vector = [float(x) for x in row["courseDescription"].split()]
    docs.append({
        "courseId": str(row["courseId"]),
        "courseName": row["courseName"],
        "courseDescription": vector,
        "creditHours": int(row["creditHours"])
    })
result = search_client.upload_documents(documents=docs)
print("Documents uploaded:", result)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        doc = {
            "courseId": str(row["courseId"]),
            "courseDescription": new_vector
        }
        search_client.merge_or_upload_documents(documents=[doc])

results = search_client.search(search_text="*", filter="creditHours gt 5", select=["courseId"])
keys_to_delete = [doc["courseId"] for doc in results]
if keys_to_delete:
    delete_docs = [{"courseId": key} for key in keys_to_delete]
    search_client.delete_documents(delete_docs)
    
query_vector = [0.01] * 768
results = search_client.search(
    search_text="",
    vectors={"courseDescription": {"value": query_vector, "k": 10}},
    filter="creditHours ge 3",
    select=["courseName", "courseDescription"]
)
print("Azure AI Search Vector Results:")
for res in results:
    print(res)

results = search_client.search(
    search_text="courseId:CS*",
    select=["courseId", "courseName"],
    top=5
)
print("Azure AI Search Non-Vector Query Results:")
for res in results:
    print(res)

results = search_client.search(search_text="*", filter="creditHours gt 5", select=["courseId"])
keys_to_delete = [doc["courseId"] for doc in results]
if keys_to_delete:
    delete_docs = [{"courseId": key} for key in keys_to_delete]
    search_client.delete_documents(delete_docs)

all_docs = search_client.search(search_text="*", select=["courseId", "courseName", "courseDescription"])
for doc in all_docs:
    if "creditHours" in doc:
        doc.pop("creditHours")
        search_client.merge_or_upload_documents(documents=[doc])

index_client.delete_index(index_name)
