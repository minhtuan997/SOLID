package O.example;

public class Triangle implements Shape {
	private float side;
	
	public Triangle(float side) {
		this.setSide(side);
	}
	
	@Override
	public String getType() {
		return "Triangle";
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
}
