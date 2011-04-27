package subsumption.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class OutputSinkItemSemanticEditPolicy extends
		SubsumptionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputSinkItemSemanticEditPolicy() {
		super(SubsumptionElementTypes.OutputSink_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
