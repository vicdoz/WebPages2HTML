/**
 */
package WebApp.util;

import WebApp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WebApp.WebAppPackage
 * @generated
 */
public class WebAppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebAppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebAppPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppSwitch<Adapter> modelSwitch =
		new WebAppSwitch<Adapter>() {
			@Override
			public Adapter caseAplicacionWeb(AplicacionWeb object) {
				return createAplicacionWebAdapter();
			}
			@Override
			public Adapter casePaginaWeb(PaginaWeb object) {
				return createPaginaWebAdapter();
			}
			@Override
			public Adapter caseEstiloVisual(EstiloVisual object) {
				return createEstiloVisualAdapter();
			}
			@Override
			public Adapter caseParrafo(Parrafo object) {
				return createParrafoAdapter();
			}
			@Override
			public Adapter caseEnlace(Enlace object) {
				return createEnlaceAdapter();
			}
			@Override
			public Adapter caseImagen(Imagen object) {
				return createImagenAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link WebApp.AplicacionWeb <em>Aplicacion Web</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.AplicacionWeb
	 * @generated
	 */
	public Adapter createAplicacionWebAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebApp.PaginaWeb <em>Pagina Web</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.PaginaWeb
	 * @generated
	 */
	public Adapter createPaginaWebAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebApp.EstiloVisual <em>Estilo Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.EstiloVisual
	 * @generated
	 */
	public Adapter createEstiloVisualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebApp.Parrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.Parrafo
	 * @generated
	 */
	public Adapter createParrafoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebApp.Enlace <em>Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.Enlace
	 * @generated
	 */
	public Adapter createEnlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebApp.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebApp.Imagen
	 * @generated
	 */
	public Adapter createImagenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebAppAdapterFactory
