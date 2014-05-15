package WebApp.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebAppModelingAssistantProviderOfEstiloVisualEditPart extends
		WebApp.diagram.providers.WebAppModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WebApp.diagram.edit.parts.EstiloVisualEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			WebApp.diagram.edit.parts.EstiloVisualEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(WebApp.diagram.edit.parts.EstiloVisualEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			WebApp.diagram.edit.parts.EstiloVisualEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001) {
			types.add(WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001);
		}
		return types;
	}

}
