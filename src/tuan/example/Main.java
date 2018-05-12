package tuan.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

	

	public static void main(String[] args) {
		NormalPeople norPeople = new NormalPeople();
		PeopleNetWoking netPeople = new PeopleNetWoking();
		PeoplePrograming proPeople = new PeoplePrograming();
		
		List<People> list = new ArrayList<>();
		list.add(norPeople);
		list.add(netPeople);
		list.add(proPeople);
		
		for (People people : list) {
			if( people instanceof IT) {
				System.out.println(String.valueOf(((IT) people).getMajor()));
			}
			else {
				System.out.println("Khong co major");
			}
		}
	}

}
