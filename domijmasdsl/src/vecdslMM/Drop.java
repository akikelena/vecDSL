/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Drop#getDropCond <em>Drop Cond</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getDrop()
 * @model
 * @generated
 */
public interface Drop extends DdlMethod {
	/**
	 * Returns the value of the '<em><b>Drop Cond</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Cond</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getDrop_DropCond()
	 * @model
	 * @generated
	 */
	EList<Filter> getDropCond();

} // Drop
