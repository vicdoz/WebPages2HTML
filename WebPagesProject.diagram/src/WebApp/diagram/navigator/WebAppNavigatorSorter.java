package WebApp.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class WebAppNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WebApp.diagram.navigator.WebAppNavigatorItem) {
			WebApp.diagram.navigator.WebAppNavigatorItem item = (WebApp.diagram.navigator.WebAppNavigatorItem) element;
			return WebApp.diagram.part.WebAppVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
