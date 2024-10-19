/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.IndexLimit#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getIndexLimit()
 * @model
 * @generated
 */
public interface IndexLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EIndexLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EIndexLimit
	 * @see #setType(EIndexLimit)
	 * @see vecdslMM.VecdslMMPackage#getIndexLimit_Type()
	 * @model required="true"
	 * @generated
	 */
	EIndexLimit getType();

	/**
	 * Sets the value of the '{@link vecdslMM.IndexLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EIndexLimit
	 * @see #getType()
	 * @generated
	 */
	void setType(EIndexLimit value);

} // IndexLimit
