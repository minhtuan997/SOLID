package S.example;

public class LoginUseCase {
	private DAOUser daoUser;
	
	public boolean login(String email) {
		
		if( email.equals("tuan") ) 
			return true;
		else
			return false;
	}			
}
