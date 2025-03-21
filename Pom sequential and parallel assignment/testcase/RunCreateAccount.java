package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateAccount extends BaseClass{
	
	@Test
	public void runCreateAcc() throws InterruptedException {
		System.out.println(driver);
		Login lp = new Login(driver);
		lp.enterUname().enterpwd().clickLogin().clickOnCrmsfa().clickAccount().clickCreateAccount().enterAccname()
		.enterDesc().enterNoOfEmp().enterSiteName().clickCreateAcc().verifyAcc();
	}
}
