/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Script#getMethods <em>Methods</em>}</li>
 *   <li>{@link vecdslMM.Script#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getScript_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EVendorName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see vecdslMM.EVendorName
	 * @see #setVendor(EVendorName)
	 * @see vecdslMM.VecdslMMPackage#getScript_Vendor()
	 * @model required="true"
	 * @generated
	 */
	EVendorName getVendor();

	/**
	 * Sets the value of the '{@link vecdslMM.Script#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see vecdslMM.EVendorName
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(EVendorName value);

} // Script
