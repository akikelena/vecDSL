import pandas as pd
import requests
import json

MYSCALE_BASE_URL = "http://localhost:8080"
CREATE_COLLECTION_ENDPOINT = f"{MYSCALE_BASE_URL}/v1/collections"
COLLECTION_NAME = "ScienceCourses"

def create_collection():
    schema = {
        "name": COLLECTION_NAME,
        "schema": {
            "courseName": {"type": "string", "primary": True, "max_length": 255},
            "courseDescription": {"type": "float_vector", "dim": 768, "index": {"type": "HNSW", "metric": "cosine"}},
            "creditHours": {"type": "int"}
        }
    }
    response = requests.post(CREATE_COLLECTION_ENDPOINT, json=schema)
    if response.status_code in (200, 201):
        print("Collection created successfully.")
    else:
        print(f"Failed to create collection: {response.status_code}, {response.text}")

def insert_document(document):
    url = f"{MYSCALE_BASE_URL}/v1/collections/{COLLECTION_NAME}/documents"
    response = requests.post(url, json=document)
    if response.status_code in (200, 201):
        print(f"Inserted document with courseName: {document.get('courseName')}")
    else:
        print(f"Failed to insert document {document.get('courseName')}: {response.status_code} {response.text}")

def update_document(course_name, update_fields):
    url = f"{MYSCALE_BASE_URL}/v1/collections/{COLLECTION_NAME}/documents/{course_name}"
    response = requests.patch(url, json=update_fields)
    if response.status_code == 200:
        print(f"Updated document with courseName: {course_name}")
    else:
        print(f"Failed to update document {course_name}: {response.status_code} {response.text}")

def delete_document(course_name):
    url = f"{MYSCALE_BASE_URL}/v1/collections/{COLLECTION_NAME}/documents/{course_name}"
    response = requests.delete(url)
    if response.status_code == 200:
        print(f"Deleted document with courseName: {course_name}")
    else:
        print(f"Failed to delete document {course_name}: {response.status_code} {response.text}")

def search_documents(query_payload):
    url = f"{MYSCALE_BASE_URL}/v1/collections/{COLLECTION_NAME}/query"
    response = requests.post(url, json=query_payload)
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Search failed: {response.status_code} {response.text}")
        return None

def main():
    create_collection()
    
    df = pd.read_csv("/data/science/courses.csv")
    for _, row in df.iterrows():
        course_name = str(row["courseName"])
        course_description = [float(x) for x in str(row["courseDescription"]).split()]
        credit_hours = int(row["creditHours"])
        document = {"courseName": course_name, "courseDescription": course_description, "creditHours": credit_hours}
        insert_document(document)
    
    update_df = pd.read_csv("/data/science/courses_update.csv")
    for _, row in update_df.iterrows():
        course_name = str(row["courseName"])
        if "CS" in course_name:
            new_course_description = [float(x) for x in str(row["courseDescription"]).split()]
            update_document(course_name, {"courseDescription": new_course_description})
    
    delete_query = {"filter": {"creditHours": {"$gt": 5}}, "limit": 100}
    results = search_documents(delete_query)
    if results and "results" in results:
        for doc in results["results"]:
            doc_key = doc.get("courseName")
            delete_document(doc_key)
    
    query_vector = [0.01] * 768
    vector_search_payload = {
        "vector": {"field": "courseDescription", "query": query_vector, "k": 10, "metric": "cosine"},
        "filter": {"creditHours": {"$gte": 3}},
        "fields": ["courseName", "courseDescription"]
    }
    vector_results = search_documents(vector_search_payload)
    print("Vector Search Results:")
    print(json.dumps(vector_results, indent=2))
    
    non_vector_payload = {"filter": {"courseName": {"$like": "CS%"}}, "limit": 5, "fields": ["courseName", "courseDescription"]}
    non_vector_results = search_documents(non_vector_payload)
    print("Non-vector Search Results:")
    print(json.dumps(non_vector_results, indent=2))
    
    print("Note: In MyScale, operations such as reloading a collection or modifying its schema typically require administrative actions or a new deployment of the collection configuration.")

if __name__ == "__main__":
    main()
