from elasticsearch import Elasticsearch, helpers
import pandas as pd

es = Elasticsearch("http://localhost:9200")
index_name = "sciencecourses"

# Delete the index if it exists
if es.indices.exists(index=index_name):
    es.indices.delete(index=index_name)

# Create the index with a mapping including a dense_vector field
mapping = {
    "mappings": {
        "properties": {
            "courseId": {"type": "keyword"},
            "courseName": {"type": "text"},
            "courseDescription": {
                "type": "dense_vector",
                "dims": 768,
                "index": True,
                "similarity": "cosine"
            },
            "creditHours": {"type": "integer"}
        }
    }
}
es.indices.create(index=index_name, body=mapping)

# --- Insert documents from CSV ---
df = pd.read_csv("/data/science/courses.csv")
actions = []
for _, row in df.iterrows():
    vector = [float(x) for x in row["courseDescription"].split()]
    doc = {
        "courseId": str(row["courseId"]),
        "courseName": row["courseName"],
        "courseDescription": vector,
        "creditHours": int(row["creditHours"])
    }
    actions.append({
        "_index": index_name,
        "_id": str(row["courseId"]),
        "_source": doc
    })
helpers.bulk(es, actions)

# --- Update: For documents where courseId contains "CS", update courseDescription ---
update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        es.update(
            index=index_name,
            id=str(row["courseId"]),
            body={"doc": {"courseDescription": new_vector}}
        )

# --- Delete: Remove documents where creditHours > 5 ---
es.delete_by_query(index=index_name, body={
    "query": {
        "range": {"creditHours": {"gt": 5}}
    }
})

# --- Vector search using a script_score query ---
query_vector = [0.01] * 768
response = es.search(index=index_name, body={
    "size": 10,
    "query": {
        "script_score": {
            "query": {"range": {"creditHours": {"gte": 3}}},
            "script": {
                "source": "cosineSimilarity(params.query_vector, 'courseDescription') + 1.0",
                "params": {"query_vector": query_vector}
            }
        }
    },
    "_source": ["courseName", "courseDescription"]
})
print("Elasticsearch Vector Search Results:", response["hits"]["hits"])

response = es.search(index=index_name, body={
    "size": 5,
    "query": {
        "wildcard": {"courseId": "CS*"}
    },
    "_source": ["courseId", "courseName"]
})
print("Elasticsearch Non-Vector Query Results:", response["hits"]["hits"])

es.delete_by_query(index=index_name, body={
    "query": {
        "range": {"creditHours": {"gt": 5}}
    }
})

docs = es.search(index=index_name, body={"query": {"match_all": {}}}, size=1000)["hits"]["hits"]
for doc in docs:
    source = doc["_source"]
    if "creditHours" in source:
        del source["creditHours"]
        es.index(index=index_name, id=doc["_id"], body=source)

es.indices.delete(index=index_name)