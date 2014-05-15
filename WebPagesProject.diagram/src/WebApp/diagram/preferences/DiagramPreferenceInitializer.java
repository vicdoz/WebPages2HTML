package WebApp.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		WebApp.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		WebApp.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		WebApp.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		WebApp.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		WebApp.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return WebApp.diagram.part.WebAppDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
