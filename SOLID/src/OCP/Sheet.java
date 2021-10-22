package OCP;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	/*Vector<Square> squares = new Vector<>();
	Vector<Circle> circles = new Vector<>();

	public void addCircle(Circle c) {
		circles.add(c);
	}

	public void addSEquare(Square s) {
		squares.add(s);
	}

	public void drawFigures() {
		Enumeration<Square> esquares = squares.elements();
		Square s;
		while (esquares.hasMoreElements()) {
			s = esquares.nextElement();
			s.draw();
		}
		Enumeration<Circle> ecircles = circles.elements();
		Circle c;
		while (ecircles.hasMoreElements()) {
			c = ecircles.nextElement();
			c.draw();
		}
	}*/
	Vector<Figure> figures=new Vector<>();
	
	public void addFigure(Figure s) {
		figures.add(s);
	}
	
	public void drawFigures() {
		Enumeration<Figure> efigures=figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f=efigures.nextElement();
			f.draw();
		}
	}
	
	public void calculateAreas() {
		Enumeration<Figure> efigures=figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f=efigures.nextElement();
			System.out.println("Area: " + f.getArea());
		}
	}
} 
