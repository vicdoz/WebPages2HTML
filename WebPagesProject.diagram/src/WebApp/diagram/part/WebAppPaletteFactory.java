package WebApp.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebAppPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWebApp1Group());
	}

	/**
	 * Creates "WebApp" palette tool group
	 * @generated
	 */
	private PaletteContainer createWebApp1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				WebApp.diagram.part.Messages.WebApp1Group_title);
		paletteContainer.setId("createWebApp1Group"); //$NON-NLS-1$
		paletteContainer.add(createPaginaWeb1CreationTool());
		paletteContainer.add(createPaginaWebEstilo2CreationTool());
		paletteContainer.add(createEstiloVisual3CreationTool());
		paletteContainer.add(createParrafo4CreationTool());
		paletteContainer.add(createEnlace5CreationTool());
		paletteContainer.add(createImagen6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPaginaWeb1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				WebApp.diagram.part.Messages.PaginaWeb1CreationTool_title,
				WebApp.diagram.part.Messages.PaginaWeb1CreationTool_desc,
				Collections
						.singletonList(WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001));
		entry.setId("createPaginaWeb1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebApp.diagram.providers.WebAppElementTypes
				.getImageDescriptor(WebApp.diagram.providers.WebAppElementTypes.PaginaWeb_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPaginaWebEstilo2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				WebApp.diagram.part.Messages.PaginaWebEstilo2CreationTool_title,
				WebApp.diagram.part.Messages.PaginaWebEstilo2CreationTool_desc,
				Collections
						.singletonList(WebApp.diagram.providers.WebAppElementTypes.EstiloVisual_2002));
		entry.setId("createPaginaWebEstilo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebApp.diagram.providers.WebAppElementTypes
				.getImageDescriptor(WebApp.diagram.providers.WebAppElementTypes.EstiloVisual_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstiloVisual3CreationTool() {
		ToolEntry entry = new ToolEntry(
				WebApp.diagram.part.Messages.EstiloVisual3CreationTool_title,
				WebApp.diagram.part.Messages.EstiloVisual3CreationTool_desc,
				null, null) {
		};
		entry.setId("createEstiloVisual3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParrafo4CreationTool() {
		ToolEntry entry = new ToolEntry(
				WebApp.diagram.part.Messages.Parrafo4CreationTool_title,
				WebApp.diagram.part.Messages.Parrafo4CreationTool_desc, null,
				null) {
		};
		entry.setId("createParrafo4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlace5CreationTool() {
		ToolEntry entry = new ToolEntry(
				WebApp.diagram.part.Messages.Enlace5CreationTool_title,
				WebApp.diagram.part.Messages.Enlace5CreationTool_desc, null,
				null) {
		};
		entry.setId("createEnlace5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImagen6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				WebApp.diagram.part.Messages.Imagen6CreationTool_title,
				WebApp.diagram.part.Messages.Imagen6CreationTool_desc,
				Collections
						.singletonList(WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001));
		entry.setId("createImagen6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebApp.diagram.providers.WebAppElementTypes
				.getImageDescriptor(WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
