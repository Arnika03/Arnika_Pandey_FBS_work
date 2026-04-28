package exception.login;

public class Login {
	String username = "Arnika";
	String password = "abc@34346";
	
	// Username validation
	public void validateUsername(String enteredUsername) throws InvalidUsernameException{
		if (enteredUsername == null || !enteredUsername.trim().equalsIgnoreCase(username)) {
		    throw new InvalidUsernameException("Invalid Username!");
		}
	}
	
	// Password validation
	public void validatePassword(String enteredPassword) throws InvalidPasswordException{
		if (!password.equals(enteredPassword)) {
		    throw new InvalidPasswordException("Invalid Password!");
		}
	}
	
	
	

}
