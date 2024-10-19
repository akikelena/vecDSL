/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.VectorSearch#getMetric <em>Metric</em>}</li>
 *   <li>{@link vecdslMM.VectorSearch#getNumUnitsProbe <em>Num Units Probe</em>}</li>
 *   <li>{@link vecdslMM.VectorSearch#getVecSearchFilters <em>Vec Search Filters</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getVectorSearch()
 * @model
 * @generated
 */
public interface VectorSearch extends QueryMethod {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EMetricType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see vecdslMM.EMetricType
	 * @see #setMetric(EMetricType)
	 * @see vecdslMM.VecdslMMPackage#getVectorSearch_Metric()
	 * @model required="true"
	 * @generated
	 */
	EMetricType getMetric();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorSearch#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see vecdslMM.EMetricType
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(EMetricType value);

	/**
	 * Returns the value of the '<em><b>Num Units Probe</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Units Probe</em>' attribute.
	 * @see #setNumUnitsProbe(int)
	 * @see vecdslMM.VecdslMMPackage#getVectorSearch_NumUnitsProbe()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getNumUnitsProbe();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorSearch#getNumUnitsProbe <em>Num Units Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Units Probe</em>' attribute.
	 * @see #getNumUnitsProbe()
	 * @generated
	 */
	void setNumUnitsProbe(int value);

	/**
	 * Returns the value of the '<em><b>Vec Search Filters</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vec Search Filters</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorSearch_VecSearchFilters()
	 * @model
	 * @generated
	 */
	EList<Filter> getVecSearchFilters();

} // VectorSearch
