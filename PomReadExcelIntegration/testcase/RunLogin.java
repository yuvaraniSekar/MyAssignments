package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		readExcelFile = "Login";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uName, String pwd) {
	
		Login lp1 = new Login(driver);
		lp1.enterUname(uName).enterpwd(pwd).clickLogin().clickOnCrmsfa();
	}
}
