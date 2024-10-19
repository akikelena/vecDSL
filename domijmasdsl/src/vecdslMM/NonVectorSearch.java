/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Vector Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.NonVectorSearch#getNonVecFilters <em>Non Vec Filters</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getNonVectorSearch()
 * @model
 * @generated
 */
public interface NonVectorSearch extends QueryMethod {
	/**
	 * Returns the value of the '<em><b>Non Vec Filters</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Vec Filters</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getNonVectorSearch_NonVecFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getNonVecFilters();

} // NonVectorSearch
