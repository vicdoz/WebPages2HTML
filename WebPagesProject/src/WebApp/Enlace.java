/**
 */
package WebApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebApp.Enlace#getDestino <em>Destino</em>}</li>
 *   <li>{@link WebApp.Enlace#getTexto <em>Texto</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebApp.WebAppPackage#getEnlace()
 * @model
 * @generated
 */
public interface Enlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(PaginaWeb)
	 * @see WebApp.WebAppPackage#getEnlace_Destino()
	 * @model required="true"
	 * @generated
	 */
	PaginaWeb getDestino();

	/**
	 * Sets the value of the '{@link WebApp.Enlace#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(PaginaWeb value);

	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see WebApp.WebAppPackage#getEnlace_Texto()
	 * @model required="true"
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link WebApp.Enlace#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Enlace
