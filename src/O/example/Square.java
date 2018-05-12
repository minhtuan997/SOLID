package O.example;

public class Square implements Shape{
	private float arris ;
	public Square(float arris) {
		this.setArris(arris);
	}
	@Override
	public String getType() {
		return "Square";
	}
	public float getArris() {
		return arris;
	}
	public void setArris(float arris) {
		this.arris = arris;
	}
	
	
}
