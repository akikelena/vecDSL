import pandas as pd
import math
from cassandra.cluster import Cluster
from cassandra.query import SimpleStatement

cluster = Cluster(['127.0.0.1'])
session = cluster.connect()

session.execute("""
CREATE KEYSPACE IF NOT EXISTS science
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}
""")
session.set_keyspace("science")

session.execute("""
CREATE TABLE IF NOT EXISTS ScienceCourses (
    courseId text PRIMARY KEY,
    courseName text,
    courseDescription list<double>,
    creditHours int
)
""")

df = pd.read_csv("/data/science/courses.csv")
for _, row in df.iterrows():
    vector = [float(x) for x in row["courseDescription"].split()]
    session.execute("""
    INSERT INTO ScienceCourses (courseId, courseName, courseDescription, creditHours)
    VALUES (%s, %s, %s, %s)
    """, (str(row["courseId"]), row["courseName"], vector, int(row["creditHours"])))

update_df = pd.read_csv("/data/science/courses_update.csv")
for _, row in update_df.iterrows():
    if "CS" in str(row["courseId"]):
        new_vector = [float(x) for x in row["courseDescription"].split()]
        session.execute("""
        UPDATE ScienceCourses SET courseDescription = %s WHERE courseId = %s
        """, (new_vector, str(row["courseId"])))

select_stmt = SimpleStatement("SELECT courseId FROM ScienceCourses WHERE creditHours > 5 ALLOW FILTERING")
rows = session.execute(select_stmt)
for row in rows:
    session.execute("DELETE FROM ScienceCourses WHERE courseId = %s", (row.courseId,))

def cosine_similarity(vec1, vec2):
    dot = sum(a*b for a, b in zip(vec1, vec2))
    norm1 = math.sqrt(sum(a*a for a in vec1))
    norm2 = math.sqrt(sum(a*a for a in vec2))
    return dot / (norm1 * norm2) if norm1 and norm2 else 0

query_vector = [0.01] * 768
select_stmt = SimpleStatement("SELECT courseName, courseDescription FROM ScienceCourses WHERE creditHours >= 3 ALLOW FILTERING")
rows = session.execute(select_stmt)
results = []
for row in rows:
    score = cosine_similarity(query_vector, row.courseDescription)
    results.append((row.courseName, row.courseDescription, score))
results.sort(key=lambda x: x[2], reverse=True)
print("Cassandra Vector Search Results (top 10):", results[:10])

select_stmt = SimpleStatement("SELECT courseId, courseName FROM ScienceCourses WHERE courseId >= 'CS' AND courseId < 'CT' ALLOW FILTERING")
rows = session.execute(select_stmt)
non_vector_results = [(row.courseId, row.courseName) for row in rows][:5]
print("Cassandra Non-Vector Query Results:", non_vector_results)

select_stmt = SimpleStatement("SELECT courseId FROM ScienceCourses WHERE creditHours > 5 ALLOW FILTERING")
rows = session.execute(select_stmt)
for row in rows:
    session.execute("DELETE FROM ScienceCourses WHERE courseId = %s", (row.courseId,))

session.execute("ALTER TABLE ScienceCourses DROP creditHours")

session.execute("DROP TABLE ScienceCourses")
cluster.shutdown()
