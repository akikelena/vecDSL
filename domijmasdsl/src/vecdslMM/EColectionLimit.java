/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EColection Limit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEColectionLimit()
 * @model
 * @generated
 */
public enum EColectionLimit implements Enumerator {
	/**
	 * The '<em><b>NOFPARTITIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFPARTITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NOFPARTITIONS(0, "NOFPARTITIONS", "NOFPARTITIONS"),

	/**
	 * The '<em><b>NOFFIELDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFFIELDS_VALUE
	 * @generated
	 * @ordered
	 */
	NOFFIELDS(1, "NOFFIELDS", "NOFFIELDS"),

	/**
	 * The '<em><b>NOFSHARDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFSHARDS_VALUE
	 * @generated
	 * @ordered
	 */
	NOFSHARDS(2, "NOFSHARDS", "NOFSHARDS"),

	/**
	 * The '<em><b>VECTORDIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORDIM_VALUE
	 * @generated
	 * @ordered
	 */
	VECTORDIM(3, "VECTORDIM", "VECTORDIM");

	/**
	 * The '<em><b>NOFPARTITIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFPARTITIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFPARTITIONS_VALUE = 0;

	/**
	 * The '<em><b>NOFFIELDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFFIELDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFFIELDS_VALUE = 1;

	/**
	 * The '<em><b>NOFSHARDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFSHARDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFSHARDS_VALUE = 2;

	/**
	 * The '<em><b>VECTORDIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORDIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VECTORDIM_VALUE = 3;

	/**
	 * An array of all the '<em><b>EColection Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EColectionLimit[] VALUES_ARRAY =
		new EColectionLimit[] {
			NOFPARTITIONS,
			NOFFIELDS,
			NOFSHARDS,
			VECTORDIM,
		};

	/**
	 * A public read-only list of all the '<em><b>EColection Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EColectionLimit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EColection Limit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EColectionLimit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EColectionLimit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EColection Limit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EColectionLimit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EColectionLimit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EColection Limit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EColectionLimit get(int value) {
		switch (value) {
			case NOFPARTITIONS_VALUE: return NOFPARTITIONS;
			case NOFFIELDS_VALUE: return NOFFIELDS;
			case NOFSHARDS_VALUE: return NOFSHARDS;
			case VECTORDIM_VALUE: return VECTORDIM;
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
	private EColectionLimit(int value, String name, String literal) {
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
	
} //EColectionLimit
