/**
 */
package WebApp.impl;

import WebApp.Enlace;
import WebApp.EstiloVisual;
import WebApp.Imagen;
import WebApp.PaginaWeb;
import WebApp.Parrafo;
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
 * An implementation of the model object '<em><b>Pagina Web</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getEstilo <em>Estilo</em>}</li>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getEnlaces <em>Enlaces</em>}</li>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getParrafos <em>Parrafos</em>}</li>
 *   <li>{@link WebApp.impl.PaginaWebImpl#getImagenes <em>Imagenes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaginaWebImpl extends MinimalEObjectImpl.Container implements PaginaWeb {
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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected EstiloVisual estilo;

	/**
	 * The cached value of the '{@link #getEnlaces() <em>Enlaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Enlace> enlaces;

	/**
	 * The cached value of the '{@link #getParrafos() <em>Parrafos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParrafos()
	 * @generated
	 * @ordered
	 */
	protected EList<Parrafo> parrafos;

	/**
	 * The cached value of the '{@link #getImagenes() <em>Imagenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Imagen> imagenes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaWebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebAppPackage.Literals.PAGINA_WEB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebAppPackage.PAGINA_WEB__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebAppPackage.PAGINA_WEB__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloVisual getEstilo() {
		if (estilo != null && estilo.eIsProxy()) {
			InternalEObject oldEstilo = (InternalEObject)estilo;
			estilo = (EstiloVisual)eResolveProxy(oldEstilo);
			if (estilo != oldEstilo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebAppPackage.PAGINA_WEB__ESTILO, oldEstilo, estilo));
			}
		}
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloVisual basicGetEstilo() {
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstilo(EstiloVisual newEstilo) {
		EstiloVisual oldEstilo = estilo;
		estilo = newEstilo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebAppPackage.PAGINA_WEB__ESTILO, oldEstilo, estilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enlace> getEnlaces() {
		if (enlaces == null) {
			enlaces = new EObjectContainmentEList<Enlace>(Enlace.class, this, WebAppPackage.PAGINA_WEB__ENLACES);
		}
		return enlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parrafo> getParrafos() {
		if (parrafos == null) {
			parrafos = new EObjectContainmentEList<Parrafo>(Parrafo.class, this, WebAppPackage.PAGINA_WEB__PARRAFOS);
		}
		return parrafos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Imagen> getImagenes() {
		if (imagenes == null) {
			imagenes = new EObjectContainmentEList<Imagen>(Imagen.class, this, WebAppPackage.PAGINA_WEB__IMAGENES);
		}
		return imagenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebAppPackage.PAGINA_WEB__ENLACES:
				return ((InternalEList<?>)getEnlaces()).basicRemove(otherEnd, msgs);
			case WebAppPackage.PAGINA_WEB__PARRAFOS:
				return ((InternalEList<?>)getParrafos()).basicRemove(otherEnd, msgs);
			case WebAppPackage.PAGINA_WEB__IMAGENES:
				return ((InternalEList<?>)getImagenes()).basicRemove(otherEnd, msgs);
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
			case WebAppPackage.PAGINA_WEB__TITULO:
				return getTitulo();
			case WebAppPackage.PAGINA_WEB__NOMBRE:
				return getNombre();
			case WebAppPackage.PAGINA_WEB__ESTILO:
				if (resolve) return getEstilo();
				return basicGetEstilo();
			case WebAppPackage.PAGINA_WEB__ENLACES:
				return getEnlaces();
			case WebAppPackage.PAGINA_WEB__PARRAFOS:
				return getParrafos();
			case WebAppPackage.PAGINA_WEB__IMAGENES:
				return getImagenes();
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
			case WebAppPackage.PAGINA_WEB__TITULO:
				setTitulo((String)newValue);
				return;
			case WebAppPackage.PAGINA_WEB__NOMBRE:
				setNombre((String)newValue);
				return;
			case WebAppPackage.PAGINA_WEB__ESTILO:
				setEstilo((EstiloVisual)newValue);
				return;
			case WebAppPackage.PAGINA_WEB__ENLACES:
				getEnlaces().clear();
				getEnlaces().addAll((Collection<? extends Enlace>)newValue);
				return;
			case WebAppPackage.PAGINA_WEB__PARRAFOS:
				getParrafos().clear();
				getParrafos().addAll((Collection<? extends Parrafo>)newValue);
				return;
			case WebAppPackage.PAGINA_WEB__IMAGENES:
				getImagenes().clear();
				getImagenes().addAll((Collection<? extends Imagen>)newValue);
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
			case WebAppPackage.PAGINA_WEB__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case WebAppPackage.PAGINA_WEB__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case WebAppPackage.PAGINA_WEB__ESTILO:
				setEstilo((EstiloVisual)null);
				return;
			case WebAppPackage.PAGINA_WEB__ENLACES:
				getEnlaces().clear();
				return;
			case WebAppPackage.PAGINA_WEB__PARRAFOS:
				getParrafos().clear();
				return;
			case WebAppPackage.PAGINA_WEB__IMAGENES:
				getImagenes().clear();
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
			case WebAppPackage.PAGINA_WEB__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case WebAppPackage.PAGINA_WEB__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case WebAppPackage.PAGINA_WEB__ESTILO:
				return estilo != null;
			case WebAppPackage.PAGINA_WEB__ENLACES:
				return enlaces != null && !enlaces.isEmpty();
			case WebAppPackage.PAGINA_WEB__PARRAFOS:
				return parrafos != null && !parrafos.isEmpty();
			case WebAppPackage.PAGINA_WEB__IMAGENES:
				return imagenes != null && !imagenes.isEmpty();
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //PaginaWebImpl
