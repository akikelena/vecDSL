import pandas as pd
import numpy as np
import deeplake

ds = deeplake.empty("ScienceCourses", overwrite=True)
ds.create_tensor("courseId", htype="label", dtype="int64")
ds.create_tensor("courseName", htype="text", dtype="str")
ds.create_tensor("courseDescription", htype="embedding", dtype="float32", shape=(768,))
ds.create_tensor("creditHours", htype="annotation", dtype="int64")

df = pd.read_csv("/data/science/courses.csv")
for _, row in df.iterrows():
    vector = np.array([float(x) for x in row["courseDescription"].split()], dtype=np.float32)
    ds.append({
        "courseId": row["courseId"],
        "courseName": row["courseName"],
        "courseDescription": vector,
        "creditHours": row["creditHours"]
    })

ds.create_index("courseDescription", index_type="hnsw", metric="cosine")

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = np.array([float(x) for x in row["courseDescription"].split()], dtype=np.float32)
        # Identify the record(s) matching this courseId
        indices = ds.query(filter_expr=f"courseId == {row['courseId']}")
        for idx in indices:
            ds[idx]["courseDescription"] = new_vector


ds.delete(filter_expr="creditHours > 5")

search_results = ds.search(
    vector=[0.01] * 768,
    tensor_field="courseDescription",
    top_k=10,
    filter_expr="creditHours >= 3",
    output_fields=["courseName", "courseDescription"],
    search_params={"metric": "cosine", "ef": 64}
)
print("Deeplake Vector Search Results:", search_results)

non_vector_results = ds.query(
    filter_expr="CAST(courseId, 'string') LIKE 'CS%'",
    output_fields=["courseId", "courseName"],
    limit=5
)
print("Deeplake Non-Vector Query Results:", non_vector_results)

ds.load()

ds.delete(filter_expr="creditHours > 5")
ds.drop_tensor("creditHours")
ds.delete_dataset()
