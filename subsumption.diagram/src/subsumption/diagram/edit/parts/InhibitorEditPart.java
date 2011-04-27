package subsumption.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import subsumption.diagram.edit.policies.InhibitorItemSemanticEditPolicy;
import subsumption.diagram.part.SubsumptionVisualIDRegistry;
import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class InhibitorEditPart extends ShapeNodeEditPart {

	private ConnectionAnchor fixedAnchor;

	public class FixedConnectionAnchor extends AbstractConnectionAnchor {
		public FixedConnectionAnchor(IFigure owner) {
			super(owner);
		}

		public Point getLocation(Point reference) {
			Point right = getOwner().getBounds().getTop();
			Point p = new PrecisionPoint(right);
			getOwner().translateToAbsolute(p);
			return p;
		}
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		if (fixedAnchor == null) {
			fixedAnchor = new FixedConnectionAnchor(getNodeFigure());
		}
		return fixedAnchor;
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InhibitorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InhibitorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InhibitorFigure();
	}

	/**
	 * @generated
	 */
	public InhibitorFigure getPrimaryShape() {
		return (InhibitorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InhibitorTimeEditPart) {
			((InhibitorTimeEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureInhibitorTimeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InhibitorTimeEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(50, 50);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SubsumptionVisualIDRegistry
				.getType(InhibitorTimeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SubsumptionElementTypes.OutputActivates_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SubsumptionElementTypes.OutputActivates_4002) {
			types.add(SubsumptionElementTypes.Output_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class InhibitorFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInhibitorTimeFigure;

		/**
		 * @generated
		 */
		public InhibitorFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(50),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel inhibitorConstantLabel0 = new WrappingLabel();
			inhibitorConstantLabel0.setText("I");

			GridData constraintInhibitorConstantLabel0 = new GridData();
			constraintInhibitorConstantLabel0.verticalAlignment = GridData.CENTER;
			constraintInhibitorConstantLabel0.horizontalAlignment = GridData.CENTER;
			constraintInhibitorConstantLabel0.horizontalIndent = 0;
			constraintInhibitorConstantLabel0.horizontalSpan = 1;
			constraintInhibitorConstantLabel0.verticalSpan = 1;
			constraintInhibitorConstantLabel0.grabExcessHorizontalSpace = true;
			constraintInhibitorConstantLabel0.grabExcessVerticalSpace = true;
			this.add(inhibitorConstantLabel0, constraintInhibitorConstantLabel0);

			fFigureInhibitorTimeFigure = new WrappingLabel();
			fFigureInhibitorTimeFigure.setText("<...>");

			GridData constraintFFigureInhibitorTimeFigure = new GridData();
			constraintFFigureInhibitorTimeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureInhibitorTimeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureInhibitorTimeFigure.horizontalIndent = 0;
			constraintFFigureInhibitorTimeFigure.horizontalSpan = 1;
			constraintFFigureInhibitorTimeFigure.verticalSpan = 1;
			constraintFFigureInhibitorTimeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureInhibitorTimeFigure.grabExcessVerticalSpace = false;
			this.add(fFigureInhibitorTimeFigure,
					constraintFFigureInhibitorTimeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInhibitorTimeFigure() {
			return fFigureInhibitorTimeFigure;
		}

	}

}
