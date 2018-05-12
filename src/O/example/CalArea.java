package O.example;

import java.util.List;

public class CalArea {
	// Open/Closed Principle
	public float calSumArae(List<Shape> list) {
		float res = 0;
		for(int i=0; i < list.size(); i++) {
			Shape s = list.get(i);
			if( s.getType().equals("Triangle")) {
				res += 22222; // t�nh to�n
			}
			else if ( s.getType().equals("Square")) {
				res += 3333;
			}
			
		}
		return res;
	}
}
