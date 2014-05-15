/**
 */
package WebApp.impl;

import WebApp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebAppFactoryImpl extends EFactoryImpl implements WebAppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebAppFactory init() {
		try {
			WebAppFactory theWebAppFactory = (WebAppFactory)EPackage.Registry.INSTANCE.getEFactory(WebAppPackage.eNS_URI);
			if (theWebAppFactory != null) {
				return theWebAppFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebAppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebAppPackage.APLICACION_WEB: return createAplicacionWeb();
			case WebAppPackage.PAGINA_WEB: return createPaginaWeb();
			case WebAppPackage.ESTILO_VISUAL: return createEstiloVisual();
			case WebAppPackage.PARRAFO: return createParrafo();
			case WebAppPackage.ENLACE: return createEnlace();
			case WebAppPackage.IMAGEN: return createImagen();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AplicacionWeb createAplicacionWeb() {
		AplicacionWebImpl aplicacionWeb = new AplicacionWebImpl();
		return aplicacionWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaWeb createPaginaWeb() {
		PaginaWebImpl paginaWeb = new PaginaWebImpl();
		return paginaWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloVisual createEstiloVisual() {
		EstiloVisualImpl estiloVisual = new EstiloVisualImpl();
		return estiloVisual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parrafo createParrafo() {
		ParrafoImpl parrafo = new ParrafoImpl();
		return parrafo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enlace createEnlace() {
		EnlaceImpl enlace = new EnlaceImpl();
		return enlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imagen createImagen() {
		ImagenImpl imagen = new ImagenImpl();
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppPackage getWebAppPackage() {
		return (WebAppPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebAppPackage getPackage() {
		return WebAppPackage.eINSTANCE;
	}

} //WebAppFactoryImpl
