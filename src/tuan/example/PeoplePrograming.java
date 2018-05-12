package tuan.example;

public class PeoplePrograming implements IT,People {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Major getMajor() {
		return Major.Programing;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PeoplePrograming{" + String.valueOf(this.getMajor()) + "," + this.getName() + "," + this.getAge() +"}";
	}
}
