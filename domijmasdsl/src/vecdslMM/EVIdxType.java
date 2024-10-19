/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EV Idx Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEVIdxType()
 * @model
 * @generated
 */
public enum EVIdxType implements Enumerator {
	/**
	 * The '<em><b>FLAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(0, "FLAT", "FLAT"),

	/**
	 * The '<em><b>IVF FLAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	IVF_FLAT(1, "IVF_FLAT", "IVF_FLAT"),

	/**
	 * The '<em><b>IVF SQ8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_SQ8_VALUE
	 * @generated
	 * @ordered
	 */
	IVF_SQ8(2, "IVF_SQ8", "IVF_SQ8"),

	/**
	 * The '<em><b>IVF PQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_PQ_VALUE
	 * @generated
	 * @ordered
	 */
	IVF_PQ(3, "IVF_PQ", "IVF_PQ"),

	/**
	 * The '<em><b>HNSW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HNSW_VALUE
	 * @generated
	 * @ordered
	 */
	HNSW(4, "HNSW", "HNSW"),

	/**
	 * The '<em><b>SCANN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANN_VALUE
	 * @generated
	 * @ordered
	 */
	SCANN(5, "SCANN", "SCANN");

	/**
	 * The '<em><b>FLAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_VALUE = 0;

	/**
	 * The '<em><b>IVF FLAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_FLAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVF_FLAT_VALUE = 1;

	/**
	 * The '<em><b>IVF SQ8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_SQ8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVF_SQ8_VALUE = 2;

	/**
	 * The '<em><b>IVF PQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_PQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVF_PQ_VALUE = 3;

	/**
	 * The '<em><b>HNSW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HNSW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HNSW_VALUE = 4;

	/**
	 * The '<em><b>SCANN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCANN_VALUE = 5;

	/**
	 * An array of all the '<em><b>EV Idx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EVIdxType[] VALUES_ARRAY =
		new EVIdxType[] {
			FLAT,
			IVF_FLAT,
			IVF_SQ8,
			IVF_PQ,
			HNSW,
			SCANN,
		};

	/**
	 * A public read-only list of all the '<em><b>EV Idx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EVIdxType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EV Idx Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVIdxType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVIdxType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EV Idx Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVIdxType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVIdxType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EV Idx Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVIdxType get(int value) {
		switch (value) {
			case FLAT_VALUE: return FLAT;
			case IVF_FLAT_VALUE: return IVF_FLAT;
			case IVF_SQ8_VALUE: return IVF_SQ8;
			case IVF_PQ_VALUE: return IVF_PQ;
			case HNSW_VALUE: return HNSW;
			case SCANN_VALUE: return SCANN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EVIdxType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EVIdxType
