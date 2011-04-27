package subsumption.diagram.edit.parts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
 
public class VerticalArrowLineRectangle extends RectangleFigure {
 
	public VerticalArrowLineRectangle() {	
		super();
		setFill(false);
	}
 
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		
		graphics.drawLine(
				r.getLeft(),
				r.getRight().getTranslated(-1, 0)
				);
		
		Point P1 = r.getRight().getTranslated(-1, 0);
		Point P2 = P1.getTranslated(-7, +4);
		Point P3 = P1.getTranslated(-7, -4);
		
		PointList points = new PointList();
		points.addPoint(P1);
		points.addPoint(P2);
		points.addPoint(P3);
		
		graphics.setBackgroundColor(getForegroundColor());
		graphics.setLineCap(SWT.CAP_FLAT);
		graphics.setLineJoin(SWT.JOIN_ROUND);
		graphics.fillPolygon(points);
	}
}
