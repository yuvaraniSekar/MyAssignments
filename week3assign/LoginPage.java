package week3.assign;

public class LoginPage extends BasePage{
	
	
	//@Override
	public void performCommonTask() {
		// TODO Auto-generated method stub
		//super.performCommonTask();
		System.out.println("Perform common task in login");
	}

	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		
		login.clickElement();
		login.findElement();
		login.enterText();
		login.performCommonTask();
}
}
