import pandas as pd
import pyodbc

conn = pyodbc.connect("DSN=ActianVectorDSN;UID=user;PWD=password")
cursor = conn.cursor()

cursor.execute("""
CREATE TABLE ScienceCourses (
    courseId BIGINT PRIMARY KEY,
    courseName VARCHAR(255),
    courseDescription FLOAT ARRAY,  -- Use ARRAY type for vectors (adjust syntax as needed)
    creditHours BIGINT
)
""")
conn.commit()

cursor.execute("""
CREATE INDEX idx_courseDescription 
ON ScienceCourses 
USING HNSW (courseDescription) 
WITH (metric = 'COSINE')
""")
conn.commit()

df = pd.read_csv("/data/science/courses.csv")
for _, row in df.iterrows():
    vector = [float(x) for x in row["courseDescription"].split()]
    vector_literal = "ARRAY[" + ",".join(map(str, vector)) + "]"
    cursor.execute("""
        INSERT INTO ScienceCourses (courseId, courseName, courseDescription, creditHours)
        VALUES (?, ?, {0}, ?)
    """.format(vector_literal), row["courseId"], row["courseName"], row["creditHours"])
conn.commit()

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        vector_literal = "ARRAY[" + ",".join(map(str, new_vector)) + "]"
        cursor.execute("""
            UPDATE ScienceCourses 
            SET courseDescription = {0} 
            WHERE courseId = ?
        """.format(vector_literal), row["courseId"])
conn.commit()

cursor.execute("DELETE FROM ScienceCourses WHERE creditHours > 5")
conn.commit()

query_vector_literal = "ARRAY[" + ",".join(["0.01"] * 768) + "]"
cursor.execute(f"""
SELECT courseName, courseDescription
FROM ScienceCourses
WHERE creditHours >= 3
ORDER BY VECTOR_COSINE_SIMILARITY(courseDescription, {query_vector_literal}) DESC
FETCH FIRST 10 ROWS ONLY
""")
results = cursor.fetchall()
print("Actian Vector Search Results:", results)


cursor.execute("""
SELECT courseId, courseName 
FROM ScienceCourses 
WHERE CAST(courseId AS VARCHAR) LIKE 'CS%' 
FETCH FIRST 5 ROWS ONLY
""")
non_vector_results = cursor.fetchall()
print("Actian Vector Non-Vector Query Results:", non_vector_results)

cursor.execute("DELETE FROM ScienceCourses WHERE creditHours > 5")
conn.commit()
cursor.execute("ALTER TABLE ScienceCourses DROP COLUMN creditHours")
conn.commit()
cursor.execute("DROP TABLE ScienceCourses")
conn.commit()

cursor.close()
conn.close()