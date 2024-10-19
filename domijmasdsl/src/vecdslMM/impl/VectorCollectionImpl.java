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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.Cluster;
import vecdslMM.CollectionLimit;
import vecdslMM.EPodEnv;
import vecdslMM.EPodSize;
import vecdslMM.EPodTypes;
import vecdslMM.Field;
import vecdslMM.Partition;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getPodtype <em>Podtype</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getPodSize <em>Pod Size</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getPodEnv <em>Pod Env</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorCollectionImpl#getCollectionLimits <em>Collection Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorCollectionImpl extends ConceptImpl implements VectorCollection {
	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected Cluster cluster;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partitions;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamic = DYNAMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPodtype() <em>Podtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodtype()
	 * @generated
	 * @ordered
	 */
	protected static final EPodTypes PODTYPE_EDEFAULT = EPodTypes.S1;

	/**
	 * The cached value of the '{@link #getPodtype() <em>Podtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodtype()
	 * @generated
	 * @ordered
	 */
	protected EPodTypes podtype = PODTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPodSize() <em>Pod Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodSize()
	 * @generated
	 * @ordered
	 */
	protected static final EPodSize POD_SIZE_EDEFAULT = EPodSize.X1;

	/**
	 * The cached value of the '{@link #getPodSize() <em>Pod Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodSize()
	 * @generated
	 * @ordered
	 */
	protected EPodSize podSize = POD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPodEnv() <em>Pod Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodEnv()
	 * @generated
	 * @ordered
	 */
	protected static final EPodEnv POD_ENV_EDEFAULT = EPodEnv.US_W1_GCP;

	/**
	 * The cached value of the '{@link #getPodEnv() <em>Pod Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodEnv()
	 * @generated
	 * @ordered
	 */
	protected EPodEnv podEnv = POD_ENV_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollectionLimits() <em>Collection Limits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionLimit> collectionLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.VECTOR_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getCluster() {
		if (cluster != null && cluster.eIsProxy()) {
			InternalEObject oldCluster = (InternalEObject)cluster;
			cluster = (Cluster)eResolveProxy(oldCluster);
			if (cluster != oldCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.VECTOR_COLLECTION__CLUSTER, oldCluster, cluster));
			}
		}
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCluster(Cluster newCluster, NotificationChain msgs) {
		Cluster oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__CLUSTER, oldCluster, newCluster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(Cluster newCluster) {
		if (newCluster != cluster) {
			NotificationChain msgs = null;
			if (cluster != null)
				msgs = ((InternalEObject)cluster).eInverseRemove(this, VecdslMMPackage.CLUSTER__COLLECTIONS, Cluster.class, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, VecdslMMPackage.CLUSTER__COLLECTIONS, Cluster.class, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartitions() {
		if (partitions == null) {
			partitions = new EObjectWithInverseResolvingEList<Partition>(Partition.class, this, VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS, VecdslMMPackage.PARTITION__COL_PART_OWNER);
		}
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList<Field>(Field.class, this, VecdslMMPackage.VECTOR_COLLECTION__FIELDS, VecdslMMPackage.FIELD__COL_FIELD_OWNER);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamic() {
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamic(boolean newDynamic) {
		boolean oldDynamic = dynamic;
		dynamic = newDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__DYNAMIC, oldDynamic, dynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodTypes getPodtype() {
		return podtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPodtype(EPodTypes newPodtype) {
		EPodTypes oldPodtype = podtype;
		podtype = newPodtype == null ? PODTYPE_EDEFAULT : newPodtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__PODTYPE, oldPodtype, podtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodSize getPodSize() {
		return podSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPodSize(EPodSize newPodSize) {
		EPodSize oldPodSize = podSize;
		podSize = newPodSize == null ? POD_SIZE_EDEFAULT : newPodSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__POD_SIZE, oldPodSize, podSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPodEnv getPodEnv() {
		return podEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPodEnv(EPodEnv newPodEnv) {
		EPodEnv oldPodEnv = podEnv;
		podEnv = newPodEnv == null ? POD_ENV_EDEFAULT : newPodEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_COLLECTION__POD_ENV, oldPodEnv, podEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionLimit> getCollectionLimits() {
		if (collectionLimits == null) {
			collectionLimits = new EObjectContainmentEList<CollectionLimit>(CollectionLimit.class, this, VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS);
		}
		return collectionLimits;
	}

	/**
	 * The cached validation expression for the '{@link #colLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Col Limits Names</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #colLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String COL_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Collection limit names must be unique!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.collectionLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean colLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.VECTOR_COLLECTION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.VECTOR_COLLECTION___COL_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP,
				 COL_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.VECTOR_COLLECTION__COL_LIMITS_NAMES);
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				if (cluster != null)
					msgs = ((InternalEObject)cluster).eInverseRemove(this, VecdslMMPackage.CLUSTER__COLLECTIONS, Cluster.class, msgs);
				return basicSetCluster((Cluster)otherEnd, msgs);
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartitions()).basicAdd(otherEnd, msgs);
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				return basicSetCluster(null, msgs);
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				return ((InternalEList<?>)getPartitions()).basicRemove(otherEnd, msgs);
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS:
				return ((InternalEList<?>)getCollectionLimits()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				if (resolve) return getCluster();
				return basicGetCluster();
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				return getPartitions();
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				return getFields();
			case VecdslMMPackage.VECTOR_COLLECTION__DYNAMIC:
				return isDynamic();
			case VecdslMMPackage.VECTOR_COLLECTION__PODTYPE:
				return getPodtype();
			case VecdslMMPackage.VECTOR_COLLECTION__POD_SIZE:
				return getPodSize();
			case VecdslMMPackage.VECTOR_COLLECTION__POD_ENV:
				return getPodEnv();
			case VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS:
				return getCollectionLimits();
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				setCluster((Cluster)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				getPartitions().clear();
				getPartitions().addAll((Collection<? extends Partition>)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__DYNAMIC:
				setDynamic((Boolean)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__PODTYPE:
				setPodtype((EPodTypes)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_SIZE:
				setPodSize((EPodSize)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_ENV:
				setPodEnv((EPodEnv)newValue);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS:
				getCollectionLimits().clear();
				getCollectionLimits().addAll((Collection<? extends CollectionLimit>)newValue);
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				setCluster((Cluster)null);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				getPartitions().clear();
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				getFields().clear();
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__DYNAMIC:
				setDynamic(DYNAMIC_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__PODTYPE:
				setPodtype(PODTYPE_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_SIZE:
				setPodSize(POD_SIZE_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_ENV:
				setPodEnv(POD_ENV_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS:
				getCollectionLimits().clear();
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
			case VecdslMMPackage.VECTOR_COLLECTION__CLUSTER:
				return cluster != null;
			case VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS:
				return partitions != null && !partitions.isEmpty();
			case VecdslMMPackage.VECTOR_COLLECTION__FIELDS:
				return fields != null && !fields.isEmpty();
			case VecdslMMPackage.VECTOR_COLLECTION__DYNAMIC:
				return dynamic != DYNAMIC_EDEFAULT;
			case VecdslMMPackage.VECTOR_COLLECTION__PODTYPE:
				return podtype != PODTYPE_EDEFAULT;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_SIZE:
				return podSize != POD_SIZE_EDEFAULT;
			case VecdslMMPackage.VECTOR_COLLECTION__POD_ENV:
				return podEnv != POD_ENV_EDEFAULT;
			case VecdslMMPackage.VECTOR_COLLECTION__COLLECTION_LIMITS:
				return collectionLimits != null && !collectionLimits.isEmpty();
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
			case VecdslMMPackage.VECTOR_COLLECTION___COL_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP:
				return colLimitsNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dynamic: ");
		result.append(dynamic);
		result.append(", podtype: ");
		result.append(podtype);
		result.append(", podSize: ");
		result.append(podSize);
		result.append(", podEnv: ");
		result.append(podEnv);
		result.append(')');
		return result.toString();
	}

} //VectorCollectionImpl
