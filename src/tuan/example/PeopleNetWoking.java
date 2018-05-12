package tuan.example;

public class PeopleNetWoking implements People,IT {

	@Override
	public Major getMajor() {
		return Major.Networking;
	}

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
	public String toString() {
		
		return "PeopleNetWoking{" + String.valueOf(this.getMajor()) + "," + this.getName() + "," + this.getAge() +"}";
	}
}
