# Generated Python code based on the script models from files in: scriptModels\version_02

import pandas as pd
from pymilvus import connections,FieldSchema,CollectionSchema,Collection,DataType
from sentence_transformers import SentenceTransformer

connections.connect(
    host="localhost",
    port="8081")

embedding_model=SentenceTransformer("BAAI/bge-m3")

course_id_field=FieldSchema(
    name="courseId",
    dtype=DataType.INT64,
    is_primary=True,
    description="Uniquecourseidentifier")

course_name_field=FieldSchema(
    name="courseName",
    dtype=DataType.VARCHAR,
    max_length=255)
 
course_desc_field=FieldSchema(
    name="courseDescription",
    dtype=DataType.FLOAT_VECTOR,
    dim=768)
 
credit_hours_field=FieldSchema(
    name="creditHours",
    dtype=DataType.INT64)
 
schema=CollectionSchema(
    fields=[course_id_field,course_name_field,course_desc_field,credit_hours_field])
 
collection=Collection(
    name="ScienceCourses",
    schema=schema)
 
collection.create_partition("UndergradPartition")
 
index_params={
    "index_type":"HNSW",
    "metric_type":"COSINE",
    "params":{"M":16,"efConstruction":200}}
 
collection.create_index(
    field_name="courseDescription",
    index_params=index_params)
 
df=pd.read_csv(
    "/data/science/courses.csv",
    nrows=1000)

embeddings=embedding_model.encode(df["courseDescription"].tolist())

df["courseDescription"]=list(embeddings)

data_to_insert=[
    df["courseId"].tolist(),
    df["courseName"].tolist(),
    df["courseDescription"].tolist(),
    df["creditHours"].tolist()]

collection.insert(data_to_insert)

collection.flush()