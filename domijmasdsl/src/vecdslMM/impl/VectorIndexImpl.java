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
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.EMetricType;
import vecdslMM.EVIdxType;
import vecdslMM.IndexLimit;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorIndex;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.VectorIndexImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorIndexImpl#getType <em>Type</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorIndexImpl#getVIndexLimits <em>VIndex Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorIndexImpl extends IndexImpl implements VectorIndex {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final EMetricType METRIC_EDEFAULT = EMetricType.EUCLIDEAN;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EMetricType metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EVIdxType TYPE_EDEFAULT = EVIdxType.FLAT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EVIdxType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVIndexLimits() <em>VIndex Limits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIndexLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexLimit> vIndexLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.VECTOR_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMetricType getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(EMetricType newMetric) {
		EMetricType oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_INDEX__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVIdxType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EVIdxType newType) {
		EVIdxType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_INDEX__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexLimit> getVIndexLimits() {
		if (vIndexLimits == null) {
			vIndexLimits = new EObjectContainmentEList<IndexLimit>(IndexLimit.class, this, VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS);
		}
		return vIndexLimits;
	}

	/**
	 * The cached validation expression for the '{@link #vIdxLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>VIdx Limits Names</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #vIdxLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VIDX_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Vector index limit names must be unique!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.vIndexLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean vIdxLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.VECTOR_INDEX,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.VECTOR_INDEX___VIDX_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP,
				 VIDX_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.VECTOR_INDEX__VIDX_LIMITS_NAMES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS:
				return ((InternalEList<?>)getVIndexLimits()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.VECTOR_INDEX__METRIC:
				return getMetric();
			case VecdslMMPackage.VECTOR_INDEX__TYPE:
				return getType();
			case VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS:
				return getVIndexLimits();
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
			case VecdslMMPackage.VECTOR_INDEX__METRIC:
				setMetric((EMetricType)newValue);
				return;
			case VecdslMMPackage.VECTOR_INDEX__TYPE:
				setType((EVIdxType)newValue);
				return;
			case VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS:
				getVIndexLimits().clear();
				getVIndexLimits().addAll((Collection<? extends IndexLimit>)newValue);
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
			case VecdslMMPackage.VECTOR_INDEX__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_INDEX__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS:
				getVIndexLimits().clear();
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
			case VecdslMMPackage.VECTOR_INDEX__METRIC:
				return metric != METRIC_EDEFAULT;
			case VecdslMMPackage.VECTOR_INDEX__TYPE:
				return type != TYPE_EDEFAULT;
			case VecdslMMPackage.VECTOR_INDEX__VINDEX_LIMITS:
				return vIndexLimits != null && !vIndexLimits.isEmpty();
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
			case VecdslMMPackage.VECTOR_INDEX___VIDX_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP:
				return vIdxLimitsNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VectorIndexImpl
