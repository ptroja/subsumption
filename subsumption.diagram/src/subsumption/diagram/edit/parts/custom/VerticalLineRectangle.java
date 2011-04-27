package subsumption.diagram.edit.parts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
 
public class VerticalLineRectangle extends RectangleFigure {
 
	public VerticalLineRectangle() {	
		super();
		setFill(false);
	}
 
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		
		graphics.drawLine(
				r.getLeft(),
				r.getRight()
				);
	}
}
