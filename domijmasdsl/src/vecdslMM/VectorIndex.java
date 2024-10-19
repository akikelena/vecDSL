/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.VectorIndex#getMetric <em>Metric</em>}</li>
 *   <li>{@link vecdslMM.VectorIndex#getType <em>Type</em>}</li>
 *   <li>{@link vecdslMM.VectorIndex#getVIndexLimits <em>VIndex Limits</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getVectorIndex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vIdxLimitsNames'"
 * @generated
 */
public interface VectorIndex extends Index {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EMetricType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see vecdslMM.EMetricType
	 * @see #setMetric(EMetricType)
	 * @see vecdslMM.VecdslMMPackage#getVectorIndex_Metric()
	 * @model required="true"
	 * @generated
	 */
	EMetricType getMetric();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorIndex#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see vecdslMM.EMetricType
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(EMetricType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EVIdxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EVIdxType
	 * @see #setType(EVIdxType)
	 * @see vecdslMM.VecdslMMPackage#getVectorIndex_Type()
	 * @model required="true"
	 * @generated
	 */
	EVIdxType getType();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorIndex#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EVIdxType
	 * @see #getType()
	 * @generated
	 */
	void setType(EVIdxType value);

	/**
	 * Returns the value of the '<em><b>VIndex Limits</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.IndexLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIndex Limits</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorIndex_VIndexLimits()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexLimit> getVIndexLimits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Vector index limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.vIndexLimits-&gt;forAll(lim1, lim2 | lim1 &lt;&gt; lim2 implies lim1.name &lt;&gt; lim2.name)\n}.status'"
	 * @generated
	 */
	boolean vIdxLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VectorIndex
