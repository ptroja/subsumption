package subsumption.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class OutputActivatesItemSemanticEditPolicy extends
		SubsumptionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputActivatesItemSemanticEditPolicy() {
		super(SubsumptionElementTypes.OutputActivates_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
