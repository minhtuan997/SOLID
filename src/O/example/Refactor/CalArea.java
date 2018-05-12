package O.example.Refactor;

import java.util.List;

public class CalArea {
	public float calSumArea(List<Shape> list) {
		float res = 0;
		for(int i=0; i < list.size(); i++)
			res += list.get(i).Area();
		
		return res;
	}
}
