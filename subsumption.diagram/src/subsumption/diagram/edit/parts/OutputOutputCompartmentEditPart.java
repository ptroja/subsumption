package subsumption.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import subsumption.SubsumptionPackage;
import subsumption.diagram.edit.policies.OutputOutputCompartmentCanonicalEditPolicy;
import subsumption.diagram.edit.policies.OutputOutputCompartmentItemSemanticEditPolicy;
import subsumption.diagram.edit.policies.custom.CompartmentChildCreationEditPolicy;
import subsumption.diagram.edit.policies.custom.CompartmentEditPolicy;
import subsumption.diagram.part.Messages;

/**
 * @generated
 */
public class OutputOutputCompartmentEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public OutputOutputCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.OutputOutputCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();

		FlowLayout layout = new FlowLayout();
		layout.setMajorSpacing(getMapMode().DPtoLP(5));
		layout.setMinorSpacing(getMapMode().DPtoLP(5));
		layout.setHorizontal(true);

		result.getContentPane().setLayoutManager(layout);

		result.setBorder(null);

		result.setTitleVisibility(false);

		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OutputOutputCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
		//new CreationEditPolicy());
				new CompartmentChildCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OutputOutputCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(
				SubsumptionPackage.Literals.OUTPUT__INHIBITED_BY));
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
