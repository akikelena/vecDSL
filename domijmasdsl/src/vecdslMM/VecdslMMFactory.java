/**
 */
package vecdslMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage
 * @generated
 */
public interface VecdslMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VecdslMMFactory eINSTANCE = vecdslMM.impl.VecdslMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alter</em>'.
	 * @generated
	 */
	Alter createAlter();

	/**
	 * Returns a new object of class '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop</em>'.
	 * @generated
	 */
	Drop createDrop();

	/**
	 * Returns a new object of class '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert</em>'.
	 * @generated
	 */
	Insert createInsert();

	/**
	 * Returns a new object of class '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update</em>'.
	 * @generated
	 */
	Update createUpdate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Vector Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Search</em>'.
	 * @generated
	 */
	VectorSearch createVectorSearch();

	/**
	 * Returns a new object of class '<em>Vector Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Database</em>'.
	 * @generated
	 */
	VectorDatabase createVectorDatabase();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Vector Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Collection</em>'.
	 * @generated
	 */
	VectorCollection createVectorCollection();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	Partition createPartition();

	/**
	 * Returns a new object of class '<em>Embedding Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedding Model</em>'.
	 * @generated
	 */
	EmbeddingModel createEmbeddingModel();

	/**
	 * Returns a new object of class '<em>Field Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Limit</em>'.
	 * @generated
	 */
	FieldLimit createFieldLimit();

	/**
	 * Returns a new object of class '<em>Collection Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Limit</em>'.
	 * @generated
	 */
	CollectionLimit createCollectionLimit();

	/**
	 * Returns a new object of class '<em>Cluster Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Limit</em>'.
	 * @generated
	 */
	ClusterLimit createClusterLimit();

	/**
	 * Returns a new object of class '<em>Index Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Limit</em>'.
	 * @generated
	 */
	IndexLimit createIndexLimit();

	/**
	 * Returns a new object of class '<em>Vector Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Index</em>'.
	 * @generated
	 */
	VectorIndex createVectorIndex();

	/**
	 * Returns a new object of class '<em>Non Vector Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Vector Search</em>'.
	 * @generated
	 */
	NonVectorSearch createNonVectorSearch();

	/**
	 * Returns a new object of class '<em>Non Vector Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Vector Field</em>'.
	 * @generated
	 */
	NonVectorField createNonVectorField();

	/**
	 * Returns a new object of class '<em>Vector Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Field</em>'.
	 * @generated
	 */
	VectorField createVectorField();

	/**
	 * Returns a new object of class '<em>Non Vector Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Vector Index</em>'.
	 * @generated
	 */
	NonVectorIndex createNonVectorIndex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VecdslMMPackage getVecdslMMPackage();

} //VecdslMMFactory
