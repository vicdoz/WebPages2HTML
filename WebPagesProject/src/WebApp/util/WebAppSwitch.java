/**
 */
package WebApp.util;

import WebApp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WebApp.WebAppPackage
 * @generated
 */
public class WebAppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebAppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppSwitch() {
		if (modelPackage == null) {
			modelPackage = WebAppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebAppPackage.APLICACION_WEB: {
				AplicacionWeb aplicacionWeb = (AplicacionWeb)theEObject;
				T result = caseAplicacionWeb(aplicacionWeb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebAppPackage.PAGINA_WEB: {
				PaginaWeb paginaWeb = (PaginaWeb)theEObject;
				T result = casePaginaWeb(paginaWeb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebAppPackage.ESTILO_VISUAL: {
				EstiloVisual estiloVisual = (EstiloVisual)theEObject;
				T result = caseEstiloVisual(estiloVisual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebAppPackage.PARRAFO: {
				Parrafo parrafo = (Parrafo)theEObject;
				T result = caseParrafo(parrafo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebAppPackage.ENLACE: {
				Enlace enlace = (Enlace)theEObject;
				T result = caseEnlace(enlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebAppPackage.IMAGEN: {
				Imagen imagen = (Imagen)theEObject;
				T result = caseImagen(imagen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aplicacion Web</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aplicacion Web</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAplicacionWeb(AplicacionWeb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina Web</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina Web</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginaWeb(PaginaWeb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estilo Visual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estilo Visual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstiloVisual(EstiloVisual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parrafo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parrafo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParrafo(Parrafo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enlace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnlace(Enlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imagen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imagen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagen(Imagen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebAppSwitch
