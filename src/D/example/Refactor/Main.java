package D.example.Refactor;

public class Main {
	
	public static void main(String []agrc) {
		IDatabase database = new Mongo();
		database.update();
	}
	
	
}
