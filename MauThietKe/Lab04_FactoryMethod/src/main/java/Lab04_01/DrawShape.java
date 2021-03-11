package Lab04_01;

public class DrawShape {
	public void draw (int shape, int style) {
		IShape drawShape;
		drawShape = new Circle();
		if (style == 2) {
			if (shape == 1) {
				drawShape = new SolidCircle();
			} else if (shape == 2) {
				drawShape = new SolidSquares();
			} else if (shape == 3) {
				drawShape = new SolidRectangle();
			}
		}else {
			if (shape == 1) {
				drawShape = new Circle();
			} else if (shape == 2) {
				drawShape = new Squares();
			} else if (shape == 3) {
				drawShape = new Rectangle();
			}
		}
		drawShape.draw();
	}
}
