package subsumption.diagram.edit.parts.custom;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

public class FixedChildBorderItemlocator extends BorderItemLocator {
	
	/** remembers the preferred side used when the locator was created*/
	private int originalPreferredSide;

	/**
	 * 
	 * @param parentFigure
	 * @param position
	 *            one of the org.eclipse.draw2d.PositionConstants
	 */
	public FixedChildBorderItemlocator(IFigure parentFigure, int position) {
		super(parentFigure, position);
		originalPreferredSide = position;
	}

	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation,
			IFigure borderItem) {
		Rectangle realLocation = new Rectangle(proposedLocation);
		int side = originalPreferredSide; //findClosestSideOfParent(proposedLocation, getParentBorder());
		Point newTopLeft = locateOnBorder(realLocation.getTopLeft(), side, 0,
			borderItem);
		realLocation.setLocation(newTopLeft);
		return realLocation;
	}
}
