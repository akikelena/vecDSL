/**
 */
package vecdslMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Connection#getHost <em>Host</em>}</li>
 *   <li>{@link vecdslMM.Connection#getPort <em>Port</em>}</li>
 *   <li>{@link vecdslMM.Connection#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link vecdslMM.Connection#getUsername <em>Username</em>}</li>
 *   <li>{@link vecdslMM.Connection#getPassword <em>Password</em>}</li>
 *   <li>{@link vecdslMM.Connection#getRegion <em>Region</em>}</li>
 *   <li>{@link vecdslMM.Connection#getUserRole <em>User Role</em>}</li>
 *   <li>{@link vecdslMM.Connection#getUserPrivillege <em>User Privillege</em>}</li>
 *   <li>{@link vecdslMM.Connection#getCloud <em>Cloud</em>}</li>
 *   <li>{@link vecdslMM.Connection#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_ApiKey()
	 * @model
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>User Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role</em>' attribute.
	 * @see #setUserRole(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_UserRole()
	 * @model
	 * @generated
	 */
	String getUserRole();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getUserRole <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Role</em>' attribute.
	 * @see #getUserRole()
	 * @generated
	 */
	void setUserRole(String value);

	/**
	 * Returns the value of the '<em><b>User Privillege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Privillege</em>' attribute.
	 * @see #setUserPrivillege(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_UserPrivillege()
	 * @model
	 * @generated
	 */
	String getUserPrivillege();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getUserPrivillege <em>User Privillege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Privillege</em>' attribute.
	 * @see #getUserPrivillege()
	 * @generated
	 */
	void setUserPrivillege(String value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' attribute.
	 * @see #setCloud(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Cloud()
	 * @model
	 * @generated
	 */
	String getCloud();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getCloud <em>Cloud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' attribute.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see vecdslMM.VecdslMMPackage#getConnection_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link vecdslMM.Connection#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // Connection
