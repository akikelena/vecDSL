/**
 */
package vecdslMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import vecdslMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage
 * @generated
 */
public class VecdslMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VecdslMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMSwitch() {
		if (modelPackage == null) {
			modelPackage = VecdslMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VecdslMMPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.DDL_METHOD: {
				DdlMethod ddlMethod = (DdlMethod)theEObject;
				T result = caseDdlMethod(ddlMethod);
				if (result == null) result = caseMethod(ddlMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseDdlMethod(create);
				if (result == null) result = caseMethod(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.ALTER: {
				Alter alter = (Alter)theEObject;
				T result = caseAlter(alter);
				if (result == null) result = caseDdlMethod(alter);
				if (result == null) result = caseMethod(alter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = caseDdlMethod(drop);
				if (result == null) result = caseMethod(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.DML_METHOD: {
				DmlMethod dmlMethod = (DmlMethod)theEObject;
				T result = caseDmlMethod(dmlMethod);
				if (result == null) result = caseMethod(dmlMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = caseDmlMethod(insert);
				if (result == null) result = caseMethod(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseDmlMethod(update);
				if (result == null) result = caseMethod(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseDmlMethod(delete);
				if (result == null) result = caseMethod(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.QUERY_METHOD: {
				QueryMethod queryMethod = (QueryMethod)theEObject;
				T result = caseQueryMethod(queryMethod);
				if (result == null) result = caseMethod(queryMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.VECTOR_SEARCH: {
				VectorSearch vectorSearch = (VectorSearch)theEObject;
				T result = caseVectorSearch(vectorSearch);
				if (result == null) result = caseQueryMethod(vectorSearch);
				if (result == null) result = caseMethod(vectorSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.VECTOR_DATABASE: {
				VectorDatabase vectorDatabase = (VectorDatabase)theEObject;
				T result = caseVectorDatabase(vectorDatabase);
				if (result == null) result = caseConcept(vectorDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = caseConcept(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.VECTOR_COLLECTION: {
				VectorCollection vectorCollection = (VectorCollection)theEObject;
				T result = caseVectorCollection(vectorCollection);
				if (result == null) result = caseConcept(vectorCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T result = casePartition(partition);
				if (result == null) result = caseConcept(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseConcept(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = caseConcept(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.LIMIT: {
				Limit limit = (Limit)theEObject;
				T result = caseLimit(limit);
				if (result == null) result = caseConcept(limit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.EMBEDDING_MODEL: {
				EmbeddingModel embeddingModel = (EmbeddingModel)theEObject;
				T result = caseEmbeddingModel(embeddingModel);
				if (result == null) result = caseConcept(embeddingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.FIELD_LIMIT: {
				FieldLimit fieldLimit = (FieldLimit)theEObject;
				T result = caseFieldLimit(fieldLimit);
				if (result == null) result = caseLimit(fieldLimit);
				if (result == null) result = caseConcept(fieldLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.COLLECTION_LIMIT: {
				CollectionLimit collectionLimit = (CollectionLimit)theEObject;
				T result = caseCollectionLimit(collectionLimit);
				if (result == null) result = caseLimit(collectionLimit);
				if (result == null) result = caseConcept(collectionLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.CLUSTER_LIMIT: {
				ClusterLimit clusterLimit = (ClusterLimit)theEObject;
				T result = caseClusterLimit(clusterLimit);
				if (result == null) result = caseLimit(clusterLimit);
				if (result == null) result = caseConcept(clusterLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.INDEX_LIMIT: {
				IndexLimit indexLimit = (IndexLimit)theEObject;
				T result = caseIndexLimit(indexLimit);
				if (result == null) result = caseLimit(indexLimit);
				if (result == null) result = caseConcept(indexLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.VECTOR_INDEX: {
				VectorIndex vectorIndex = (VectorIndex)theEObject;
				T result = caseVectorIndex(vectorIndex);
				if (result == null) result = caseIndex(vectorIndex);
				if (result == null) result = caseConcept(vectorIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.NON_VECTOR_SEARCH: {
				NonVectorSearch nonVectorSearch = (NonVectorSearch)theEObject;
				T result = caseNonVectorSearch(nonVectorSearch);
				if (result == null) result = caseQueryMethod(nonVectorSearch);
				if (result == null) result = caseMethod(nonVectorSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.NON_VECTOR_FIELD: {
				NonVectorField nonVectorField = (NonVectorField)theEObject;
				T result = caseNonVectorField(nonVectorField);
				if (result == null) result = caseField(nonVectorField);
				if (result == null) result = caseConcept(nonVectorField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.VECTOR_FIELD: {
				VectorField vectorField = (VectorField)theEObject;
				T result = caseVectorField(vectorField);
				if (result == null) result = caseField(vectorField);
				if (result == null) result = caseConcept(vectorField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VecdslMMPackage.NON_VECTOR_INDEX: {
				NonVectorIndex nonVectorIndex = (NonVectorIndex)theEObject;
				T result = caseNonVectorIndex(nonVectorIndex);
				if (result == null) result = caseIndex(nonVectorIndex);
				if (result == null) result = caseConcept(nonVectorIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddl Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddl Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdlMethod(DdlMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlter(Alter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dml Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dml Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmlMethod(DmlMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryMethod(QueryMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorSearch(VectorSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorDatabase(VectorDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorCollection(VectorCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedding Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedding Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddingModel(EmbeddingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldLimit(FieldLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionLimit(CollectionLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterLimit(ClusterLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexLimit(IndexLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorIndex(VectorIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Vector Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Vector Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonVectorSearch(NonVectorSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Vector Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Vector Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonVectorField(NonVectorField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorField(VectorField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Vector Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Vector Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonVectorIndex(NonVectorIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VecdslMMSwitch
