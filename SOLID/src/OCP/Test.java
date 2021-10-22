package OCP;

public class Test {

	public static void main(String[] args) {
		Square a= new Square();
		Circle b= new Circle();
		Circle c=new Circle();
		Diamond d=new Diamond();
		
		a.length=2;
		b.diameter=1;
		c.diameter=(float)0.5;
		Sheet s=new Sheet();
		
		s.addFigure(a);
		s.addFigure(b);
		s.addFigure(c);
		s.addFigure(d);
		
		s.drawFigures();
		s.calculateAreas();

	}

}
