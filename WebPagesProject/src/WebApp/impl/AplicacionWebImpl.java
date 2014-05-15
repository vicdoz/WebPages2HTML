/**
 */
package WebApp.impl;

import WebApp.AplicacionWeb;
import WebApp.EstiloVisual;
import WebApp.PaginaWeb;
import WebApp.WebAppPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicacion Web</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebApp.impl.AplicacionWebImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link WebApp.impl.AplicacionWebImpl#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link WebApp.impl.AplicacionWebImpl#getEstilos <em>Estilos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AplicacionWebImpl extends MinimalEObjectImpl.Container implements AplicacionWeb {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaginas() <em>Paginas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginas()
	 * @generated
	 * @ordered
	 */
	protected EList<PaginaWeb> paginas;

	/**
	 * The cached value of the '{@link #getEstilos() <em>Estilos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilos()
	 * @generated
	 * @ordered
	 */
	protected EList<EstiloVisual> estilos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionWebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebAppPackage.Literals.APLICACION_WEB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebAppPackage.APLICACION_WEB__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaginaWeb> getPaginas() {
		if (paginas == null) {
			paginas = new EObjectContainmentEList<PaginaWeb>(PaginaWeb.class, this, WebAppPackage.APLICACION_WEB__PAGINAS);
		}
		return paginas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EstiloVisual> getEstilos() {
		if (estilos == null) {
			estilos = new EObjectContainmentEList<EstiloVisual>(EstiloVisual.class, this, WebAppPackage.APLICACION_WEB__ESTILOS);
		}
		return estilos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebAppPackage.APLICACION_WEB__PAGINAS:
				return ((InternalEList<?>)getPaginas()).basicRemove(otherEnd, msgs);
			case WebAppPackage.APLICACION_WEB__ESTILOS:
				return ((InternalEList<?>)getEstilos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebAppPackage.APLICACION_WEB__TITULO:
				return getTitulo();
			case WebAppPackage.APLICACION_WEB__PAGINAS:
				return getPaginas();
			case WebAppPackage.APLICACION_WEB__ESTILOS:
				return getEstilos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebAppPackage.APLICACION_WEB__TITULO:
				setTitulo((String)newValue);
				return;
			case WebAppPackage.APLICACION_WEB__PAGINAS:
				getPaginas().clear();
				getPaginas().addAll((Collection<? extends PaginaWeb>)newValue);
				return;
			case WebAppPackage.APLICACION_WEB__ESTILOS:
				getEstilos().clear();
				getEstilos().addAll((Collection<? extends EstiloVisual>)newValue);
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
			case WebAppPackage.APLICACION_WEB__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case WebAppPackage.APLICACION_WEB__PAGINAS:
				getPaginas().clear();
				return;
			case WebAppPackage.APLICACION_WEB__ESTILOS:
				getEstilos().clear();
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
			case WebAppPackage.APLICACION_WEB__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case WebAppPackage.APLICACION_WEB__PAGINAS:
				return paginas != null && !paginas.isEmpty();
			case WebAppPackage.APLICACION_WEB__ESTILOS:
				return estilos != null && !estilos.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(')');
		return result.toString();
	}

} //AplicacionWebImpl
