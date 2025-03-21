package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunLogout extends BaseClass{
	
	@Test
	public void runLogout() {
		Login lp2 = new Login(driver);
		lp2.enterUname().enterpwd().clickLogin().clickLogout();
	}

}
