package practice_session;

public class PasswordStrengthChecker {

	public String checkPassword(String password) {
		if( password.length() == 5) {
			return "Strong";
		}else {
			return "Week";
		}
	}
}
