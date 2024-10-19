/**
 */
package vecdslMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vecdslMM.Connection;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getUserRole <em>User Role</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getUserPrivillege <em>User Privillege</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link vecdslMM.impl.ConnectionImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected String userRole = USER_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPrivillege() <em>User Privillege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrivillege()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PRIVILLEGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPrivillege() <em>User Privillege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPrivillege()
	 * @generated
	 * @ordered
	 */
	protected String userPrivillege = USER_PRIVILLEGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloud() <em>Cloud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected String cloud = CLOUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRole(String newUserRole) {
		String oldUserRole = userRole;
		userRole = newUserRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__USER_ROLE, oldUserRole, userRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserPrivillege() {
		return userPrivillege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserPrivillege(String newUserPrivillege) {
		String oldUserPrivillege = userPrivillege;
		userPrivillege = newUserPrivillege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__USER_PRIVILLEGE, oldUserPrivillege, userPrivillege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloud() {
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud(String newCloud) {
		String oldCloud = cloud;
		cloud = newCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__CLOUD, oldCloud, cloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CONNECTION__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.CONNECTION__HOST:
				return getHost();
			case VecdslMMPackage.CONNECTION__PORT:
				return getPort();
			case VecdslMMPackage.CONNECTION__API_KEY:
				return getApiKey();
			case VecdslMMPackage.CONNECTION__USERNAME:
				return getUsername();
			case VecdslMMPackage.CONNECTION__PASSWORD:
				return getPassword();
			case VecdslMMPackage.CONNECTION__REGION:
				return getRegion();
			case VecdslMMPackage.CONNECTION__USER_ROLE:
				return getUserRole();
			case VecdslMMPackage.CONNECTION__USER_PRIVILLEGE:
				return getUserPrivillege();
			case VecdslMMPackage.CONNECTION__CLOUD:
				return getCloud();
			case VecdslMMPackage.CONNECTION__ENVIRONMENT:
				return getEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VecdslMMPackage.CONNECTION__HOST:
				setHost((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__PORT:
				setPort((Integer)newValue);
				return;
			case VecdslMMPackage.CONNECTION__API_KEY:
				setApiKey((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__USERNAME:
				setUsername((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__PASSWORD:
				setPassword((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__REGION:
				setRegion((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__USER_ROLE:
				setUserRole((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__USER_PRIVILLEGE:
				setUserPrivillege((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__CLOUD:
				setCloud((String)newValue);
				return;
			case VecdslMMPackage.CONNECTION__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.CONNECTION__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__USER_ROLE:
				setUserRole(USER_ROLE_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__USER_PRIVILLEGE:
				setUserPrivillege(USER_PRIVILLEGE_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__CLOUD:
				setCloud(CLOUD_EDEFAULT);
				return;
			case VecdslMMPackage.CONNECTION__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.CONNECTION__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case VecdslMMPackage.CONNECTION__PORT:
				return port != PORT_EDEFAULT;
			case VecdslMMPackage.CONNECTION__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case VecdslMMPackage.CONNECTION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case VecdslMMPackage.CONNECTION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case VecdslMMPackage.CONNECTION__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case VecdslMMPackage.CONNECTION__USER_ROLE:
				return USER_ROLE_EDEFAULT == null ? userRole != null : !USER_ROLE_EDEFAULT.equals(userRole);
			case VecdslMMPackage.CONNECTION__USER_PRIVILLEGE:
				return USER_PRIVILLEGE_EDEFAULT == null ? userPrivillege != null : !USER_PRIVILLEGE_EDEFAULT.equals(userPrivillege);
			case VecdslMMPackage.CONNECTION__CLOUD:
				return CLOUD_EDEFAULT == null ? cloud != null : !CLOUD_EDEFAULT.equals(cloud);
			case VecdslMMPackage.CONNECTION__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", region: ");
		result.append(region);
		result.append(", userRole: ");
		result.append(userRole);
		result.append(", userPrivillege: ");
		result.append(userPrivillege);
		result.append(", cloud: ");
		result.append(cloud);
		result.append(", environment: ");
		result.append(environment);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
