/**
 */
package vecdslMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface VecdslMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vecdslMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "domijMAS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ftn.uns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VecdslMMPackage eINSTANCE = vecdslMM.impl.VecdslMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link vecdslMM.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.ScriptImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__VENDOR = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.MethodImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.DdlMethodImpl <em>Ddl Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.DdlMethodImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getDdlMethod()
	 * @generated
	 */
	int DDL_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Ddl Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_METHOD__DDL_CONCEPT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ddl Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_METHOD__DDL_NODE = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ddl Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ddl Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.CreateImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 3;

	/**
	 * The feature id for the '<em><b>Ddl Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__DDL_CONCEPT = DDL_METHOD__DDL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Ddl Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__DDL_NODE = DDL_METHOD__DDL_NODE;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = DDL_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = DDL_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.AlterImpl <em>Alter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.AlterImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getAlter()
	 * @generated
	 */
	int ALTER = 4;

	/**
	 * The feature id for the '<em><b>Ddl Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__DDL_CONCEPT = DDL_METHOD__DDL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Ddl Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__DDL_NODE = DDL_METHOD__DDL_NODE;

	/**
	 * The feature id for the '<em><b>Alter Cond</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__ALTER_COND = DDL_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_FEATURE_COUNT = DDL_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_COUNT = DDL_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.DropImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 5;

	/**
	 * The feature id for the '<em><b>Ddl Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DDL_CONCEPT = DDL_METHOD__DDL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Ddl Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DDL_NODE = DDL_METHOD__DDL_NODE;

	/**
	 * The feature id for the '<em><b>Drop Cond</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DROP_COND = DDL_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = DDL_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = DDL_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.DmlMethodImpl <em>Dml Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.DmlMethodImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getDmlMethod()
	 * @generated
	 */
	int DML_METHOD = 6;

	/**
	 * The feature id for the '<em><b>Dml Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_METHOD__DML_COLLECTION = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dml Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dml Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.InsertImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 7;

	/**
	 * The feature id for the '<em><b>Dml Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__DML_COLLECTION = DML_METHOD__DML_COLLECTION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__PATH = DML_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nof Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__NOF_RECORDS = DML_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = DML_METHOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Of Records In Insert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT___NO_OF_RECORDS_IN_INSERT__DIAGNOSTICCHAIN_MAP = DML_METHOD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = DML_METHOD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.UpdateImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 8;

	/**
	 * The feature id for the '<em><b>Dml Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__DML_COLLECTION = DML_METHOD__DML_COLLECTION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__PATH = DML_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nof Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__NOF_RECORDS = DML_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Update Cond</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__UPDATE_COND = DML_METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__IDS = DML_METHOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = DML_METHOD_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Unique IDs In Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE___UNIQUE_IDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP = DML_METHOD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Nof Records In Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE___NOF_RECORDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP = DML_METHOD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = DML_METHOD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.DeleteImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 9;

	/**
	 * The feature id for the '<em><b>Dml Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DML_COLLECTION = DML_METHOD__DML_COLLECTION;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IDS = DML_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete Cond</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DELETE_COND = DML_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = DML_METHOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique IDs In Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE___UNIQUE_IDS_IN_DELETE__DIAGNOSTICCHAIN_MAP = DML_METHOD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = DML_METHOD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.QueryMethodImpl <em>Query Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.QueryMethodImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getQueryMethod()
	 * @generated
	 */
	int QUERY_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__TOP_K = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__QUERY_COLLECTION = METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__OUTPUT_FIELDS = METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Output Fields QVC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP = METHOD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Top KValue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP = METHOD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.FilterImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 11;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Filter Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.VectorSearchImpl <em>Vector Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.VectorSearchImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorSearch()
	 * @generated
	 */
	int VECTOR_SEARCH = 12;

	/**
	 * The feature id for the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__TOP_K = QUERY_METHOD__TOP_K;

	/**
	 * The feature id for the '<em><b>Query Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__QUERY_COLLECTION = QUERY_METHOD__QUERY_COLLECTION;

	/**
	 * The feature id for the '<em><b>Output Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__OUTPUT_FIELDS = QUERY_METHOD__OUTPUT_FIELDS;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__METRIC = QUERY_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Units Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__NUM_UNITS_PROBE = QUERY_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vec Search Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH__VEC_SEARCH_FILTERS = QUERY_METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH_FEATURE_COUNT = QUERY_METHOD_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Output Fields QVC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP = QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Top KValue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH___TOP_KVALUE__DIAGNOSTICCHAIN_MAP = QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Vector Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_SEARCH_OPERATION_COUNT = QUERY_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.ConceptImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.VectorDatabaseImpl <em>Vector Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.VectorDatabaseImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorDatabase()
	 * @generated
	 */
	int VECTOR_DATABASE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE__CLUSTERS = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE__CONNECTION = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vector Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Unique Cluster Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE___UNIQUE_CLUSTER_NAME__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vector Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DATABASE_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.ConnectionImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HOST = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 1;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__API_KEY = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__USERNAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REGION = 5;

	/**
	 * The feature id for the '<em><b>User Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__USER_ROLE = 6;

	/**
	 * The feature id for the '<em><b>User Privillege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__USER_PRIVILLEGE = 7;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CLOUD = 8;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENVIRONMENT = 9;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.ClusterImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__COLLECTIONS = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nof Collections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NOF_COLLECTIONS = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vectordb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__VECTORDB = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cluster Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__CLUSTER_LIMITS = CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>No Of Collections GT</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___NO_OF_COLLECTIONS_GT__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cluster Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___CLUSTER_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Collection Name In Cluster</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___UNIQUE_COLLECTION_NAME_IN_CLUSTER__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.VectorCollectionImpl <em>Vector Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.VectorCollectionImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorCollection()
	 * @generated
	 */
	int VECTOR_COLLECTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__CLUSTER = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__PARTITIONS = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__FIELDS = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__DYNAMIC = CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Podtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__PODTYPE = CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pod Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__POD_SIZE = CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pod Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__POD_ENV = CONCEPT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION__COLLECTION_LIMITS = CONCEPT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Vector Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Col Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION___COL_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vector Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_COLLECTION_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.PartitionImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Col Part Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__COL_PART_OWNER = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_KEY = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Single Partition Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___SINGLE_PARTITION_KEY__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.FieldImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Col Field Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COL_FIELD_OWNER = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_PRIMARY = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_LIMITS = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Field Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.IndexImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.LimitImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__VALUE = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.EmbeddingModelImpl <em>Embedding Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.EmbeddingModelImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEmbeddingModel()
	 * @generated
	 */
	int EMBEDDING_MODEL = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_MODEL__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_MODEL__DESCRIPTION = CONCEPT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Embedding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_MODEL_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Embedding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_MODEL_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.FieldLimitImpl <em>Field Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.FieldLimitImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getFieldLimit()
	 * @generated
	 */
	int FIELD_LIMIT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT__VALUE = LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT__TYPE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.CollectionLimitImpl <em>Collection Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.CollectionLimitImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getCollectionLimit()
	 * @generated
	 */
	int COLLECTION_LIMIT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT__VALUE = LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT__TYPE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.ClusterLimitImpl <em>Cluster Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.ClusterLimitImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getClusterLimit()
	 * @generated
	 */
	int CLUSTER_LIMIT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT__VALUE = LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT__TYPE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cluster Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cluster Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.IndexLimitImpl <em>Index Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.IndexLimitImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getIndexLimit()
	 * @generated
	 */
	int INDEX_LIMIT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT__DESCRIPTION = LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT__VALUE = LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT__TYPE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.VectorIndexImpl <em>Vector Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.VectorIndexImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorIndex()
	 * @generated
	 */
	int VECTOR_INDEX = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX__NAME = INDEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX__DESCRIPTION = INDEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX__METRIC = INDEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX__TYPE = INDEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VIndex Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX__VINDEX_LIMITS = INDEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX_FEATURE_COUNT = INDEX_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>VIdx Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX___VIDX_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = INDEX_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vector Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_INDEX_OPERATION_COUNT = INDEX_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.NonVectorSearchImpl <em>Non Vector Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.NonVectorSearchImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorSearch()
	 * @generated
	 */
	int NON_VECTOR_SEARCH = 28;

	/**
	 * The feature id for the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH__TOP_K = QUERY_METHOD__TOP_K;

	/**
	 * The feature id for the '<em><b>Query Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH__QUERY_COLLECTION = QUERY_METHOD__QUERY_COLLECTION;

	/**
	 * The feature id for the '<em><b>Output Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH__OUTPUT_FIELDS = QUERY_METHOD__OUTPUT_FIELDS;

	/**
	 * The feature id for the '<em><b>Non Vec Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH__NON_VEC_FILTERS = QUERY_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Vector Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH_FEATURE_COUNT = QUERY_METHOD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Output Fields QVC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP = QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Top KValue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH___TOP_KVALUE__DIAGNOSTICCHAIN_MAP = QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Non Vector Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_SEARCH_OPERATION_COUNT = QUERY_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.NonVectorFieldImpl <em>Non Vector Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.NonVectorFieldImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorField()
	 * @generated
	 */
	int NON_VECTOR_FIELD = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__DESCRIPTION = FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Col Field Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__COL_FIELD_OWNER = FIELD__COL_FIELD_OWNER;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__IS_PRIMARY = FIELD__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Field Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__FIELD_LIMITS = FIELD__FIELD_LIMITS;

	/**
	 * The feature id for the '<em><b>Non Vector Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__NON_VECTOR_INDEXES = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD__TYPE = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Vector Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Field Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Non Vector Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.VectorFieldImpl <em>Vector Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.VectorFieldImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorField()
	 * @generated
	 */
	int VECTOR_FIELD = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__DESCRIPTION = FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Col Field Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__COL_FIELD_OWNER = FIELD__COL_FIELD_OWNER;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__IS_PRIMARY = FIELD__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Field Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__FIELD_LIMITS = FIELD__FIELD_LIMITS;

	/**
	 * The feature id for the '<em><b>Vector Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__VECTOR_INDEXES = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__TYPE = FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emb Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD__EMB_MODEL = FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Field Limits Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Vector Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.impl.NonVectorIndexImpl <em>Non Vector Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.impl.NonVectorIndexImpl
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorIndex()
	 * @generated
	 */
	int NON_VECTOR_INDEX = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_INDEX__NAME = INDEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_INDEX__DESCRIPTION = INDEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_INDEX__TYPE = INDEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Vector Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_INDEX_FEATURE_COUNT = INDEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Vector Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VECTOR_INDEX_OPERATION_COUNT = INDEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vecdslMM.EIndexLimit <em>EIndex Limit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EIndexLimit
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEIndexLimit()
	 * @generated
	 */
	int EINDEX_LIMIT = 32;

	/**
	 * The meta object id for the '{@link vecdslMM.EMetricType <em>EMetric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EMetricType
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEMetricType()
	 * @generated
	 */
	int EMETRIC_TYPE = 33;

	/**
	 * The meta object id for the '{@link vecdslMM.EScalarDType <em>EScalar DType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EScalarDType
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEScalarDType()
	 * @generated
	 */
	int ESCALAR_DTYPE = 34;

	/**
	 * The meta object id for the '{@link vecdslMM.EClusterLimit <em>ECluster Limit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EClusterLimit
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEClusterLimit()
	 * @generated
	 */
	int ECLUSTER_LIMIT = 35;

	/**
	 * The meta object id for the '{@link vecdslMM.EVIdxType <em>EV Idx Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EVIdxType
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVIdxType()
	 * @generated
	 */
	int EV_IDX_TYPE = 36;

	/**
	 * The meta object id for the '{@link vecdslMM.EPodSize <em>EPod Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EPodSize
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodSize()
	 * @generated
	 */
	int EPOD_SIZE = 37;

	/**
	 * The meta object id for the '{@link vecdslMM.EFieldLimit <em>EField Limit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EFieldLimit
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEFieldLimit()
	 * @generated
	 */
	int EFIELD_LIMIT = 38;

	/**
	 * The meta object id for the '{@link vecdslMM.EOperator <em>EOperator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EOperator
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEOperator()
	 * @generated
	 */
	int EOPERATOR = 39;

	/**
	 * The meta object id for the '{@link vecdslMM.EPodTypes <em>EPod Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EPodTypes
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodTypes()
	 * @generated
	 */
	int EPOD_TYPES = 40;

	/**
	 * The meta object id for the '{@link vecdslMM.EPodEnv <em>EPod Env</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EPodEnv
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodEnv()
	 * @generated
	 */
	int EPOD_ENV = 41;

	/**
	 * The meta object id for the '{@link vecdslMM.EColectionLimit <em>EColection Limit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EColectionLimit
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEColectionLimit()
	 * @generated
	 */
	int ECOLECTION_LIMIT = 42;

	/**
	 * The meta object id for the '{@link vecdslMM.EVendorName <em>EVendor Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EVendorName
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVendorName()
	 * @generated
	 */
	int EVENDOR_NAME = 43;

	/**
	 * The meta object id for the '{@link vecdslMM.ENVIdxType <em>ENV Idx Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.ENVIdxType
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getENVIdxType()
	 * @generated
	 */
	int ENV_IDX_TYPE = 44;

	/**
	 * The meta object id for the '{@link vecdslMM.EVectorDType <em>EVector DType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vecdslMM.EVectorDType
	 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVectorDType()
	 * @generated
	 */
	int EVECTOR_DTYPE = 45;


	/**
	 * Returns the meta object for class '{@link vecdslMM.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see vecdslMM.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.Script#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see vecdslMM.Script#getMethods()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Methods();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Script#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see vecdslMM.Script#getVendor()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Vendor();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see vecdslMM.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link vecdslMM.DdlMethod <em>Ddl Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddl Method</em>'.
	 * @see vecdslMM.DdlMethod
	 * @generated
	 */
	EClass getDdlMethod();

	/**
	 * Returns the meta object for the containment reference '{@link vecdslMM.DdlMethod#getDdlConcept <em>Ddl Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ddl Concept</em>'.
	 * @see vecdslMM.DdlMethod#getDdlConcept()
	 * @see #getDdlMethod()
	 * @generated
	 */
	EReference getDdlMethod_DdlConcept();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.DdlMethod#getDdlNode <em>Ddl Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ddl Node</em>'.
	 * @see vecdslMM.DdlMethod#getDdlNode()
	 * @see #getDdlMethod()
	 * @generated
	 */
	EReference getDdlMethod_DdlNode();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see vecdslMM.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter</em>'.
	 * @see vecdslMM.Alter
	 * @generated
	 */
	EClass getAlter();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.Alter#getAlterCond <em>Alter Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alter Cond</em>'.
	 * @see vecdslMM.Alter#getAlterCond()
	 * @see #getAlter()
	 * @generated
	 */
	EReference getAlter_AlterCond();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see vecdslMM.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.Drop#getDropCond <em>Drop Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Drop Cond</em>'.
	 * @see vecdslMM.Drop#getDropCond()
	 * @see #getDrop()
	 * @generated
	 */
	EReference getDrop_DropCond();

	/**
	 * Returns the meta object for class '{@link vecdslMM.DmlMethod <em>Dml Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dml Method</em>'.
	 * @see vecdslMM.DmlMethod
	 * @generated
	 */
	EClass getDmlMethod();

	/**
	 * Returns the meta object for the containment reference '{@link vecdslMM.DmlMethod#getDmlCollection <em>Dml Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dml Collection</em>'.
	 * @see vecdslMM.DmlMethod#getDmlCollection()
	 * @see #getDmlMethod()
	 * @generated
	 */
	EReference getDmlMethod_DmlCollection();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see vecdslMM.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Insert#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see vecdslMM.Insert#getPath()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_Path();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Insert#getNofRecords <em>Nof Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Records</em>'.
	 * @see vecdslMM.Insert#getNofRecords()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_NofRecords();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Insert#NoOfRecordsInInsert(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Of Records In Insert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Of Records In Insert</em>' operation.
	 * @see vecdslMM.Insert#NoOfRecordsInInsert(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInsert__NoOfRecordsInInsert__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see vecdslMM.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Update#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see vecdslMM.Update#getPath()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Path();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Update#getNofRecords <em>Nof Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Records</em>'.
	 * @see vecdslMM.Update#getNofRecords()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_NofRecords();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.Update#getUpdateCond <em>Update Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Update Cond</em>'.
	 * @see vecdslMM.Update#getUpdateCond()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_UpdateCond();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Update#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ids</em>'.
	 * @see vecdslMM.Update#getIds()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Ids();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Update#UniqueIDsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique IDs In Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique IDs In Update</em>' operation.
	 * @see vecdslMM.Update#UniqueIDsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUpdate__UniqueIDsInUpdate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Update#NofRecordsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nof Records In Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nof Records In Update</em>' operation.
	 * @see vecdslMM.Update#NofRecordsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUpdate__NofRecordsInUpdate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see vecdslMM.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Delete#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ids</em>'.
	 * @see vecdslMM.Delete#getIds()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Ids();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.Delete#getDeleteCond <em>Delete Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delete Cond</em>'.
	 * @see vecdslMM.Delete#getDeleteCond()
	 * @see #getDelete()
	 * @generated
	 */
	EReference getDelete_DeleteCond();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Delete#UniqueIDsInDelete(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique IDs In Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique IDs In Delete</em>' operation.
	 * @see vecdslMM.Delete#UniqueIDsInDelete(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDelete__UniqueIDsInDelete__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.QueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Method</em>'.
	 * @see vecdslMM.QueryMethod
	 * @generated
	 */
	EClass getQueryMethod();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.QueryMethod#getTopK <em>Top K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top K</em>'.
	 * @see vecdslMM.QueryMethod#getTopK()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EAttribute getQueryMethod_TopK();

	/**
	 * Returns the meta object for the containment reference '{@link vecdslMM.QueryMethod#getQueryCollection <em>Query Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Collection</em>'.
	 * @see vecdslMM.QueryMethod#getQueryCollection()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EReference getQueryMethod_QueryCollection();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.QueryMethod#getOutputFields <em>Output Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Fields</em>'.
	 * @see vecdslMM.QueryMethod#getOutputFields()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EReference getQueryMethod_OutputFields();

	/**
	 * Returns the meta object for the '{@link vecdslMM.QueryMethod#OutputFieldsQVC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Fields QVC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Fields QVC</em>' operation.
	 * @see vecdslMM.QueryMethod#OutputFieldsQVC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQueryMethod__OutputFieldsQVC__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link vecdslMM.QueryMethod#TopKValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Top KValue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Top KValue</em>' operation.
	 * @see vecdslMM.QueryMethod#TopKValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQueryMethod__TopKValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see vecdslMM.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Filter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see vecdslMM.Filter#getOperator()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Operator();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Filter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vecdslMM.Filter#getValue()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Value();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.Filter#getFilterField <em>Filter Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Field</em>'.
	 * @see vecdslMM.Filter#getFilterField()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FilterField();

	/**
	 * Returns the meta object for class '{@link vecdslMM.VectorSearch <em>Vector Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Search</em>'.
	 * @see vecdslMM.VectorSearch
	 * @generated
	 */
	EClass getVectorSearch();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorSearch#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see vecdslMM.VectorSearch#getMetric()
	 * @see #getVectorSearch()
	 * @generated
	 */
	EAttribute getVectorSearch_Metric();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorSearch#getNumUnitsProbe <em>Num Units Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Units Probe</em>'.
	 * @see vecdslMM.VectorSearch#getNumUnitsProbe()
	 * @see #getVectorSearch()
	 * @generated
	 */
	EAttribute getVectorSearch_NumUnitsProbe();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.VectorSearch#getVecSearchFilters <em>Vec Search Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vec Search Filters</em>'.
	 * @see vecdslMM.VectorSearch#getVecSearchFilters()
	 * @see #getVectorSearch()
	 * @generated
	 */
	EReference getVectorSearch_VecSearchFilters();

	/**
	 * Returns the meta object for class '{@link vecdslMM.VectorDatabase <em>Vector Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Database</em>'.
	 * @see vecdslMM.VectorDatabase
	 * @generated
	 */
	EClass getVectorDatabase();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.VectorDatabase#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clusters</em>'.
	 * @see vecdslMM.VectorDatabase#getClusters()
	 * @see #getVectorDatabase()
	 * @generated
	 */
	EReference getVectorDatabase_Clusters();

	/**
	 * Returns the meta object for the containment reference '{@link vecdslMM.VectorDatabase#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see vecdslMM.VectorDatabase#getConnection()
	 * @see #getVectorDatabase()
	 * @generated
	 */
	EReference getVectorDatabase_Connection();

	/**
	 * Returns the meta object for the '{@link vecdslMM.VectorDatabase#UniqueClusterName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Cluster Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Cluster Name</em>' operation.
	 * @see vecdslMM.VectorDatabase#UniqueClusterName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVectorDatabase__UniqueClusterName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see vecdslMM.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see vecdslMM.Connection#getHost()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Host();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see vecdslMM.Connection#getPort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Port();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see vecdslMM.Connection#getApiKey()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see vecdslMM.Connection#getUsername()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Username();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see vecdslMM.Connection#getPassword()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Password();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see vecdslMM.Connection#getRegion()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Region();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getUserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Role</em>'.
	 * @see vecdslMM.Connection#getUserRole()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_UserRole();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getUserPrivillege <em>User Privillege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Privillege</em>'.
	 * @see vecdslMM.Connection#getUserPrivillege()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_UserPrivillege();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud</em>'.
	 * @see vecdslMM.Connection#getCloud()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Cloud();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Connection#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see vecdslMM.Connection#getEnvironment()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Environment();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see vecdslMM.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.Cluster#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collections</em>'.
	 * @see vecdslMM.Cluster#getCollections()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Collections();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Cluster#getNofCollections <em>Nof Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Collections</em>'.
	 * @see vecdslMM.Cluster#getNofCollections()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_NofCollections();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.Cluster#getVectordb <em>Vectordb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vectordb</em>'.
	 * @see vecdslMM.Cluster#getVectordb()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Vectordb();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.Cluster#getClusterLimits <em>Cluster Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cluster Limits</em>'.
	 * @see vecdslMM.Cluster#getClusterLimits()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_ClusterLimits();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Cluster#NoOfCollectionsGT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Of Collections GT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Of Collections GT</em>' operation.
	 * @see vecdslMM.Cluster#NoOfCollectionsGT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__NoOfCollectionsGT__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Cluster#clusterLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cluster Limits Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cluster Limits Names</em>' operation.
	 * @see vecdslMM.Cluster#clusterLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__ClusterLimitsNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Cluster#UniqueCollectionNameInCluster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Collection Name In Cluster</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Collection Name In Cluster</em>' operation.
	 * @see vecdslMM.Cluster#UniqueCollectionNameInCluster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCluster__UniqueCollectionNameInCluster__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.VectorCollection <em>Vector Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Collection</em>'.
	 * @see vecdslMM.VectorCollection
	 * @generated
	 */
	EClass getVectorCollection();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.VectorCollection#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see vecdslMM.VectorCollection#getCluster()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EReference getVectorCollection_Cluster();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.VectorCollection#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partitions</em>'.
	 * @see vecdslMM.VectorCollection#getPartitions()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EReference getVectorCollection_Partitions();

	/**
	 * Returns the meta object for the reference list '{@link vecdslMM.VectorCollection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see vecdslMM.VectorCollection#getFields()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EReference getVectorCollection_Fields();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorCollection#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see vecdslMM.VectorCollection#isDynamic()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EAttribute getVectorCollection_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorCollection#getPodtype <em>Podtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podtype</em>'.
	 * @see vecdslMM.VectorCollection#getPodtype()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EAttribute getVectorCollection_Podtype();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorCollection#getPodSize <em>Pod Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pod Size</em>'.
	 * @see vecdslMM.VectorCollection#getPodSize()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EAttribute getVectorCollection_PodSize();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorCollection#getPodEnv <em>Pod Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pod Env</em>'.
	 * @see vecdslMM.VectorCollection#getPodEnv()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EAttribute getVectorCollection_PodEnv();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.VectorCollection#getCollectionLimits <em>Collection Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection Limits</em>'.
	 * @see vecdslMM.VectorCollection#getCollectionLimits()
	 * @see #getVectorCollection()
	 * @generated
	 */
	EReference getVectorCollection_CollectionLimits();

	/**
	 * Returns the meta object for the '{@link vecdslMM.VectorCollection#colLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Col Limits Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Col Limits Names</em>' operation.
	 * @see vecdslMM.VectorCollection#colLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVectorCollection__ColLimitsNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see vecdslMM.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.Partition#getColPartOwner <em>Col Part Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col Part Owner</em>'.
	 * @see vecdslMM.Partition#getColPartOwner()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_ColPartOwner();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.Partition#getPartitionKey <em>Partition Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partition Key</em>'.
	 * @see vecdslMM.Partition#getPartitionKey()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartitionKey();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Partition#SinglePartitionKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Partition Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Single Partition Key</em>' operation.
	 * @see vecdslMM.Partition#SinglePartitionKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPartition__SinglePartitionKey__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see vecdslMM.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.Field#getColFieldOwner <em>Col Field Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col Field Owner</em>'.
	 * @see vecdslMM.Field#getColFieldOwner()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ColFieldOwner();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Field#isIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see vecdslMM.Field#isIsPrimary()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsPrimary();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.Field#getFieldLimits <em>Field Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Limits</em>'.
	 * @see vecdslMM.Field#getFieldLimits()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_FieldLimits();

	/**
	 * Returns the meta object for the '{@link vecdslMM.Field#fieldLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Field Limits Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Field Limits Names</em>' operation.
	 * @see vecdslMM.Field#fieldLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getField__FieldLimitsNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see vecdslMM.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see vecdslMM.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Limit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vecdslMM.Limit#getValue()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Value();

	/**
	 * Returns the meta object for class '{@link vecdslMM.EmbeddingModel <em>Embedding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedding Model</em>'.
	 * @see vecdslMM.EmbeddingModel
	 * @generated
	 */
	EClass getEmbeddingModel();

	/**
	 * Returns the meta object for class '{@link vecdslMM.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see vecdslMM.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Concept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vecdslMM.Concept#getName()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Name();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.Concept#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see vecdslMM.Concept#getDescription()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Description();

	/**
	 * Returns the meta object for class '{@link vecdslMM.FieldLimit <em>Field Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Limit</em>'.
	 * @see vecdslMM.FieldLimit
	 * @generated
	 */
	EClass getFieldLimit();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.FieldLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.FieldLimit#getType()
	 * @see #getFieldLimit()
	 * @generated
	 */
	EAttribute getFieldLimit_Type();

	/**
	 * Returns the meta object for class '{@link vecdslMM.CollectionLimit <em>Collection Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Limit</em>'.
	 * @see vecdslMM.CollectionLimit
	 * @generated
	 */
	EClass getCollectionLimit();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.CollectionLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.CollectionLimit#getType()
	 * @see #getCollectionLimit()
	 * @generated
	 */
	EAttribute getCollectionLimit_Type();

	/**
	 * Returns the meta object for class '{@link vecdslMM.ClusterLimit <em>Cluster Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Limit</em>'.
	 * @see vecdslMM.ClusterLimit
	 * @generated
	 */
	EClass getClusterLimit();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.ClusterLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.ClusterLimit#getType()
	 * @see #getClusterLimit()
	 * @generated
	 */
	EAttribute getClusterLimit_Type();

	/**
	 * Returns the meta object for class '{@link vecdslMM.IndexLimit <em>Index Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Limit</em>'.
	 * @see vecdslMM.IndexLimit
	 * @generated
	 */
	EClass getIndexLimit();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.IndexLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.IndexLimit#getType()
	 * @see #getIndexLimit()
	 * @generated
	 */
	EAttribute getIndexLimit_Type();

	/**
	 * Returns the meta object for class '{@link vecdslMM.VectorIndex <em>Vector Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Index</em>'.
	 * @see vecdslMM.VectorIndex
	 * @generated
	 */
	EClass getVectorIndex();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorIndex#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see vecdslMM.VectorIndex#getMetric()
	 * @see #getVectorIndex()
	 * @generated
	 */
	EAttribute getVectorIndex_Metric();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorIndex#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.VectorIndex#getType()
	 * @see #getVectorIndex()
	 * @generated
	 */
	EAttribute getVectorIndex_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.VectorIndex#getVIndexLimits <em>VIndex Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VIndex Limits</em>'.
	 * @see vecdslMM.VectorIndex#getVIndexLimits()
	 * @see #getVectorIndex()
	 * @generated
	 */
	EReference getVectorIndex_VIndexLimits();

	/**
	 * Returns the meta object for the '{@link vecdslMM.VectorIndex#vIdxLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>VIdx Limits Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>VIdx Limits Names</em>' operation.
	 * @see vecdslMM.VectorIndex#vIdxLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVectorIndex__VIdxLimitsNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link vecdslMM.NonVectorSearch <em>Non Vector Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Vector Search</em>'.
	 * @see vecdslMM.NonVectorSearch
	 * @generated
	 */
	EClass getNonVectorSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.NonVectorSearch#getNonVecFilters <em>Non Vec Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Vec Filters</em>'.
	 * @see vecdslMM.NonVectorSearch#getNonVecFilters()
	 * @see #getNonVectorSearch()
	 * @generated
	 */
	EReference getNonVectorSearch_NonVecFilters();

	/**
	 * Returns the meta object for class '{@link vecdslMM.NonVectorField <em>Non Vector Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Vector Field</em>'.
	 * @see vecdslMM.NonVectorField
	 * @generated
	 */
	EClass getNonVectorField();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.NonVectorField#getNonVectorIndexes <em>Non Vector Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Vector Indexes</em>'.
	 * @see vecdslMM.NonVectorField#getNonVectorIndexes()
	 * @see #getNonVectorField()
	 * @generated
	 */
	EReference getNonVectorField_NonVectorIndexes();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.NonVectorField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.NonVectorField#getType()
	 * @see #getNonVectorField()
	 * @generated
	 */
	EAttribute getNonVectorField_Type();

	/**
	 * Returns the meta object for class '{@link vecdslMM.VectorField <em>Vector Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Field</em>'.
	 * @see vecdslMM.VectorField
	 * @generated
	 */
	EClass getVectorField();

	/**
	 * Returns the meta object for the containment reference list '{@link vecdslMM.VectorField#getVectorIndexes <em>Vector Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vector Indexes</em>'.
	 * @see vecdslMM.VectorField#getVectorIndexes()
	 * @see #getVectorField()
	 * @generated
	 */
	EReference getVectorField_VectorIndexes();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.VectorField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.VectorField#getType()
	 * @see #getVectorField()
	 * @generated
	 */
	EAttribute getVectorField_Type();

	/**
	 * Returns the meta object for the reference '{@link vecdslMM.VectorField#getEmbModel <em>Emb Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emb Model</em>'.
	 * @see vecdslMM.VectorField#getEmbModel()
	 * @see #getVectorField()
	 * @generated
	 */
	EReference getVectorField_EmbModel();

	/**
	 * Returns the meta object for class '{@link vecdslMM.NonVectorIndex <em>Non Vector Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Vector Index</em>'.
	 * @see vecdslMM.NonVectorIndex
	 * @generated
	 */
	EClass getNonVectorIndex();

	/**
	 * Returns the meta object for the attribute '{@link vecdslMM.NonVectorIndex#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vecdslMM.NonVectorIndex#getType()
	 * @see #getNonVectorIndex()
	 * @generated
	 */
	EAttribute getNonVectorIndex_Type();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EIndexLimit <em>EIndex Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EIndex Limit</em>'.
	 * @see vecdslMM.EIndexLimit
	 * @generated
	 */
	EEnum getEIndexLimit();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EMetricType <em>EMetric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMetric Type</em>'.
	 * @see vecdslMM.EMetricType
	 * @generated
	 */
	EEnum getEMetricType();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EScalarDType <em>EScalar DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EScalar DType</em>'.
	 * @see vecdslMM.EScalarDType
	 * @generated
	 */
	EEnum getEScalarDType();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EClusterLimit <em>ECluster Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECluster Limit</em>'.
	 * @see vecdslMM.EClusterLimit
	 * @generated
	 */
	EEnum getEClusterLimit();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EVIdxType <em>EV Idx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EV Idx Type</em>'.
	 * @see vecdslMM.EVIdxType
	 * @generated
	 */
	EEnum getEVIdxType();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EPodSize <em>EPod Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPod Size</em>'.
	 * @see vecdslMM.EPodSize
	 * @generated
	 */
	EEnum getEPodSize();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EFieldLimit <em>EField Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EField Limit</em>'.
	 * @see vecdslMM.EFieldLimit
	 * @generated
	 */
	EEnum getEFieldLimit();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EOperator <em>EOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOperator</em>'.
	 * @see vecdslMM.EOperator
	 * @generated
	 */
	EEnum getEOperator();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EPodTypes <em>EPod Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPod Types</em>'.
	 * @see vecdslMM.EPodTypes
	 * @generated
	 */
	EEnum getEPodTypes();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EPodEnv <em>EPod Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPod Env</em>'.
	 * @see vecdslMM.EPodEnv
	 * @generated
	 */
	EEnum getEPodEnv();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EColectionLimit <em>EColection Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EColection Limit</em>'.
	 * @see vecdslMM.EColectionLimit
	 * @generated
	 */
	EEnum getEColectionLimit();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EVendorName <em>EVendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVendor Name</em>'.
	 * @see vecdslMM.EVendorName
	 * @generated
	 */
	EEnum getEVendorName();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.ENVIdxType <em>ENV Idx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENV Idx Type</em>'.
	 * @see vecdslMM.ENVIdxType
	 * @generated
	 */
	EEnum getENVIdxType();

	/**
	 * Returns the meta object for enum '{@link vecdslMM.EVectorDType <em>EVector DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVector DType</em>'.
	 * @see vecdslMM.EVectorDType
	 * @generated
	 */
	EEnum getEVectorDType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VecdslMMFactory getVecdslMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vecdslMM.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.ScriptImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__METHODS = eINSTANCE.getScript_Methods();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__VENDOR = eINSTANCE.getScript_Vendor();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.MethodImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.DdlMethodImpl <em>Ddl Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.DdlMethodImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getDdlMethod()
		 * @generated
		 */
		EClass DDL_METHOD = eINSTANCE.getDdlMethod();

		/**
		 * The meta object literal for the '<em><b>Ddl Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDL_METHOD__DDL_CONCEPT = eINSTANCE.getDdlMethod_DdlConcept();

		/**
		 * The meta object literal for the '<em><b>Ddl Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDL_METHOD__DDL_NODE = eINSTANCE.getDdlMethod_DdlNode();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.CreateImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.AlterImpl <em>Alter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.AlterImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getAlter()
		 * @generated
		 */
		EClass ALTER = eINSTANCE.getAlter();

		/**
		 * The meta object literal for the '<em><b>Alter Cond</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTER__ALTER_COND = eINSTANCE.getAlter_AlterCond();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.DropImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '<em><b>Drop Cond</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP__DROP_COND = eINSTANCE.getDrop_DropCond();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.DmlMethodImpl <em>Dml Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.DmlMethodImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getDmlMethod()
		 * @generated
		 */
		EClass DML_METHOD = eINSTANCE.getDmlMethod();

		/**
		 * The meta object literal for the '<em><b>Dml Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DML_METHOD__DML_COLLECTION = eINSTANCE.getDmlMethod_DmlCollection();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.InsertImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__PATH = eINSTANCE.getInsert_Path();

		/**
		 * The meta object literal for the '<em><b>Nof Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__NOF_RECORDS = eINSTANCE.getInsert_NofRecords();

		/**
		 * The meta object literal for the '<em><b>No Of Records In Insert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSERT___NO_OF_RECORDS_IN_INSERT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInsert__NoOfRecordsInInsert__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.UpdateImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__PATH = eINSTANCE.getUpdate_Path();

		/**
		 * The meta object literal for the '<em><b>Nof Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__NOF_RECORDS = eINSTANCE.getUpdate_NofRecords();

		/**
		 * The meta object literal for the '<em><b>Update Cond</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__UPDATE_COND = eINSTANCE.getUpdate_UpdateCond();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__IDS = eINSTANCE.getUpdate_Ids();

		/**
		 * The meta object literal for the '<em><b>Unique IDs In Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATE___UNIQUE_IDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUpdate__UniqueIDsInUpdate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nof Records In Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATE___NOF_RECORDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUpdate__NofRecordsInUpdate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.DeleteImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__IDS = eINSTANCE.getDelete_Ids();

		/**
		 * The meta object literal for the '<em><b>Delete Cond</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE__DELETE_COND = eINSTANCE.getDelete_DeleteCond();

		/**
		 * The meta object literal for the '<em><b>Unique IDs In Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELETE___UNIQUE_IDS_IN_DELETE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDelete__UniqueIDsInDelete__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.QueryMethodImpl <em>Query Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.QueryMethodImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getQueryMethod()
		 * @generated
		 */
		EClass QUERY_METHOD = eINSTANCE.getQueryMethod();

		/**
		 * The meta object literal for the '<em><b>Top K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_METHOD__TOP_K = eINSTANCE.getQueryMethod_TopK();

		/**
		 * The meta object literal for the '<em><b>Query Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_METHOD__QUERY_COLLECTION = eINSTANCE.getQueryMethod_QueryCollection();

		/**
		 * The meta object literal for the '<em><b>Output Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_METHOD__OUTPUT_FIELDS = eINSTANCE.getQueryMethod_OutputFields();

		/**
		 * The meta object literal for the '<em><b>Output Fields QVC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQueryMethod__OutputFieldsQVC__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Top KValue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQueryMethod__TopKValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.FilterImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__OPERATOR = eINSTANCE.getFilter_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__VALUE = eINSTANCE.getFilter_Value();

		/**
		 * The meta object literal for the '<em><b>Filter Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER_FIELD = eINSTANCE.getFilter_FilterField();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.VectorSearchImpl <em>Vector Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.VectorSearchImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorSearch()
		 * @generated
		 */
		EClass VECTOR_SEARCH = eINSTANCE.getVectorSearch();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_SEARCH__METRIC = eINSTANCE.getVectorSearch_Metric();

		/**
		 * The meta object literal for the '<em><b>Num Units Probe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_SEARCH__NUM_UNITS_PROBE = eINSTANCE.getVectorSearch_NumUnitsProbe();

		/**
		 * The meta object literal for the '<em><b>Vec Search Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_SEARCH__VEC_SEARCH_FILTERS = eINSTANCE.getVectorSearch_VecSearchFilters();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.VectorDatabaseImpl <em>Vector Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.VectorDatabaseImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorDatabase()
		 * @generated
		 */
		EClass VECTOR_DATABASE = eINSTANCE.getVectorDatabase();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_DATABASE__CLUSTERS = eINSTANCE.getVectorDatabase_Clusters();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_DATABASE__CONNECTION = eINSTANCE.getVectorDatabase_Connection();

		/**
		 * The meta object literal for the '<em><b>Unique Cluster Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECTOR_DATABASE___UNIQUE_CLUSTER_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVectorDatabase__UniqueClusterName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.ConnectionImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__HOST = eINSTANCE.getConnection_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PORT = eINSTANCE.getConnection_Port();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__API_KEY = eINSTANCE.getConnection_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__USERNAME = eINSTANCE.getConnection_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PASSWORD = eINSTANCE.getConnection_Password();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__REGION = eINSTANCE.getConnection_Region();

		/**
		 * The meta object literal for the '<em><b>User Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__USER_ROLE = eINSTANCE.getConnection_UserRole();

		/**
		 * The meta object literal for the '<em><b>User Privillege</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__USER_PRIVILLEGE = eINSTANCE.getConnection_UserPrivillege();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CLOUD = eINSTANCE.getConnection_Cloud();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ENVIRONMENT = eINSTANCE.getConnection_Environment();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.ClusterImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__COLLECTIONS = eINSTANCE.getCluster_Collections();

		/**
		 * The meta object literal for the '<em><b>Nof Collections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__NOF_COLLECTIONS = eINSTANCE.getCluster_NofCollections();

		/**
		 * The meta object literal for the '<em><b>Vectordb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__VECTORDB = eINSTANCE.getCluster_Vectordb();

		/**
		 * The meta object literal for the '<em><b>Cluster Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__CLUSTER_LIMITS = eINSTANCE.getCluster_ClusterLimits();

		/**
		 * The meta object literal for the '<em><b>No Of Collections GT</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___NO_OF_COLLECTIONS_GT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__NoOfCollectionsGT__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Cluster Limits Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___CLUSTER_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__ClusterLimitsNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Collection Name In Cluster</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLUSTER___UNIQUE_COLLECTION_NAME_IN_CLUSTER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCluster__UniqueCollectionNameInCluster__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.VectorCollectionImpl <em>Vector Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.VectorCollectionImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorCollection()
		 * @generated
		 */
		EClass VECTOR_COLLECTION = eINSTANCE.getVectorCollection();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_COLLECTION__CLUSTER = eINSTANCE.getVectorCollection_Cluster();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_COLLECTION__PARTITIONS = eINSTANCE.getVectorCollection_Partitions();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_COLLECTION__FIELDS = eINSTANCE.getVectorCollection_Fields();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_COLLECTION__DYNAMIC = eINSTANCE.getVectorCollection_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Podtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_COLLECTION__PODTYPE = eINSTANCE.getVectorCollection_Podtype();

		/**
		 * The meta object literal for the '<em><b>Pod Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_COLLECTION__POD_SIZE = eINSTANCE.getVectorCollection_PodSize();

		/**
		 * The meta object literal for the '<em><b>Pod Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_COLLECTION__POD_ENV = eINSTANCE.getVectorCollection_PodEnv();

		/**
		 * The meta object literal for the '<em><b>Collection Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_COLLECTION__COLLECTION_LIMITS = eINSTANCE.getVectorCollection_CollectionLimits();

		/**
		 * The meta object literal for the '<em><b>Col Limits Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECTOR_COLLECTION___COL_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVectorCollection__ColLimitsNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.PartitionImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Col Part Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__COL_PART_OWNER = eINSTANCE.getPartition_ColPartOwner();

		/**
		 * The meta object literal for the '<em><b>Partition Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITION_KEY = eINSTANCE.getPartition_PartitionKey();

		/**
		 * The meta object literal for the '<em><b>Single Partition Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTITION___SINGLE_PARTITION_KEY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPartition__SinglePartitionKey__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.FieldImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Col Field Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__COL_FIELD_OWNER = eINSTANCE.getField_ColFieldOwner();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_PRIMARY = eINSTANCE.getField_IsPrimary();

		/**
		 * The meta object literal for the '<em><b>Field Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FIELD_LIMITS = eINSTANCE.getField_FieldLimits();

		/**
		 * The meta object literal for the '<em><b>Field Limits Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getField__FieldLimitsNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.IndexImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.LimitImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__VALUE = eINSTANCE.getLimit_Value();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.EmbeddingModelImpl <em>Embedding Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.EmbeddingModelImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEmbeddingModel()
		 * @generated
		 */
		EClass EMBEDDING_MODEL = eINSTANCE.getEmbeddingModel();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.ConceptImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__NAME = eINSTANCE.getConcept_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__DESCRIPTION = eINSTANCE.getConcept_Description();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.FieldLimitImpl <em>Field Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.FieldLimitImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getFieldLimit()
		 * @generated
		 */
		EClass FIELD_LIMIT = eINSTANCE.getFieldLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_LIMIT__TYPE = eINSTANCE.getFieldLimit_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.CollectionLimitImpl <em>Collection Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.CollectionLimitImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getCollectionLimit()
		 * @generated
		 */
		EClass COLLECTION_LIMIT = eINSTANCE.getCollectionLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_LIMIT__TYPE = eINSTANCE.getCollectionLimit_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.ClusterLimitImpl <em>Cluster Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.ClusterLimitImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getClusterLimit()
		 * @generated
		 */
		EClass CLUSTER_LIMIT = eINSTANCE.getClusterLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_LIMIT__TYPE = eINSTANCE.getClusterLimit_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.IndexLimitImpl <em>Index Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.IndexLimitImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getIndexLimit()
		 * @generated
		 */
		EClass INDEX_LIMIT = eINSTANCE.getIndexLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_LIMIT__TYPE = eINSTANCE.getIndexLimit_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.VectorIndexImpl <em>Vector Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.VectorIndexImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorIndex()
		 * @generated
		 */
		EClass VECTOR_INDEX = eINSTANCE.getVectorIndex();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_INDEX__METRIC = eINSTANCE.getVectorIndex_Metric();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_INDEX__TYPE = eINSTANCE.getVectorIndex_Type();

		/**
		 * The meta object literal for the '<em><b>VIndex Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_INDEX__VINDEX_LIMITS = eINSTANCE.getVectorIndex_VIndexLimits();

		/**
		 * The meta object literal for the '<em><b>VIdx Limits Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECTOR_INDEX___VIDX_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVectorIndex__VIdxLimitsNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.NonVectorSearchImpl <em>Non Vector Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.NonVectorSearchImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorSearch()
		 * @generated
		 */
		EClass NON_VECTOR_SEARCH = eINSTANCE.getNonVectorSearch();

		/**
		 * The meta object literal for the '<em><b>Non Vec Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_VECTOR_SEARCH__NON_VEC_FILTERS = eINSTANCE.getNonVectorSearch_NonVecFilters();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.NonVectorFieldImpl <em>Non Vector Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.NonVectorFieldImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorField()
		 * @generated
		 */
		EClass NON_VECTOR_FIELD = eINSTANCE.getNonVectorField();

		/**
		 * The meta object literal for the '<em><b>Non Vector Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_VECTOR_FIELD__NON_VECTOR_INDEXES = eINSTANCE.getNonVectorField_NonVectorIndexes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_VECTOR_FIELD__TYPE = eINSTANCE.getNonVectorField_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.VectorFieldImpl <em>Vector Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.VectorFieldImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getVectorField()
		 * @generated
		 */
		EClass VECTOR_FIELD = eINSTANCE.getVectorField();

		/**
		 * The meta object literal for the '<em><b>Vector Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_FIELD__VECTOR_INDEXES = eINSTANCE.getVectorField_VectorIndexes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_FIELD__TYPE = eINSTANCE.getVectorField_Type();

		/**
		 * The meta object literal for the '<em><b>Emb Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_FIELD__EMB_MODEL = eINSTANCE.getVectorField_EmbModel();

		/**
		 * The meta object literal for the '{@link vecdslMM.impl.NonVectorIndexImpl <em>Non Vector Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.impl.NonVectorIndexImpl
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getNonVectorIndex()
		 * @generated
		 */
		EClass NON_VECTOR_INDEX = eINSTANCE.getNonVectorIndex();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_VECTOR_INDEX__TYPE = eINSTANCE.getNonVectorIndex_Type();

		/**
		 * The meta object literal for the '{@link vecdslMM.EIndexLimit <em>EIndex Limit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EIndexLimit
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEIndexLimit()
		 * @generated
		 */
		EEnum EINDEX_LIMIT = eINSTANCE.getEIndexLimit();

		/**
		 * The meta object literal for the '{@link vecdslMM.EMetricType <em>EMetric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EMetricType
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEMetricType()
		 * @generated
		 */
		EEnum EMETRIC_TYPE = eINSTANCE.getEMetricType();

		/**
		 * The meta object literal for the '{@link vecdslMM.EScalarDType <em>EScalar DType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EScalarDType
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEScalarDType()
		 * @generated
		 */
		EEnum ESCALAR_DTYPE = eINSTANCE.getEScalarDType();

		/**
		 * The meta object literal for the '{@link vecdslMM.EClusterLimit <em>ECluster Limit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EClusterLimit
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEClusterLimit()
		 * @generated
		 */
		EEnum ECLUSTER_LIMIT = eINSTANCE.getEClusterLimit();

		/**
		 * The meta object literal for the '{@link vecdslMM.EVIdxType <em>EV Idx Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EVIdxType
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVIdxType()
		 * @generated
		 */
		EEnum EV_IDX_TYPE = eINSTANCE.getEVIdxType();

		/**
		 * The meta object literal for the '{@link vecdslMM.EPodSize <em>EPod Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EPodSize
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodSize()
		 * @generated
		 */
		EEnum EPOD_SIZE = eINSTANCE.getEPodSize();

		/**
		 * The meta object literal for the '{@link vecdslMM.EFieldLimit <em>EField Limit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EFieldLimit
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEFieldLimit()
		 * @generated
		 */
		EEnum EFIELD_LIMIT = eINSTANCE.getEFieldLimit();

		/**
		 * The meta object literal for the '{@link vecdslMM.EOperator <em>EOperator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EOperator
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEOperator()
		 * @generated
		 */
		EEnum EOPERATOR = eINSTANCE.getEOperator();

		/**
		 * The meta object literal for the '{@link vecdslMM.EPodTypes <em>EPod Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EPodTypes
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodTypes()
		 * @generated
		 */
		EEnum EPOD_TYPES = eINSTANCE.getEPodTypes();

		/**
		 * The meta object literal for the '{@link vecdslMM.EPodEnv <em>EPod Env</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EPodEnv
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEPodEnv()
		 * @generated
		 */
		EEnum EPOD_ENV = eINSTANCE.getEPodEnv();

		/**
		 * The meta object literal for the '{@link vecdslMM.EColectionLimit <em>EColection Limit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EColectionLimit
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEColectionLimit()
		 * @generated
		 */
		EEnum ECOLECTION_LIMIT = eINSTANCE.getEColectionLimit();

		/**
		 * The meta object literal for the '{@link vecdslMM.EVendorName <em>EVendor Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EVendorName
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVendorName()
		 * @generated
		 */
		EEnum EVENDOR_NAME = eINSTANCE.getEVendorName();

		/**
		 * The meta object literal for the '{@link vecdslMM.ENVIdxType <em>ENV Idx Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.ENVIdxType
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getENVIdxType()
		 * @generated
		 */
		EEnum ENV_IDX_TYPE = eINSTANCE.getENVIdxType();

		/**
		 * The meta object literal for the '{@link vecdslMM.EVectorDType <em>EVector DType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vecdslMM.EVectorDType
		 * @see vecdslMM.impl.VecdslMMPackageImpl#getEVectorDType()
		 * @generated
		 */
		EEnum EVECTOR_DTYPE = eINSTANCE.getEVectorDType();

	}

} //VecdslMMPackage
