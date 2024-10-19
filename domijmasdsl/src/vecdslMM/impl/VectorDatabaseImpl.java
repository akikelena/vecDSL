/**
 */
package vecdslMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.Cluster;
import vecdslMM.Connection;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorDatabase;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.VectorDatabaseImpl#getClusters <em>Clusters</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorDatabaseImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorDatabaseImpl extends ConceptImpl implements VectorDatabase {
	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> clusters;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.VECTOR_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getClusters() {
		if (clusters == null) {
			clusters = new EObjectWithInverseResolvingEList<Cluster>(Cluster.class, this, VecdslMMPackage.VECTOR_DATABASE__CLUSTERS, VecdslMMPackage.CLUSTER__VECTORDB);
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_DATABASE__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.VECTOR_DATABASE__CONNECTION, null, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.VECTOR_DATABASE__CONNECTION, null, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_DATABASE__CONNECTION, newConnection, newConnection));
	}

	/**
	 * The cached validation expression for the '{@link #UniqueClusterName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Cluster Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueClusterName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_CLUSTER_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Cluster name must be unique within specific vector database!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.clusters->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueClusterName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.VECTOR_DATABASE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.VECTOR_DATABASE___UNIQUE_CLUSTER_NAME__DIAGNOSTICCHAIN_MAP,
				 UNIQUE_CLUSTER_NAME_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.VECTOR_DATABASE__UNIQUE_CLUSTER_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClusters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				return ((InternalEList<?>)getClusters()).basicRemove(otherEnd, msgs);
			case VecdslMMPackage.VECTOR_DATABASE__CONNECTION:
				return basicSetConnection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				return getClusters();
			case VecdslMMPackage.VECTOR_DATABASE__CONNECTION:
				return getConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				getClusters().clear();
				getClusters().addAll((Collection<? extends Cluster>)newValue);
				return;
			case VecdslMMPackage.VECTOR_DATABASE__CONNECTION:
				setConnection((Connection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				getClusters().clear();
				return;
			case VecdslMMPackage.VECTOR_DATABASE__CONNECTION:
				setConnection((Connection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_DATABASE__CLUSTERS:
				return clusters != null && !clusters.isEmpty();
			case VecdslMMPackage.VECTOR_DATABASE__CONNECTION:
				return connection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VecdslMMPackage.VECTOR_DATABASE___UNIQUE_CLUSTER_NAME__DIAGNOSTICCHAIN_MAP:
				return UniqueClusterName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VectorDatabaseImpl
