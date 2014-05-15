/**
 */
package WebApp.impl;

import WebApp.AplicacionWeb;
import WebApp.Enlace;
import WebApp.EstiloVisual;
import WebApp.Imagen;
import WebApp.PaginaWeb;
import WebApp.Parrafo;
import WebApp.WebAppFactory;
import WebApp.WebAppPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebAppPackageImpl extends EPackageImpl implements WebAppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionWebEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaWebEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estiloVisualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parrafoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WebApp.WebAppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebAppPackageImpl() {
		super(eNS_URI, WebAppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebAppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebAppPackage init() {
		if (isInited) return (WebAppPackage)EPackage.Registry.INSTANCE.getEPackage(WebAppPackage.eNS_URI);

		// Obtain or create and register package
		WebAppPackageImpl theWebAppPackage = (WebAppPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebAppPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebAppPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWebAppPackage.createPackageContents();

		// Initialize created meta-data
		theWebAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebAppPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebAppPackage.eNS_URI, theWebAppPackage);
		return theWebAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacionWeb() {
		return aplicacionWebEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacionWeb_Titulo() {
		return (EAttribute)aplicacionWebEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacionWeb_Paginas() {
		return (EReference)aplicacionWebEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacionWeb_Estilos() {
		return (EReference)aplicacionWebEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginaWeb() {
		return paginaWebEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginaWeb_Titulo() {
		return (EAttribute)paginaWebEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginaWeb_Nombre() {
		return (EAttribute)paginaWebEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaginaWeb_Estilo() {
		return (EReference)paginaWebEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaginaWeb_Enlaces() {
		return (EReference)paginaWebEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaginaWeb_Parrafos() {
		return (EReference)paginaWebEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaginaWeb_Imagenes() {
		return (EReference)paginaWebEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstiloVisual() {
		return estiloVisualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstiloVisual_Nombre() {
		return (EAttribute)estiloVisualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParrafo() {
		return parrafoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParrafo_Texto() {
		return (EAttribute)parrafoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnlace() {
		return enlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlace_Destino() {
		return (EReference)enlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnlace_Texto() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagen() {
		return imagenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagen_Texto() {
		return (EAttribute)imagenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagen_Url() {
		return (EAttribute)imagenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppFactory getWebAppFactory() {
		return (WebAppFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aplicacionWebEClass = createEClass(APLICACION_WEB);
		createEAttribute(aplicacionWebEClass, APLICACION_WEB__TITULO);
		createEReference(aplicacionWebEClass, APLICACION_WEB__PAGINAS);
		createEReference(aplicacionWebEClass, APLICACION_WEB__ESTILOS);

		paginaWebEClass = createEClass(PAGINA_WEB);
		createEAttribute(paginaWebEClass, PAGINA_WEB__TITULO);
		createEAttribute(paginaWebEClass, PAGINA_WEB__NOMBRE);
		createEReference(paginaWebEClass, PAGINA_WEB__ESTILO);
		createEReference(paginaWebEClass, PAGINA_WEB__ENLACES);
		createEReference(paginaWebEClass, PAGINA_WEB__PARRAFOS);
		createEReference(paginaWebEClass, PAGINA_WEB__IMAGENES);

		estiloVisualEClass = createEClass(ESTILO_VISUAL);
		createEAttribute(estiloVisualEClass, ESTILO_VISUAL__NOMBRE);

		parrafoEClass = createEClass(PARRAFO);
		createEAttribute(parrafoEClass, PARRAFO__TEXTO);

		enlaceEClass = createEClass(ENLACE);
		createEReference(enlaceEClass, ENLACE__DESTINO);
		createEAttribute(enlaceEClass, ENLACE__TEXTO);

		imagenEClass = createEClass(IMAGEN);
		createEAttribute(imagenEClass, IMAGEN__TEXTO);
		createEAttribute(imagenEClass, IMAGEN__URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aplicacionWebEClass, AplicacionWeb.class, "AplicacionWeb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacionWeb_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, AplicacionWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacionWeb_Paginas(), this.getPaginaWeb(), null, "paginas", null, 0, -1, AplicacionWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacionWeb_Estilos(), this.getEstiloVisual(), null, "estilos", null, 0, -1, AplicacionWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaWebEClass, PaginaWeb.class, "PaginaWeb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginaWeb_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginaWeb_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaWeb_Estilo(), this.getEstiloVisual(), null, "estilo", null, 0, 1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaWeb_Enlaces(), this.getEnlace(), null, "enlaces", null, 0, -1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaWeb_Parrafos(), this.getParrafo(), null, "parrafos", null, 0, -1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaWeb_Imagenes(), this.getImagen(), null, "imagenes", null, 0, -1, PaginaWeb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estiloVisualEClass, EstiloVisual.class, "EstiloVisual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstiloVisual_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, EstiloVisual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parrafoEClass, Parrafo.class, "Parrafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParrafo_Texto(), ecorePackage.getEString(), "texto", null, 1, 1, Parrafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceEClass, Enlace.class, "Enlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnlace_Destino(), this.getPaginaWeb(), null, "destino", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_Texto(), ecorePackage.getEString(), "texto", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagenEClass, Imagen.class, "Imagen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagen_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Imagen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagen_Url(), ecorePackage.getEString(), "url", null, 1, 1, Imagen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WebAppPackageImpl
