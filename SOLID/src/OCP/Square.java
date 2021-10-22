package OCP;

public class Square extends Figure {

	float length;
	
	@Override
	public float getArea() {
		return (length*length);
	}
}
