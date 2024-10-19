/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.FieldLimit#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getFieldLimit()
 * @model
 * @generated
 */
public interface FieldLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EFieldLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EFieldLimit
	 * @see #setType(EFieldLimit)
	 * @see vecdslMM.VecdslMMPackage#getFieldLimit_Type()
	 * @model required="true"
	 * @generated
	 */
	EFieldLimit getType();

	/**
	 * Sets the value of the '{@link vecdslMM.FieldLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EFieldLimit
	 * @see #getType()
	 * @generated
	 */
	void setType(EFieldLimit value);

} // FieldLimit
