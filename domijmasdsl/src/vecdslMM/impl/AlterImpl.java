/**
 */
package vecdslMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vecdslMM.Alter;
import vecdslMM.Filter;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.AlterImpl#getAlterCond <em>Alter Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterImpl extends DdlMethodImpl implements Alter {
	/**
	 * The cached value of the '{@link #getAlterCond() <em>Alter Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> alterCond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.ALTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getAlterCond() {
		if (alterCond == null) {
			alterCond = new EObjectResolvingEList<Filter>(Filter.class, this, VecdslMMPackage.ALTER__ALTER_COND);
		}
		return alterCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.ALTER__ALTER_COND:
				return getAlterCond();
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
			case VecdslMMPackage.ALTER__ALTER_COND:
				getAlterCond().clear();
				getAlterCond().addAll((Collection<? extends Filter>)newValue);
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
			case VecdslMMPackage.ALTER__ALTER_COND:
				getAlterCond().clear();
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
			case VecdslMMPackage.ALTER__ALTER_COND:
				return alterCond != null && !alterCond.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlterImpl
