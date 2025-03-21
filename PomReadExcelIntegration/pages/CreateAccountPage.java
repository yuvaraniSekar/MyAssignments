package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage enterAccname(String aName) {
		driver.findElement(By.id("accountName")).sendKeys(aName);
		return this;
	}
	public CreateAccountPage enterDesc(String desc){
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc);
		return this;
	}
	public CreateAccountPage enterNoOfEmp(String nofEmp){
		driver.findElement(By.id("numberEmployees")).sendKeys(nofEmp);
		return this;
		}
	public CreateAccountPage enterSiteName(String sName) {
		driver.findElement(By.id("officeSiteName")).sendKeys(sName);
		return this;
	}
	public ViewAccountPage clickCreateAcc() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewAccountPage(driver);
	}
}
