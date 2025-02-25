import pandas as pd
import requests
import json

VESPA_BASE_URL = "http://localhost:8080"
DOCUMENT_ENDPOINT = f"{VESPA_BASE_URL}/document/v1/default/sciencecourse/docid"

def feed_document(doc_id, document, update=False):
    update_str = "true" if update else "false"
    url = f"{DOCUMENT_ENDPOINT}/{doc_id}?update={update_str}"
    headers = {"Content-Type": "application/json"}
    payload = {"fields": document}
    response = requests.put(url, headers=headers, json=payload)
    if response.status_code not in (200, 201):
        print(f"Failed to feed document {doc_id}: {response.text}")
    else:
        print(f"Document {doc_id} fed successfully.")

def delete_document(doc_id):
    url = f"{DOCUMENT_ENDPOINT}/{doc_id}"
    response = requests.delete(url)
    if response.status_code != 200:
        print(f"Failed to delete document {doc_id}: {response.text}")
    else:
        print(f"Document {doc_id} deleted successfully.")

def search(query_payload):
    search_url = f"{VESPA_BASE_URL}/search/"
    response = requests.post(search_url, json=query_payload)
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Search failed: {response.text}")
        return None

def main():
    df = pd.read_csv("/data/science/courses.csv")
    for _, row in df.iterrows():
        course_name = str(row["courseName"])
        course_description = [float(x) for x in str(row["courseDescription"]).split()]
        credit_hours = int(row["creditHours"])
        document = {"courseName": course_name, "courseDescription": course_description, "creditHours": credit_hours}
        feed_document(course_name, document, update=False)
    
    update_df = pd.read_csv("/data/science/courses_update.csv")
    for _, row in update_df.iterrows():
        course_name = str(row["courseName"])
        if "CS" in course_name:
            new_course_description = [float(x) for x in str(row["courseDescription"]).split()]
            update_payload = {"courseDescription": {"assign": new_course_description}}
            feed_document(course_name, update_payload, update=True)
    
    delete_query = {"yql": "select * from sources sciencecourse where creditHours > 5;", "hits": 100}
    delete_results = search(delete_query)
    if delete_results and "root" in delete_results and "children" in delete_results["root"]:
        for hit in delete_results["root"]["children"]:
            full_id = hit.get("id", "")
            doc_id = full_id.split("::")[-1] if "::" in full_id else full_id
            delete_document(doc_id)
    
    query_vector = [0.01] * 768
    vector_search_payload = {
        "yql": "select * from sources sciencecourse where ([{targetNumHits:10}]nearestNeighbor(courseDescription, queryVector)) and creditHours >= 3;",
        "ranking": {"features": {"query(queryVector)": query_vector}},
        "hits": 10,
        "summary": "short"
    }
    vector_results = search(vector_search_payload)
    print("Vector Search Results:")
    print(json.dumps(vector_results, indent=2))
    
    non_vector_payload = {"yql": 'select * from sources sciencecourse where startswith(courseName, "CS");', "hits": 5, "summary": "short"}
    non_vector_results = search(non_vector_payload)
    print("Non-vector Search Results:")
    print(json.dumps(non_vector_results, indent=2))
    
    print("Note: In Vespa, operations such as reloading the collection, dropping a field, or dropping a collection require modifying and redeploying the application package.")

if __name__ == "__main__":
    main()
