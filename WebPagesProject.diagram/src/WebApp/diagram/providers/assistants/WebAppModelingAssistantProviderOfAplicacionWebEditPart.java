package WebApp.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebAppModelingAssistantProviderOfAplicacionWebEditPart extends
		WebApp.diagram.providers.WebAppModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001);
		types.add(WebApp.diagram.providers.WebAppElementTypes.EstiloVisual_2002);
		return types;
	}

}
