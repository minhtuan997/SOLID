package S.example;

public class User {
	//Single Responsibility Principle
	private String name;
	private int age;
	private String email;
	
	public User(String name,int age,String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public String formatToJson() {
		return "";
	}
	
	public String formatToHtml() {
		return "";
	}
	
	public boolean login(String email) {
		
	}
	
}
