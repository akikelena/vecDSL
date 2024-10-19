/**
 */
package vecdslMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vecdslMM.EMetricType;
import vecdslMM.Filter;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorSearch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.VectorSearchImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorSearchImpl#getNumUnitsProbe <em>Num Units Probe</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorSearchImpl#getVecSearchFilters <em>Vec Search Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorSearchImpl extends QueryMethodImpl implements VectorSearch {
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
	 * The default value of the '{@link #getNumUnitsProbe() <em>Num Units Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUnitsProbe()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_UNITS_PROBE_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getNumUnitsProbe() <em>Num Units Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUnitsProbe()
	 * @generated
	 * @ordered
	 */
	protected int numUnitsProbe = NUM_UNITS_PROBE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVecSearchFilters() <em>Vec Search Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVecSearchFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> vecSearchFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.VECTOR_SEARCH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_SEARCH__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumUnitsProbe() {
		return numUnitsProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumUnitsProbe(int newNumUnitsProbe) {
		int oldNumUnitsProbe = numUnitsProbe;
		numUnitsProbe = newNumUnitsProbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_SEARCH__NUM_UNITS_PROBE, oldNumUnitsProbe, numUnitsProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getVecSearchFilters() {
		if (vecSearchFilters == null) {
			vecSearchFilters = new EObjectResolvingEList<Filter>(Filter.class, this, VecdslMMPackage.VECTOR_SEARCH__VEC_SEARCH_FILTERS);
		}
		return vecSearchFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_SEARCH__METRIC:
				return getMetric();
			case VecdslMMPackage.VECTOR_SEARCH__NUM_UNITS_PROBE:
				return getNumUnitsProbe();
			case VecdslMMPackage.VECTOR_SEARCH__VEC_SEARCH_FILTERS:
				return getVecSearchFilters();
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
			case VecdslMMPackage.VECTOR_SEARCH__METRIC:
				setMetric((EMetricType)newValue);
				return;
			case VecdslMMPackage.VECTOR_SEARCH__NUM_UNITS_PROBE:
				setNumUnitsProbe((Integer)newValue);
				return;
			case VecdslMMPackage.VECTOR_SEARCH__VEC_SEARCH_FILTERS:
				getVecSearchFilters().clear();
				getVecSearchFilters().addAll((Collection<? extends Filter>)newValue);
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
			case VecdslMMPackage.VECTOR_SEARCH__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_SEARCH__NUM_UNITS_PROBE:
				setNumUnitsProbe(NUM_UNITS_PROBE_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_SEARCH__VEC_SEARCH_FILTERS:
				getVecSearchFilters().clear();
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
			case VecdslMMPackage.VECTOR_SEARCH__METRIC:
				return metric != METRIC_EDEFAULT;
			case VecdslMMPackage.VECTOR_SEARCH__NUM_UNITS_PROBE:
				return numUnitsProbe != NUM_UNITS_PROBE_EDEFAULT;
			case VecdslMMPackage.VECTOR_SEARCH__VEC_SEARCH_FILTERS:
				return vecSearchFilters != null && !vecSearchFilters.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(", numUnitsProbe: ");
		result.append(numUnitsProbe);
		result.append(')');
		return result.toString();
	}

} //VectorSearchImpl
