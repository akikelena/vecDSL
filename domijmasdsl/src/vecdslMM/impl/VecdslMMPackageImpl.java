/**
 */
package vecdslMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vecdslMM.Alter;
import vecdslMM.Cluster;
import vecdslMM.ClusterLimit;
import vecdslMM.CollectionLimit;
import vecdslMM.Concept;
import vecdslMM.Connection;
import vecdslMM.Create;
import vecdslMM.DdlMethod;
import vecdslMM.Delete;
import vecdslMM.DmlMethod;
import vecdslMM.Drop;
import vecdslMM.EClusterLimit;
import vecdslMM.EColectionLimit;
import vecdslMM.EFieldLimit;
import vecdslMM.EIndexLimit;
import vecdslMM.EMetricType;
import vecdslMM.ENVIdxType;
import vecdslMM.EOperator;
import vecdslMM.EPodEnv;
import vecdslMM.EPodSize;
import vecdslMM.EPodTypes;
import vecdslMM.EScalarDType;
import vecdslMM.EVIdxType;
import vecdslMM.EVectorDType;
import vecdslMM.EVendorName;
import vecdslMM.EmbeddingModel;
import vecdslMM.Field;
import vecdslMM.FieldLimit;
import vecdslMM.Filter;
import vecdslMM.Index;
import vecdslMM.IndexLimit;
import vecdslMM.Insert;
import vecdslMM.Limit;
import vecdslMM.Method;
import vecdslMM.NonVectorField;
import vecdslMM.NonVectorIndex;
import vecdslMM.NonVectorSearch;
import vecdslMM.Partition;
import vecdslMM.QueryMethod;
import vecdslMM.Script;
import vecdslMM.Update;
import vecdslMM.VecdslMMFactory;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;
import vecdslMM.VectorDatabase;
import vecdslMM.VectorField;
import vecdslMM.VectorIndex;
import vecdslMM.VectorSearch;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VecdslMMPackageImpl extends EPackageImpl implements VecdslMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddlMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmlMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonVectorSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonVectorFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonVectorIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eIndexLimitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eMetricTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eScalarDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eClusterLimitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evIdxTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePodSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eFieldLimitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePodTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePodEnvEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eColectionLimitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eVendorNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum envIdxTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eVectorDTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vecdslMM.VecdslMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VecdslMMPackageImpl() {
		super(eNS_URI, VecdslMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VecdslMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VecdslMMPackage init() {
		if (isInited) return (VecdslMMPackage)EPackage.Registry.INSTANCE.getEPackage(VecdslMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVecdslMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VecdslMMPackageImpl theVecdslMMPackage = registeredVecdslMMPackage instanceof VecdslMMPackageImpl ? (VecdslMMPackageImpl)registeredVecdslMMPackage : new VecdslMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVecdslMMPackage.createPackageContents();

		// Initialize created meta-data
		theVecdslMMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVecdslMMPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VecdslMMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVecdslMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VecdslMMPackage.eNS_URI, theVecdslMMPackage);
		return theVecdslMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Methods() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Vendor() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdlMethod() {
		return ddlMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdlMethod_DdlConcept() {
		return (EReference)ddlMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdlMethod_DdlNode() {
		return (EReference)ddlMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlter() {
		return alterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlter_AlterCond() {
		return (EReference)alterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrop_DropCond() {
		return (EReference)dropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmlMethod() {
		return dmlMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmlMethod_DmlCollection() {
		return (EReference)dmlMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsert() {
		return insertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsert_Path() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsert_NofRecords() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInsert__NoOfRecordsInInsert__DiagnosticChain_Map() {
		return insertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdate_Path() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdate_NofRecords() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdate_UpdateCond() {
		return (EReference)updateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdate_Ids() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUpdate__UniqueIDsInUpdate__DiagnosticChain_Map() {
		return updateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUpdate__NofRecordsInUpdate__DiagnosticChain_Map() {
		return updateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_Ids() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelete_DeleteCond() {
		return (EReference)deleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelete__UniqueIDsInDelete__DiagnosticChain_Map() {
		return deleteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryMethod() {
		return queryMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryMethod_TopK() {
		return (EAttribute)queryMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethod_QueryCollection() {
		return (EReference)queryMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMethod_OutputFields() {
		return (EReference)queryMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQueryMethod__OutputFieldsQVC__DiagnosticChain_Map() {
		return queryMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQueryMethod__TopKValue__DiagnosticChain_Map() {
		return queryMethodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Operator() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Value() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_FilterField() {
		return (EReference)filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorSearch() {
		return vectorSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorSearch_Metric() {
		return (EAttribute)vectorSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorSearch_NumUnitsProbe() {
		return (EAttribute)vectorSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorSearch_VecSearchFilters() {
		return (EReference)vectorSearchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorDatabase() {
		return vectorDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorDatabase_Clusters() {
		return (EReference)vectorDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorDatabase_Connection() {
		return (EReference)vectorDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVectorDatabase__UniqueClusterName__DiagnosticChain_Map() {
		return vectorDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Host() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Port() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_ApiKey() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Username() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Password() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Region() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_UserRole() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_UserPrivillege() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Cloud() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Environment() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Collections() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_NofCollections() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Vectordb() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_ClusterLimits() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__NoOfCollectionsGT__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__ClusterLimitsNames__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__UniqueCollectionNameInCluster__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorCollection() {
		return vectorCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorCollection_Cluster() {
		return (EReference)vectorCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorCollection_Partitions() {
		return (EReference)vectorCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorCollection_Fields() {
		return (EReference)vectorCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorCollection_Dynamic() {
		return (EAttribute)vectorCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorCollection_Podtype() {
		return (EAttribute)vectorCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorCollection_PodSize() {
		return (EAttribute)vectorCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorCollection_PodEnv() {
		return (EAttribute)vectorCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorCollection_CollectionLimits() {
		return (EReference)vectorCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVectorCollection__ColLimitsNames__DiagnosticChain_Map() {
		return vectorCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ColPartOwner() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_PartitionKey() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartition__SinglePartitionKey__DiagnosticChain_Map() {
		return partitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_ColFieldOwner() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_IsPrimary() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_FieldLimits() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getField__FieldLimitsNames__DiagnosticChain_Map() {
		return fieldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimit() {
		return limitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Value() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddingModel() {
		return embeddingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_Name() {
		return (EAttribute)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_Description() {
		return (EAttribute)conceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldLimit() {
		return fieldLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldLimit_Type() {
		return (EAttribute)fieldLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionLimit() {
		return collectionLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionLimit_Type() {
		return (EAttribute)collectionLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterLimit() {
		return clusterLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusterLimit_Type() {
		return (EAttribute)clusterLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexLimit() {
		return indexLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexLimit_Type() {
		return (EAttribute)indexLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorIndex() {
		return vectorIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorIndex_Metric() {
		return (EAttribute)vectorIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorIndex_Type() {
		return (EAttribute)vectorIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorIndex_VIndexLimits() {
		return (EReference)vectorIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVectorIndex__VIdxLimitsNames__DiagnosticChain_Map() {
		return vectorIndexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonVectorSearch() {
		return nonVectorSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonVectorSearch_NonVecFilters() {
		return (EReference)nonVectorSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonVectorField() {
		return nonVectorFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonVectorField_NonVectorIndexes() {
		return (EReference)nonVectorFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonVectorField_Type() {
		return (EAttribute)nonVectorFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorField() {
		return vectorFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorField_VectorIndexes() {
		return (EReference)vectorFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorField_Type() {
		return (EAttribute)vectorFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorField_EmbModel() {
		return (EReference)vectorFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonVectorIndex() {
		return nonVectorIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonVectorIndex_Type() {
		return (EAttribute)nonVectorIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEIndexLimit() {
		return eIndexLimitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEMetricType() {
		return eMetricTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEScalarDType() {
		return eScalarDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEClusterLimit() {
		return eClusterLimitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVIdxType() {
		return evIdxTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEPodSize() {
		return ePodSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEFieldLimit() {
		return eFieldLimitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEOperator() {
		return eOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEPodTypes() {
		return ePodTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEPodEnv() {
		return ePodEnvEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEColectionLimit() {
		return eColectionLimitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVendorName() {
		return eVendorNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getENVIdxType() {
		return envIdxTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVectorDType() {
		return eVectorDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecdslMMFactory getVecdslMMFactory() {
		return (VecdslMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__METHODS);
		createEAttribute(scriptEClass, SCRIPT__VENDOR);

		methodEClass = createEClass(METHOD);

		ddlMethodEClass = createEClass(DDL_METHOD);
		createEReference(ddlMethodEClass, DDL_METHOD__DDL_CONCEPT);
		createEReference(ddlMethodEClass, DDL_METHOD__DDL_NODE);

		createEClass = createEClass(CREATE);

		alterEClass = createEClass(ALTER);
		createEReference(alterEClass, ALTER__ALTER_COND);

		dropEClass = createEClass(DROP);
		createEReference(dropEClass, DROP__DROP_COND);

		dmlMethodEClass = createEClass(DML_METHOD);
		createEReference(dmlMethodEClass, DML_METHOD__DML_COLLECTION);

		insertEClass = createEClass(INSERT);
		createEAttribute(insertEClass, INSERT__PATH);
		createEAttribute(insertEClass, INSERT__NOF_RECORDS);
		createEOperation(insertEClass, INSERT___NO_OF_RECORDS_IN_INSERT__DIAGNOSTICCHAIN_MAP);

		updateEClass = createEClass(UPDATE);
		createEAttribute(updateEClass, UPDATE__PATH);
		createEAttribute(updateEClass, UPDATE__NOF_RECORDS);
		createEReference(updateEClass, UPDATE__UPDATE_COND);
		createEAttribute(updateEClass, UPDATE__IDS);
		createEOperation(updateEClass, UPDATE___UNIQUE_IDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(updateEClass, UPDATE___NOF_RECORDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__IDS);
		createEReference(deleteEClass, DELETE__DELETE_COND);
		createEOperation(deleteEClass, DELETE___UNIQUE_IDS_IN_DELETE__DIAGNOSTICCHAIN_MAP);

		queryMethodEClass = createEClass(QUERY_METHOD);
		createEAttribute(queryMethodEClass, QUERY_METHOD__TOP_K);
		createEReference(queryMethodEClass, QUERY_METHOD__QUERY_COLLECTION);
		createEReference(queryMethodEClass, QUERY_METHOD__OUTPUT_FIELDS);
		createEOperation(queryMethodEClass, QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP);
		createEOperation(queryMethodEClass, QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__OPERATOR);
		createEAttribute(filterEClass, FILTER__VALUE);
		createEReference(filterEClass, FILTER__FILTER_FIELD);

		vectorSearchEClass = createEClass(VECTOR_SEARCH);
		createEAttribute(vectorSearchEClass, VECTOR_SEARCH__METRIC);
		createEAttribute(vectorSearchEClass, VECTOR_SEARCH__NUM_UNITS_PROBE);
		createEReference(vectorSearchEClass, VECTOR_SEARCH__VEC_SEARCH_FILTERS);

		vectorDatabaseEClass = createEClass(VECTOR_DATABASE);
		createEReference(vectorDatabaseEClass, VECTOR_DATABASE__CLUSTERS);
		createEReference(vectorDatabaseEClass, VECTOR_DATABASE__CONNECTION);
		createEOperation(vectorDatabaseEClass, VECTOR_DATABASE___UNIQUE_CLUSTER_NAME__DIAGNOSTICCHAIN_MAP);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__HOST);
		createEAttribute(connectionEClass, CONNECTION__PORT);
		createEAttribute(connectionEClass, CONNECTION__API_KEY);
		createEAttribute(connectionEClass, CONNECTION__USERNAME);
		createEAttribute(connectionEClass, CONNECTION__PASSWORD);
		createEAttribute(connectionEClass, CONNECTION__REGION);
		createEAttribute(connectionEClass, CONNECTION__USER_ROLE);
		createEAttribute(connectionEClass, CONNECTION__USER_PRIVILLEGE);
		createEAttribute(connectionEClass, CONNECTION__CLOUD);
		createEAttribute(connectionEClass, CONNECTION__ENVIRONMENT);

		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__COLLECTIONS);
		createEAttribute(clusterEClass, CLUSTER__NOF_COLLECTIONS);
		createEReference(clusterEClass, CLUSTER__VECTORDB);
		createEReference(clusterEClass, CLUSTER__CLUSTER_LIMITS);
		createEOperation(clusterEClass, CLUSTER___NO_OF_COLLECTIONS_GT__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___CLUSTER_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___UNIQUE_COLLECTION_NAME_IN_CLUSTER__DIAGNOSTICCHAIN_MAP);

		vectorCollectionEClass = createEClass(VECTOR_COLLECTION);
		createEReference(vectorCollectionEClass, VECTOR_COLLECTION__CLUSTER);
		createEReference(vectorCollectionEClass, VECTOR_COLLECTION__PARTITIONS);
		createEReference(vectorCollectionEClass, VECTOR_COLLECTION__FIELDS);
		createEAttribute(vectorCollectionEClass, VECTOR_COLLECTION__DYNAMIC);
		createEAttribute(vectorCollectionEClass, VECTOR_COLLECTION__PODTYPE);
		createEAttribute(vectorCollectionEClass, VECTOR_COLLECTION__POD_SIZE);
		createEAttribute(vectorCollectionEClass, VECTOR_COLLECTION__POD_ENV);
		createEReference(vectorCollectionEClass, VECTOR_COLLECTION__COLLECTION_LIMITS);
		createEOperation(vectorCollectionEClass, VECTOR_COLLECTION___COL_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP);

		partitionEClass = createEClass(PARTITION);
		createEReference(partitionEClass, PARTITION__COL_PART_OWNER);
		createEReference(partitionEClass, PARTITION__PARTITION_KEY);
		createEOperation(partitionEClass, PARTITION___SINGLE_PARTITION_KEY__DIAGNOSTICCHAIN_MAP);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__COL_FIELD_OWNER);
		createEAttribute(fieldEClass, FIELD__IS_PRIMARY);
		createEReference(fieldEClass, FIELD__FIELD_LIMITS);
		createEOperation(fieldEClass, FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP);

		indexEClass = createEClass(INDEX);

		limitEClass = createEClass(LIMIT);
		createEAttribute(limitEClass, LIMIT__VALUE);

		embeddingModelEClass = createEClass(EMBEDDING_MODEL);

		conceptEClass = createEClass(CONCEPT);
		createEAttribute(conceptEClass, CONCEPT__NAME);
		createEAttribute(conceptEClass, CONCEPT__DESCRIPTION);

		fieldLimitEClass = createEClass(FIELD_LIMIT);
		createEAttribute(fieldLimitEClass, FIELD_LIMIT__TYPE);

		collectionLimitEClass = createEClass(COLLECTION_LIMIT);
		createEAttribute(collectionLimitEClass, COLLECTION_LIMIT__TYPE);

		clusterLimitEClass = createEClass(CLUSTER_LIMIT);
		createEAttribute(clusterLimitEClass, CLUSTER_LIMIT__TYPE);

		indexLimitEClass = createEClass(INDEX_LIMIT);
		createEAttribute(indexLimitEClass, INDEX_LIMIT__TYPE);

		vectorIndexEClass = createEClass(VECTOR_INDEX);
		createEAttribute(vectorIndexEClass, VECTOR_INDEX__METRIC);
		createEAttribute(vectorIndexEClass, VECTOR_INDEX__TYPE);
		createEReference(vectorIndexEClass, VECTOR_INDEX__VINDEX_LIMITS);
		createEOperation(vectorIndexEClass, VECTOR_INDEX___VIDX_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP);

		nonVectorSearchEClass = createEClass(NON_VECTOR_SEARCH);
		createEReference(nonVectorSearchEClass, NON_VECTOR_SEARCH__NON_VEC_FILTERS);

		nonVectorFieldEClass = createEClass(NON_VECTOR_FIELD);
		createEReference(nonVectorFieldEClass, NON_VECTOR_FIELD__NON_VECTOR_INDEXES);
		createEAttribute(nonVectorFieldEClass, NON_VECTOR_FIELD__TYPE);

		vectorFieldEClass = createEClass(VECTOR_FIELD);
		createEReference(vectorFieldEClass, VECTOR_FIELD__VECTOR_INDEXES);
		createEAttribute(vectorFieldEClass, VECTOR_FIELD__TYPE);
		createEReference(vectorFieldEClass, VECTOR_FIELD__EMB_MODEL);

		nonVectorIndexEClass = createEClass(NON_VECTOR_INDEX);
		createEAttribute(nonVectorIndexEClass, NON_VECTOR_INDEX__TYPE);

		// Create enums
		eIndexLimitEEnum = createEEnum(EINDEX_LIMIT);
		eMetricTypeEEnum = createEEnum(EMETRIC_TYPE);
		eScalarDTypeEEnum = createEEnum(ESCALAR_DTYPE);
		eClusterLimitEEnum = createEEnum(ECLUSTER_LIMIT);
		evIdxTypeEEnum = createEEnum(EV_IDX_TYPE);
		ePodSizeEEnum = createEEnum(EPOD_SIZE);
		eFieldLimitEEnum = createEEnum(EFIELD_LIMIT);
		eOperatorEEnum = createEEnum(EOPERATOR);
		ePodTypesEEnum = createEEnum(EPOD_TYPES);
		ePodEnvEEnum = createEEnum(EPOD_ENV);
		eColectionLimitEEnum = createEEnum(ECOLECTION_LIMIT);
		eVendorNameEEnum = createEEnum(EVENDOR_NAME);
		envIdxTypeEEnum = createEEnum(ENV_IDX_TYPE);
		eVectorDTypeEEnum = createEEnum(EVECTOR_DTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddlMethodEClass.getESuperTypes().add(this.getMethod());
		createEClass.getESuperTypes().add(this.getDdlMethod());
		alterEClass.getESuperTypes().add(this.getDdlMethod());
		dropEClass.getESuperTypes().add(this.getDdlMethod());
		dmlMethodEClass.getESuperTypes().add(this.getMethod());
		insertEClass.getESuperTypes().add(this.getDmlMethod());
		updateEClass.getESuperTypes().add(this.getDmlMethod());
		deleteEClass.getESuperTypes().add(this.getDmlMethod());
		queryMethodEClass.getESuperTypes().add(this.getMethod());
		vectorSearchEClass.getESuperTypes().add(this.getQueryMethod());
		vectorDatabaseEClass.getESuperTypes().add(this.getConcept());
		clusterEClass.getESuperTypes().add(this.getConcept());
		vectorCollectionEClass.getESuperTypes().add(this.getConcept());
		partitionEClass.getESuperTypes().add(this.getConcept());
		fieldEClass.getESuperTypes().add(this.getConcept());
		indexEClass.getESuperTypes().add(this.getConcept());
		limitEClass.getESuperTypes().add(this.getConcept());
		embeddingModelEClass.getESuperTypes().add(this.getConcept());
		fieldLimitEClass.getESuperTypes().add(this.getLimit());
		collectionLimitEClass.getESuperTypes().add(this.getLimit());
		clusterLimitEClass.getESuperTypes().add(this.getLimit());
		indexLimitEClass.getESuperTypes().add(this.getLimit());
		vectorIndexEClass.getESuperTypes().add(this.getIndex());
		nonVectorSearchEClass.getESuperTypes().add(this.getQueryMethod());
		nonVectorFieldEClass.getESuperTypes().add(this.getField());
		vectorFieldEClass.getESuperTypes().add(this.getField());
		nonVectorIndexEClass.getESuperTypes().add(this.getIndex());

		// Initialize classes, features, and operations; add parameters
		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Methods(), this.getMethod(), null, "methods", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Vendor(), this.getEVendorName(), "vendor", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddlMethodEClass, DdlMethod.class, "DdlMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdlMethod_DdlConcept(), this.getConcept(), null, "ddlConcept", null, 1, 1, DdlMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDdlMethod_DdlNode(), this.getDdlMethod(), null, "ddlNode", null, 0, -1, DdlMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alterEClass, Alter.class, "Alter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlter_AlterCond(), this.getFilter(), null, "alterCond", null, 1, -1, Alter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrop_DropCond(), this.getFilter(), null, "dropCond", null, 0, -1, Drop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmlMethodEClass, DmlMethod.class, "DmlMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmlMethod_DmlCollection(), this.getVectorCollection(), null, "dmlCollection", null, 1, 1, DmlMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsert_Path(), ecorePackage.getEString(), "path", null, 1, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsert_NofRecords(), ecorePackage.getEInt(), "nofRecords", null, 1, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getInsert__NoOfRecordsInInsert__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOfRecordsInInsert", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdate_Path(), ecorePackage.getEString(), "path", null, 1, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdate_NofRecords(), ecorePackage.getEInt(), "nofRecords", null, 1, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdate_UpdateCond(), this.getFilter(), null, "updateCond", null, 1, -1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getUpdate_Ids(), g1, "ids", null, 0, 1, Update.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUpdate__UniqueIDsInUpdate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueIDsInUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUpdate__NofRecordsInUpdate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NofRecordsInUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getDelete_Ids(), g1, "ids", null, 0, 1, Delete.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelete_DeleteCond(), this.getFilter(), null, "deleteCond", null, 0, -1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDelete__UniqueIDsInDelete__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueIDsInDelete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryMethodEClass, QueryMethod.class, "QueryMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryMethod_TopK(), ecorePackage.getEInt(), "topK", null, 1, 1, QueryMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryMethod_QueryCollection(), this.getVectorCollection(), null, "queryCollection", null, 1, 1, QueryMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryMethod_OutputFields(), this.getField(), null, "outputFields", null, 1, -1, QueryMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getQueryMethod__OutputFieldsQVC__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutputFieldsQVC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQueryMethod__TopKValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TopKValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Operator(), this.getEOperator(), "operator", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_FilterField(), this.getConcept(), null, "filterField", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorSearchEClass, VectorSearch.class, "VectorSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVectorSearch_Metric(), this.getEMetricType(), "metric", null, 1, 1, VectorSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorSearch_NumUnitsProbe(), ecorePackage.getEInt(), "numUnitsProbe", "8", 1, 1, VectorSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorSearch_VecSearchFilters(), this.getFilter(), null, "vecSearchFilters", null, 0, -1, VectorSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorDatabaseEClass, VectorDatabase.class, "VectorDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorDatabase_Clusters(), this.getCluster(), this.getCluster_Vectordb(), "clusters", null, 0, -1, VectorDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorDatabase_Connection(), this.getConnection(), null, "connection", null, 1, 1, VectorDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVectorDatabase__UniqueClusterName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueClusterName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Host(), ecorePackage.getEString(), "host", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Port(), ecorePackage.getEInt(), "port", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_ApiKey(), ecorePackage.getEString(), "apiKey", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Username(), ecorePackage.getEString(), "username", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Password(), ecorePackage.getEString(), "password", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Region(), ecorePackage.getEString(), "region", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_UserRole(), ecorePackage.getEString(), "userRole", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_UserPrivillege(), ecorePackage.getEString(), "userPrivillege", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Cloud(), ecorePackage.getEString(), "cloud", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Collections(), this.getVectorCollection(), this.getVectorCollection_Cluster(), "collections", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_NofCollections(), ecorePackage.getEInt(), "nofCollections", null, 1, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Vectordb(), this.getVectorDatabase(), this.getVectorDatabase_Clusters(), "vectordb", null, 1, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_ClusterLimits(), this.getClusterLimit(), null, "clusterLimits", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCluster__NoOfCollectionsGT__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOfCollectionsGT", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__ClusterLimitsNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "clusterLimitsNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__UniqueCollectionNameInCluster__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueCollectionNameInCluster", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vectorCollectionEClass, VectorCollection.class, "VectorCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorCollection_Cluster(), this.getCluster(), this.getCluster_Collections(), "cluster", null, 1, 1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorCollection_Partitions(), this.getPartition(), this.getPartition_ColPartOwner(), "partitions", null, 0, -1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorCollection_Fields(), this.getField(), this.getField_ColFieldOwner(), "fields", null, 0, -1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorCollection_Dynamic(), ecorePackage.getEBoolean(), "dynamic", null, 1, 1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorCollection_Podtype(), this.getEPodTypes(), "podtype", null, 0, 1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorCollection_PodSize(), this.getEPodSize(), "podSize", null, 0, 1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorCollection_PodEnv(), this.getEPodEnv(), "podEnv", null, 0, 1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorCollection_CollectionLimits(), this.getCollectionLimit(), null, "collectionLimits", null, 0, -1, VectorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVectorCollection__ColLimitsNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "colLimitsNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartition_ColPartOwner(), this.getVectorCollection(), this.getVectorCollection_Partitions(), "colPartOwner", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_PartitionKey(), this.getField(), null, "partitionKey", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPartition__SinglePartitionKey__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SinglePartitionKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_ColFieldOwner(), this.getVectorCollection(), this.getVectorCollection_Fields(), "colFieldOwner", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_IsPrimary(), ecorePackage.getEBoolean(), "isPrimary", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_FieldLimits(), this.getFieldLimit(), null, "fieldLimits", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getField__FieldLimitsNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "fieldLimitsNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(limitEClass, Limit.class, "Limit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimit_Value(), ecorePackage.getEString(), "value", null, 1, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddingModelEClass, EmbeddingModel.class, "EmbeddingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptEClass, Concept.class, "Concept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcept_Name(), ecorePackage.getEString(), "name", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcept_Description(), ecorePackage.getEString(), "description", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldLimitEClass, FieldLimit.class, "FieldLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldLimit_Type(), this.getEFieldLimit(), "type", null, 1, 1, FieldLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionLimitEClass, CollectionLimit.class, "CollectionLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionLimit_Type(), this.getEColectionLimit(), "type", null, 1, 1, CollectionLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterLimitEClass, ClusterLimit.class, "ClusterLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClusterLimit_Type(), this.getEClusterLimit(), "type", null, 1, 1, ClusterLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexLimitEClass, IndexLimit.class, "IndexLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexLimit_Type(), this.getEIndexLimit(), "type", null, 1, 1, IndexLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorIndexEClass, VectorIndex.class, "VectorIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVectorIndex_Metric(), this.getEMetricType(), "metric", null, 1, 1, VectorIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorIndex_Type(), this.getEVIdxType(), "type", null, 1, 1, VectorIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorIndex_VIndexLimits(), this.getIndexLimit(), null, "vIndexLimits", null, 0, -1, VectorIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVectorIndex__VIdxLimitsNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "vIdxLimitsNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nonVectorSearchEClass, NonVectorSearch.class, "NonVectorSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonVectorSearch_NonVecFilters(), this.getFilter(), null, "nonVecFilters", null, 0, -1, NonVectorSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonVectorFieldEClass, NonVectorField.class, "NonVectorField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonVectorField_NonVectorIndexes(), this.getNonVectorIndex(), null, "nonVectorIndexes", null, 0, -1, NonVectorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonVectorField_Type(), this.getEScalarDType(), "type", null, 1, 1, NonVectorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorFieldEClass, VectorField.class, "VectorField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorField_VectorIndexes(), this.getVectorIndex(), null, "vectorIndexes", null, 0, -1, VectorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorField_Type(), this.getEVectorDType(), "type", null, 1, 1, VectorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorField_EmbModel(), this.getEmbeddingModel(), null, "embModel", null, 0, 1, VectorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonVectorIndexEClass, NonVectorIndex.class, "NonVectorIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonVectorIndex_Type(), this.getENVIdxType(), "type", null, 1, 1, NonVectorIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eIndexLimitEEnum, EIndexLimit.class, "EIndexLimit");
		addEEnumLiteral(eIndexLimitEEnum, EIndexLimit.NOFCLUSTERUNIT);
		addEEnumLiteral(eIndexLimitEEnum, EIndexLimit.NOFFACTORSPQ);
		addEEnumLiteral(eIndexLimitEEnum, EIndexLimit.MAXNODEDGRE);

		initEEnum(eMetricTypeEEnum, EMetricType.class, "EMetricType");
		addEEnumLiteral(eMetricTypeEEnum, EMetricType.EUCLIDEAN);
		addEEnumLiteral(eMetricTypeEEnum, EMetricType.MANHATTAN);
		addEEnumLiteral(eMetricTypeEEnum, EMetricType.DOT);
		addEEnumLiteral(eMetricTypeEEnum, EMetricType.COSINE);

		initEEnum(eScalarDTypeEEnum, EScalarDType.class, "EScalarDType");
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.INT);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.VARCHAR);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.DOUBLE);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.FLOAT);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.DATE);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.DATETIME);
		addEEnumLiteral(eScalarDTypeEEnum, EScalarDType.JSON);

		initEEnum(eClusterLimitEEnum, EClusterLimit.class, "EClusterLimit");
		addEEnumLiteral(eClusterLimitEEnum, EClusterLimit.NOFCOLLECTIONS);

		initEEnum(evIdxTypeEEnum, EVIdxType.class, "EVIdxType");
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.FLAT);
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.IVF_FLAT);
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.IVF_SQ8);
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.IVF_PQ);
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.HNSW);
		addEEnumLiteral(evIdxTypeEEnum, EVIdxType.SCANN);

		initEEnum(ePodSizeEEnum, EPodSize.class, "EPodSize");
		addEEnumLiteral(ePodSizeEEnum, EPodSize.X1);
		addEEnumLiteral(ePodSizeEEnum, EPodSize.X2);
		addEEnumLiteral(ePodSizeEEnum, EPodSize.X4);
		addEEnumLiteral(ePodSizeEEnum, EPodSize.X8);

		initEEnum(eFieldLimitEEnum, EFieldLimit.class, "EFieldLimit");
		addEEnumLiteral(eFieldLimitEEnum, EFieldLimit.VECTORDIM);
		addEEnumLiteral(eFieldLimitEEnum, EFieldLimit.ARRAYLEN);
		addEEnumLiteral(eFieldLimitEEnum, EFieldLimit.MAXSIZE);

		initEEnum(eOperatorEEnum, EOperator.class, "EOperator");
		addEEnumLiteral(eOperatorEEnum, EOperator.AND);
		addEEnumLiteral(eOperatorEEnum, EOperator.OR);
		addEEnumLiteral(eOperatorEEnum, EOperator.NOT);
		addEEnumLiteral(eOperatorEEnum, EOperator.LIKE);
		addEEnumLiteral(eOperatorEEnum, EOperator.EQ);
		addEEnumLiteral(eOperatorEEnum, EOperator.NEQ);
		addEEnumLiteral(eOperatorEEnum, EOperator.GT);
		addEEnumLiteral(eOperatorEEnum, EOperator.GTE);
		addEEnumLiteral(eOperatorEEnum, EOperator.LT);
		addEEnumLiteral(eOperatorEEnum, EOperator.LTE);

		initEEnum(ePodTypesEEnum, EPodTypes.class, "EPodTypes");
		addEEnumLiteral(ePodTypesEEnum, EPodTypes.S1);
		addEEnumLiteral(ePodTypesEEnum, EPodTypes.P1);
		addEEnumLiteral(ePodTypesEEnum, EPodTypes.P2);

		initEEnum(ePodEnvEEnum, EPodEnv.class, "EPodEnv");
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_W1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_C1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_W4_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_E4_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.NA_NE1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.ANE1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.ASE1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_E1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.EU_W1_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.EU_W4_GCP);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.US_E1_AWS);
		addEEnumLiteral(ePodEnvEEnum, EPodEnv.AZURE);

		initEEnum(eColectionLimitEEnum, EColectionLimit.class, "EColectionLimit");
		addEEnumLiteral(eColectionLimitEEnum, EColectionLimit.NOFPARTITIONS);
		addEEnumLiteral(eColectionLimitEEnum, EColectionLimit.NOFFIELDS);
		addEEnumLiteral(eColectionLimitEEnum, EColectionLimit.NOFSHARDS);
		addEEnumLiteral(eColectionLimitEEnum, EColectionLimit.VECTORDIM);

		initEEnum(eVendorNameEEnum, EVendorName.class, "EVendorName");
		addEEnumLiteral(eVendorNameEEnum, EVendorName.PINECONE);
		addEEnumLiteral(eVendorNameEEnum, EVendorName.MILVUS);
		addEEnumLiteral(eVendorNameEEnum, EVendorName.CHROMA);
		addEEnumLiteral(eVendorNameEEnum, EVendorName.WEAVIATE);
		addEEnumLiteral(eVendorNameEEnum, EVendorName.QDRANT);

		initEEnum(envIdxTypeEEnum, ENVIdxType.class, "ENVIdxType");
		addEEnumLiteral(envIdxTypeEEnum, ENVIdxType.STANDARD);
		addEEnumLiteral(envIdxTypeEEnum, ENVIdxType.FULL_TEXT);
		addEEnumLiteral(envIdxTypeEEnum, ENVIdxType.INTEGER);
		addEEnumLiteral(envIdxTypeEEnum, ENVIdxType.PARAM_INT);

		initEEnum(eVectorDTypeEEnum, EVectorDType.class, "EVectorDType");
		addEEnumLiteral(eVectorDTypeEEnum, EVectorDType.BINARY_VECTOR);
		addEEnumLiteral(eVectorDTypeEEnum, EVectorDType.FLOAT_VECTOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (insertEClass,
		   source,
		   new String[] {
			   "constraints", "NoOfRecordsInInsert"
		   });
		addAnnotation
		  (updateEClass,
		   source,
		   new String[] {
			   "constraints", "NofRecordsInUpdate"
		   });
		addAnnotation
		  (deleteEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueIDsInDelete"
		   });
		addAnnotation
		  (queryMethodEClass,
		   source,
		   new String[] {
			   "constraints", "TopKValue"
		   });
		addAnnotation
		  (vectorDatabaseEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueClusterName"
		   });
		addAnnotation
		  (clusterEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueCollectionNameInCluster"
		   });
		addAnnotation
		  (vectorCollectionEClass,
		   source,
		   new String[] {
			   "constraints", "colLimitsNames"
		   });
		addAnnotation
		  (partitionEClass,
		   source,
		   new String[] {
			   "constraints", "SinglePartitionKey"
		   });
		addAnnotation
		  (fieldEClass,
		   source,
		   new String[] {
			   "constraints", "fieldLimitsNames"
		   });
		addAnnotation
		  (vectorIndexEClass,
		   source,
		   new String[] {
			   "constraints", "vIdxLimitsNames"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getInsert__NoOfRecordsInInsert__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Number of records must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofRecords->notEmpty() implies self.nofRecords > 0\n}.status"
		   });
		addAnnotation
		  (getUpdate__UniqueIDsInUpdate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Identifiers must not repeat!\',\n\tstatus : Boolean = \n    \t\tself.ids->isUnique(id | id)\n}.status"
		   });
		addAnnotation
		  (getUpdate__NofRecordsInUpdate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Number of records must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofRecords->notEmpty() implies self.nofRecords > 0\n}.status"
		   });
		addAnnotation
		  (getDelete__UniqueIDsInDelete__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Identifiers must not repeat!\',\n\tstatus : Boolean = \n    \t\tself.ids->isUnique(id | id)\n}.status"
		   });
		addAnnotation
		  (getQueryMethod__OutputFieldsQVC__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Output fields must be from the list of query collection field list!\',\n\tstatus : Boolean = \n    \t\tself.outputFields->forAll(of | self.queryCollection.fields->includes(of))\n}.status"
		   });
		addAnnotation
		  (getQueryMethod__TopKValue__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Top K value must at least one!\',\n\tstatus : Boolean = \n    \t\tself.topK >= 1\n}.status"
		   });
		addAnnotation
		  (getVectorDatabase__UniqueClusterName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Cluster name must be unique within specific vector database!\',\n\tstatus : Boolean = \n    \t\tself.clusters->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)\n}.status"
		   });
		addAnnotation
		  (getCluster__NoOfCollectionsGT__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Number of collections in cluster must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofCollections > 0\n}.status"
		   });
		addAnnotation
		  (getCluster__ClusterLimitsNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Cluster limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.clusterLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n}.status"
		   });
		addAnnotation
		  (getCluster__UniqueCollectionNameInCluster__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Collection name must be unique within specific cluster!\',\n\tstatus : Boolean = \n    \t\tself.collections->forAll(col1, col2 | col1 <> col2 implies col1.name <> col2.name)\n}.status"
		   });
		addAnnotation
		  (getVectorCollection__ColLimitsNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Collection limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.collectionLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n}.status"
		   });
		addAnnotation
		  (getPartition__SinglePartitionKey__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'There must be just one partition key for each partition!\',\n\tstatus : Boolean = \n    \t\tself.partitionKey->size() <= 1\n}.status"
		   });
		addAnnotation
		  (getField__FieldLimitsNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Field limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.fieldLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n}.status"
		   });
		addAnnotation
		  (getVectorIndex__VIdxLimitsNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Vector index limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.vIndexLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n}.status"
		   });
	}

} //VecdslMMPackageImpl
