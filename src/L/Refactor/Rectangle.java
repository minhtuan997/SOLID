package L.Refactor;

public class Rectangle implements Shape {
	private float height;
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	private float width;
	
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
