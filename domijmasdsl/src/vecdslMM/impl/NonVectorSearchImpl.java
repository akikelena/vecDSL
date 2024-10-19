/**
 */
package vecdslMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.Filter;
import vecdslMM.NonVectorSearch;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Vector Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.NonVectorSearchImpl#getNonVecFilters <em>Non Vec Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonVectorSearchImpl extends QueryMethodImpl implements NonVectorSearch {
	/**
	 * The cached value of the '{@link #getNonVecFilters() <em>Non Vec Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonVecFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> nonVecFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonVectorSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.NON_VECTOR_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getNonVecFilters() {
		if (nonVecFilters == null) {
			nonVecFilters = new EObjectContainmentEList<Filter>(Filter.class, this, VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS);
		}
		return nonVecFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS:
				return ((InternalEList<?>)getNonVecFilters()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS:
				return getNonVecFilters();
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
			case VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS:
				getNonVecFilters().clear();
				getNonVecFilters().addAll((Collection<? extends Filter>)newValue);
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
			case VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS:
				getNonVecFilters().clear();
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
			case VecdslMMPackage.NON_VECTOR_SEARCH__NON_VEC_FILTERS:
				return nonVecFilters != null && !nonVecFilters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NonVectorSearchImpl
