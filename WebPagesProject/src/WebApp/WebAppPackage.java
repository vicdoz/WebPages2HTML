/**
 */
package WebApp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WebApp.WebAppFactory
 * @model kind="package"
 * @generated
 */
public interface WebAppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WebApp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "WebApp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebAppPackage eINSTANCE = WebApp.impl.WebAppPackageImpl.init();

	/**
	 * The meta object id for the '{@link WebApp.impl.AplicacionWebImpl <em>Aplicacion Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.AplicacionWebImpl
	 * @see WebApp.impl.WebAppPackageImpl#getAplicacionWeb()
	 * @generated
	 */
	int APLICACION_WEB = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_WEB__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Paginas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_WEB__PAGINAS = 1;

	/**
	 * The feature id for the '<em><b>Estilos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_WEB__ESTILOS = 2;

	/**
	 * The number of structural features of the '<em>Aplicacion Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_WEB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aplicacion Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_WEB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebApp.impl.PaginaWebImpl <em>Pagina Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.PaginaWebImpl
	 * @see WebApp.impl.WebAppPackageImpl#getPaginaWeb()
	 * @generated
	 */
	int PAGINA_WEB = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__ESTILO = 2;

	/**
	 * The feature id for the '<em><b>Enlaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__ENLACES = 3;

	/**
	 * The feature id for the '<em><b>Parrafos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__PARRAFOS = 4;

	/**
	 * The feature id for the '<em><b>Imagenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB__IMAGENES = 5;

	/**
	 * The number of structural features of the '<em>Pagina Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pagina Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_WEB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebApp.impl.EstiloVisualImpl <em>Estilo Visual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.EstiloVisualImpl
	 * @see WebApp.impl.WebAppPackageImpl#getEstiloVisual()
	 * @generated
	 */
	int ESTILO_VISUAL = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTILO_VISUAL__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Estilo Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTILO_VISUAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Estilo Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTILO_VISUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebApp.impl.ParrafoImpl <em>Parrafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.ParrafoImpl
	 * @see WebApp.impl.WebAppPackageImpl#getParrafo()
	 * @generated
	 */
	int PARRAFO = 3;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__TEXTO = 0;

	/**
	 * The number of structural features of the '<em>Parrafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parrafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebApp.impl.EnlaceImpl <em>Enlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.EnlaceImpl
	 * @see WebApp.impl.WebAppPackageImpl#getEnlace()
	 * @generated
	 */
	int ENLACE = 4;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__DESTINO = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__TEXTO = 1;

	/**
	 * The number of structural features of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebApp.impl.ImagenImpl <em>Imagen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebApp.impl.ImagenImpl
	 * @see WebApp.impl.WebAppPackageImpl#getImagen()
	 * @generated
	 */
	int IMAGEN = 5;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__TEXTO = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__URL = 1;

	/**
	 * The number of structural features of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link WebApp.AplicacionWeb <em>Aplicacion Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion Web</em>'.
	 * @see WebApp.AplicacionWeb
	 * @generated
	 */
	EClass getAplicacionWeb();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.AplicacionWeb#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see WebApp.AplicacionWeb#getTitulo()
	 * @see #getAplicacionWeb()
	 * @generated
	 */
	EAttribute getAplicacionWeb_Titulo();

	/**
	 * Returns the meta object for the containment reference list '{@link WebApp.AplicacionWeb#getPaginas <em>Paginas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginas</em>'.
	 * @see WebApp.AplicacionWeb#getPaginas()
	 * @see #getAplicacionWeb()
	 * @generated
	 */
	EReference getAplicacionWeb_Paginas();

	/**
	 * Returns the meta object for the containment reference list '{@link WebApp.AplicacionWeb#getEstilos <em>Estilos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estilos</em>'.
	 * @see WebApp.AplicacionWeb#getEstilos()
	 * @see #getAplicacionWeb()
	 * @generated
	 */
	EReference getAplicacionWeb_Estilos();

	/**
	 * Returns the meta object for class '{@link WebApp.PaginaWeb <em>Pagina Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina Web</em>'.
	 * @see WebApp.PaginaWeb
	 * @generated
	 */
	EClass getPaginaWeb();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.PaginaWeb#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see WebApp.PaginaWeb#getTitulo()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EAttribute getPaginaWeb_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.PaginaWeb#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see WebApp.PaginaWeb#getNombre()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EAttribute getPaginaWeb_Nombre();

	/**
	 * Returns the meta object for the reference '{@link WebApp.PaginaWeb#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estilo</em>'.
	 * @see WebApp.PaginaWeb#getEstilo()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EReference getPaginaWeb_Estilo();

	/**
	 * Returns the meta object for the containment reference list '{@link WebApp.PaginaWeb#getEnlaces <em>Enlaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlaces</em>'.
	 * @see WebApp.PaginaWeb#getEnlaces()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EReference getPaginaWeb_Enlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link WebApp.PaginaWeb#getParrafos <em>Parrafos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parrafos</em>'.
	 * @see WebApp.PaginaWeb#getParrafos()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EReference getPaginaWeb_Parrafos();

	/**
	 * Returns the meta object for the containment reference list '{@link WebApp.PaginaWeb#getImagenes <em>Imagenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagenes</em>'.
	 * @see WebApp.PaginaWeb#getImagenes()
	 * @see #getPaginaWeb()
	 * @generated
	 */
	EReference getPaginaWeb_Imagenes();

	/**
	 * Returns the meta object for class '{@link WebApp.EstiloVisual <em>Estilo Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estilo Visual</em>'.
	 * @see WebApp.EstiloVisual
	 * @generated
	 */
	EClass getEstiloVisual();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.EstiloVisual#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see WebApp.EstiloVisual#getNombre()
	 * @see #getEstiloVisual()
	 * @generated
	 */
	EAttribute getEstiloVisual_Nombre();

	/**
	 * Returns the meta object for class '{@link WebApp.Parrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parrafo</em>'.
	 * @see WebApp.Parrafo
	 * @generated
	 */
	EClass getParrafo();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.Parrafo#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see WebApp.Parrafo#getTexto()
	 * @see #getParrafo()
	 * @generated
	 */
	EAttribute getParrafo_Texto();

	/**
	 * Returns the meta object for class '{@link WebApp.Enlace <em>Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace</em>'.
	 * @see WebApp.Enlace
	 * @generated
	 */
	EClass getEnlace();

	/**
	 * Returns the meta object for the reference '{@link WebApp.Enlace#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see WebApp.Enlace#getDestino()
	 * @see #getEnlace()
	 * @generated
	 */
	EReference getEnlace_Destino();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.Enlace#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see WebApp.Enlace#getTexto()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_Texto();

	/**
	 * Returns the meta object for class '{@link WebApp.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagen</em>'.
	 * @see WebApp.Imagen
	 * @generated
	 */
	EClass getImagen();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.Imagen#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see WebApp.Imagen#getTexto()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Texto();

	/**
	 * Returns the meta object for the attribute '{@link WebApp.Imagen#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see WebApp.Imagen#getUrl()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebAppFactory getWebAppFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WebApp.impl.AplicacionWebImpl <em>Aplicacion Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.AplicacionWebImpl
		 * @see WebApp.impl.WebAppPackageImpl#getAplicacionWeb()
		 * @generated
		 */
		EClass APLICACION_WEB = eINSTANCE.getAplicacionWeb();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION_WEB__TITULO = eINSTANCE.getAplicacionWeb_Titulo();

		/**
		 * The meta object literal for the '<em><b>Paginas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION_WEB__PAGINAS = eINSTANCE.getAplicacionWeb_Paginas();

		/**
		 * The meta object literal for the '<em><b>Estilos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION_WEB__ESTILOS = eINSTANCE.getAplicacionWeb_Estilos();

		/**
		 * The meta object literal for the '{@link WebApp.impl.PaginaWebImpl <em>Pagina Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.PaginaWebImpl
		 * @see WebApp.impl.WebAppPackageImpl#getPaginaWeb()
		 * @generated
		 */
		EClass PAGINA_WEB = eINSTANCE.getPaginaWeb();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA_WEB__TITULO = eINSTANCE.getPaginaWeb_Titulo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA_WEB__NOMBRE = eINSTANCE.getPaginaWeb_Nombre();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_WEB__ESTILO = eINSTANCE.getPaginaWeb_Estilo();

		/**
		 * The meta object literal for the '<em><b>Enlaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_WEB__ENLACES = eINSTANCE.getPaginaWeb_Enlaces();

		/**
		 * The meta object literal for the '<em><b>Parrafos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_WEB__PARRAFOS = eINSTANCE.getPaginaWeb_Parrafos();

		/**
		 * The meta object literal for the '<em><b>Imagenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_WEB__IMAGENES = eINSTANCE.getPaginaWeb_Imagenes();

		/**
		 * The meta object literal for the '{@link WebApp.impl.EstiloVisualImpl <em>Estilo Visual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.EstiloVisualImpl
		 * @see WebApp.impl.WebAppPackageImpl#getEstiloVisual()
		 * @generated
		 */
		EClass ESTILO_VISUAL = eINSTANCE.getEstiloVisual();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTILO_VISUAL__NOMBRE = eINSTANCE.getEstiloVisual_Nombre();

		/**
		 * The meta object literal for the '{@link WebApp.impl.ParrafoImpl <em>Parrafo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.ParrafoImpl
		 * @see WebApp.impl.WebAppPackageImpl#getParrafo()
		 * @generated
		 */
		EClass PARRAFO = eINSTANCE.getParrafo();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARRAFO__TEXTO = eINSTANCE.getParrafo_Texto();

		/**
		 * The meta object literal for the '{@link WebApp.impl.EnlaceImpl <em>Enlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.EnlaceImpl
		 * @see WebApp.impl.WebAppPackageImpl#getEnlace()
		 * @generated
		 */
		EClass ENLACE = eINSTANCE.getEnlace();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE__DESTINO = eINSTANCE.getEnlace_Destino();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__TEXTO = eINSTANCE.getEnlace_Texto();

		/**
		 * The meta object literal for the '{@link WebApp.impl.ImagenImpl <em>Imagen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebApp.impl.ImagenImpl
		 * @see WebApp.impl.WebAppPackageImpl#getImagen()
		 * @generated
		 */
		EClass IMAGEN = eINSTANCE.getImagen();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__TEXTO = eINSTANCE.getImagen_Texto();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__URL = eINSTANCE.getImagen_Url();

	}

} //WebAppPackage
