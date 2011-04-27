package subsumption.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import subsumption.diagram.edit.parts.custom.FixedChildBorderItemlocator;
import subsumption.diagram.edit.policies.ModuleCanonicalEditPolicy;
import subsumption.diagram.edit.policies.ModuleItemSemanticEditPolicy;
import subsumption.diagram.part.SubsumptionVisualIDRegistry;

/**
 * @generated
 */
public class ModuleEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ModuleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ModuleItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ModuleCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (SubsumptionVisualIDRegistry.getVisualID(childView)) {
				case InputEditPart.VISUAL_ID:
				case OutputEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
		return primaryShape = new ModuleFigure();
	}

	/**
	 * @generated
	 */
	public ModuleFigure getPrimaryShape() {
		return (ModuleFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModuleNameEditPart) {
			((ModuleNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureModuleNameFigure());
			return true;
		}
		if (childEditPart instanceof InputEditPart) {
			//			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
			//					PositionConstants.WEST);
			FixedChildBorderItemlocator locator = new FixedChildBorderItemlocator(
					getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((InputEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof OutputEditPart) {
			//			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
			//					PositionConstants.EAST);
			FixedChildBorderItemlocator locator = new FixedChildBorderItemlocator(
					getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((OutputEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ModuleNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InputEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((InputEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof OutputEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OutputEditPart) childEditPart).getFigure());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	protected NodeFigure createMainFigure() {
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
				.getType(ModuleNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ModuleFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureModuleNameFigure;

		/**
		 * @generated NOT
		 */
		public ModuleFigure() {
			this.setLayoutManager(new StackLayout() {
				public void layout(IFigure figure) {
					Rectangle r = figure.getClientArea();
					List children = figure.getChildren();
					for (int i = 0; i < children.size(); i++) {
						IFigure child = (IFigure) children.get(i);
						//						Dimension d = child.getPreferredSize(r.width, r.height);
						Dimension d = child.getPreferredSize();
						d.width = Math.min(d.width, r.width);
						d.height = Math.min(d.height, r.height);
						//System.out.println("d.width = " + d.width + "; d.height = " + d.height);
						Point P = new Point(r.x + (r.width - d.width) / 2, r.y
								+ (r.height - d.height) / 2);

						Rectangle childRect = new Rectangle(P, d);
						child.setBounds(childRect);
					}
				}
			});
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureModuleNameFigure = new WrappingLabel();
			fFigureModuleNameFigure.setText("<...>");

			this.add(fFigureModuleNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModuleNameFigure() {
			return fFigureModuleNameFigure;
		}

	}

}
