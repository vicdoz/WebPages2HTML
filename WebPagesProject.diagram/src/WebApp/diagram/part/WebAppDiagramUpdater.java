package WebApp.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class WebAppDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppNodeDescriptor> getSemanticChildren(
			View view) {
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return getAplicacionWeb_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppNodeDescriptor> getAplicacionWeb_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebApp.AplicacionWeb modelElement = (WebApp.AplicacionWeb) view
				.getElement();
		LinkedList<WebApp.diagram.part.WebAppNodeDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPaginas().iterator(); it
				.hasNext();) {
			WebApp.PaginaWeb childElement = (WebApp.PaginaWeb) it.next();
			int visualID = WebApp.diagram.part.WebAppVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID) {
				result.add(new WebApp.diagram.part.WebAppNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEstilos().iterator(); it
				.hasNext();) {
			WebApp.EstiloVisual childElement = (WebApp.EstiloVisual) it.next();
			int visualID = WebApp.diagram.part.WebAppVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID) {
				result.add(new WebApp.diagram.part.WebAppNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getContainedLinks(
			View view) {
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return getAplicacionWeb_1000ContainedLinks(view);
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return getPaginaWeb_2001ContainedLinks(view);
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return getEstiloVisual_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getIncomingLinks(
			View view) {
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return getPaginaWeb_2001IncomingLinks(view);
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return getEstiloVisual_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return getPaginaWeb_2001OutgoingLinks(view);
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return getEstiloVisual_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getAplicacionWeb_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getPaginaWeb_2001ContainedLinks(
			View view) {
		WebApp.PaginaWeb modelElement = (WebApp.PaginaWeb) view.getElement();
		LinkedList<WebApp.diagram.part.WebAppLinkDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaWeb_Estilo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getEstiloVisual_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getPaginaWeb_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getEstiloVisual_2002IncomingLinks(
			View view) {
		WebApp.EstiloVisual modelElement = (WebApp.EstiloVisual) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebApp.diagram.part.WebAppLinkDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaWeb_Estilo_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getPaginaWeb_2001OutgoingLinks(
			View view) {
		WebApp.PaginaWeb modelElement = (WebApp.PaginaWeb) view.getElement();
		LinkedList<WebApp.diagram.part.WebAppLinkDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaWeb_Estilo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebApp.diagram.part.WebAppLinkDescriptor> getEstiloVisual_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<WebApp.diagram.part.WebAppLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaWeb_Estilo_4001(
			WebApp.EstiloVisual target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebApp.diagram.part.WebAppLinkDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WebApp.WebAppPackage.eINSTANCE
					.getPaginaWeb_Estilo()) {
				result.add(new WebApp.diagram.part.WebAppLinkDescriptor(
						setting.getEObject(),
						target,
						WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001,
						WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebApp.diagram.part.WebAppLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaWeb_Estilo_4001(
			WebApp.PaginaWeb source) {
		LinkedList<WebApp.diagram.part.WebAppLinkDescriptor> result = new LinkedList<WebApp.diagram.part.WebAppLinkDescriptor>();
		WebApp.EstiloVisual destination = source.getEstilo();
		if (destination == null) {
			return result;
		}
		result.add(new WebApp.diagram.part.WebAppLinkDescriptor(
				source,
				destination,
				WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001,
				WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<WebApp.diagram.part.WebAppNodeDescriptor> getSemanticChildren(
				View view) {
			return WebAppDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebApp.diagram.part.WebAppLinkDescriptor> getContainedLinks(
				View view) {
			return WebAppDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebApp.diagram.part.WebAppLinkDescriptor> getIncomingLinks(
				View view) {
			return WebAppDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebApp.diagram.part.WebAppLinkDescriptor> getOutgoingLinks(
				View view) {
			return WebAppDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
