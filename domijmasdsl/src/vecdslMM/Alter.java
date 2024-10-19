/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Alter#getAlterCond <em>Alter Cond</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getAlter()
 * @model
 * @generated
 */
public interface Alter extends DdlMethod {
	/**
	 * Returns the value of the '<em><b>Alter Cond</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter Cond</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getAlter_AlterCond()
	 * @model required="true"
	 * @generated
	 */
	EList<Filter> getAlterCond();

} // Alter
