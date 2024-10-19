package org.xtext.example.domij.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import vecdslMM.Script
import vecdslMM.VectorDatabase


class MilvusGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		 for (eObject : resource.contents) {
            if (eObject instanceof Script) {
                generate(eObject as Script, fsa)
            }
        }
	}
	
	def generate(Script s, IFileSystemAccess2 fsa) {
        
        val pythonCode = 
        '''
        import csv
        import numpy as np
        from sentence_transformers import SentenceTransformer
        from pymilvus import utility, db, connections, FieldSchema, CollectionSchema, DataType, Collection, Partition, MilvusClient
                    
        # Vector database setup
        «vdbCode»
                    
        # Connection setup
        «connectionCode»
                    
        # Embedding model setup
        «embeddingModelCode»
        
        # Define cluster and collection creation logic
        «clustersCode»
        
        # Methods (Insert, Upsert, Delete, Filter, VectorSearch)
        «methodsCode»
        '''
        fsa.generateFile('milvus.py', pythonCode) 
    }
    def generateVdbCode(VectorDatabase vdb)'''
    db.create_database(db_name="«vdb.name»")
    print('Current vector databases in Milvus:', db.list_database())
    
    # Generate methods
        «FOR method : vdb.methods»
            «generateMethodCode(vdb, method)»
        «ENDFOR»
    '''
    
    def generateConnectionCode(Connection conn) '''
    # Connect to Milvus
    connections.connect(host="«conn.host»", port=«conn.port»)
    print('Connected to Milvus')
    '''

    def generateClusterCode(Cluster cluster) '''
    # Define collections and indices for cluster «cluster.name»
    «FOR collection : cluster.colections»
        «generateCollectionCode(collection)»
    «ENDFOR»
	'''

    //  #num_partitions=«collection.colection_limits.findFirst[limit | limit.type == EColectionLimit::NOFPARTITIONS].value»,
    // num_shards=«collection.colection_limits.findFirst[limit | limit.type == EColectionLimit::NOFSHARDS].value»
    def generateCollectionCode(Colection collection) '''
    # Drop collection if it exists
    if utility.has_collection("«collection.name»"):
    	utility.drop_collection("«collection.name»")
    		
    # Create collection «collection.name»
    fields = [
    	«collection.fields.map[generateFieldSchema].join(",\n")»
    ]
    schema = CollectionSchema(fields=fields)
    collection = Collection(name="«collection.name»", schema=schema)
    collection.load()
    print('Collection «collection.name» created')
    
    # Generate partition creation code
    «FOR partition : collection.partitions»
        generatePartitionCode(collection, partition)
    «ENDFOR»
    
    schema = MilvusClient.create_schema(
        auto_id=False,
        enable_dynamic_field=«collection.dynamic»
        
    )
'''
    
 
    def generatePartitionCode(Colection collection, Partition partition) '''
    # Create partition «partition.name»
    partition_key = "«partition.partition_key.name»"
    partition = Partition("«collection.name»", "«partition.name»", "«partition.description»")
    print('Partition «partition.name» created')
'''
     
   	def generateEmbeddingModelCode(VectorDatabase db) {
    val embeddingModels = newHashSet(db.clusters.flatMap[colections].flatMap[fields].filter[embModel !== null].map[embModel.source])
    if (embeddingModels.isEmpty) {
        return ""
    }
    return embeddingModels.map[name | "model = SentenceTransformer('all-MiniLM-L6-v2')"].join("\n")
}

    def generateFieldSchema(Field field) '''
    FieldSchema(
        name='«field.name»',
        dtype=DataType.«field.dataType.getName().toUpperCase»,
        is_primary=«field.isPrimary ? "True" : "False"»,
        is_partition_key=True, # Set default value for is_partition_key,
        «IF field.isPrimary»
        auto_id=True,
        «ENDIF»
        «IF field.field_limits.exists[type == EFieldLimit.MAXSIZE]»
        max_length=«field.field_limits.findFirst[type == EFieldLimit.MAXSIZE].value»,
        «ENDIF»
        «IF field.field_limits.exists[type == EFieldLimit.VECTORDIM]»
        dim=«field.field_limits.findFirst[type == EFieldLimit.VECTORDIM].value»
        «ENDIF»
    )
'''
	def String getConvertedDataType(EDataType dataType) {
    switch (dataType) {
        case EDataType::INT: 'INT64'
        default: dataType.getName().toUpperCase
    }
}
	

	def generateIndex(Index index) '''
    «IF index instanceof StdIndex»
        indexType = «index.type.getName()»
        Index(name="«index.name»", type=IndexType.valueOf(indexType))
    «ELSEIF index instanceof VectorIndex»
        indexType = «index.type.getName()»
        metricType = «index.metric.getName()»
        indexParams = newHashMap[String, String]
        «IF index.includeRawData»
            indexParams.put("includeRawData", "true")
        «ENDIF»
        «FOR limit : index.indexLimits»
            indexParams.put("«limit.type.getName()»", "«limit.value»")
        «ENDFOR»
        VectorIndex(
            name="«index.name»",
            type=IndexType.valueOf(indexType),
            metric=EMetricType.valueOf(metricType),
            index_params=indexParams
        )
    «ENDIF»
'''
    def generateMethodCode(VectorDatabase db, Method method) {
    if (!db.methods.contains(method)) {
        return ""
    }

    switch method {
        Insert: {
            generateInsertMethod(method as Insert)
        }
        Upsert: {
            generateUpsertMethod(method as Upsert)
        }
        Delete: {
            generateDeleteMethod(method as Delete)
        }
        Filter: {
            generateFilterMethod(method as Filter)
        }
        VectorSearch: {
            generateVectorSearchMethod(method as VectorSearch)
        }
    }
}


