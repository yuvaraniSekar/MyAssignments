package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunLogin extends BaseClass{
	
	@Test
	public void runLogin() {
	
		Login lp1 = new Login(driver);
		lp1.enterUname().enterpwd().clickLogin().clickOnCrmsfa();
	}
}
