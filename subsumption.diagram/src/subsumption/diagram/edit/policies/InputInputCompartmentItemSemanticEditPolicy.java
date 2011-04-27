package subsumption.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import subsumption.diagram.edit.commands.SuppressorCreateCommand;
import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class InputInputCompartmentItemSemanticEditPolicy extends
		SubsumptionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputInputCompartmentItemSemanticEditPolicy() {
		super(SubsumptionElementTypes.Input_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SubsumptionElementTypes.Suppressor_3003 == req.getElementType()) {
			return getGEFWrapper(new SuppressorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
