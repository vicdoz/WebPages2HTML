package WebApp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PaginaWebEstiloItemSemanticEditPolicy extends
		WebApp.diagram.edit.policies.WebAppBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PaginaWebEstiloItemSemanticEditPolicy() {
		super(WebApp.diagram.providers.WebAppElementTypes.PaginaWebEstilo_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
