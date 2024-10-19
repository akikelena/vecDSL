/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dml Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.DmlMethod#getDmlCollection <em>Dml Collection</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getDmlMethod()
 * @model abstract="true"
 * @generated
 */
public interface DmlMethod extends Method {
	/**
	 * Returns the value of the '<em><b>Dml Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dml Collection</em>' containment reference.
	 * @see #setDmlCollection(VectorCollection)
	 * @see vecdslMM.VecdslMMPackage#getDmlMethod_DmlCollection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VectorCollection getDmlCollection();

	/**
	 * Sets the value of the '{@link vecdslMM.DmlMethod#getDmlCollection <em>Dml Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dml Collection</em>' containment reference.
	 * @see #getDmlCollection()
	 * @generated
	 */
	void setDmlCollection(VectorCollection value);

} // DmlMethod
