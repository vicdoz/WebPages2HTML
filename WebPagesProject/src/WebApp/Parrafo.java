/**
 */
package WebApp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parrafo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebApp.Parrafo#getTexto <em>Texto</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebApp.WebAppPackage#getParrafo()
 * @model
 * @generated
 */
public interface Parrafo extends EObject {
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
	 * @see WebApp.WebAppPackage#getParrafo_Texto()
	 * @model required="true"
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link WebApp.Parrafo#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Parrafo
