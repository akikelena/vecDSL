/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.ClusterLimit#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getClusterLimit()
 * @model
 * @generated
 */
public interface ClusterLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EClusterLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EClusterLimit
	 * @see #setType(EClusterLimit)
	 * @see vecdslMM.VecdslMMPackage#getClusterLimit_Type()
	 * @model required="true"
	 * @generated
	 */
	EClusterLimit getType();

	/**
	 * Sets the value of the '{@link vecdslMM.ClusterLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EClusterLimit
	 * @see #getType()
	 * @generated
	 */
	void setType(EClusterLimit value);

} // ClusterLimit
