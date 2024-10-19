/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /domijmasdsl/model/VecDslMM.ecore
 * using:
 *   /domijmasdsl/model/VecDslMM.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package vecdslMM;

import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
// import vecdslMM.VecdslMMTables;

/**
 * VecdslMMTables provides the dispatch tables for the vecdslMM for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class VecdslMMTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(VecdslMMPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			VecdslMMTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Alter = new EcoreExecutorType(VecdslMMPackage.Literals.ALTER, PACKAGE, 0);
		public static final EcoreExecutorType _Cluster = new EcoreExecutorType(VecdslMMPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _ClusterLimit = new EcoreExecutorType(VecdslMMPackage.Literals.CLUSTER_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorType _CollectionLimit = new EcoreExecutorType(VecdslMMPackage.Literals.COLLECTION_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorType _Concept = new EcoreExecutorType(VecdslMMPackage.Literals.CONCEPT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Connection = new EcoreExecutorType(VecdslMMPackage.Literals.CONNECTION, PACKAGE, 0);
		public static final EcoreExecutorType _Create = new EcoreExecutorType(VecdslMMPackage.Literals.CREATE, PACKAGE, 0);
		public static final EcoreExecutorType _DdlMethod = new EcoreExecutorType(VecdslMMPackage.Literals.DDL_METHOD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Delete = new EcoreExecutorType(VecdslMMPackage.Literals.DELETE, PACKAGE, 0);
		public static final EcoreExecutorType _DmlMethod = new EcoreExecutorType(VecdslMMPackage.Literals.DML_METHOD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Drop = new EcoreExecutorType(VecdslMMPackage.Literals.DROP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EClusterLimit = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.ECLUSTER_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EColectionLimit = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.ECOLECTION_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EFieldLimit = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EFIELD_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EIndexLimit = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EINDEX_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EMetricType = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EMETRIC_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ENVIdxType = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.ENV_IDX_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EOperator = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EOPERATOR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EPodEnv = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EPOD_ENV, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EPodSize = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EPOD_SIZE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EPodTypes = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EPOD_TYPES, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EScalarDType = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.ESCALAR_DTYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EVIdxType = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EV_IDX_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EVectorDType = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EVECTOR_DTYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EVendorName = new EcoreExecutorEnumeration(VecdslMMPackage.Literals.EVENDOR_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _EmbeddingModel = new EcoreExecutorType(VecdslMMPackage.Literals.EMBEDDING_MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Field = new EcoreExecutorType(VecdslMMPackage.Literals.FIELD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _FieldLimit = new EcoreExecutorType(VecdslMMPackage.Literals.FIELD_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorType _Filter = new EcoreExecutorType(VecdslMMPackage.Literals.FILTER, PACKAGE, 0);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(VecdslMMPackage.Literals.INDEX, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _IndexLimit = new EcoreExecutorType(VecdslMMPackage.Literals.INDEX_LIMIT, PACKAGE, 0);
		public static final EcoreExecutorType _Insert = new EcoreExecutorType(VecdslMMPackage.Literals.INSERT, PACKAGE, 0);
		public static final EcoreExecutorType _Limit = new EcoreExecutorType(VecdslMMPackage.Literals.LIMIT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Method = new EcoreExecutorType(VecdslMMPackage.Literals.METHOD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NonVectorField = new EcoreExecutorType(VecdslMMPackage.Literals.NON_VECTOR_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _NonVectorIndex = new EcoreExecutorType(VecdslMMPackage.Literals.NON_VECTOR_INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _NonVectorSearch = new EcoreExecutorType(VecdslMMPackage.Literals.NON_VECTOR_SEARCH, PACKAGE, 0);
		public static final EcoreExecutorType _Partition = new EcoreExecutorType(VecdslMMPackage.Literals.PARTITION, PACKAGE, 0);
		public static final EcoreExecutorType _QueryMethod = new EcoreExecutorType(VecdslMMPackage.Literals.QUERY_METHOD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Script = new EcoreExecutorType(VecdslMMPackage.Literals.SCRIPT, PACKAGE, 0);
		public static final EcoreExecutorType _Update = new EcoreExecutorType(VecdslMMPackage.Literals.UPDATE, PACKAGE, 0);
		public static final EcoreExecutorType _VectorCollection = new EcoreExecutorType(VecdslMMPackage.Literals.VECTOR_COLLECTION, PACKAGE, 0);
		public static final EcoreExecutorType _VectorDatabase = new EcoreExecutorType(VecdslMMPackage.Literals.VECTOR_DATABASE, PACKAGE, 0);
		public static final EcoreExecutorType _VectorField = new EcoreExecutorType(VecdslMMPackage.Literals.VECTOR_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _VectorIndex = new EcoreExecutorType(VecdslMMPackage.Literals.VECTOR_INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _VectorSearch = new EcoreExecutorType(VecdslMMPackage.Literals.VECTOR_SEARCH, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Alter,
			_Cluster,
			_ClusterLimit,
			_CollectionLimit,
			_Concept,
			_Connection,
			_Create,
			_DdlMethod,
			_Delete,
			_DmlMethod,
			_Drop,
			_EClusterLimit,
			_EColectionLimit,
			_EFieldLimit,
			_EIndexLimit,
			_EMetricType,
			_ENVIdxType,
			_EOperator,
			_EPodEnv,
			_EPodSize,
			_EPodTypes,
			_EScalarDType,
			_EVIdxType,
			_EVectorDType,
			_EVendorName,
			_EmbeddingModel,
			_Field,
			_FieldLimit,
			_Filter,
			_Index,
			_IndexLimit,
			_Insert,
			_Limit,
			_Method,
			_NonVectorField,
			_NonVectorIndex,
			_NonVectorSearch,
			_Partition,
			_QueryMethod,
			_Script,
			_Update,
			_VectorCollection,
			_VectorDatabase,
			_VectorField,
			_VectorIndex,
			_VectorSearch
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Alter__Alter = new ExecutorFragment(Types._Alter, VecdslMMTables.Types._Alter);
		private static final ExecutorFragment _Alter__DdlMethod = new ExecutorFragment(Types._Alter, VecdslMMTables.Types._DdlMethod);
		private static final ExecutorFragment _Alter__Method = new ExecutorFragment(Types._Alter, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Alter__OclAny = new ExecutorFragment(Types._Alter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Alter__OclElement = new ExecutorFragment(Types._Alter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Cluster__Cluster = new ExecutorFragment(Types._Cluster, VecdslMMTables.Types._Cluster);
		private static final ExecutorFragment _Cluster__Concept = new ExecutorFragment(Types._Cluster, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ClusterLimit__ClusterLimit = new ExecutorFragment(Types._ClusterLimit, VecdslMMTables.Types._ClusterLimit);
		private static final ExecutorFragment _ClusterLimit__Concept = new ExecutorFragment(Types._ClusterLimit, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _ClusterLimit__Limit = new ExecutorFragment(Types._ClusterLimit, VecdslMMTables.Types._Limit);
		private static final ExecutorFragment _ClusterLimit__OclAny = new ExecutorFragment(Types._ClusterLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClusterLimit__OclElement = new ExecutorFragment(Types._ClusterLimit, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CollectionLimit__CollectionLimit = new ExecutorFragment(Types._CollectionLimit, VecdslMMTables.Types._CollectionLimit);
		private static final ExecutorFragment _CollectionLimit__Concept = new ExecutorFragment(Types._CollectionLimit, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _CollectionLimit__Limit = new ExecutorFragment(Types._CollectionLimit, VecdslMMTables.Types._Limit);
		private static final ExecutorFragment _CollectionLimit__OclAny = new ExecutorFragment(Types._CollectionLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CollectionLimit__OclElement = new ExecutorFragment(Types._CollectionLimit, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Concept__Concept = new ExecutorFragment(Types._Concept, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Concept__OclAny = new ExecutorFragment(Types._Concept, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Concept__OclElement = new ExecutorFragment(Types._Concept, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Connection__Connection = new ExecutorFragment(Types._Connection, VecdslMMTables.Types._Connection);
		private static final ExecutorFragment _Connection__OclAny = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Connection__OclElement = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Create__Create = new ExecutorFragment(Types._Create, VecdslMMTables.Types._Create);
		private static final ExecutorFragment _Create__DdlMethod = new ExecutorFragment(Types._Create, VecdslMMTables.Types._DdlMethod);
		private static final ExecutorFragment _Create__Method = new ExecutorFragment(Types._Create, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Create__OclAny = new ExecutorFragment(Types._Create, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Create__OclElement = new ExecutorFragment(Types._Create, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DdlMethod__DdlMethod = new ExecutorFragment(Types._DdlMethod, VecdslMMTables.Types._DdlMethod);
		private static final ExecutorFragment _DdlMethod__Method = new ExecutorFragment(Types._DdlMethod, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _DdlMethod__OclAny = new ExecutorFragment(Types._DdlMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DdlMethod__OclElement = new ExecutorFragment(Types._DdlMethod, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Delete__Delete = new ExecutorFragment(Types._Delete, VecdslMMTables.Types._Delete);
		private static final ExecutorFragment _Delete__DmlMethod = new ExecutorFragment(Types._Delete, VecdslMMTables.Types._DmlMethod);
		private static final ExecutorFragment _Delete__Method = new ExecutorFragment(Types._Delete, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Delete__OclAny = new ExecutorFragment(Types._Delete, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Delete__OclElement = new ExecutorFragment(Types._Delete, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DmlMethod__DmlMethod = new ExecutorFragment(Types._DmlMethod, VecdslMMTables.Types._DmlMethod);
		private static final ExecutorFragment _DmlMethod__Method = new ExecutorFragment(Types._DmlMethod, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _DmlMethod__OclAny = new ExecutorFragment(Types._DmlMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DmlMethod__OclElement = new ExecutorFragment(Types._DmlMethod, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Drop__DdlMethod = new ExecutorFragment(Types._Drop, VecdslMMTables.Types._DdlMethod);
		private static final ExecutorFragment _Drop__Drop = new ExecutorFragment(Types._Drop, VecdslMMTables.Types._Drop);
		private static final ExecutorFragment _Drop__Method = new ExecutorFragment(Types._Drop, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Drop__OclAny = new ExecutorFragment(Types._Drop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Drop__OclElement = new ExecutorFragment(Types._Drop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EClusterLimit__EClusterLimit = new ExecutorFragment(Types._EClusterLimit, VecdslMMTables.Types._EClusterLimit);
		private static final ExecutorFragment _EClusterLimit__OclAny = new ExecutorFragment(Types._EClusterLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EClusterLimit__OclElement = new ExecutorFragment(Types._EClusterLimit, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EClusterLimit__OclEnumeration = new ExecutorFragment(Types._EClusterLimit, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EClusterLimit__OclType = new ExecutorFragment(Types._EClusterLimit, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EColectionLimit__EColectionLimit = new ExecutorFragment(Types._EColectionLimit, VecdslMMTables.Types._EColectionLimit);
		private static final ExecutorFragment _EColectionLimit__OclAny = new ExecutorFragment(Types._EColectionLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EColectionLimit__OclElement = new ExecutorFragment(Types._EColectionLimit, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EColectionLimit__OclEnumeration = new ExecutorFragment(Types._EColectionLimit, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EColectionLimit__OclType = new ExecutorFragment(Types._EColectionLimit, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EFieldLimit__EFieldLimit = new ExecutorFragment(Types._EFieldLimit, VecdslMMTables.Types._EFieldLimit);
		private static final ExecutorFragment _EFieldLimit__OclAny = new ExecutorFragment(Types._EFieldLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EFieldLimit__OclElement = new ExecutorFragment(Types._EFieldLimit, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EFieldLimit__OclEnumeration = new ExecutorFragment(Types._EFieldLimit, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EFieldLimit__OclType = new ExecutorFragment(Types._EFieldLimit, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EIndexLimit__EIndexLimit = new ExecutorFragment(Types._EIndexLimit, VecdslMMTables.Types._EIndexLimit);
		private static final ExecutorFragment _EIndexLimit__OclAny = new ExecutorFragment(Types._EIndexLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EIndexLimit__OclElement = new ExecutorFragment(Types._EIndexLimit, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EIndexLimit__OclEnumeration = new ExecutorFragment(Types._EIndexLimit, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EIndexLimit__OclType = new ExecutorFragment(Types._EIndexLimit, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EMetricType__EMetricType = new ExecutorFragment(Types._EMetricType, VecdslMMTables.Types._EMetricType);
		private static final ExecutorFragment _EMetricType__OclAny = new ExecutorFragment(Types._EMetricType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EMetricType__OclElement = new ExecutorFragment(Types._EMetricType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EMetricType__OclEnumeration = new ExecutorFragment(Types._EMetricType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EMetricType__OclType = new ExecutorFragment(Types._EMetricType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ENVIdxType__ENVIdxType = new ExecutorFragment(Types._ENVIdxType, VecdslMMTables.Types._ENVIdxType);
		private static final ExecutorFragment _ENVIdxType__OclAny = new ExecutorFragment(Types._ENVIdxType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ENVIdxType__OclElement = new ExecutorFragment(Types._ENVIdxType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ENVIdxType__OclEnumeration = new ExecutorFragment(Types._ENVIdxType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ENVIdxType__OclType = new ExecutorFragment(Types._ENVIdxType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EOperator__EOperator = new ExecutorFragment(Types._EOperator, VecdslMMTables.Types._EOperator);
		private static final ExecutorFragment _EOperator__OclAny = new ExecutorFragment(Types._EOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EOperator__OclElement = new ExecutorFragment(Types._EOperator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EOperator__OclEnumeration = new ExecutorFragment(Types._EOperator, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EOperator__OclType = new ExecutorFragment(Types._EOperator, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EPodEnv__EPodEnv = new ExecutorFragment(Types._EPodEnv, VecdslMMTables.Types._EPodEnv);
		private static final ExecutorFragment _EPodEnv__OclAny = new ExecutorFragment(Types._EPodEnv, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EPodEnv__OclElement = new ExecutorFragment(Types._EPodEnv, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EPodEnv__OclEnumeration = new ExecutorFragment(Types._EPodEnv, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EPodEnv__OclType = new ExecutorFragment(Types._EPodEnv, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EPodSize__EPodSize = new ExecutorFragment(Types._EPodSize, VecdslMMTables.Types._EPodSize);
		private static final ExecutorFragment _EPodSize__OclAny = new ExecutorFragment(Types._EPodSize, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EPodSize__OclElement = new ExecutorFragment(Types._EPodSize, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EPodSize__OclEnumeration = new ExecutorFragment(Types._EPodSize, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EPodSize__OclType = new ExecutorFragment(Types._EPodSize, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EPodTypes__EPodTypes = new ExecutorFragment(Types._EPodTypes, VecdslMMTables.Types._EPodTypes);
		private static final ExecutorFragment _EPodTypes__OclAny = new ExecutorFragment(Types._EPodTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EPodTypes__OclElement = new ExecutorFragment(Types._EPodTypes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EPodTypes__OclEnumeration = new ExecutorFragment(Types._EPodTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EPodTypes__OclType = new ExecutorFragment(Types._EPodTypes, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EScalarDType__EScalarDType = new ExecutorFragment(Types._EScalarDType, VecdslMMTables.Types._EScalarDType);
		private static final ExecutorFragment _EScalarDType__OclAny = new ExecutorFragment(Types._EScalarDType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EScalarDType__OclElement = new ExecutorFragment(Types._EScalarDType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EScalarDType__OclEnumeration = new ExecutorFragment(Types._EScalarDType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EScalarDType__OclType = new ExecutorFragment(Types._EScalarDType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EVIdxType__EVIdxType = new ExecutorFragment(Types._EVIdxType, VecdslMMTables.Types._EVIdxType);
		private static final ExecutorFragment _EVIdxType__OclAny = new ExecutorFragment(Types._EVIdxType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EVIdxType__OclElement = new ExecutorFragment(Types._EVIdxType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EVIdxType__OclEnumeration = new ExecutorFragment(Types._EVIdxType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EVIdxType__OclType = new ExecutorFragment(Types._EVIdxType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EVectorDType__EVectorDType = new ExecutorFragment(Types._EVectorDType, VecdslMMTables.Types._EVectorDType);
		private static final ExecutorFragment _EVectorDType__OclAny = new ExecutorFragment(Types._EVectorDType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EVectorDType__OclElement = new ExecutorFragment(Types._EVectorDType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EVectorDType__OclEnumeration = new ExecutorFragment(Types._EVectorDType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EVectorDType__OclType = new ExecutorFragment(Types._EVectorDType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EVendorName__EVendorName = new ExecutorFragment(Types._EVendorName, VecdslMMTables.Types._EVendorName);
		private static final ExecutorFragment _EVendorName__OclAny = new ExecutorFragment(Types._EVendorName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EVendorName__OclElement = new ExecutorFragment(Types._EVendorName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EVendorName__OclEnumeration = new ExecutorFragment(Types._EVendorName, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EVendorName__OclType = new ExecutorFragment(Types._EVendorName, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EmbeddingModel__Concept = new ExecutorFragment(Types._EmbeddingModel, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _EmbeddingModel__EmbeddingModel = new ExecutorFragment(Types._EmbeddingModel, VecdslMMTables.Types._EmbeddingModel);
		private static final ExecutorFragment _EmbeddingModel__OclAny = new ExecutorFragment(Types._EmbeddingModel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EmbeddingModel__OclElement = new ExecutorFragment(Types._EmbeddingModel, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Field__Concept = new ExecutorFragment(Types._Field, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Field__Field = new ExecutorFragment(Types._Field, VecdslMMTables.Types._Field);
		private static final ExecutorFragment _Field__OclAny = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Field__OclElement = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FieldLimit__Concept = new ExecutorFragment(Types._FieldLimit, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _FieldLimit__FieldLimit = new ExecutorFragment(Types._FieldLimit, VecdslMMTables.Types._FieldLimit);
		private static final ExecutorFragment _FieldLimit__Limit = new ExecutorFragment(Types._FieldLimit, VecdslMMTables.Types._Limit);
		private static final ExecutorFragment _FieldLimit__OclAny = new ExecutorFragment(Types._FieldLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FieldLimit__OclElement = new ExecutorFragment(Types._FieldLimit, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Filter__Filter = new ExecutorFragment(Types._Filter, VecdslMMTables.Types._Filter);
		private static final ExecutorFragment _Filter__OclAny = new ExecutorFragment(Types._Filter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Filter__OclElement = new ExecutorFragment(Types._Filter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Index__Concept = new ExecutorFragment(Types._Index, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, VecdslMMTables.Types._Index);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IndexLimit__Concept = new ExecutorFragment(Types._IndexLimit, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _IndexLimit__IndexLimit = new ExecutorFragment(Types._IndexLimit, VecdslMMTables.Types._IndexLimit);
		private static final ExecutorFragment _IndexLimit__Limit = new ExecutorFragment(Types._IndexLimit, VecdslMMTables.Types._Limit);
		private static final ExecutorFragment _IndexLimit__OclAny = new ExecutorFragment(Types._IndexLimit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IndexLimit__OclElement = new ExecutorFragment(Types._IndexLimit, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Insert__DmlMethod = new ExecutorFragment(Types._Insert, VecdslMMTables.Types._DmlMethod);
		private static final ExecutorFragment _Insert__Insert = new ExecutorFragment(Types._Insert, VecdslMMTables.Types._Insert);
		private static final ExecutorFragment _Insert__Method = new ExecutorFragment(Types._Insert, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Insert__OclAny = new ExecutorFragment(Types._Insert, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Insert__OclElement = new ExecutorFragment(Types._Insert, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Limit__Concept = new ExecutorFragment(Types._Limit, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Limit__Limit = new ExecutorFragment(Types._Limit, VecdslMMTables.Types._Limit);
		private static final ExecutorFragment _Limit__OclAny = new ExecutorFragment(Types._Limit, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Limit__OclElement = new ExecutorFragment(Types._Limit, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Method__Method = new ExecutorFragment(Types._Method, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Method__OclAny = new ExecutorFragment(Types._Method, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Method__OclElement = new ExecutorFragment(Types._Method, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NonVectorField__Concept = new ExecutorFragment(Types._NonVectorField, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _NonVectorField__Field = new ExecutorFragment(Types._NonVectorField, VecdslMMTables.Types._Field);
		private static final ExecutorFragment _NonVectorField__NonVectorField = new ExecutorFragment(Types._NonVectorField, VecdslMMTables.Types._NonVectorField);
		private static final ExecutorFragment _NonVectorField__OclAny = new ExecutorFragment(Types._NonVectorField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NonVectorField__OclElement = new ExecutorFragment(Types._NonVectorField, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NonVectorIndex__Concept = new ExecutorFragment(Types._NonVectorIndex, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _NonVectorIndex__Index = new ExecutorFragment(Types._NonVectorIndex, VecdslMMTables.Types._Index);
		private static final ExecutorFragment _NonVectorIndex__NonVectorIndex = new ExecutorFragment(Types._NonVectorIndex, VecdslMMTables.Types._NonVectorIndex);
		private static final ExecutorFragment _NonVectorIndex__OclAny = new ExecutorFragment(Types._NonVectorIndex, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NonVectorIndex__OclElement = new ExecutorFragment(Types._NonVectorIndex, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NonVectorSearch__Method = new ExecutorFragment(Types._NonVectorSearch, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _NonVectorSearch__NonVectorSearch = new ExecutorFragment(Types._NonVectorSearch, VecdslMMTables.Types._NonVectorSearch);
		private static final ExecutorFragment _NonVectorSearch__OclAny = new ExecutorFragment(Types._NonVectorSearch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NonVectorSearch__OclElement = new ExecutorFragment(Types._NonVectorSearch, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NonVectorSearch__QueryMethod = new ExecutorFragment(Types._NonVectorSearch, VecdslMMTables.Types._QueryMethod);

		private static final ExecutorFragment _Partition__Concept = new ExecutorFragment(Types._Partition, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _Partition__OclAny = new ExecutorFragment(Types._Partition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Partition__OclElement = new ExecutorFragment(Types._Partition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Partition__Partition = new ExecutorFragment(Types._Partition, VecdslMMTables.Types._Partition);

		private static final ExecutorFragment _QueryMethod__Method = new ExecutorFragment(Types._QueryMethod, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _QueryMethod__OclAny = new ExecutorFragment(Types._QueryMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QueryMethod__OclElement = new ExecutorFragment(Types._QueryMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QueryMethod__QueryMethod = new ExecutorFragment(Types._QueryMethod, VecdslMMTables.Types._QueryMethod);

		private static final ExecutorFragment _Script__OclAny = new ExecutorFragment(Types._Script, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Script__OclElement = new ExecutorFragment(Types._Script, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Script__Script = new ExecutorFragment(Types._Script, VecdslMMTables.Types._Script);

		private static final ExecutorFragment _Update__DmlMethod = new ExecutorFragment(Types._Update, VecdslMMTables.Types._DmlMethod);
		private static final ExecutorFragment _Update__Method = new ExecutorFragment(Types._Update, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _Update__OclAny = new ExecutorFragment(Types._Update, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Update__OclElement = new ExecutorFragment(Types._Update, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Update__Update = new ExecutorFragment(Types._Update, VecdslMMTables.Types._Update);

		private static final ExecutorFragment _VectorCollection__Concept = new ExecutorFragment(Types._VectorCollection, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _VectorCollection__OclAny = new ExecutorFragment(Types._VectorCollection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VectorCollection__OclElement = new ExecutorFragment(Types._VectorCollection, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VectorCollection__VectorCollection = new ExecutorFragment(Types._VectorCollection, VecdslMMTables.Types._VectorCollection);

		private static final ExecutorFragment _VectorDatabase__Concept = new ExecutorFragment(Types._VectorDatabase, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _VectorDatabase__OclAny = new ExecutorFragment(Types._VectorDatabase, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VectorDatabase__OclElement = new ExecutorFragment(Types._VectorDatabase, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VectorDatabase__VectorDatabase = new ExecutorFragment(Types._VectorDatabase, VecdslMMTables.Types._VectorDatabase);

		private static final ExecutorFragment _VectorField__Concept = new ExecutorFragment(Types._VectorField, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _VectorField__Field = new ExecutorFragment(Types._VectorField, VecdslMMTables.Types._Field);
		private static final ExecutorFragment _VectorField__OclAny = new ExecutorFragment(Types._VectorField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VectorField__OclElement = new ExecutorFragment(Types._VectorField, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VectorField__VectorField = new ExecutorFragment(Types._VectorField, VecdslMMTables.Types._VectorField);

		private static final ExecutorFragment _VectorIndex__Concept = new ExecutorFragment(Types._VectorIndex, VecdslMMTables.Types._Concept);
		private static final ExecutorFragment _VectorIndex__Index = new ExecutorFragment(Types._VectorIndex, VecdslMMTables.Types._Index);
		private static final ExecutorFragment _VectorIndex__OclAny = new ExecutorFragment(Types._VectorIndex, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VectorIndex__OclElement = new ExecutorFragment(Types._VectorIndex, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VectorIndex__VectorIndex = new ExecutorFragment(Types._VectorIndex, VecdslMMTables.Types._VectorIndex);

		private static final ExecutorFragment _VectorSearch__Method = new ExecutorFragment(Types._VectorSearch, VecdslMMTables.Types._Method);
		private static final ExecutorFragment _VectorSearch__OclAny = new ExecutorFragment(Types._VectorSearch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VectorSearch__OclElement = new ExecutorFragment(Types._VectorSearch, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VectorSearch__QueryMethod = new ExecutorFragment(Types._VectorSearch, VecdslMMTables.Types._QueryMethod);
		private static final ExecutorFragment _VectorSearch__VectorSearch = new ExecutorFragment(Types._VectorSearch, VecdslMMTables.Types._VectorSearch);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Alter__alterCond = new EcoreExecutorProperty(VecdslMMPackage.Literals.ALTER__ALTER_COND, Types._Alter, 0);

		public static final ExecutorProperty _Cluster__clusterLimits = new EcoreExecutorProperty(VecdslMMPackage.Literals.CLUSTER__CLUSTER_LIMITS, Types._Cluster, 0);
		public static final ExecutorProperty _Cluster__collections = new EcoreExecutorProperty(VecdslMMPackage.Literals.CLUSTER__COLLECTIONS, Types._Cluster, 1);
		public static final ExecutorProperty _Cluster__nofCollections = new EcoreExecutorProperty(VecdslMMPackage.Literals.CLUSTER__NOF_COLLECTIONS, Types._Cluster, 2);
		public static final ExecutorProperty _Cluster__vectordb = new EcoreExecutorProperty(VecdslMMPackage.Literals.CLUSTER__VECTORDB, Types._Cluster, 3);

		public static final ExecutorProperty _ClusterLimit__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.CLUSTER_LIMIT__TYPE, Types._ClusterLimit, 0);
		public static final ExecutorProperty _ClusterLimit__Cluster__clusterLimits = new ExecutorPropertyWithImplementation("Cluster", Types._ClusterLimit, 1, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.CLUSTER__CLUSTER_LIMITS));

		public static final ExecutorProperty _CollectionLimit__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.COLLECTION_LIMIT__TYPE, Types._CollectionLimit, 0);
		public static final ExecutorProperty _CollectionLimit__VectorCollection__collectionLimits = new ExecutorPropertyWithImplementation("VectorCollection", Types._CollectionLimit, 1, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__COLLECTION_LIMITS));

		public static final ExecutorProperty _Concept__description = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONCEPT__DESCRIPTION, Types._Concept, 0);
		public static final ExecutorProperty _Concept__name = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONCEPT__NAME, Types._Concept, 1);
		public static final ExecutorProperty _Concept__DdlMethod__ddlConcept = new ExecutorPropertyWithImplementation("DdlMethod", Types._Concept, 2, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.DDL_METHOD__DDL_CONCEPT));
		public static final ExecutorProperty _Concept__Filter__filterField = new ExecutorPropertyWithImplementation("Filter", Types._Concept, 3, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.FILTER__FILTER_FIELD));

		public static final ExecutorProperty _Connection__apiKey = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__API_KEY, Types._Connection, 0);
		public static final ExecutorProperty _Connection__cloud = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__CLOUD, Types._Connection, 1);
		public static final ExecutorProperty _Connection__environment = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__ENVIRONMENT, Types._Connection, 2);
		public static final ExecutorProperty _Connection__host = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__HOST, Types._Connection, 3);
		public static final ExecutorProperty _Connection__password = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__PASSWORD, Types._Connection, 4);
		public static final ExecutorProperty _Connection__port = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__PORT, Types._Connection, 5);
		public static final ExecutorProperty _Connection__region = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__REGION, Types._Connection, 6);
		public static final ExecutorProperty _Connection__userPrivillege = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__USER_PRIVILLEGE, Types._Connection, 7);
		public static final ExecutorProperty _Connection__userRole = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__USER_ROLE, Types._Connection, 8);
		public static final ExecutorProperty _Connection__username = new EcoreExecutorProperty(VecdslMMPackage.Literals.CONNECTION__USERNAME, Types._Connection, 9);
		public static final ExecutorProperty _Connection__VectorDatabase__connection = new ExecutorPropertyWithImplementation("VectorDatabase", Types._Connection, 10, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_DATABASE__CONNECTION));

		public static final ExecutorProperty _DdlMethod__ddlConcept = new EcoreExecutorProperty(VecdslMMPackage.Literals.DDL_METHOD__DDL_CONCEPT, Types._DdlMethod, 0);
		public static final ExecutorProperty _DdlMethod__ddlNode = new EcoreExecutorProperty(VecdslMMPackage.Literals.DDL_METHOD__DDL_NODE, Types._DdlMethod, 1);
		public static final ExecutorProperty _DdlMethod__DdlMethod__ddlNode = new ExecutorPropertyWithImplementation("DdlMethod", Types._DdlMethod, 2, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.DDL_METHOD__DDL_NODE));

		public static final ExecutorProperty _Delete__deleteCond = new EcoreExecutorProperty(VecdslMMPackage.Literals.DELETE__DELETE_COND, Types._Delete, 0);
		public static final ExecutorProperty _Delete__ids = new EcoreExecutorProperty(VecdslMMPackage.Literals.DELETE__IDS, Types._Delete, 1);

		public static final ExecutorProperty _DmlMethod__dmlCollection = new EcoreExecutorProperty(VecdslMMPackage.Literals.DML_METHOD__DML_COLLECTION, Types._DmlMethod, 0);

		public static final ExecutorProperty _Drop__dropCond = new EcoreExecutorProperty(VecdslMMPackage.Literals.DROP__DROP_COND, Types._Drop, 0);

		public static final ExecutorProperty _EmbeddingModel__VectorField__embModel = new ExecutorPropertyWithImplementation("VectorField", Types._EmbeddingModel, 0, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_FIELD__EMB_MODEL));

		public static final ExecutorProperty _Field__colFieldOwner = new EcoreExecutorProperty(VecdslMMPackage.Literals.FIELD__COL_FIELD_OWNER, Types._Field, 0);
		public static final ExecutorProperty _Field__fieldLimits = new EcoreExecutorProperty(VecdslMMPackage.Literals.FIELD__FIELD_LIMITS, Types._Field, 1);
		public static final ExecutorProperty _Field__isPrimary = new EcoreExecutorProperty(VecdslMMPackage.Literals.FIELD__IS_PRIMARY, Types._Field, 2);
		public static final ExecutorProperty _Field__Partition__partitionKey = new ExecutorPropertyWithImplementation("Partition", Types._Field, 3, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.PARTITION__PARTITION_KEY));
		public static final ExecutorProperty _Field__QueryMethod__outputFields = new ExecutorPropertyWithImplementation("QueryMethod", Types._Field, 4, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.QUERY_METHOD__OUTPUT_FIELDS));

		public static final ExecutorProperty _FieldLimit__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.FIELD_LIMIT__TYPE, Types._FieldLimit, 0);
		public static final ExecutorProperty _FieldLimit__Field__fieldLimits = new ExecutorPropertyWithImplementation("Field", Types._FieldLimit, 1, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.FIELD__FIELD_LIMITS));

		public static final ExecutorProperty _Filter__filterField = new EcoreExecutorProperty(VecdslMMPackage.Literals.FILTER__FILTER_FIELD, Types._Filter, 0);
		public static final ExecutorProperty _Filter__operator = new EcoreExecutorProperty(VecdslMMPackage.Literals.FILTER__OPERATOR, Types._Filter, 1);
		public static final ExecutorProperty _Filter__value = new EcoreExecutorProperty(VecdslMMPackage.Literals.FILTER__VALUE, Types._Filter, 2);
		public static final ExecutorProperty _Filter__Alter__alterCond = new ExecutorPropertyWithImplementation("Alter", Types._Filter, 3, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.ALTER__ALTER_COND));
		public static final ExecutorProperty _Filter__Delete__deleteCond = new ExecutorPropertyWithImplementation("Delete", Types._Filter, 4, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.DELETE__DELETE_COND));
		public static final ExecutorProperty _Filter__Drop__dropCond = new ExecutorPropertyWithImplementation("Drop", Types._Filter, 5, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.DROP__DROP_COND));
		public static final ExecutorProperty _Filter__NonVectorSearch__nonVecFilters = new ExecutorPropertyWithImplementation("NonVectorSearch", Types._Filter, 6, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.NON_VECTOR_SEARCH__NON_VEC_FILTERS));
		public static final ExecutorProperty _Filter__Update__updateCond = new ExecutorPropertyWithImplementation("Update", Types._Filter, 7, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.UPDATE__UPDATE_COND));
		public static final ExecutorProperty _Filter__VectorSearch__vecSearchFilters = new ExecutorPropertyWithImplementation("VectorSearch", Types._Filter, 8, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_SEARCH__VEC_SEARCH_FILTERS));

		public static final ExecutorProperty _IndexLimit__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.INDEX_LIMIT__TYPE, Types._IndexLimit, 0);
		public static final ExecutorProperty _IndexLimit__VectorIndex__vIndexLimits = new ExecutorPropertyWithImplementation("VectorIndex", Types._IndexLimit, 1, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_INDEX__VINDEX_LIMITS));

		public static final ExecutorProperty _Insert__nofRecords = new EcoreExecutorProperty(VecdslMMPackage.Literals.INSERT__NOF_RECORDS, Types._Insert, 0);
		public static final ExecutorProperty _Insert__path = new EcoreExecutorProperty(VecdslMMPackage.Literals.INSERT__PATH, Types._Insert, 1);

		public static final ExecutorProperty _Limit__value = new EcoreExecutorProperty(VecdslMMPackage.Literals.LIMIT__VALUE, Types._Limit, 0);

		public static final ExecutorProperty _Method__Script__methods = new ExecutorPropertyWithImplementation("Script", Types._Method, 0, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.SCRIPT__METHODS));

		public static final ExecutorProperty _NonVectorField__nonVectorIndexes = new EcoreExecutorProperty(VecdslMMPackage.Literals.NON_VECTOR_FIELD__NON_VECTOR_INDEXES, Types._NonVectorField, 0);
		public static final ExecutorProperty _NonVectorField__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.NON_VECTOR_FIELD__TYPE, Types._NonVectorField, 1);

		public static final ExecutorProperty _NonVectorIndex__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.NON_VECTOR_INDEX__TYPE, Types._NonVectorIndex, 0);
		public static final ExecutorProperty _NonVectorIndex__NonVectorField__nonVectorIndexes = new ExecutorPropertyWithImplementation("NonVectorField", Types._NonVectorIndex, 1, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.NON_VECTOR_FIELD__NON_VECTOR_INDEXES));

		public static final ExecutorProperty _NonVectorSearch__nonVecFilters = new EcoreExecutorProperty(VecdslMMPackage.Literals.NON_VECTOR_SEARCH__NON_VEC_FILTERS, Types._NonVectorSearch, 0);

		public static final ExecutorProperty _Partition__colPartOwner = new EcoreExecutorProperty(VecdslMMPackage.Literals.PARTITION__COL_PART_OWNER, Types._Partition, 0);
		public static final ExecutorProperty _Partition__partitionKey = new EcoreExecutorProperty(VecdslMMPackage.Literals.PARTITION__PARTITION_KEY, Types._Partition, 1);

		public static final ExecutorProperty _QueryMethod__outputFields = new EcoreExecutorProperty(VecdslMMPackage.Literals.QUERY_METHOD__OUTPUT_FIELDS, Types._QueryMethod, 0);
		public static final ExecutorProperty _QueryMethod__queryCollection = new EcoreExecutorProperty(VecdslMMPackage.Literals.QUERY_METHOD__QUERY_COLLECTION, Types._QueryMethod, 1);
		public static final ExecutorProperty _QueryMethod__topK = new EcoreExecutorProperty(VecdslMMPackage.Literals.QUERY_METHOD__TOP_K, Types._QueryMethod, 2);

		public static final ExecutorProperty _Script__methods = new EcoreExecutorProperty(VecdslMMPackage.Literals.SCRIPT__METHODS, Types._Script, 0);
		public static final ExecutorProperty _Script__vendor = new EcoreExecutorProperty(VecdslMMPackage.Literals.SCRIPT__VENDOR, Types._Script, 1);

		public static final ExecutorProperty _Update__ids = new EcoreExecutorProperty(VecdslMMPackage.Literals.UPDATE__IDS, Types._Update, 0);
		public static final ExecutorProperty _Update__nofRecords = new EcoreExecutorProperty(VecdslMMPackage.Literals.UPDATE__NOF_RECORDS, Types._Update, 1);
		public static final ExecutorProperty _Update__path = new EcoreExecutorProperty(VecdslMMPackage.Literals.UPDATE__PATH, Types._Update, 2);
		public static final ExecutorProperty _Update__updateCond = new EcoreExecutorProperty(VecdslMMPackage.Literals.UPDATE__UPDATE_COND, Types._Update, 3);

		public static final ExecutorProperty _VectorCollection__cluster = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__CLUSTER, Types._VectorCollection, 0);
		public static final ExecutorProperty _VectorCollection__collectionLimits = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__COLLECTION_LIMITS, Types._VectorCollection, 1);
		public static final ExecutorProperty _VectorCollection__dynamic = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__DYNAMIC, Types._VectorCollection, 2);
		public static final ExecutorProperty _VectorCollection__fields = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__FIELDS, Types._VectorCollection, 3);
		public static final ExecutorProperty _VectorCollection__partitions = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__PARTITIONS, Types._VectorCollection, 4);
		public static final ExecutorProperty _VectorCollection__podEnv = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__POD_ENV, Types._VectorCollection, 5);
		public static final ExecutorProperty _VectorCollection__podSize = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__POD_SIZE, Types._VectorCollection, 6);
		public static final ExecutorProperty _VectorCollection__podtype = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_COLLECTION__PODTYPE, Types._VectorCollection, 7);
		public static final ExecutorProperty _VectorCollection__DmlMethod__dmlCollection = new ExecutorPropertyWithImplementation("DmlMethod", Types._VectorCollection, 8, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.DML_METHOD__DML_COLLECTION));
		public static final ExecutorProperty _VectorCollection__QueryMethod__queryCollection = new ExecutorPropertyWithImplementation("QueryMethod", Types._VectorCollection, 9, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.QUERY_METHOD__QUERY_COLLECTION));

		public static final ExecutorProperty _VectorDatabase__clusters = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_DATABASE__CLUSTERS, Types._VectorDatabase, 0);
		public static final ExecutorProperty _VectorDatabase__connection = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_DATABASE__CONNECTION, Types._VectorDatabase, 1);

		public static final ExecutorProperty _VectorField__embModel = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_FIELD__EMB_MODEL, Types._VectorField, 0);
		public static final ExecutorProperty _VectorField__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_FIELD__TYPE, Types._VectorField, 1);
		public static final ExecutorProperty _VectorField__vectorIndexes = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_FIELD__VECTOR_INDEXES, Types._VectorField, 2);

		public static final ExecutorProperty _VectorIndex__metric = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_INDEX__METRIC, Types._VectorIndex, 0);
		public static final ExecutorProperty _VectorIndex__type = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_INDEX__TYPE, Types._VectorIndex, 1);
		public static final ExecutorProperty _VectorIndex__vIndexLimits = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_INDEX__VINDEX_LIMITS, Types._VectorIndex, 2);
		public static final ExecutorProperty _VectorIndex__VectorField__vectorIndexes = new ExecutorPropertyWithImplementation("VectorField", Types._VectorIndex, 3, new EcoreLibraryOppositeProperty(VecdslMMPackage.Literals.VECTOR_FIELD__VECTOR_INDEXES));

		public static final ExecutorProperty _VectorSearch__metric = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_SEARCH__METRIC, Types._VectorSearch, 0);
		public static final ExecutorProperty _VectorSearch__numUnitsProbe = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_SEARCH__NUM_UNITS_PROBE, Types._VectorSearch, 1);
		public static final ExecutorProperty _VectorSearch__vecSearchFilters = new EcoreExecutorProperty(VecdslMMPackage.Literals.VECTOR_SEARCH__VEC_SEARCH_FILTERS, Types._VectorSearch, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Alter =
			{
				Fragments._Alter__OclAny /* 0 */,
				Fragments._Alter__OclElement /* 1 */,
				Fragments._Alter__Method /* 2 */,
				Fragments._Alter__DdlMethod /* 3 */,
				Fragments._Alter__Alter /* 4 */
			};
		private static final int /*@NonNull*/ [] __Alter = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Cluster =
			{
				Fragments._Cluster__OclAny /* 0 */,
				Fragments._Cluster__OclElement /* 1 */,
				Fragments._Cluster__Concept /* 2 */,
				Fragments._Cluster__Cluster /* 3 */
			};
		private static final int /*@NonNull*/ [] __Cluster = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClusterLimit =
			{
				Fragments._ClusterLimit__OclAny /* 0 */,
				Fragments._ClusterLimit__OclElement /* 1 */,
				Fragments._ClusterLimit__Concept /* 2 */,
				Fragments._ClusterLimit__Limit /* 3 */,
				Fragments._ClusterLimit__ClusterLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __ClusterLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CollectionLimit =
			{
				Fragments._CollectionLimit__OclAny /* 0 */,
				Fragments._CollectionLimit__OclElement /* 1 */,
				Fragments._CollectionLimit__Concept /* 2 */,
				Fragments._CollectionLimit__Limit /* 3 */,
				Fragments._CollectionLimit__CollectionLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __CollectionLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Concept =
			{
				Fragments._Concept__OclAny /* 0 */,
				Fragments._Concept__OclElement /* 1 */,
				Fragments._Concept__Concept /* 2 */
			};
		private static final int /*@NonNull*/ [] __Concept = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Connection =
			{
				Fragments._Connection__OclAny /* 0 */,
				Fragments._Connection__OclElement /* 1 */,
				Fragments._Connection__Connection /* 2 */
			};
		private static final int /*@NonNull*/ [] __Connection = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Create =
			{
				Fragments._Create__OclAny /* 0 */,
				Fragments._Create__OclElement /* 1 */,
				Fragments._Create__Method /* 2 */,
				Fragments._Create__DdlMethod /* 3 */,
				Fragments._Create__Create /* 4 */
			};
		private static final int /*@NonNull*/ [] __Create = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DdlMethod =
			{
				Fragments._DdlMethod__OclAny /* 0 */,
				Fragments._DdlMethod__OclElement /* 1 */,
				Fragments._DdlMethod__Method /* 2 */,
				Fragments._DdlMethod__DdlMethod /* 3 */
			};
		private static final int /*@NonNull*/ [] __DdlMethod = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Delete =
			{
				Fragments._Delete__OclAny /* 0 */,
				Fragments._Delete__OclElement /* 1 */,
				Fragments._Delete__Method /* 2 */,
				Fragments._Delete__DmlMethod /* 3 */,
				Fragments._Delete__Delete /* 4 */
			};
		private static final int /*@NonNull*/ [] __Delete = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DmlMethod =
			{
				Fragments._DmlMethod__OclAny /* 0 */,
				Fragments._DmlMethod__OclElement /* 1 */,
				Fragments._DmlMethod__Method /* 2 */,
				Fragments._DmlMethod__DmlMethod /* 3 */
			};
		private static final int /*@NonNull*/ [] __DmlMethod = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Drop =
			{
				Fragments._Drop__OclAny /* 0 */,
				Fragments._Drop__OclElement /* 1 */,
				Fragments._Drop__Method /* 2 */,
				Fragments._Drop__DdlMethod /* 3 */,
				Fragments._Drop__Drop /* 4 */
			};
		private static final int /*@NonNull*/ [] __Drop = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EClusterLimit =
			{
				Fragments._EClusterLimit__OclAny /* 0 */,
				Fragments._EClusterLimit__OclElement /* 1 */,
				Fragments._EClusterLimit__OclType /* 2 */,
				Fragments._EClusterLimit__OclEnumeration /* 3 */,
				Fragments._EClusterLimit__EClusterLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __EClusterLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EColectionLimit =
			{
				Fragments._EColectionLimit__OclAny /* 0 */,
				Fragments._EColectionLimit__OclElement /* 1 */,
				Fragments._EColectionLimit__OclType /* 2 */,
				Fragments._EColectionLimit__OclEnumeration /* 3 */,
				Fragments._EColectionLimit__EColectionLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __EColectionLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EFieldLimit =
			{
				Fragments._EFieldLimit__OclAny /* 0 */,
				Fragments._EFieldLimit__OclElement /* 1 */,
				Fragments._EFieldLimit__OclType /* 2 */,
				Fragments._EFieldLimit__OclEnumeration /* 3 */,
				Fragments._EFieldLimit__EFieldLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __EFieldLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EIndexLimit =
			{
				Fragments._EIndexLimit__OclAny /* 0 */,
				Fragments._EIndexLimit__OclElement /* 1 */,
				Fragments._EIndexLimit__OclType /* 2 */,
				Fragments._EIndexLimit__OclEnumeration /* 3 */,
				Fragments._EIndexLimit__EIndexLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __EIndexLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EMetricType =
			{
				Fragments._EMetricType__OclAny /* 0 */,
				Fragments._EMetricType__OclElement /* 1 */,
				Fragments._EMetricType__OclType /* 2 */,
				Fragments._EMetricType__OclEnumeration /* 3 */,
				Fragments._EMetricType__EMetricType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EMetricType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ENVIdxType =
			{
				Fragments._ENVIdxType__OclAny /* 0 */,
				Fragments._ENVIdxType__OclElement /* 1 */,
				Fragments._ENVIdxType__OclType /* 2 */,
				Fragments._ENVIdxType__OclEnumeration /* 3 */,
				Fragments._ENVIdxType__ENVIdxType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ENVIdxType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EOperator =
			{
				Fragments._EOperator__OclAny /* 0 */,
				Fragments._EOperator__OclElement /* 1 */,
				Fragments._EOperator__OclType /* 2 */,
				Fragments._EOperator__OclEnumeration /* 3 */,
				Fragments._EOperator__EOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __EOperator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EPodEnv =
			{
				Fragments._EPodEnv__OclAny /* 0 */,
				Fragments._EPodEnv__OclElement /* 1 */,
				Fragments._EPodEnv__OclType /* 2 */,
				Fragments._EPodEnv__OclEnumeration /* 3 */,
				Fragments._EPodEnv__EPodEnv /* 4 */
			};
		private static final int /*@NonNull*/ [] __EPodEnv = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EPodSize =
			{
				Fragments._EPodSize__OclAny /* 0 */,
				Fragments._EPodSize__OclElement /* 1 */,
				Fragments._EPodSize__OclType /* 2 */,
				Fragments._EPodSize__OclEnumeration /* 3 */,
				Fragments._EPodSize__EPodSize /* 4 */
			};
		private static final int /*@NonNull*/ [] __EPodSize = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EPodTypes =
			{
				Fragments._EPodTypes__OclAny /* 0 */,
				Fragments._EPodTypes__OclElement /* 1 */,
				Fragments._EPodTypes__OclType /* 2 */,
				Fragments._EPodTypes__OclEnumeration /* 3 */,
				Fragments._EPodTypes__EPodTypes /* 4 */
			};
		private static final int /*@NonNull*/ [] __EPodTypes = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EScalarDType =
			{
				Fragments._EScalarDType__OclAny /* 0 */,
				Fragments._EScalarDType__OclElement /* 1 */,
				Fragments._EScalarDType__OclType /* 2 */,
				Fragments._EScalarDType__OclEnumeration /* 3 */,
				Fragments._EScalarDType__EScalarDType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EScalarDType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EVIdxType =
			{
				Fragments._EVIdxType__OclAny /* 0 */,
				Fragments._EVIdxType__OclElement /* 1 */,
				Fragments._EVIdxType__OclType /* 2 */,
				Fragments._EVIdxType__OclEnumeration /* 3 */,
				Fragments._EVIdxType__EVIdxType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EVIdxType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EVectorDType =
			{
				Fragments._EVectorDType__OclAny /* 0 */,
				Fragments._EVectorDType__OclElement /* 1 */,
				Fragments._EVectorDType__OclType /* 2 */,
				Fragments._EVectorDType__OclEnumeration /* 3 */,
				Fragments._EVectorDType__EVectorDType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EVectorDType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EVendorName =
			{
				Fragments._EVendorName__OclAny /* 0 */,
				Fragments._EVendorName__OclElement /* 1 */,
				Fragments._EVendorName__OclType /* 2 */,
				Fragments._EVendorName__OclEnumeration /* 3 */,
				Fragments._EVendorName__EVendorName /* 4 */
			};
		private static final int /*@NonNull*/ [] __EVendorName = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EmbeddingModel =
			{
				Fragments._EmbeddingModel__OclAny /* 0 */,
				Fragments._EmbeddingModel__OclElement /* 1 */,
				Fragments._EmbeddingModel__Concept /* 2 */,
				Fragments._EmbeddingModel__EmbeddingModel /* 3 */
			};
		private static final int /*@NonNull*/ [] __EmbeddingModel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Field =
			{
				Fragments._Field__OclAny /* 0 */,
				Fragments._Field__OclElement /* 1 */,
				Fragments._Field__Concept /* 2 */,
				Fragments._Field__Field /* 3 */
			};
		private static final int /*@NonNull*/ [] __Field = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FieldLimit =
			{
				Fragments._FieldLimit__OclAny /* 0 */,
				Fragments._FieldLimit__OclElement /* 1 */,
				Fragments._FieldLimit__Concept /* 2 */,
				Fragments._FieldLimit__Limit /* 3 */,
				Fragments._FieldLimit__FieldLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __FieldLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Filter =
			{
				Fragments._Filter__OclAny /* 0 */,
				Fragments._Filter__OclElement /* 1 */,
				Fragments._Filter__Filter /* 2 */
			};
		private static final int /*@NonNull*/ [] __Filter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__Concept /* 2 */,
				Fragments._Index__Index /* 3 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IndexLimit =
			{
				Fragments._IndexLimit__OclAny /* 0 */,
				Fragments._IndexLimit__OclElement /* 1 */,
				Fragments._IndexLimit__Concept /* 2 */,
				Fragments._IndexLimit__Limit /* 3 */,
				Fragments._IndexLimit__IndexLimit /* 4 */
			};
		private static final int /*@NonNull*/ [] __IndexLimit = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Insert =
			{
				Fragments._Insert__OclAny /* 0 */,
				Fragments._Insert__OclElement /* 1 */,
				Fragments._Insert__Method /* 2 */,
				Fragments._Insert__DmlMethod /* 3 */,
				Fragments._Insert__Insert /* 4 */
			};
		private static final int /*@NonNull*/ [] __Insert = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Limit =
			{
				Fragments._Limit__OclAny /* 0 */,
				Fragments._Limit__OclElement /* 1 */,
				Fragments._Limit__Concept /* 2 */,
				Fragments._Limit__Limit /* 3 */
			};
		private static final int /*@NonNull*/ [] __Limit = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Method =
			{
				Fragments._Method__OclAny /* 0 */,
				Fragments._Method__OclElement /* 1 */,
				Fragments._Method__Method /* 2 */
			};
		private static final int /*@NonNull*/ [] __Method = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NonVectorField =
			{
				Fragments._NonVectorField__OclAny /* 0 */,
				Fragments._NonVectorField__OclElement /* 1 */,
				Fragments._NonVectorField__Concept /* 2 */,
				Fragments._NonVectorField__Field /* 3 */,
				Fragments._NonVectorField__NonVectorField /* 4 */
			};
		private static final int /*@NonNull*/ [] __NonVectorField = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NonVectorIndex =
			{
				Fragments._NonVectorIndex__OclAny /* 0 */,
				Fragments._NonVectorIndex__OclElement /* 1 */,
				Fragments._NonVectorIndex__Concept /* 2 */,
				Fragments._NonVectorIndex__Index /* 3 */,
				Fragments._NonVectorIndex__NonVectorIndex /* 4 */
			};
		private static final int /*@NonNull*/ [] __NonVectorIndex = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NonVectorSearch =
			{
				Fragments._NonVectorSearch__OclAny /* 0 */,
				Fragments._NonVectorSearch__OclElement /* 1 */,
				Fragments._NonVectorSearch__Method /* 2 */,
				Fragments._NonVectorSearch__QueryMethod /* 3 */,
				Fragments._NonVectorSearch__NonVectorSearch /* 4 */
			};
		private static final int /*@NonNull*/ [] __NonVectorSearch = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Partition =
			{
				Fragments._Partition__OclAny /* 0 */,
				Fragments._Partition__OclElement /* 1 */,
				Fragments._Partition__Concept /* 2 */,
				Fragments._Partition__Partition /* 3 */
			};
		private static final int /*@NonNull*/ [] __Partition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QueryMethod =
			{
				Fragments._QueryMethod__OclAny /* 0 */,
				Fragments._QueryMethod__OclElement /* 1 */,
				Fragments._QueryMethod__Method /* 2 */,
				Fragments._QueryMethod__QueryMethod /* 3 */
			};
		private static final int /*@NonNull*/ [] __QueryMethod = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Script =
			{
				Fragments._Script__OclAny /* 0 */,
				Fragments._Script__OclElement /* 1 */,
				Fragments._Script__Script /* 2 */
			};
		private static final int /*@NonNull*/ [] __Script = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Update =
			{
				Fragments._Update__OclAny /* 0 */,
				Fragments._Update__OclElement /* 1 */,
				Fragments._Update__Method /* 2 */,
				Fragments._Update__DmlMethod /* 3 */,
				Fragments._Update__Update /* 4 */
			};
		private static final int /*@NonNull*/ [] __Update = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VectorCollection =
			{
				Fragments._VectorCollection__OclAny /* 0 */,
				Fragments._VectorCollection__OclElement /* 1 */,
				Fragments._VectorCollection__Concept /* 2 */,
				Fragments._VectorCollection__VectorCollection /* 3 */
			};
		private static final int /*@NonNull*/ [] __VectorCollection = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VectorDatabase =
			{
				Fragments._VectorDatabase__OclAny /* 0 */,
				Fragments._VectorDatabase__OclElement /* 1 */,
				Fragments._VectorDatabase__Concept /* 2 */,
				Fragments._VectorDatabase__VectorDatabase /* 3 */
			};
		private static final int /*@NonNull*/ [] __VectorDatabase = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VectorField =
			{
				Fragments._VectorField__OclAny /* 0 */,
				Fragments._VectorField__OclElement /* 1 */,
				Fragments._VectorField__Concept /* 2 */,
				Fragments._VectorField__Field /* 3 */,
				Fragments._VectorField__VectorField /* 4 */
			};
		private static final int /*@NonNull*/ [] __VectorField = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VectorIndex =
			{
				Fragments._VectorIndex__OclAny /* 0 */,
				Fragments._VectorIndex__OclElement /* 1 */,
				Fragments._VectorIndex__Concept /* 2 */,
				Fragments._VectorIndex__Index /* 3 */,
				Fragments._VectorIndex__VectorIndex /* 4 */
			};
		private static final int /*@NonNull*/ [] __VectorIndex = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VectorSearch =
			{
				Fragments._VectorSearch__OclAny /* 0 */,
				Fragments._VectorSearch__OclElement /* 1 */,
				Fragments._VectorSearch__Method /* 2 */,
				Fragments._VectorSearch__QueryMethod /* 3 */,
				Fragments._VectorSearch__VectorSearch /* 4 */
			};
		private static final int /*@NonNull*/ [] __VectorSearch = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Alter.initFragments(_Alter, __Alter);
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._ClusterLimit.initFragments(_ClusterLimit, __ClusterLimit);
			Types._CollectionLimit.initFragments(_CollectionLimit, __CollectionLimit);
			Types._Concept.initFragments(_Concept, __Concept);
			Types._Connection.initFragments(_Connection, __Connection);
			Types._Create.initFragments(_Create, __Create);
			Types._DdlMethod.initFragments(_DdlMethod, __DdlMethod);
			Types._Delete.initFragments(_Delete, __Delete);
			Types._DmlMethod.initFragments(_DmlMethod, __DmlMethod);
			Types._Drop.initFragments(_Drop, __Drop);
			Types._EClusterLimit.initFragments(_EClusterLimit, __EClusterLimit);
			Types._EColectionLimit.initFragments(_EColectionLimit, __EColectionLimit);
			Types._EFieldLimit.initFragments(_EFieldLimit, __EFieldLimit);
			Types._EIndexLimit.initFragments(_EIndexLimit, __EIndexLimit);
			Types._EMetricType.initFragments(_EMetricType, __EMetricType);
			Types._ENVIdxType.initFragments(_ENVIdxType, __ENVIdxType);
			Types._EOperator.initFragments(_EOperator, __EOperator);
			Types._EPodEnv.initFragments(_EPodEnv, __EPodEnv);
			Types._EPodSize.initFragments(_EPodSize, __EPodSize);
			Types._EPodTypes.initFragments(_EPodTypes, __EPodTypes);
			Types._EScalarDType.initFragments(_EScalarDType, __EScalarDType);
			Types._EVIdxType.initFragments(_EVIdxType, __EVIdxType);
			Types._EVectorDType.initFragments(_EVectorDType, __EVectorDType);
			Types._EVendorName.initFragments(_EVendorName, __EVendorName);
			Types._EmbeddingModel.initFragments(_EmbeddingModel, __EmbeddingModel);
			Types._Field.initFragments(_Field, __Field);
			Types._FieldLimit.initFragments(_FieldLimit, __FieldLimit);
			Types._Filter.initFragments(_Filter, __Filter);
			Types._Index.initFragments(_Index, __Index);
			Types._IndexLimit.initFragments(_IndexLimit, __IndexLimit);
			Types._Insert.initFragments(_Insert, __Insert);
			Types._Limit.initFragments(_Limit, __Limit);
			Types._Method.initFragments(_Method, __Method);
			Types._NonVectorField.initFragments(_NonVectorField, __NonVectorField);
			Types._NonVectorIndex.initFragments(_NonVectorIndex, __NonVectorIndex);
			Types._NonVectorSearch.initFragments(_NonVectorSearch, __NonVectorSearch);
			Types._Partition.initFragments(_Partition, __Partition);
			Types._QueryMethod.initFragments(_QueryMethod, __QueryMethod);
			Types._Script.initFragments(_Script, __Script);
			Types._Update.initFragments(_Update, __Update);
			Types._VectorCollection.initFragments(_VectorCollection, __VectorCollection);
			Types._VectorDatabase.initFragments(_VectorDatabase, __VectorDatabase);
			Types._VectorField.initFragments(_VectorField, __VectorField);
			Types._VectorIndex.initFragments(_VectorIndex, __VectorIndex);
			Types._VectorSearch.initFragments(_VectorSearch, __VectorSearch);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Alter__Alter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Alter__DdlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Alter__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Alter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Alter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ClusterLimit__ClusterLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusterLimit__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusterLimit__Limit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusterLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ClusterLimit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CollectionLimit__CollectionLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionLimit__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionLimit__Limit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionLimit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Concept__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Concept__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Concept__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Connection__Connection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Connection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Connection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Create__Create = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Create__DdlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Create__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Create__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Create__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DdlMethod__DdlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DdlMethod__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DdlMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DdlMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Delete__Delete = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Delete__DmlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Delete__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Delete__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Delete__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DmlMethod__DmlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DmlMethod__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DmlMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DmlMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Drop__Drop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Drop__DdlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Drop__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Drop__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Drop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EClusterLimit__EClusterLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EClusterLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClusterLimit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClusterLimit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EClusterLimit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EColectionLimit__EColectionLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EColectionLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EColectionLimit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EColectionLimit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EColectionLimit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EFieldLimit__EFieldLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EFieldLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EFieldLimit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EFieldLimit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EFieldLimit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EIndexLimit__EIndexLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EIndexLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EIndexLimit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EIndexLimit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EIndexLimit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EMetricType__EMetricType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EMetricType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EMetricType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EMetricType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EMetricType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ENVIdxType__ENVIdxType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ENVIdxType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ENVIdxType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ENVIdxType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ENVIdxType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EOperator__EOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EOperator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOperator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOperator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EOperator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EPodEnv__EPodEnv = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodEnv__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodEnv__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodEnv__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodEnv__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EPodSize__EPodSize = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodSize__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodSize__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodSize__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodSize__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EPodTypes__EPodTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EPodTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EScalarDType__EScalarDType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EScalarDType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EScalarDType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EScalarDType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EScalarDType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EVIdxType__EVIdxType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EVIdxType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVIdxType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVIdxType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVIdxType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EVectorDType__EVectorDType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EVectorDType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVectorDType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVectorDType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVectorDType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EVendorName__EVendorName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EVendorName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVendorName__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVendorName__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EVendorName__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EmbeddingModel__EmbeddingModel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EmbeddingModel__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EmbeddingModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EmbeddingModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Field__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FieldLimit__FieldLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldLimit__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldLimit__Limit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldLimit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Filter__Filter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Filter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Index__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IndexLimit__IndexLimit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndexLimit__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndexLimit__Limit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndexLimit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndexLimit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Insert__Insert = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Insert__DmlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Insert__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Insert__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Insert__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Limit__Limit = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Limit__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Limit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Limit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Method__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Method__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Method__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorField__NonVectorField = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorField__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorField__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorField__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorIndex__NonVectorIndex = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorIndex__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorIndex__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorIndex__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorIndex__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorSearch__NonVectorSearch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorSearch__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorSearch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorSearch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NonVectorSearch__QueryMethod = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Partition__Partition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Partition__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Partition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Partition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _QueryMethod__QueryMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QueryMethod__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QueryMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QueryMethod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Script__Script = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Script__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Script__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Update__Update = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Update__DmlMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Update__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Update__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Update__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VectorCollection__VectorCollection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorCollection__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorCollection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorCollection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VectorDatabase__VectorDatabase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorDatabase__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorDatabase__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorDatabase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VectorField__VectorField = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorField__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorField__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorField__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VectorIndex__VectorIndex = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorIndex__Concept = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorIndex__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorIndex__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorIndex__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VectorSearch__VectorSearch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorSearch__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorSearch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorSearch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VectorSearch__QueryMethod = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Alter__Alter.initOperations(_Alter__Alter);
			Fragments._Alter__DdlMethod.initOperations(_Alter__DdlMethod);
			Fragments._Alter__Method.initOperations(_Alter__Method);
			Fragments._Alter__OclAny.initOperations(_Alter__OclAny);
			Fragments._Alter__OclElement.initOperations(_Alter__OclElement);

			Fragments._Cluster__Cluster.initOperations(_Cluster__Cluster);
			Fragments._Cluster__Concept.initOperations(_Cluster__Concept);
			Fragments._Cluster__OclAny.initOperations(_Cluster__OclAny);
			Fragments._Cluster__OclElement.initOperations(_Cluster__OclElement);

			Fragments._ClusterLimit__ClusterLimit.initOperations(_ClusterLimit__ClusterLimit);
			Fragments._ClusterLimit__Concept.initOperations(_ClusterLimit__Concept);
			Fragments._ClusterLimit__Limit.initOperations(_ClusterLimit__Limit);
			Fragments._ClusterLimit__OclAny.initOperations(_ClusterLimit__OclAny);
			Fragments._ClusterLimit__OclElement.initOperations(_ClusterLimit__OclElement);

			Fragments._CollectionLimit__CollectionLimit.initOperations(_CollectionLimit__CollectionLimit);
			Fragments._CollectionLimit__Concept.initOperations(_CollectionLimit__Concept);
			Fragments._CollectionLimit__Limit.initOperations(_CollectionLimit__Limit);
			Fragments._CollectionLimit__OclAny.initOperations(_CollectionLimit__OclAny);
			Fragments._CollectionLimit__OclElement.initOperations(_CollectionLimit__OclElement);

			Fragments._Concept__Concept.initOperations(_Concept__Concept);
			Fragments._Concept__OclAny.initOperations(_Concept__OclAny);
			Fragments._Concept__OclElement.initOperations(_Concept__OclElement);

			Fragments._Connection__Connection.initOperations(_Connection__Connection);
			Fragments._Connection__OclAny.initOperations(_Connection__OclAny);
			Fragments._Connection__OclElement.initOperations(_Connection__OclElement);

			Fragments._Create__Create.initOperations(_Create__Create);
			Fragments._Create__DdlMethod.initOperations(_Create__DdlMethod);
			Fragments._Create__Method.initOperations(_Create__Method);
			Fragments._Create__OclAny.initOperations(_Create__OclAny);
			Fragments._Create__OclElement.initOperations(_Create__OclElement);

			Fragments._DdlMethod__DdlMethod.initOperations(_DdlMethod__DdlMethod);
			Fragments._DdlMethod__Method.initOperations(_DdlMethod__Method);
			Fragments._DdlMethod__OclAny.initOperations(_DdlMethod__OclAny);
			Fragments._DdlMethod__OclElement.initOperations(_DdlMethod__OclElement);

			Fragments._Delete__Delete.initOperations(_Delete__Delete);
			Fragments._Delete__DmlMethod.initOperations(_Delete__DmlMethod);
			Fragments._Delete__Method.initOperations(_Delete__Method);
			Fragments._Delete__OclAny.initOperations(_Delete__OclAny);
			Fragments._Delete__OclElement.initOperations(_Delete__OclElement);

			Fragments._DmlMethod__DmlMethod.initOperations(_DmlMethod__DmlMethod);
			Fragments._DmlMethod__Method.initOperations(_DmlMethod__Method);
			Fragments._DmlMethod__OclAny.initOperations(_DmlMethod__OclAny);
			Fragments._DmlMethod__OclElement.initOperations(_DmlMethod__OclElement);

			Fragments._Drop__DdlMethod.initOperations(_Drop__DdlMethod);
			Fragments._Drop__Drop.initOperations(_Drop__Drop);
			Fragments._Drop__Method.initOperations(_Drop__Method);
			Fragments._Drop__OclAny.initOperations(_Drop__OclAny);
			Fragments._Drop__OclElement.initOperations(_Drop__OclElement);

			Fragments._EClusterLimit__EClusterLimit.initOperations(_EClusterLimit__EClusterLimit);
			Fragments._EClusterLimit__OclAny.initOperations(_EClusterLimit__OclAny);
			Fragments._EClusterLimit__OclElement.initOperations(_EClusterLimit__OclElement);
			Fragments._EClusterLimit__OclEnumeration.initOperations(_EClusterLimit__OclEnumeration);
			Fragments._EClusterLimit__OclType.initOperations(_EClusterLimit__OclType);

			Fragments._EColectionLimit__EColectionLimit.initOperations(_EColectionLimit__EColectionLimit);
			Fragments._EColectionLimit__OclAny.initOperations(_EColectionLimit__OclAny);
			Fragments._EColectionLimit__OclElement.initOperations(_EColectionLimit__OclElement);
			Fragments._EColectionLimit__OclEnumeration.initOperations(_EColectionLimit__OclEnumeration);
			Fragments._EColectionLimit__OclType.initOperations(_EColectionLimit__OclType);

			Fragments._EFieldLimit__EFieldLimit.initOperations(_EFieldLimit__EFieldLimit);
			Fragments._EFieldLimit__OclAny.initOperations(_EFieldLimit__OclAny);
			Fragments._EFieldLimit__OclElement.initOperations(_EFieldLimit__OclElement);
			Fragments._EFieldLimit__OclEnumeration.initOperations(_EFieldLimit__OclEnumeration);
			Fragments._EFieldLimit__OclType.initOperations(_EFieldLimit__OclType);

			Fragments._EIndexLimit__EIndexLimit.initOperations(_EIndexLimit__EIndexLimit);
			Fragments._EIndexLimit__OclAny.initOperations(_EIndexLimit__OclAny);
			Fragments._EIndexLimit__OclElement.initOperations(_EIndexLimit__OclElement);
			Fragments._EIndexLimit__OclEnumeration.initOperations(_EIndexLimit__OclEnumeration);
			Fragments._EIndexLimit__OclType.initOperations(_EIndexLimit__OclType);

			Fragments._EMetricType__EMetricType.initOperations(_EMetricType__EMetricType);
			Fragments._EMetricType__OclAny.initOperations(_EMetricType__OclAny);
			Fragments._EMetricType__OclElement.initOperations(_EMetricType__OclElement);
			Fragments._EMetricType__OclEnumeration.initOperations(_EMetricType__OclEnumeration);
			Fragments._EMetricType__OclType.initOperations(_EMetricType__OclType);

			Fragments._ENVIdxType__ENVIdxType.initOperations(_ENVIdxType__ENVIdxType);
			Fragments._ENVIdxType__OclAny.initOperations(_ENVIdxType__OclAny);
			Fragments._ENVIdxType__OclElement.initOperations(_ENVIdxType__OclElement);
			Fragments._ENVIdxType__OclEnumeration.initOperations(_ENVIdxType__OclEnumeration);
			Fragments._ENVIdxType__OclType.initOperations(_ENVIdxType__OclType);

			Fragments._EOperator__EOperator.initOperations(_EOperator__EOperator);
			Fragments._EOperator__OclAny.initOperations(_EOperator__OclAny);
			Fragments._EOperator__OclElement.initOperations(_EOperator__OclElement);
			Fragments._EOperator__OclEnumeration.initOperations(_EOperator__OclEnumeration);
			Fragments._EOperator__OclType.initOperations(_EOperator__OclType);

			Fragments._EPodEnv__EPodEnv.initOperations(_EPodEnv__EPodEnv);
			Fragments._EPodEnv__OclAny.initOperations(_EPodEnv__OclAny);
			Fragments._EPodEnv__OclElement.initOperations(_EPodEnv__OclElement);
			Fragments._EPodEnv__OclEnumeration.initOperations(_EPodEnv__OclEnumeration);
			Fragments._EPodEnv__OclType.initOperations(_EPodEnv__OclType);

			Fragments._EPodSize__EPodSize.initOperations(_EPodSize__EPodSize);
			Fragments._EPodSize__OclAny.initOperations(_EPodSize__OclAny);
			Fragments._EPodSize__OclElement.initOperations(_EPodSize__OclElement);
			Fragments._EPodSize__OclEnumeration.initOperations(_EPodSize__OclEnumeration);
			Fragments._EPodSize__OclType.initOperations(_EPodSize__OclType);

			Fragments._EPodTypes__EPodTypes.initOperations(_EPodTypes__EPodTypes);
			Fragments._EPodTypes__OclAny.initOperations(_EPodTypes__OclAny);
			Fragments._EPodTypes__OclElement.initOperations(_EPodTypes__OclElement);
			Fragments._EPodTypes__OclEnumeration.initOperations(_EPodTypes__OclEnumeration);
			Fragments._EPodTypes__OclType.initOperations(_EPodTypes__OclType);

			Fragments._EScalarDType__EScalarDType.initOperations(_EScalarDType__EScalarDType);
			Fragments._EScalarDType__OclAny.initOperations(_EScalarDType__OclAny);
			Fragments._EScalarDType__OclElement.initOperations(_EScalarDType__OclElement);
			Fragments._EScalarDType__OclEnumeration.initOperations(_EScalarDType__OclEnumeration);
			Fragments._EScalarDType__OclType.initOperations(_EScalarDType__OclType);

			Fragments._EVIdxType__EVIdxType.initOperations(_EVIdxType__EVIdxType);
			Fragments._EVIdxType__OclAny.initOperations(_EVIdxType__OclAny);
			Fragments._EVIdxType__OclElement.initOperations(_EVIdxType__OclElement);
			Fragments._EVIdxType__OclEnumeration.initOperations(_EVIdxType__OclEnumeration);
			Fragments._EVIdxType__OclType.initOperations(_EVIdxType__OclType);

			Fragments._EVectorDType__EVectorDType.initOperations(_EVectorDType__EVectorDType);
			Fragments._EVectorDType__OclAny.initOperations(_EVectorDType__OclAny);
			Fragments._EVectorDType__OclElement.initOperations(_EVectorDType__OclElement);
			Fragments._EVectorDType__OclEnumeration.initOperations(_EVectorDType__OclEnumeration);
			Fragments._EVectorDType__OclType.initOperations(_EVectorDType__OclType);

			Fragments._EVendorName__EVendorName.initOperations(_EVendorName__EVendorName);
			Fragments._EVendorName__OclAny.initOperations(_EVendorName__OclAny);
			Fragments._EVendorName__OclElement.initOperations(_EVendorName__OclElement);
			Fragments._EVendorName__OclEnumeration.initOperations(_EVendorName__OclEnumeration);
			Fragments._EVendorName__OclType.initOperations(_EVendorName__OclType);

			Fragments._EmbeddingModel__Concept.initOperations(_EmbeddingModel__Concept);
			Fragments._EmbeddingModel__EmbeddingModel.initOperations(_EmbeddingModel__EmbeddingModel);
			Fragments._EmbeddingModel__OclAny.initOperations(_EmbeddingModel__OclAny);
			Fragments._EmbeddingModel__OclElement.initOperations(_EmbeddingModel__OclElement);

			Fragments._Field__Concept.initOperations(_Field__Concept);
			Fragments._Field__Field.initOperations(_Field__Field);
			Fragments._Field__OclAny.initOperations(_Field__OclAny);
			Fragments._Field__OclElement.initOperations(_Field__OclElement);

			Fragments._FieldLimit__Concept.initOperations(_FieldLimit__Concept);
			Fragments._FieldLimit__FieldLimit.initOperations(_FieldLimit__FieldLimit);
			Fragments._FieldLimit__Limit.initOperations(_FieldLimit__Limit);
			Fragments._FieldLimit__OclAny.initOperations(_FieldLimit__OclAny);
			Fragments._FieldLimit__OclElement.initOperations(_FieldLimit__OclElement);

			Fragments._Filter__Filter.initOperations(_Filter__Filter);
			Fragments._Filter__OclAny.initOperations(_Filter__OclAny);
			Fragments._Filter__OclElement.initOperations(_Filter__OclElement);

			Fragments._Index__Concept.initOperations(_Index__Concept);
			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);

			Fragments._IndexLimit__Concept.initOperations(_IndexLimit__Concept);
			Fragments._IndexLimit__IndexLimit.initOperations(_IndexLimit__IndexLimit);
			Fragments._IndexLimit__Limit.initOperations(_IndexLimit__Limit);
			Fragments._IndexLimit__OclAny.initOperations(_IndexLimit__OclAny);
			Fragments._IndexLimit__OclElement.initOperations(_IndexLimit__OclElement);

			Fragments._Insert__DmlMethod.initOperations(_Insert__DmlMethod);
			Fragments._Insert__Insert.initOperations(_Insert__Insert);
			Fragments._Insert__Method.initOperations(_Insert__Method);
			Fragments._Insert__OclAny.initOperations(_Insert__OclAny);
			Fragments._Insert__OclElement.initOperations(_Insert__OclElement);

			Fragments._Limit__Concept.initOperations(_Limit__Concept);
			Fragments._Limit__Limit.initOperations(_Limit__Limit);
			Fragments._Limit__OclAny.initOperations(_Limit__OclAny);
			Fragments._Limit__OclElement.initOperations(_Limit__OclElement);

			Fragments._Method__Method.initOperations(_Method__Method);
			Fragments._Method__OclAny.initOperations(_Method__OclAny);
			Fragments._Method__OclElement.initOperations(_Method__OclElement);

			Fragments._NonVectorField__Concept.initOperations(_NonVectorField__Concept);
			Fragments._NonVectorField__Field.initOperations(_NonVectorField__Field);
			Fragments._NonVectorField__NonVectorField.initOperations(_NonVectorField__NonVectorField);
			Fragments._NonVectorField__OclAny.initOperations(_NonVectorField__OclAny);
			Fragments._NonVectorField__OclElement.initOperations(_NonVectorField__OclElement);

			Fragments._NonVectorIndex__Concept.initOperations(_NonVectorIndex__Concept);
			Fragments._NonVectorIndex__Index.initOperations(_NonVectorIndex__Index);
			Fragments._NonVectorIndex__NonVectorIndex.initOperations(_NonVectorIndex__NonVectorIndex);
			Fragments._NonVectorIndex__OclAny.initOperations(_NonVectorIndex__OclAny);
			Fragments._NonVectorIndex__OclElement.initOperations(_NonVectorIndex__OclElement);

			Fragments._NonVectorSearch__Method.initOperations(_NonVectorSearch__Method);
			Fragments._NonVectorSearch__NonVectorSearch.initOperations(_NonVectorSearch__NonVectorSearch);
			Fragments._NonVectorSearch__OclAny.initOperations(_NonVectorSearch__OclAny);
			Fragments._NonVectorSearch__OclElement.initOperations(_NonVectorSearch__OclElement);
			Fragments._NonVectorSearch__QueryMethod.initOperations(_NonVectorSearch__QueryMethod);

			Fragments._Partition__Concept.initOperations(_Partition__Concept);
			Fragments._Partition__OclAny.initOperations(_Partition__OclAny);
			Fragments._Partition__OclElement.initOperations(_Partition__OclElement);
			Fragments._Partition__Partition.initOperations(_Partition__Partition);

			Fragments._QueryMethod__Method.initOperations(_QueryMethod__Method);
			Fragments._QueryMethod__OclAny.initOperations(_QueryMethod__OclAny);
			Fragments._QueryMethod__OclElement.initOperations(_QueryMethod__OclElement);
			Fragments._QueryMethod__QueryMethod.initOperations(_QueryMethod__QueryMethod);

			Fragments._Script__OclAny.initOperations(_Script__OclAny);
			Fragments._Script__OclElement.initOperations(_Script__OclElement);
			Fragments._Script__Script.initOperations(_Script__Script);

			Fragments._Update__DmlMethod.initOperations(_Update__DmlMethod);
			Fragments._Update__Method.initOperations(_Update__Method);
			Fragments._Update__OclAny.initOperations(_Update__OclAny);
			Fragments._Update__OclElement.initOperations(_Update__OclElement);
			Fragments._Update__Update.initOperations(_Update__Update);

			Fragments._VectorCollection__Concept.initOperations(_VectorCollection__Concept);
			Fragments._VectorCollection__OclAny.initOperations(_VectorCollection__OclAny);
			Fragments._VectorCollection__OclElement.initOperations(_VectorCollection__OclElement);
			Fragments._VectorCollection__VectorCollection.initOperations(_VectorCollection__VectorCollection);

			Fragments._VectorDatabase__Concept.initOperations(_VectorDatabase__Concept);
			Fragments._VectorDatabase__OclAny.initOperations(_VectorDatabase__OclAny);
			Fragments._VectorDatabase__OclElement.initOperations(_VectorDatabase__OclElement);
			Fragments._VectorDatabase__VectorDatabase.initOperations(_VectorDatabase__VectorDatabase);

			Fragments._VectorField__Concept.initOperations(_VectorField__Concept);
			Fragments._VectorField__Field.initOperations(_VectorField__Field);
			Fragments._VectorField__OclAny.initOperations(_VectorField__OclAny);
			Fragments._VectorField__OclElement.initOperations(_VectorField__OclElement);
			Fragments._VectorField__VectorField.initOperations(_VectorField__VectorField);

			Fragments._VectorIndex__Concept.initOperations(_VectorIndex__Concept);
			Fragments._VectorIndex__Index.initOperations(_VectorIndex__Index);
			Fragments._VectorIndex__OclAny.initOperations(_VectorIndex__OclAny);
			Fragments._VectorIndex__OclElement.initOperations(_VectorIndex__OclElement);
			Fragments._VectorIndex__VectorIndex.initOperations(_VectorIndex__VectorIndex);

			Fragments._VectorSearch__Method.initOperations(_VectorSearch__Method);
			Fragments._VectorSearch__OclAny.initOperations(_VectorSearch__OclAny);
			Fragments._VectorSearch__OclElement.initOperations(_VectorSearch__OclElement);
			Fragments._VectorSearch__QueryMethod.initOperations(_VectorSearch__QueryMethod);
			Fragments._VectorSearch__VectorSearch.initOperations(_VectorSearch__VectorSearch);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Alter = {
			VecdslMMTables.Properties._Alter__alterCond,
			VecdslMMTables.Properties._DdlMethod__ddlConcept,
			VecdslMMTables.Properties._DdlMethod__ddlNode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Cluster = {
			VecdslMMTables.Properties._Cluster__clusterLimits,
			VecdslMMTables.Properties._Cluster__collections,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			VecdslMMTables.Properties._Cluster__nofCollections,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Cluster__vectordb
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ClusterLimit = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._ClusterLimit__type,
			VecdslMMTables.Properties._Limit__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CollectionLimit = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._CollectionLimit__type,
			VecdslMMTables.Properties._Limit__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Concept = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Connection = {
			VecdslMMTables.Properties._Connection__apiKey,
			VecdslMMTables.Properties._Connection__cloud,
			VecdslMMTables.Properties._Connection__environment,
			VecdslMMTables.Properties._Connection__host,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Connection__password,
			VecdslMMTables.Properties._Connection__port,
			VecdslMMTables.Properties._Connection__region,
			VecdslMMTables.Properties._Connection__userPrivillege,
			VecdslMMTables.Properties._Connection__userRole,
			VecdslMMTables.Properties._Connection__username
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Create = {
			VecdslMMTables.Properties._DdlMethod__ddlConcept,
			VecdslMMTables.Properties._DdlMethod__ddlNode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DdlMethod = {
			VecdslMMTables.Properties._DdlMethod__ddlConcept,
			VecdslMMTables.Properties._DdlMethod__ddlNode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Delete = {
			VecdslMMTables.Properties._Delete__deleteCond,
			VecdslMMTables.Properties._DmlMethod__dmlCollection,
			VecdslMMTables.Properties._Delete__ids,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DmlMethod = {
			VecdslMMTables.Properties._DmlMethod__dmlCollection,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Drop = {
			VecdslMMTables.Properties._DdlMethod__ddlConcept,
			VecdslMMTables.Properties._DdlMethod__ddlNode,
			VecdslMMTables.Properties._Drop__dropCond,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EClusterLimit = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EColectionLimit = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EFieldLimit = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EIndexLimit = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EMetricType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ENVIdxType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EOperator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EPodEnv = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EPodSize = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EPodTypes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EScalarDType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EVIdxType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EVectorDType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EVendorName = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EmbeddingModel = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Field = {
			VecdslMMTables.Properties._Field__colFieldOwner,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Field__fieldLimits,
			VecdslMMTables.Properties._Field__isPrimary,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FieldLimit = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._FieldLimit__type,
			VecdslMMTables.Properties._Limit__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Filter = {
			VecdslMMTables.Properties._Filter__filterField,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Filter__operator,
			VecdslMMTables.Properties._Filter__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IndexLimit = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._IndexLimit__type,
			VecdslMMTables.Properties._Limit__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Insert = {
			VecdslMMTables.Properties._DmlMethod__dmlCollection,
			VecdslMMTables.Properties._Insert__nofRecords,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Insert__path
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Limit = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Limit__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Method = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NonVectorField = {
			VecdslMMTables.Properties._Field__colFieldOwner,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Field__fieldLimits,
			VecdslMMTables.Properties._Field__isPrimary,
			VecdslMMTables.Properties._Concept__name,
			VecdslMMTables.Properties._NonVectorField__nonVectorIndexes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._NonVectorField__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NonVectorIndex = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._NonVectorIndex__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NonVectorSearch = {
			VecdslMMTables.Properties._NonVectorSearch__nonVecFilters,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._QueryMethod__outputFields,
			VecdslMMTables.Properties._QueryMethod__queryCollection,
			VecdslMMTables.Properties._QueryMethod__topK
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Partition = {
			VecdslMMTables.Properties._Partition__colPartOwner,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Partition__partitionKey
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QueryMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._QueryMethod__outputFields,
			VecdslMMTables.Properties._QueryMethod__queryCollection,
			VecdslMMTables.Properties._QueryMethod__topK
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Script = {
			VecdslMMTables.Properties._Script__methods,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Script__vendor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Update = {
			VecdslMMTables.Properties._DmlMethod__dmlCollection,
			VecdslMMTables.Properties._Update__ids,
			VecdslMMTables.Properties._Update__nofRecords,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._Update__path,
			VecdslMMTables.Properties._Update__updateCond
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VectorCollection = {
			VecdslMMTables.Properties._VectorCollection__cluster,
			VecdslMMTables.Properties._VectorCollection__collectionLimits,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._VectorCollection__dynamic,
			VecdslMMTables.Properties._VectorCollection__fields,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._VectorCollection__partitions,
			VecdslMMTables.Properties._VectorCollection__podEnv,
			VecdslMMTables.Properties._VectorCollection__podSize,
			VecdslMMTables.Properties._VectorCollection__podtype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VectorDatabase = {
			VecdslMMTables.Properties._VectorDatabase__clusters,
			VecdslMMTables.Properties._VectorDatabase__connection,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VectorField = {
			VecdslMMTables.Properties._Field__colFieldOwner,
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._VectorField__embModel,
			VecdslMMTables.Properties._Field__fieldLimits,
			VecdslMMTables.Properties._Field__isPrimary,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._VectorField__type,
			VecdslMMTables.Properties._VectorField__vectorIndexes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VectorIndex = {
			VecdslMMTables.Properties._Concept__description,
			VecdslMMTables.Properties._VectorIndex__metric,
			VecdslMMTables.Properties._Concept__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._VectorIndex__type,
			VecdslMMTables.Properties._VectorIndex__vIndexLimits
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VectorSearch = {
			VecdslMMTables.Properties._VectorSearch__metric,
			VecdslMMTables.Properties._VectorSearch__numUnitsProbe,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			VecdslMMTables.Properties._QueryMethod__outputFields,
			VecdslMMTables.Properties._QueryMethod__queryCollection,
			VecdslMMTables.Properties._QueryMethod__topK,
			VecdslMMTables.Properties._VectorSearch__vecSearchFilters
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Alter__Alter.initProperties(_Alter);
			Fragments._Cluster__Cluster.initProperties(_Cluster);
			Fragments._ClusterLimit__ClusterLimit.initProperties(_ClusterLimit);
			Fragments._CollectionLimit__CollectionLimit.initProperties(_CollectionLimit);
			Fragments._Concept__Concept.initProperties(_Concept);
			Fragments._Connection__Connection.initProperties(_Connection);
			Fragments._Create__Create.initProperties(_Create);
			Fragments._DdlMethod__DdlMethod.initProperties(_DdlMethod);
			Fragments._Delete__Delete.initProperties(_Delete);
			Fragments._DmlMethod__DmlMethod.initProperties(_DmlMethod);
			Fragments._Drop__Drop.initProperties(_Drop);
			Fragments._EClusterLimit__EClusterLimit.initProperties(_EClusterLimit);
			Fragments._EColectionLimit__EColectionLimit.initProperties(_EColectionLimit);
			Fragments._EFieldLimit__EFieldLimit.initProperties(_EFieldLimit);
			Fragments._EIndexLimit__EIndexLimit.initProperties(_EIndexLimit);
			Fragments._EMetricType__EMetricType.initProperties(_EMetricType);
			Fragments._ENVIdxType__ENVIdxType.initProperties(_ENVIdxType);
			Fragments._EOperator__EOperator.initProperties(_EOperator);
			Fragments._EPodEnv__EPodEnv.initProperties(_EPodEnv);
			Fragments._EPodSize__EPodSize.initProperties(_EPodSize);
			Fragments._EPodTypes__EPodTypes.initProperties(_EPodTypes);
			Fragments._EScalarDType__EScalarDType.initProperties(_EScalarDType);
			Fragments._EVIdxType__EVIdxType.initProperties(_EVIdxType);
			Fragments._EVectorDType__EVectorDType.initProperties(_EVectorDType);
			Fragments._EVendorName__EVendorName.initProperties(_EVendorName);
			Fragments._EmbeddingModel__EmbeddingModel.initProperties(_EmbeddingModel);
			Fragments._Field__Field.initProperties(_Field);
			Fragments._FieldLimit__FieldLimit.initProperties(_FieldLimit);
			Fragments._Filter__Filter.initProperties(_Filter);
			Fragments._Index__Index.initProperties(_Index);
			Fragments._IndexLimit__IndexLimit.initProperties(_IndexLimit);
			Fragments._Insert__Insert.initProperties(_Insert);
			Fragments._Limit__Limit.initProperties(_Limit);
			Fragments._Method__Method.initProperties(_Method);
			Fragments._NonVectorField__NonVectorField.initProperties(_NonVectorField);
			Fragments._NonVectorIndex__NonVectorIndex.initProperties(_NonVectorIndex);
			Fragments._NonVectorSearch__NonVectorSearch.initProperties(_NonVectorSearch);
			Fragments._Partition__Partition.initProperties(_Partition);
			Fragments._QueryMethod__QueryMethod.initProperties(_QueryMethod);
			Fragments._Script__Script.initProperties(_Script);
			Fragments._Update__Update.initProperties(_Update);
			Fragments._VectorCollection__VectorCollection.initProperties(_VectorCollection);
			Fragments._VectorDatabase__VectorDatabase.initProperties(_VectorDatabase);
			Fragments._VectorField__VectorField.initProperties(_VectorField);
			Fragments._VectorIndex__VectorIndex.initProperties(_VectorIndex);
			Fragments._VectorSearch__VectorSearch.initProperties(_VectorSearch);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EClusterLimit__NOFCOLLECTIONS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ECLUSTER_LIMIT.getEEnumLiteral("NOFCOLLECTIONS"), Types._EClusterLimit, 0);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EClusterLimit = {
			_EClusterLimit__NOFCOLLECTIONS
		};

		public static final EcoreExecutorEnumerationLiteral _EColectionLimit__NOFPARTITIONS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ECOLECTION_LIMIT.getEEnumLiteral("NOFPARTITIONS"), Types._EColectionLimit, 0);
		public static final EcoreExecutorEnumerationLiteral _EColectionLimit__NOFFIELDS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ECOLECTION_LIMIT.getEEnumLiteral("NOFFIELDS"), Types._EColectionLimit, 1);
		public static final EcoreExecutorEnumerationLiteral _EColectionLimit__NOFSHARDS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ECOLECTION_LIMIT.getEEnumLiteral("NOFSHARDS"), Types._EColectionLimit, 2);
		public static final EcoreExecutorEnumerationLiteral _EColectionLimit__VECTORDIM = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ECOLECTION_LIMIT.getEEnumLiteral("VECTORDIM"), Types._EColectionLimit, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EColectionLimit = {
			_EColectionLimit__NOFPARTITIONS,
			_EColectionLimit__NOFFIELDS,
			_EColectionLimit__NOFSHARDS,
			_EColectionLimit__VECTORDIM
		};

		public static final EcoreExecutorEnumerationLiteral _EFieldLimit__VECTORDIM = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EFIELD_LIMIT.getEEnumLiteral("VECTORDIM"), Types._EFieldLimit, 0);
		public static final EcoreExecutorEnumerationLiteral _EFieldLimit__ARRAYLEN = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EFIELD_LIMIT.getEEnumLiteral("ARRAYLEN"), Types._EFieldLimit, 1);
		public static final EcoreExecutorEnumerationLiteral _EFieldLimit__MAXSIZE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EFIELD_LIMIT.getEEnumLiteral("MAXSIZE"), Types._EFieldLimit, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EFieldLimit = {
			_EFieldLimit__VECTORDIM,
			_EFieldLimit__ARRAYLEN,
			_EFieldLimit__MAXSIZE
		};

		public static final EcoreExecutorEnumerationLiteral _EIndexLimit__NOFCLUSTERUNIT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EINDEX_LIMIT.getEEnumLiteral("NOFCLUSTERUNIT"), Types._EIndexLimit, 0);
		public static final EcoreExecutorEnumerationLiteral _EIndexLimit__NOFFACTORSPQ = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EINDEX_LIMIT.getEEnumLiteral("NOFFACTORSPQ"), Types._EIndexLimit, 1);
		public static final EcoreExecutorEnumerationLiteral _EIndexLimit__MAXNODEDGRE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EINDEX_LIMIT.getEEnumLiteral("MAXNODEDGRE"), Types._EIndexLimit, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EIndexLimit = {
			_EIndexLimit__NOFCLUSTERUNIT,
			_EIndexLimit__NOFFACTORSPQ,
			_EIndexLimit__MAXNODEDGRE
		};

		public static final EcoreExecutorEnumerationLiteral _EMetricType__EUCLIDEAN = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EMETRIC_TYPE.getEEnumLiteral("EUCLIDEAN"), Types._EMetricType, 0);
		public static final EcoreExecutorEnumerationLiteral _EMetricType__MANHATTAN = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EMETRIC_TYPE.getEEnumLiteral("MANHATTAN"), Types._EMetricType, 1);
		public static final EcoreExecutorEnumerationLiteral _EMetricType__DOT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EMETRIC_TYPE.getEEnumLiteral("DOT"), Types._EMetricType, 2);
		public static final EcoreExecutorEnumerationLiteral _EMetricType__COSINE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EMETRIC_TYPE.getEEnumLiteral("COSINE"), Types._EMetricType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EMetricType = {
			_EMetricType__EUCLIDEAN,
			_EMetricType__MANHATTAN,
			_EMetricType__DOT,
			_EMetricType__COSINE
		};

		public static final EcoreExecutorEnumerationLiteral _ENVIdxType__STANDARD = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ENV_IDX_TYPE.getEEnumLiteral("STANDARD"), Types._ENVIdxType, 0);
		public static final EcoreExecutorEnumerationLiteral _ENVIdxType__FULL_TEXT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ENV_IDX_TYPE.getEEnumLiteral("FULL_TEXT"), Types._ENVIdxType, 1);
		public static final EcoreExecutorEnumerationLiteral _ENVIdxType__INTEGER = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ENV_IDX_TYPE.getEEnumLiteral("INTEGER"), Types._ENVIdxType, 2);
		public static final EcoreExecutorEnumerationLiteral _ENVIdxType__PARAM_INT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ENV_IDX_TYPE.getEEnumLiteral("PARAM_INT"), Types._ENVIdxType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ENVIdxType = {
			_ENVIdxType__STANDARD,
			_ENVIdxType__FULL_TEXT,
			_ENVIdxType__INTEGER,
			_ENVIdxType__PARAM_INT
		};

		public static final EcoreExecutorEnumerationLiteral _EOperator__AND = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("AND"), Types._EOperator, 0);
		public static final EcoreExecutorEnumerationLiteral _EOperator__OR = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("OR"), Types._EOperator, 1);
		public static final EcoreExecutorEnumerationLiteral _EOperator__NOT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("NOT"), Types._EOperator, 2);
		public static final EcoreExecutorEnumerationLiteral _EOperator__LIKE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("LIKE"), Types._EOperator, 3);
		public static final EcoreExecutorEnumerationLiteral _EOperator__EQ = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("EQ"), Types._EOperator, 4);
		public static final EcoreExecutorEnumerationLiteral _EOperator__NEQ = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("NEQ"), Types._EOperator, 5);
		public static final EcoreExecutorEnumerationLiteral _EOperator__GT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("GT"), Types._EOperator, 6);
		public static final EcoreExecutorEnumerationLiteral _EOperator__GTE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("GTE"), Types._EOperator, 7);
		public static final EcoreExecutorEnumerationLiteral _EOperator__LT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("LT"), Types._EOperator, 8);
		public static final EcoreExecutorEnumerationLiteral _EOperator__LTE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EOPERATOR.getEEnumLiteral("LTE"), Types._EOperator, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EOperator = {
			_EOperator__AND,
			_EOperator__OR,
			_EOperator__NOT,
			_EOperator__LIKE,
			_EOperator__EQ,
			_EOperator__NEQ,
			_EOperator__GT,
			_EOperator__GTE,
			_EOperator__LT,
			_EOperator__LTE
		};

		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_W1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_W1_GCP"), Types._EPodEnv, 0);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_C1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_C1_GCP"), Types._EPodEnv, 1);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_W4_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_W4_GCP"), Types._EPodEnv, 2);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_E4_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_E4_GCP"), Types._EPodEnv, 3);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__NA_NE1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("NA_NE1_GCP"), Types._EPodEnv, 4);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__A_NE1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("A_NE1_GCP"), Types._EPodEnv, 5);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__A_SE1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("A_SE1_GCP"), Types._EPodEnv, 6);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_E1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_E1_GCP"), Types._EPodEnv, 7);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__EU_W1_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("EU_W1_GCP"), Types._EPodEnv, 8);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__EU_W4_GCP = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("EU_W4_GCP"), Types._EPodEnv, 9);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__US_E1_AWS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("US_E1_AWS"), Types._EPodEnv, 10);
		public static final EcoreExecutorEnumerationLiteral _EPodEnv__AZURE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_ENV.getEEnumLiteral("AZURE"), Types._EPodEnv, 11);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EPodEnv = {
			_EPodEnv__US_W1_GCP,
			_EPodEnv__US_C1_GCP,
			_EPodEnv__US_W4_GCP,
			_EPodEnv__US_E4_GCP,
			_EPodEnv__NA_NE1_GCP,
			_EPodEnv__A_NE1_GCP,
			_EPodEnv__A_SE1_GCP,
			_EPodEnv__US_E1_GCP,
			_EPodEnv__EU_W1_GCP,
			_EPodEnv__EU_W4_GCP,
			_EPodEnv__US_E1_AWS,
			_EPodEnv__AZURE
		};

		public static final EcoreExecutorEnumerationLiteral _EPodSize__X1 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_SIZE.getEEnumLiteral("X1"), Types._EPodSize, 0);
		public static final EcoreExecutorEnumerationLiteral _EPodSize__X2 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_SIZE.getEEnumLiteral("X2"), Types._EPodSize, 1);
		public static final EcoreExecutorEnumerationLiteral _EPodSize__X4 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_SIZE.getEEnumLiteral("X4"), Types._EPodSize, 2);
		public static final EcoreExecutorEnumerationLiteral _EPodSize__X8 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_SIZE.getEEnumLiteral("X8"), Types._EPodSize, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EPodSize = {
			_EPodSize__X1,
			_EPodSize__X2,
			_EPodSize__X4,
			_EPodSize__X8
		};

		public static final EcoreExecutorEnumerationLiteral _EPodTypes__S1 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_TYPES.getEEnumLiteral("S1"), Types._EPodTypes, 0);
		public static final EcoreExecutorEnumerationLiteral _EPodTypes__P1 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_TYPES.getEEnumLiteral("P1"), Types._EPodTypes, 1);
		public static final EcoreExecutorEnumerationLiteral _EPodTypes__P2 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EPOD_TYPES.getEEnumLiteral("P2"), Types._EPodTypes, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EPodTypes = {
			_EPodTypes__S1,
			_EPodTypes__P1,
			_EPodTypes__P2
		};

		public static final EcoreExecutorEnumerationLiteral _EScalarDType__INT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("INT"), Types._EScalarDType, 0);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__VARCHAR = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("VARCHAR"), Types._EScalarDType, 1);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__DOUBLE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("DOUBLE"), Types._EScalarDType, 2);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__FLOAT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("FLOAT"), Types._EScalarDType, 3);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__DATE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("DATE"), Types._EScalarDType, 4);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__DATETIME = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("DATETIME"), Types._EScalarDType, 5);
		public static final EcoreExecutorEnumerationLiteral _EScalarDType__JSON = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.ESCALAR_DTYPE.getEEnumLiteral("JSON"), Types._EScalarDType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EScalarDType = {
			_EScalarDType__INT,
			_EScalarDType__VARCHAR,
			_EScalarDType__DOUBLE,
			_EScalarDType__FLOAT,
			_EScalarDType__DATE,
			_EScalarDType__DATETIME,
			_EScalarDType__JSON
		};

		public static final EcoreExecutorEnumerationLiteral _EVIdxType__FLAT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("FLAT"), Types._EVIdxType, 0);
		public static final EcoreExecutorEnumerationLiteral _EVIdxType__IVF_FLAT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("IVF_FLAT"), Types._EVIdxType, 1);
		public static final EcoreExecutorEnumerationLiteral _EVIdxType__IVF_SQ8 = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("IVF_SQ8"), Types._EVIdxType, 2);
		public static final EcoreExecutorEnumerationLiteral _EVIdxType__IVF_PQ = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("IVF_PQ"), Types._EVIdxType, 3);
		public static final EcoreExecutorEnumerationLiteral _EVIdxType__HNSW = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("HNSW"), Types._EVIdxType, 4);
		public static final EcoreExecutorEnumerationLiteral _EVIdxType__SCANN = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EV_IDX_TYPE.getEEnumLiteral("SCANN"), Types._EVIdxType, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EVIdxType = {
			_EVIdxType__FLAT,
			_EVIdxType__IVF_FLAT,
			_EVIdxType__IVF_SQ8,
			_EVIdxType__IVF_PQ,
			_EVIdxType__HNSW,
			_EVIdxType__SCANN
		};

		public static final EcoreExecutorEnumerationLiteral _EVectorDType__BINARY_VECTOR = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVECTOR_DTYPE.getEEnumLiteral("BINARY_VECTOR"), Types._EVectorDType, 0);
		public static final EcoreExecutorEnumerationLiteral _EVectorDType__FLOAT_VECTOR = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVECTOR_DTYPE.getEEnumLiteral("FLOAT_VECTOR"), Types._EVectorDType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EVectorDType = {
			_EVectorDType__BINARY_VECTOR,
			_EVectorDType__FLOAT_VECTOR
		};

		public static final EcoreExecutorEnumerationLiteral _EVendorName__PINECONE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVENDOR_NAME.getEEnumLiteral("PINECONE"), Types._EVendorName, 0);
		public static final EcoreExecutorEnumerationLiteral _EVendorName__MILVUS = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVENDOR_NAME.getEEnumLiteral("MILVUS"), Types._EVendorName, 1);
		public static final EcoreExecutorEnumerationLiteral _EVendorName__CHROMA = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVENDOR_NAME.getEEnumLiteral("CHROMA"), Types._EVendorName, 2);
		public static final EcoreExecutorEnumerationLiteral _EVendorName__WEAVIATE = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVENDOR_NAME.getEEnumLiteral("WEAVIATE"), Types._EVendorName, 3);
		public static final EcoreExecutorEnumerationLiteral _EVendorName__QDRANT = new EcoreExecutorEnumerationLiteral(VecdslMMPackage.Literals.EVENDOR_NAME.getEEnumLiteral("QDRANT"), Types._EVendorName, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EVendorName = {
			_EVendorName__PINECONE,
			_EVendorName__MILVUS,
			_EVendorName__CHROMA,
			_EVendorName__WEAVIATE,
			_EVendorName__QDRANT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EClusterLimit.initLiterals(_EClusterLimit);
			Types._EColectionLimit.initLiterals(_EColectionLimit);
			Types._EFieldLimit.initLiterals(_EFieldLimit);
			Types._EIndexLimit.initLiterals(_EIndexLimit);
			Types._EMetricType.initLiterals(_EMetricType);
			Types._ENVIdxType.initLiterals(_ENVIdxType);
			Types._EOperator.initLiterals(_EOperator);
			Types._EPodEnv.initLiterals(_EPodEnv);
			Types._EPodSize.initLiterals(_EPodSize);
			Types._EPodTypes.initLiterals(_EPodTypes);
			Types._EScalarDType.initLiterals(_EScalarDType);
			Types._EVIdxType.initLiterals(_EVIdxType);
			Types._EVectorDType.initLiterals(_EVectorDType);
			Types._EVendorName.initLiterals(_EVendorName);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VecdslMMTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new VecdslMMTables();
	}

	private VecdslMMTables() {
		super(VecdslMMPackage.eNS_URI);
	}
}
