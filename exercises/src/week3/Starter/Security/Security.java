package week3.Starter.Security;

public class Security {

	// returns a 'SecurityStatus' object comprising a
	// boolean representing success and a String errorMessage.
	public SecurityStatus logon(String userId, String password) {

		SecurityStatus securityStatus = new SecurityStatus(false, "");

		// validation will happen here
		if (userId == null || userId.trim().equals("")){
			securityStatus.setErrMessage("User ID cannot be null or empty");
			securityStatus.setSuccess(false);
		}
		else if (password == null || password.trim().equals("")){
			securityStatus.setErrMessage("Password cannot be null or empty");
			securityStatus.setSuccess(false);
		}
		else if (!validatePassword(password)){
			securityStatus.setErrMessage("Password must be 8 characters or longer");
			securityStatus.setSuccess(false);
		}
		else {
			securityStatus.setSuccess(true);
		}
		return securityStatus;
	}

	public boolean validatePassword(String password){
		boolean hasUpper = false, hasDigit = false;
		if (password.trim().length() < 8){
			return false;
		}
		for (char c : password.toCharArray()){
			if (Character.isDigit(c)){
				hasDigit = true;
				continue;
			}
			if (Character.isUpperCase(c)){
				hasUpper = true;
			}
		}
		return hasDigit && hasUpper;
	}
}
