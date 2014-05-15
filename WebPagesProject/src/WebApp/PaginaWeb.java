/**
 */
package WebApp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebApp.PaginaWeb#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link WebApp.PaginaWeb#getNombre <em>Nombre</em>}</li>
 *   <li>{@link WebApp.PaginaWeb#getEstilo <em>Estilo</em>}</li>
 *   <li>{@link WebApp.PaginaWeb#getEnlaces <em>Enlaces</em>}</li>
 *   <li>{@link WebApp.PaginaWeb#getParrafos <em>Parrafos</em>}</li>
 *   <li>{@link WebApp.PaginaWeb#getImagenes <em>Imagenes</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebApp.WebAppPackage#getPaginaWeb()
 * @model
 * @generated
 */
public interface PaginaWeb extends EObject {
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
	 * @see WebApp.WebAppPackage#getPaginaWeb_Titulo()
	 * @model required="true"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link WebApp.PaginaWeb#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see WebApp.WebAppPackage#getPaginaWeb_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link WebApp.PaginaWeb#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Estilo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo</em>' reference.
	 * @see #setEstilo(EstiloVisual)
	 * @see WebApp.WebAppPackage#getPaginaWeb_Estilo()
	 * @model
	 * @generated
	 */
	EstiloVisual getEstilo();

	/**
	 * Sets the value of the '{@link WebApp.PaginaWeb#getEstilo <em>Estilo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' reference.
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(EstiloVisual value);

	/**
	 * Returns the value of the '<em><b>Enlaces</b></em>' containment reference list.
	 * The list contents are of type {@link WebApp.Enlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enlaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlaces</em>' containment reference list.
	 * @see WebApp.WebAppPackage#getPaginaWeb_Enlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enlace> getEnlaces();

	/**
	 * Returns the value of the '<em><b>Parrafos</b></em>' containment reference list.
	 * The list contents are of type {@link WebApp.Parrafo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parrafos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parrafos</em>' containment reference list.
	 * @see WebApp.WebAppPackage#getPaginaWeb_Parrafos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parrafo> getParrafos();

	/**
	 * Returns the value of the '<em><b>Imagenes</b></em>' containment reference list.
	 * The list contents are of type {@link WebApp.Imagen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagenes</em>' containment reference list.
	 * @see WebApp.WebAppPackage#getPaginaWeb_Imagenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imagen> getImagenes();

} // PaginaWeb
