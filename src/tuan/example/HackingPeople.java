package tuan.example;

public class HackingPeople implements People,IT,BranchNetworking{

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
	public BranNetWoking getBranchNetWorking() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
