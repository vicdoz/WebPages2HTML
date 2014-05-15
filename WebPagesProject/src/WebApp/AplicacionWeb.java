/**
 */
package WebApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicacion Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebApp.AplicacionWeb#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link WebApp.AplicacionWeb#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link WebApp.AplicacionWeb#getEstilos <em>Estilos</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebApp.WebAppPackage#getAplicacionWeb()
 * @model
 * @generated
 */
public interface AplicacionWeb extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see WebApp.WebAppPackage#getAplicacionWeb_Titulo()
	 * @model required="true"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link WebApp.AplicacionWeb#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Paginas</b></em>' containment reference list.
	 * The list contents are of type {@link WebApp.PaginaWeb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paginas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas</em>' containment reference list.
	 * @see WebApp.WebAppPackage#getAplicacionWeb_Paginas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaginaWeb> getPaginas();

	/**
	 * Returns the value of the '<em><b>Estilos</b></em>' containment reference list.
	 * The list contents are of type {@link WebApp.EstiloVisual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilos</em>' containment reference list.
	 * @see WebApp.WebAppPackage#getAplicacionWeb_Estilos()
	 * @model containment="true"
	 * @generated
	 */
	EList<EstiloVisual> getEstilos();

} // AplicacionWeb
