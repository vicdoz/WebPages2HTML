package WebApp.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class WebAppNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WebApp.diagram.part.WebAppDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WebApp.diagram.part.WebAppDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorItem
				&& !isOwnView(((WebApp.diagram.navigator.WebAppNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorGroup) {
			WebApp.diagram.navigator.WebAppNavigatorGroup group = (WebApp.diagram.navigator.WebAppNavigatorGroup) element;
			return WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorItem) {
			WebApp.diagram.navigator.WebAppNavigatorItem navigatorItem = (WebApp.diagram.navigator.WebAppNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?WebApp?AplicacionWeb", WebApp.diagram.providers.WebAppElementTypes.AplicacionWeb_1000); //$NON-NLS-1$
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?WebApp?PaginaWeb", WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001); //$NON-NLS-1$
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?WebApp?EstiloVisual", WebApp.diagram.providers.WebAppElementTypes.EstiloVisual_2002); //$NON-NLS-1$
		case WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?WebApp?PaginaWeb?estilo", WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebApp.diagram.part.WebAppDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& WebApp.diagram.providers.WebAppElementTypes
						.isKnownElementType(elementType)) {
			image = WebApp.diagram.providers.WebAppElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorGroup) {
			WebApp.diagram.navigator.WebAppNavigatorGroup group = (WebApp.diagram.navigator.WebAppNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorItem) {
			WebApp.diagram.navigator.WebAppNavigatorItem navigatorItem = (WebApp.diagram.navigator.WebAppNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(view)) {
		case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
			return getAplicacionWeb_1000Text(view);
		case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
			return getPaginaWeb_2001Text(view);
		case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
			return getEstiloVisual_2002Text(view);
		case WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID:
			return getPaginaWebEstilo_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAplicacionWeb_1000Text(View view) {
		WebApp.AplicacionWeb domainModelElement = (WebApp.AplicacionWeb) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitulo();
		} else {
			WebApp.diagram.part.WebAppDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPaginaWeb_2001Text(View view) {
		IParser parser = WebApp.diagram.providers.WebAppParserProvider
				.getParser(
						WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001,
						view.getElement() != null ? view.getElement() : view,
						WebApp.diagram.part.WebAppVisualIDRegistry
								.getType(WebApp.diagram.edit.parts.PaginaWebTituloEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEstiloVisual_2002Text(View view) {
		IParser parser = WebApp.diagram.providers.WebAppParserProvider
				.getParser(
						WebApp.diagram.providers.WebAppElementTypes.EstiloVisual_2002,
						view.getElement() != null ? view.getElement() : view,
						WebApp.diagram.part.WebAppVisualIDRegistry
								.getType(WebApp.diagram.edit.parts.EstiloVisualNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPaginaWebEstilo_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebApp.diagram.edit.parts.AplicacionWebEditPart.MODEL_ID
				.equals(WebApp.diagram.part.WebAppVisualIDRegistry
						.getModelID(view));
	}

}
