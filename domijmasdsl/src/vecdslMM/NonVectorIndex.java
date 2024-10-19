/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Vector Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.NonVectorIndex#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getNonVectorIndex()
 * @model
 * @generated
 */
public interface NonVectorIndex extends Index {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.ENVIdxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.ENVIdxType
	 * @see #setType(ENVIdxType)
	 * @see vecdslMM.VecdslMMPackage#getNonVectorIndex_Type()
	 * @model required="true"
	 * @generated
	 */
	ENVIdxType getType();

	/**
	 * Sets the value of the '{@link vecdslMM.NonVectorIndex#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.ENVIdxType
	 * @see #getType()
	 * @generated
	 */
	void setType(ENVIdxType value);

} // NonVectorIndex
