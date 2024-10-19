/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.CollectionLimit#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getCollectionLimit()
 * @model
 * @generated
 */
public interface CollectionLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EColectionLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EColectionLimit
	 * @see #setType(EColectionLimit)
	 * @see vecdslMM.VecdslMMPackage#getCollectionLimit_Type()
	 * @model required="true"
	 * @generated
	 */
	EColectionLimit getType();

	/**
	 * Sets the value of the '{@link vecdslMM.CollectionLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EColectionLimit
	 * @see #getType()
	 * @generated
	 */
	void setType(EColectionLimit value);

} // CollectionLimit
