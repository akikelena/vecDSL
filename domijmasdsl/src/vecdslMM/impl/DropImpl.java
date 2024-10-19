/**
 */
package vecdslMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vecdslMM.Drop;
import vecdslMM.Filter;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.DropImpl#getDropCond <em>Drop Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropImpl extends DdlMethodImpl implements Drop {
	/**
	 * The cached value of the '{@link #getDropCond() <em>Drop Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> dropCond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.DROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getDropCond() {
		if (dropCond == null) {
			dropCond = new EObjectResolvingEList<Filter>(Filter.class, this, VecdslMMPackage.DROP__DROP_COND);
		}
		return dropCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.DROP__DROP_COND:
				return getDropCond();
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
			case VecdslMMPackage.DROP__DROP_COND:
				getDropCond().clear();
				getDropCond().addAll((Collection<? extends Filter>)newValue);
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
			case VecdslMMPackage.DROP__DROP_COND:
				getDropCond().clear();
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
			case VecdslMMPackage.DROP__DROP_COND:
				return dropCond != null && !dropCond.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DropImpl
