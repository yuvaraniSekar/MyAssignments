package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage enterAccname() {
		driver.findElement(By.id("accountName")).sendKeys("yrani");
		return this;
	}
	public CreateAccountPage enterDesc(){
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		return this;
	}
	public CreateAccountPage enterNoOfEmp(){
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		return this;
		}
	public CreateAccountPage enterSiteName() {
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		return this;
	}
	public ViewAccountPage clickCreateAcc() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewAccountPage(driver);
	}
}
