package WebApp.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class WebAppElementTypes {

	/**
	 * @generated
	 */
	private WebAppElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType AplicacionWeb_1000 = getElementType("WebPagesProject.diagram.AplicacionWeb_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PaginaWeb_2001 = getElementType("WebPagesProject.diagram.PaginaWeb_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EstiloVisual_2002 = getElementType("WebPagesProject.diagram.EstiloVisual_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PaginaWebEstilo_4001 = getElementType("WebPagesProject.diagram.PaginaWebEstilo_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(AplicacionWeb_1000,
					WebApp.WebAppPackage.eINSTANCE.getAplicacionWeb());

			elements.put(PaginaWeb_2001,
					WebApp.WebAppPackage.eINSTANCE.getPaginaWeb());

			elements.put(EstiloVisual_2002,
					WebApp.WebAppPackage.eINSTANCE.getEstiloVisual());

			elements.put(PaginaWebEstilo_4001,
					WebApp.WebAppPackage.eINSTANCE.getPaginaWeb_Estilo());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(AplicacionWeb_1000);
			KNOWN_ELEMENT_TYPES.add(PaginaWeb_2001);
			KNOWN_ELEMENT_TYPES.add(EstiloVisual_2002);
			KNOWN_ELEMENT_TYPES.add(PaginaWebEstilo_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return AplicacionWeb_1000;
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return PaginaWeb_2001;
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return EstiloVisual_2002;
		case WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID:
			return PaginaWebEstilo_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return WebApp.diagram.providers.WebAppElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return WebApp.diagram.providers.WebAppElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return WebApp.diagram.providers.WebAppElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
