package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyAccountPage extends BaseClass{
	
	public MyAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage clickCreateAccount() {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		return new CreateAccountPage(driver);
	}

}
