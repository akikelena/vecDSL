/**
 */
package vecdslMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vecdslMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VecdslMMFactoryImpl extends EFactoryImpl implements VecdslMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VecdslMMFactory init() {
		try {
			VecdslMMFactory theVecdslMMFactory = (VecdslMMFactory)EPackage.Registry.INSTANCE.getEFactory(VecdslMMPackage.eNS_URI);
			if (theVecdslMMFactory != null) {
				return theVecdslMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VecdslMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VecdslMMPackage.SCRIPT: return createScript();
			case VecdslMMPackage.CREATE: return createCreate();
			case VecdslMMPackage.ALTER: return createAlter();
			case VecdslMMPackage.DROP: return createDrop();
			case VecdslMMPackage.INSERT: return createInsert();
			case VecdslMMPackage.UPDATE: return createUpdate();
			case VecdslMMPackage.DELETE: return createDelete();
			case VecdslMMPackage.FILTER: return createFilter();
			case VecdslMMPackage.VECTOR_SEARCH: return createVectorSearch();
			case VecdslMMPackage.VECTOR_DATABASE: return createVectorDatabase();
			case VecdslMMPackage.CONNECTION: return createConnection();
			case VecdslMMPackage.CLUSTER: return createCluster();
			case VecdslMMPackage.VECTOR_COLLECTION: return createVectorCollection();
			case VecdslMMPackage.PARTITION: return createPartition();
			case VecdslMMPackage.EMBEDDING_MODEL: return createEmbeddingModel();
			case VecdslMMPackage.FIELD_LIMIT: return createFieldLimit();
			case VecdslMMPackage.COLLECTION_LIMIT: return createCollectionLimit();
			case VecdslMMPackage.CLUSTER_LIMIT: return createClusterLimit();
			case VecdslMMPackage.INDEX_LIMIT: return createIndexLimit();
			case VecdslMMPackage.VECTOR_INDEX: return createVectorIndex();
			case VecdslMMPackage.NON_VECTOR_SEARCH: return createNonVectorSearch();
			case VecdslMMPackage.NON_VECTOR_FIELD: return createNonVectorField();
			case VecdslMMPackage.VECTOR_FIELD: return createVectorField();
			case VecdslMMPackage.NON_VECTOR_INDEX: return createNonVectorIndex();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VecdslMMPackage.EINDEX_LIMIT:
				return createEIndexLimitFromString(eDataType, initialValue);
			case VecdslMMPackage.EMETRIC_TYPE:
				return createEMetricTypeFromString(eDataType, initialValue);
			case VecdslMMPackage.ESCALAR_DTYPE:
				return createEScalarDTypeFromString(eDataType, initialValue);
			case VecdslMMPackage.ECLUSTER_LIMIT:
				return createEClusterLimitFromString(eDataType, initialValue);
			case VecdslMMPackage.EV_IDX_TYPE:
				return createEVIdxTypeFromString(eDataType, initialValue);
			case VecdslMMPackage.EPOD_SIZE:
				return createEPodSizeFromString(eDataType, initialValue);
			case VecdslMMPackage.EFIELD_LIMIT:
				return createEFieldLimitFromString(eDataType, initialValue);
			case VecdslMMPackage.EOPERATOR:
				return createEOperatorFromString(eDataType, initialValue);
			case VecdslMMPackage.EPOD_TYPES:
				return createEPodTypesFromString(eDataType, initialValue);
			case VecdslMMPackage.EPOD_ENV:
				return createEPodEnvFromString(eDataType, initialValue);
			case VecdslMMPackage.ECOLECTION_LIMIT:
				return createEColectionLimitFromString(eDataType, initialValue);
			case VecdslMMPackage.EVENDOR_NAME:
				return createEVendorNameFromString(eDataType, initialValue);
			case VecdslMMPackage.ENV_IDX_TYPE:
				return createENVIdxTypeFromString(eDataType, initialValue);
			case VecdslMMPackage.EVECTOR_DTYPE:
				return createEVectorDTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VecdslMMPackage.EINDEX_LIMIT:
				return convertEIndexLimitToString(eDataType, instanceValue);
			case VecdslMMPackage.EMETRIC_TYPE:
				return convertEMetricTypeToString(eDataType, instanceValue);
			case VecdslMMPackage.ESCALAR_DTYPE:
				return convertEScalarDTypeToString(eDataType, instanceValue);
			case VecdslMMPackage.ECLUSTER_LIMIT:
				return convertEClusterLimitToString(eDataType, instanceValue);
			case VecdslMMPackage.EV_IDX_TYPE:
				return convertEVIdxTypeToString(eDataType, instanceValue);
			case VecdslMMPackage.EPOD_SIZE:
				return convertEPodSizeToString(eDataType, instanceValue);
			case VecdslMMPackage.EFIELD_LIMIT:
				return convertEFieldLimitToString(eDataType, instanceValue);
			case VecdslMMPackage.EOPERATOR:
				return convertEOperatorToString(eDataType, instanceValue);
			case VecdslMMPackage.EPOD_TYPES:
				return convertEPodTypesToString(eDataType, instanceValue);
			case VecdslMMPackage.EPOD_ENV:
				return convertEPodEnvToString(eDataType, instanceValue);
			case VecdslMMPackage.ECOLECTION_LIMIT:
				return convertEColectionLimitToString(eDataType, instanceValue);
			case VecdslMMPackage.EVENDOR_NAME:
				return convertEVendorNameToString(eDataType, instanceValue);
			case VecdslMMPackage.ENV_IDX_TYPE:
				return convertENVIdxTypeToString(eDataType, instanceValue);
			case VecdslMMPackage.EVECTOR_DTYPE:
				return convertEVectorDTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alter createAlter() {
		AlterImpl alter = new AlterImpl();
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorSearch createVectorSearch() {
		VectorSearchImpl vectorSearch = new VectorSearchImpl();
		return vectorSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorDatabase createVectorDatabase() {
		VectorDatabaseImpl vectorDatabase = new VectorDatabaseImpl();
		return vectorDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection createVectorCollection() {
		VectorCollectionImpl vectorCollection = new VectorCollectionImpl();
		return vectorCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddingModel createEmbeddingModel() {
		EmbeddingModelImpl embeddingModel = new EmbeddingModelImpl();
		return embeddingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldLimit createFieldLimit() {
		FieldLimitImpl fieldLimit = new FieldLimitImpl();
		return fieldLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionLimit createCollectionLimit() {
		CollectionLimitImpl collectionLimit = new CollectionLimitImpl();
		return collectionLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterLimit createClusterLimit() {
		ClusterLimitImpl clusterLimit = new ClusterLimitImpl();
		return clusterLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexLimit createIndexLimit() {
		IndexLimitImpl indexLimit = new IndexLimitImpl();
		return indexLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorIndex createVectorIndex() {
		VectorIndexImpl vectorIndex = new VectorIndexImpl();
		return vectorIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonVectorSearch createNonVectorSearch() {
		NonVectorSearchImpl nonVectorSearch = new NonVectorSearchImpl();
		return nonVectorSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonVectorField createNonVectorField() {
		NonVectorFieldImpl nonVectorField = new NonVectorFieldImpl();
		return nonVectorField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorField createVectorField() {
		VectorFieldImpl vectorField = new VectorFieldImpl();
		return vectorField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonVectorIndex createNonVectorIndex() {
		NonVectorIndexImpl nonVectorIndex = new NonVectorIndexImpl();
		return nonVectorIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIndexLimit createEIndexLimitFromString(EDataType eDataType, String initialValue) {
		EIndexLimit result = EIndexLimit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIndexLimitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMetricType createEMetricTypeFromString(EDataType eDataType, String initialValue) {
		EMetricType result = EMetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMetricTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScalarDType createEScalarDTypeFromString(EDataType eDataType, String initialValue) {
		EScalarDType result = EScalarDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEScalarDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClusterLimit createEClusterLimitFromString(EDataType eDataType, String initialValue) {
		EClusterLimit result = EClusterLimit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEClusterLimitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVIdxType createEVIdxTypeFromString(EDataType eDataType, String initialValue) {
		EVIdxType result = EVIdxType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVIdxTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodSize createEPodSizeFromString(EDataType eDataType, String initialValue) {
		EPodSize result = EPodSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPodSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFieldLimit createEFieldLimitFromString(EDataType eDataType, String initialValue) {
		EFieldLimit result = EFieldLimit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFieldLimitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperator createEOperatorFromString(EDataType eDataType, String initialValue) {
		EOperator result = EOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodTypes createEPodTypesFromString(EDataType eDataType, String initialValue) {
		EPodTypes result = EPodTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPodTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodEnv createEPodEnvFromString(EDataType eDataType, String initialValue) {
		EPodEnv result = EPodEnv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPodEnvToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EColectionLimit createEColectionLimitFromString(EDataType eDataType, String initialValue) {
		EColectionLimit result = EColectionLimit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEColectionLimitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVendorName createEVendorNameFromString(EDataType eDataType, String initialValue) {
		EVendorName result = EVendorName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVendorNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENVIdxType createENVIdxTypeFromString(EDataType eDataType, String initialValue) {
		ENVIdxType result = ENVIdxType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENVIdxTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVectorDType createEVectorDTypeFromString(EDataType eDataType, String initialValue) {
		EVectorDType result = EVectorDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVectorDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMPackage getVecdslMMPackage() {
		return (VecdslMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VecdslMMPackage getPackage() {
		return VecdslMMPackage.eINSTANCE;
	}

} //VecdslMMFactoryImpl
