package subsumption.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import subsumption.diagram.edit.commands.InhibitorCreateCommand;
import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class OutputOutputCompartmentItemSemanticEditPolicy extends
		SubsumptionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputOutputCompartmentItemSemanticEditPolicy() {
		super(SubsumptionElementTypes.Output_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SubsumptionElementTypes.Inhibitor_3004 == req.getElementType()) {
			return getGEFWrapper(new InhibitorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
