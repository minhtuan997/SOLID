package O.example.Refactor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Shape myShape = (Shape) new MyShape();
		Shape square = new Square(100);
		Shape triangle = new Triangle(10);
		
		List<Shape> list = new ArrayList();
		list.add(myShape);
		list.add(square);
		list.add(triangle);
		
		float res = 0;
		
		for (Shape shape : list) {
			res += shape.Area();
		}
		System.out.println(res);
	}

}
