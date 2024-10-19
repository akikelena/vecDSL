/**
 */
package vecdslMM.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import vecdslMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage
 * @generated
 */
public class VecdslMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VecdslMMValidator INSTANCE = new VecdslMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "vecdslMM";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Of Records In Insert' of 'Insert'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSERT__NO_OF_RECORDS_IN_INSERT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique IDs In Update' of 'Update'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UPDATE__UNIQUE_IDS_IN_UPDATE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nof Records In Update' of 'Update'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UPDATE__NOF_RECORDS_IN_UPDATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique IDs In Delete' of 'Delete'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DELETE__UNIQUE_IDS_IN_DELETE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Fields QVC' of 'Query Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUERY_METHOD__OUTPUT_FIELDS_QVC = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Top KValue' of 'Query Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUERY_METHOD__TOP_KVALUE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Cluster Name' of 'Vector Database'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VECTOR_DATABASE__UNIQUE_CLUSTER_NAME = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Of Collections GT' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__NO_OF_COLLECTIONS_GT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cluster Limits Names' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__CLUSTER_LIMITS_NAMES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Collection Name In Cluster' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__UNIQUE_COLLECTION_NAME_IN_CLUSTER = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Col Limits Names' of 'Vector Collection'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VECTOR_COLLECTION__COL_LIMITS_NAMES = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Single Partition Key' of 'Partition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTITION__SINGLE_PARTITION_KEY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Field Limits Names' of 'Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FIELD__FIELD_LIMITS_NAMES = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'VIdx Limits Names' of 'Vector Index'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VECTOR_INDEX__VIDX_LIMITS_NAMES = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VecdslMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VecdslMMPackage.SCRIPT:
				return validateScript((Script)value, diagnostics, context);
			case VecdslMMPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case VecdslMMPackage.DDL_METHOD:
				return validateDdlMethod((DdlMethod)value, diagnostics, context);
			case VecdslMMPackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case VecdslMMPackage.ALTER:
				return validateAlter((Alter)value, diagnostics, context);
			case VecdslMMPackage.DROP:
				return validateDrop((Drop)value, diagnostics, context);
			case VecdslMMPackage.DML_METHOD:
				return validateDmlMethod((DmlMethod)value, diagnostics, context);
			case VecdslMMPackage.INSERT:
				return validateInsert((Insert)value, diagnostics, context);
			case VecdslMMPackage.UPDATE:
				return validateUpdate((Update)value, diagnostics, context);
			case VecdslMMPackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case VecdslMMPackage.QUERY_METHOD:
				return validateQueryMethod((QueryMethod)value, diagnostics, context);
			case VecdslMMPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case VecdslMMPackage.VECTOR_SEARCH:
				return validateVectorSearch((VectorSearch)value, diagnostics, context);
			case VecdslMMPackage.VECTOR_DATABASE:
				return validateVectorDatabase((VectorDatabase)value, diagnostics, context);
			case VecdslMMPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case VecdslMMPackage.CLUSTER:
				return validateCluster((Cluster)value, diagnostics, context);
			case VecdslMMPackage.VECTOR_COLLECTION:
				return validateVectorCollection((VectorCollection)value, diagnostics, context);
			case VecdslMMPackage.PARTITION:
				return validatePartition((Partition)value, diagnostics, context);
			case VecdslMMPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case VecdslMMPackage.INDEX:
				return validateIndex((Index)value, diagnostics, context);
			case VecdslMMPackage.LIMIT:
				return validateLimit((Limit)value, diagnostics, context);
			case VecdslMMPackage.EMBEDDING_MODEL:
				return validateEmbeddingModel((EmbeddingModel)value, diagnostics, context);
			case VecdslMMPackage.CONCEPT:
				return validateConcept((Concept)value, diagnostics, context);
			case VecdslMMPackage.FIELD_LIMIT:
				return validateFieldLimit((FieldLimit)value, diagnostics, context);
			case VecdslMMPackage.COLLECTION_LIMIT:
				return validateCollectionLimit((CollectionLimit)value, diagnostics, context);
			case VecdslMMPackage.CLUSTER_LIMIT:
				return validateClusterLimit((ClusterLimit)value, diagnostics, context);
			case VecdslMMPackage.INDEX_LIMIT:
				return validateIndexLimit((IndexLimit)value, diagnostics, context);
			case VecdslMMPackage.VECTOR_INDEX:
				return validateVectorIndex((VectorIndex)value, diagnostics, context);
			case VecdslMMPackage.NON_VECTOR_SEARCH:
				return validateNonVectorSearch((NonVectorSearch)value, diagnostics, context);
			case VecdslMMPackage.NON_VECTOR_FIELD:
				return validateNonVectorField((NonVectorField)value, diagnostics, context);
			case VecdslMMPackage.VECTOR_FIELD:
				return validateVectorField((VectorField)value, diagnostics, context);
			case VecdslMMPackage.NON_VECTOR_INDEX:
				return validateNonVectorIndex((NonVectorIndex)value, diagnostics, context);
			case VecdslMMPackage.EINDEX_LIMIT:
				return validateEIndexLimit((EIndexLimit)value, diagnostics, context);
			case VecdslMMPackage.EMETRIC_TYPE:
				return validateEMetricType((EMetricType)value, diagnostics, context);
			case VecdslMMPackage.ESCALAR_DTYPE:
				return validateEScalarDType((EScalarDType)value, diagnostics, context);
			case VecdslMMPackage.ECLUSTER_LIMIT:
				return validateEClusterLimit((EClusterLimit)value, diagnostics, context);
			case VecdslMMPackage.EV_IDX_TYPE:
				return validateEVIdxType((EVIdxType)value, diagnostics, context);
			case VecdslMMPackage.EPOD_SIZE:
				return validateEPodSize((EPodSize)value, diagnostics, context);
			case VecdslMMPackage.EFIELD_LIMIT:
				return validateEFieldLimit((EFieldLimit)value, diagnostics, context);
			case VecdslMMPackage.EOPERATOR:
				return validateEOperator((EOperator)value, diagnostics, context);
			case VecdslMMPackage.EPOD_TYPES:
				return validateEPodTypes((EPodTypes)value, diagnostics, context);
			case VecdslMMPackage.EPOD_ENV:
				return validateEPodEnv((EPodEnv)value, diagnostics, context);
			case VecdslMMPackage.ECOLECTION_LIMIT:
				return validateEColectionLimit((EColectionLimit)value, diagnostics, context);
			case VecdslMMPackage.EVENDOR_NAME:
				return validateEVendorName((EVendorName)value, diagnostics, context);
			case VecdslMMPackage.ENV_IDX_TYPE:
				return validateENVIdxType((ENVIdxType)value, diagnostics, context);
			case VecdslMMPackage.EVECTOR_DTYPE:
				return validateEVectorDType((EVectorDType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(Script script, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(script, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(method, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdlMethod(DdlMethod ddlMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddlMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(create, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlter(Alter alter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrop(Drop drop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(drop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDmlMethod(DmlMethod dmlMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dmlMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsert(Insert insert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(insert, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(insert, diagnostics, context);
		if (result || diagnostics != null) result &= validateInsert_NoOfRecordsInInsert(insert, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoOfRecordsInInsert constraint of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsert_NoOfRecordsInInsert(Insert insert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insert.NoOfRecordsInInsert(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(update, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(update, diagnostics, context);
		if (result || diagnostics != null) result &= validateUpdate_NofRecordsInUpdate(update, diagnostics, context);
		if (result || diagnostics != null) result &= validateUpdate_UniqueIDsInUpdate(update, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NofRecordsInUpdate constraint of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate_NofRecordsInUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return update.NofRecordsInUpdate(diagnostics, context);
	}

	/**
	 * Validates the UniqueIDsInUpdate constraint of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate_UniqueIDsInUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return update.UniqueIDsInUpdate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delete, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelete_UniqueIDsInDelete(delete, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueIDsInDelete constraint of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete_UniqueIDsInDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return delete.UniqueIDsInDelete(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryMethod(QueryMethod queryMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(queryMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_TopKValue(queryMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_OutputFieldsQVC(queryMethod, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TopKValue constraint of '<em>Query Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryMethod_TopKValue(QueryMethod queryMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return queryMethod.TopKValue(diagnostics, context);
	}

	/**
	 * Validates the OutputFieldsQVC constraint of '<em>Query Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryMethod_OutputFieldsQVC(QueryMethod queryMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return queryMethod.OutputFieldsQVC(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorSearch(VectorSearch vectorSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vectorSearch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_TopKValue(vectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_OutputFieldsQVC(vectorSearch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorDatabase(VectorDatabase vectorDatabase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vectorDatabase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vectorDatabase, diagnostics, context);
		if (result || diagnostics != null) result &= validateVectorDatabase_UniqueClusterName(vectorDatabase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueClusterName constraint of '<em>Vector Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorDatabase_UniqueClusterName(VectorDatabase vectorDatabase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vectorDatabase.UniqueClusterName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_UniqueCollectionNameInCluster(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_NoOfCollectionsGT(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_clusterLimitsNames(cluster, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueCollectionNameInCluster constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_UniqueCollectionNameInCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.UniqueCollectionNameInCluster(diagnostics, context);
	}

	/**
	 * Validates the NoOfCollectionsGT constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_NoOfCollectionsGT(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.NoOfCollectionsGT(diagnostics, context);
	}

	/**
	 * Validates the clusterLimitsNames constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_clusterLimitsNames(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.clusterLimitsNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorCollection(VectorCollection vectorCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vectorCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vectorCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVectorCollection_colLimitsNames(vectorCollection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the colLimitsNames constraint of '<em>Vector Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorCollection_colLimitsNames(VectorCollection vectorCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vectorCollection.colLimitsNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartition_SinglePartitionKey(partition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SinglePartitionKey constraint of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition_SinglePartitionKey(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partition.SinglePartitionKey(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(field, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validateField_fieldLimitsNames(field, diagnostics, context);
		return result;
	}

	/**
	 * Validates the fieldLimitsNames constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField_fieldLimitsNames(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return field.fieldLimitsNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex(Index index, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(index, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimit(Limit limit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(limit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddingModel(EmbeddingModel embeddingModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(embeddingModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcept(Concept concept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldLimit(FieldLimit fieldLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLimit(CollectionLimit collectionLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusterLimit(ClusterLimit clusterLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clusterLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexLimit(IndexLimit indexLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorIndex(VectorIndex vectorIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vectorIndex, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vectorIndex, diagnostics, context);
		if (result || diagnostics != null) result &= validateVectorIndex_vIdxLimitsNames(vectorIndex, diagnostics, context);
		return result;
	}

	/**
	 * Validates the vIdxLimitsNames constraint of '<em>Vector Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorIndex_vIdxLimitsNames(VectorIndex vectorIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vectorIndex.vIdxLimitsNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonVectorSearch(NonVectorSearch nonVectorSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonVectorSearch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_TopKValue(nonVectorSearch, diagnostics, context);
		if (result || diagnostics != null) result &= validateQueryMethod_OutputFieldsQVC(nonVectorSearch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonVectorField(NonVectorField nonVectorField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonVectorField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonVectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validateField_fieldLimitsNames(nonVectorField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorField(VectorField vectorField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vectorField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vectorField, diagnostics, context);
		if (result || diagnostics != null) result &= validateField_fieldLimitsNames(vectorField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonVectorIndex(NonVectorIndex nonVectorIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonVectorIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIndexLimit(EIndexLimit eIndexLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMetricType(EMetricType eMetricType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEScalarDType(EScalarDType eScalarDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClusterLimit(EClusterLimit eClusterLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEVIdxType(EVIdxType evIdxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPodSize(EPodSize ePodSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFieldLimit(EFieldLimit eFieldLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperator(EOperator eOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPodTypes(EPodTypes ePodTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPodEnv(EPodEnv ePodEnv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEColectionLimit(EColectionLimit eColectionLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEVendorName(EVendorName eVendorName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENVIdxType(ENVIdxType envIdxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEVectorDType(EVectorDType eVectorDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VecdslMMValidator
