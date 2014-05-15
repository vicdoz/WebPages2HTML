package WebApp.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class WebAppEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebApp.diagram.part.WebAppVisualIDRegistry
					.getVisualID(view)) {

			case WebApp.diagram.edit.parts.AplicacionWebEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.AplicacionWebEditPart(view);

			case WebApp.diagram.edit.parts.PaginaWebEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.PaginaWebEditPart(view);

			case WebApp.diagram.edit.parts.PaginaWebTituloEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.PaginaWebTituloEditPart(
						view);

			case WebApp.diagram.edit.parts.EstiloVisualEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.EstiloVisualEditPart(view);

			case WebApp.diagram.edit.parts.EstiloVisualNombreEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.EstiloVisualNombreEditPart(
						view);

			case WebApp.diagram.edit.parts.PaginaWebEstiloEditPart.VISUAL_ID:
				return new WebApp.diagram.edit.parts.PaginaWebEstiloEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
