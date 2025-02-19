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

# Set up your Azure Cognitive Search service details
endpoint = "https://<your-search-service>.search.windows.net"
admin_key = "<your-admin-key>"
index_name = "sciencecourses"

index_client = SearchIndexClient(endpoint, AzureKeyCredential(admin_key))

# Delete the index if it exists
try:
    index_client.delete_index(index_name)
except Exception:
    pass

# Define the index schema
fields = [
    SimpleField(name="courseId", type=SearchFieldDataType.String, key=True, filterable=True),
    SearchableField(name="courseName", type=SearchFieldDataType.String),
    # courseDescription will hold the vector (Collection(Edm.Single))
    SimpleField(name="courseDescription", type="Collection(Edm.Single)", filterable=False, searchable=False),
    SimpleField(name="creditHours", type=SearchFieldDataType.Int32, filterable=True)
]

# Configure vector search (preview feature)
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

# Create a SearchClient for document operations
search_client = SearchClient(endpoint, index_name, AzureKeyCredential(admin_key))

# --- Insert documents from CSV ---
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

# --- Update: For documents where courseId contains "CS", update courseDescription ---
update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        doc = {
            "courseId": str(row["courseId"]),
            "courseDescription": new_vector
        }
        search_client.merge_or_upload_documents(documents=[doc])

# --- Delete: Remove documents where creditHours > 5 ---
# Azure Search does not support delete-by-query natively, so first query the keys and then delete.
results = search_client.search(search_text="*", filter="creditHours gt 5", select=["courseId"])
keys_to_delete = [doc["courseId"] for doc in results]
if keys_to_delete:
    delete_docs = [{"courseId": key} for key in keys_to_delete]
    search_client.delete_documents(delete_docs)
    
# --- Vector search ---
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

# --- Non-vector query: documents where courseId starts with 'CS' ---
results = search_client.search(
    search_text="courseId:CS*",
    select=["courseId", "courseName"],
    top=5
)
print("Azure AI Search Non-Vector Query Results:")
for res in results:
    print(res)

# --- Delete again documents where creditHours > 5 (if any remain) ---
results = search_client.search(search_text="*", filter="creditHours gt 5", select=["courseId"])
keys_to_delete = [doc["courseId"] for doc in results]
if keys_to_delete:
    delete_docs = [{"courseId": key} for key in keys_to_delete]
    search_client.delete_documents(delete_docs)

# --- Simulate dropping the "creditHours" field by re-uploading documents without it ---
all_docs = search_client.search(search_text="*", select=["courseId", "courseName", "courseDescription"])
for doc in all_docs:
    if "creditHours" in doc:
        doc.pop("creditHours")
        search_client.merge_or_upload_documents(documents=[doc])

# --- Finally, delete the index ---
index_client.delete_index(index_name)
