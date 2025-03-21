package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateAccount extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		readExcelFile = "CreateAccount";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreateAcc(String uName, String pwd, String aName, String desc, String nofEmp,
			String sName) throws InterruptedException {
		System.out.println(driver);
		Login lp = new Login(driver);
		lp.enterUname(uName).enterpwd(pwd).clickLogin().clickOnCrmsfa().clickAccount().clickCreateAccount()
		.enterAccname(aName).enterDesc(desc).enterNoOfEmp(nofEmp).enterSiteName(sName).clickCreateAcc().verifyAcc();
	}
}
