package D.example;

public class Main {
	//Dependency Inversion Principle
	
	public static void main(String[] args) {
		Mongo mon = new Mongo();
		Mysql my = new Mysql();
		Sql sq = new Sql();
			
	}

}
