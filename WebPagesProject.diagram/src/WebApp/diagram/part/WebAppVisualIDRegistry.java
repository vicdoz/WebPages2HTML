package WebApp.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebAppVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "WebPagesProject.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
					.equals(view.getType())) {
				return WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebApp.WebAppPackage.eINSTANCE.getAplicacionWeb().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WebApp.AplicacionWeb) domainElement)) {
			return WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = WebApp.diagram.part.WebAppVisualIDRegistry
				.getModelID(containerView);
		if (!WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = WebApp.diagram.part.WebAppVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			if (WebApp.WebAppPackage.eINSTANCE.getPaginaWeb().isSuperTypeOf(
					domainElement.eClass())) {
				return WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID;
			}
			if (WebApp.WebAppPackage.eINSTANCE.getEstiloVisual().isSuperTypeOf(
					domainElement.eClass())) {
				return WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = WebApp.diagram.part.WebAppVisualIDRegistry
				.getModelID(containerView);
		if (!WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = WebApp.diagram.part.WebAppVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			if (WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			if (WebApp.diagram.edit.parts.PaginaWebTituloEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			if (WebApp.diagram.edit.parts.EstiloVisualNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WebApp.AplicacionWeb element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return false;
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return WebApp.diagram.part.WebAppVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return WebApp.diagram.part.WebAppVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return WebApp.diagram.part.WebAppVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return WebApp.diagram.part.WebAppVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return WebApp.diagram.part.WebAppVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
