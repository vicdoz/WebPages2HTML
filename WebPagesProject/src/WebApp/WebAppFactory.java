/**
 */
package WebApp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WebApp.WebAppPackage
 * @generated
 */
public interface WebAppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebAppFactory eINSTANCE = WebApp.impl.WebAppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aplicacion Web</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacion Web</em>'.
	 * @generated
	 */
	AplicacionWeb createAplicacionWeb();

	/**
	 * Returns a new object of class '<em>Pagina Web</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagina Web</em>'.
	 * @generated
	 */
	PaginaWeb createPaginaWeb();

	/**
	 * Returns a new object of class '<em>Estilo Visual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estilo Visual</em>'.
	 * @generated
	 */
	EstiloVisual createEstiloVisual();

	/**
	 * Returns a new object of class '<em>Parrafo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parrafo</em>'.
	 * @generated
	 */
	Parrafo createParrafo();

	/**
	 * Returns a new object of class '<em>Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace</em>'.
	 * @generated
	 */
	Enlace createEnlace();

	/**
	 * Returns a new object of class '<em>Imagen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imagen</em>'.
	 * @generated
	 */
	Imagen createImagen();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebAppPackage getWebAppPackage();

} //WebAppFactory
