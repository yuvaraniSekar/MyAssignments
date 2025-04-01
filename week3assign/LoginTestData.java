package week3.assign;

public class LoginTestData implements TestData{

	@Override
	public void enterCredentials() {
		System.out.println("Enter the Credentials");
		
	}

	@Override
	public void navigateToHomePage() {
		System.out.println("Navigate to home page");
		
	}
	
	public void enterUsername() {
		System.out.println("Enter the username");
	}
	public void enterPassword() {
		System.out.println("Enter the password");
	}
	public static void main(String[] args) {
		
LoginTestData obj = new LoginTestData();
obj.enterCredentials();

obj.enterUsername();
obj.enterPassword();
obj.navigateToHomePage();
	}


}
