/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EPod Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEPodSize()
 * @model
 * @generated
 */
public enum EPodSize implements Enumerator {
	/**
	 * The '<em><b>X1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X1_VALUE
	 * @generated
	 * @ordered
	 */
	X1(0, "X1", "X1"),

	/**
	 * The '<em><b>X2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X2_VALUE
	 * @generated
	 * @ordered
	 */
	X2(1, "X2", "X2"),

	/**
	 * The '<em><b>X4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X4_VALUE
	 * @generated
	 * @ordered
	 */
	X4(2, "X4", "X4"),

	/**
	 * The '<em><b>X8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8_VALUE
	 * @generated
	 * @ordered
	 */
	X8(3, "X8", "X8");

	/**
	 * The '<em><b>X1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X1_VALUE = 0;

	/**
	 * The '<em><b>X2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X2_VALUE = 1;

	/**
	 * The '<em><b>X4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X4_VALUE = 2;

	/**
	 * The '<em><b>X8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X8_VALUE = 3;

	/**
	 * An array of all the '<em><b>EPod Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EPodSize[] VALUES_ARRAY =
		new EPodSize[] {
			X1,
			X2,
			X4,
			X8,
		};

	/**
	 * A public read-only list of all the '<em><b>EPod Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EPodSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EPod Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPodSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPodSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPod Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPodSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPodSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPod Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPodSize get(int value) {
		switch (value) {
			case X1_VALUE: return X1;
			case X2_VALUE: return X2;
			case X4_VALUE: return X4;
			case X8_VALUE: return X8;
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
	private EPodSize(int value, String name, String literal) {
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
	
} //EPodSize
