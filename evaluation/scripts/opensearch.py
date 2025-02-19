from opensearchpy import OpenSearch, helpers
import pandas as pd

client = OpenSearch(hosts=[{'host': 'localhost', 'port': 9200}])
index_name = "sciencecourses"

if client.indices.exists(index=index_name):
    client.indices.delete(index=index_name)

mapping = {
    "settings": {
        "index": {
            "knn": True,
            "knn.algo_param.ef_search": 64  
        }
    },
    "mappings": {
        "properties": {
            "courseId": {"type": "keyword"},
            "courseName": {"type": "text"},
            "courseDescription": {
                "type": "knn_vector",
                "dimension": 768,
                "method": {
                    "name": "hnsw",
                    "space_type": "cosinesimil",
                    "engine": "nmslib",
                    "parameters": {
                        "ef_search": 64,
                        "m": 16
                    }
                }
            },
            "creditHours": {"type": "integer"}
        }
    }
}

client.indices.create(index=index_name, body=mapping)

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
helpers.bulk(client, actions)

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        client.update(
            index=index_name,
            id=str(row["courseId"]),
            body={"doc": {"courseDescription": new_vector}}
        )

client.delete_by_query(
    index=index_name,
    body={
        "query": {
            "range": {
                "creditHours": {"gt": 5}
            }
        }
    }
)

query_vector = [0.01] * 768
response = client.search(
    index=index_name,
    body={
        "size": 10,
        "query": {
            "bool": {
                "must": {
                    "knn": {
                        "courseDescription": {
                            "vector": query_vector,
                            "k": 10
                        }
                    }
                },
                "filter": {
                    "range": {"creditHours": {"gte": 3}}
                }
            }
        },
        "_source": ["courseName", "courseDescription"]
    }
)
print("OpenSearch Vector Search Results:", response["hits"]["hits"])

response = client.search(
    index=index_name,
    body={
        "size": 5,
        "query": {
            "wildcard": {"courseId": "CS*"}
        },
        "_source": ["courseId", "courseName"]
    }
)
print("OpenSearch Non-Vector Query Results:", response["hits"]["hits"])

client.delete_by_query(
    index=index_name,
    body={
        "query": {
            "range": {"creditHours": {"gt": 5}}
        }
    }
)

docs = client.search(index=index_name, body={"query": {"match_all": {}}}, size=1000)
for doc in docs["hits"]["hits"]:
    _id = doc["_id"]
    source = doc["_source"]
    if "creditHours" in source:
        del source["creditHours"]
        client.index(index=index_name, id=_id, body=source)

client.indices.delete(index=index_name)