def generateInsertMethod(Insert insert) '''
# Insert data into collection "«insert.colection.name»"
def csv_load(file_path, encoding='utf-8'):
	try:
		with open(file_path, mode='r', encoding=encoding) as file:
    		csvReader = csv.reader(file)
        	rows = list(csvReader)
        return rows
    except Exception as e:
        print("Error reading CSV file:", e)
        return None
     
        
def embed_insert(data_batch, model):
# Embedding logic here
	embeddedData = data_batch.map[row |
  		[
         	row.get(0), #Original columns
            «FOR field : insert.colection.fields»
            	«IF field.dataType.getName() == 'BINARY_VECTOR' || field.dataType.getName() == 'FLOAT_VECTOR'»
            	model.encode(row.get(«insert.colection.fields.indexOf(field) + 1»)),
                        «ELSE»
            	row.get(«insert.colection.fields.indexOf(field) + 1»),
                        «ENDIF»
                    «ENDFOR»
                ]
            ]
    collection.insert(embeddedData)


BATCH_SIZE = 100 
COUNT = «insert.nofRecords»

count = 0
data_batch = []

# Read and insert data
try:
	rows = csv_load("«insert.path»")
    	
    if rows is not None:
    	model = SentenceTransformer("all-MiniLM-L6-v2") # Initialize the sentence model
        for row in rows:
        	if count <= COUNT:
            	data_batch.add(row)
            if len(data_batch) >= BATCH_SIZE:
            	embed_insert(data_batch, model)
                data_batch.clear()
                count+=1
            else:
            	break

    if len(data_batch) > 0:
    	embed_insert(data_batch, model)
        count += len(data_batch)
                
    collection.flush()
    print("Inserted data successfully")
    print("Number of inserted items: ", count)
    
except Exception as e:
print("Error occurred during filtering: ", e.getMessage())
e.printStackTrace()
	'''
	
	
	
    def generateUpsertMethod(Upsert upsert) '''
        # Upsert data into collection «upsert.colection.name»
        def upsert_data():
            file_path = "«upsert.path»"
            count = «upsert.nofRecords»
        # Upsert logic here
        print(f"Upserted {count} records into collection «upsert.colection.name»")

    '''

    def generateDeleteMethod(Delete delete) '''
    # Delete data from collection «delete.colection.name»
    def delete_data():
    identifiers = «delete.deleteIds»
    # Delete logic here
    print(f"Deleted records from collection «delete.colection.name»")

    '''

	def generateFilterMethod(Filter filter) '''
    # Filter data in collection «filter.colection.name»
    def filter_data():
        try:
            client = new MilvusClient(uri="http://127.0.0.1:19530", token="root:Milvus")
            res = client.query(
                collection_name="«filter.colection.name»",
                filter="«filter.left_side_field.name» «filter.operator» '«filter.value»'",
                output_fields=["«filter.output_fields.join("\", \"")»"],
                limit=«filter.topK»
            )
            print("Filtered top «filter.topK» records from collection «filter.colection.name»")
            print("Query result: ", res)
        except Exception as e:
            print("Error occurred during filtering: ", e.getMessage())
            e.printStackTrace()
	'''
	
    def generateVectorSearchMethod(VectorSearch search) '''
    # Vector search in collection «search.colection.name»
    def vector_search():
    	top_k = «search.topK»
        metric = "«search.metric.getName()»"
        search_fields = [«search.search_vectors.map[field | field.name].join(", ")»]
        output_fields = [«search.output_fields.map[field | field.name].join(", ")»]
    print(f"Performed vector search in collection «search.colection.name»")
    '''

}