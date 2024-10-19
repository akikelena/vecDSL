/**
 */
package vecdslMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vecdslMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage
 * @generated
 */
public class VecdslMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VecdslMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VecdslMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VecdslMMSwitch<Adapter> modelSwitch =
		new VecdslMMSwitch<Adapter>() {
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseDdlMethod(DdlMethod object) {
				return createDdlMethodAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseAlter(Alter object) {
				return createAlterAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter caseDmlMethod(DmlMethod object) {
				return createDmlMethodAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseQueryMethod(QueryMethod object) {
				return createQueryMethodAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseVectorSearch(VectorSearch object) {
				return createVectorSearchAdapter();
			}
			@Override
			public Adapter caseVectorDatabase(VectorDatabase object) {
				return createVectorDatabaseAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseVectorCollection(VectorCollection object) {
				return createVectorCollectionAdapter();
			}
			@Override
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseEmbeddingModel(EmbeddingModel object) {
				return createEmbeddingModelAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseFieldLimit(FieldLimit object) {
				return createFieldLimitAdapter();
			}
			@Override
			public Adapter caseCollectionLimit(CollectionLimit object) {
				return createCollectionLimitAdapter();
			}
			@Override
			public Adapter caseClusterLimit(ClusterLimit object) {
				return createClusterLimitAdapter();
			}
			@Override
			public Adapter caseIndexLimit(IndexLimit object) {
				return createIndexLimitAdapter();
			}
			@Override
			public Adapter caseVectorIndex(VectorIndex object) {
				return createVectorIndexAdapter();
			}
			@Override
			public Adapter caseNonVectorSearch(NonVectorSearch object) {
				return createNonVectorSearchAdapter();
			}
			@Override
			public Adapter caseNonVectorField(NonVectorField object) {
				return createNonVectorFieldAdapter();
			}
			@Override
			public Adapter caseVectorField(VectorField object) {
				return createVectorFieldAdapter();
			}
			@Override
			public Adapter caseNonVectorIndex(NonVectorIndex object) {
				return createNonVectorIndexAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.DdlMethod <em>Ddl Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.DdlMethod
	 * @generated
	 */
	public Adapter createDdlMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Alter
	 * @generated
	 */
	public Adapter createAlterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.DmlMethod <em>Dml Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.DmlMethod
	 * @generated
	 */
	public Adapter createDmlMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.QueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.QueryMethod
	 * @generated
	 */
	public Adapter createQueryMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.VectorSearch <em>Vector Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.VectorSearch
	 * @generated
	 */
	public Adapter createVectorSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.VectorDatabase <em>Vector Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.VectorDatabase
	 * @generated
	 */
	public Adapter createVectorDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.VectorCollection <em>Vector Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.VectorCollection
	 * @generated
	 */
	public Adapter createVectorCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.EmbeddingModel <em>Embedding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.EmbeddingModel
	 * @generated
	 */
	public Adapter createEmbeddingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.FieldLimit <em>Field Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.FieldLimit
	 * @generated
	 */
	public Adapter createFieldLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.CollectionLimit <em>Collection Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.CollectionLimit
	 * @generated
	 */
	public Adapter createCollectionLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.ClusterLimit <em>Cluster Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.ClusterLimit
	 * @generated
	 */
	public Adapter createClusterLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.IndexLimit <em>Index Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.IndexLimit
	 * @generated
	 */
	public Adapter createIndexLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.VectorIndex <em>Vector Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.VectorIndex
	 * @generated
	 */
	public Adapter createVectorIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.NonVectorSearch <em>Non Vector Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.NonVectorSearch
	 * @generated
	 */
	public Adapter createNonVectorSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.NonVectorField <em>Non Vector Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.NonVectorField
	 * @generated
	 */
	public Adapter createNonVectorFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.VectorField <em>Vector Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.VectorField
	 * @generated
	 */
	public Adapter createVectorFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vecdslMM.NonVectorIndex <em>Non Vector Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vecdslMM.NonVectorIndex
	 * @generated
	 */
	public Adapter createNonVectorIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VecdslMMAdapterFactory
