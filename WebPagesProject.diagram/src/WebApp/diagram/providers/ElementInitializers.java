package WebApp.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WebApp.diagram.part.WebAppDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
