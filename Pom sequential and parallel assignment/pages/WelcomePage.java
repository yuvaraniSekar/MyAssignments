package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	

	public Login clickLogout()  {
		//Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("logout"));
		driver.executeScript("arguments[0].click()", element);
		return new Login(driver);
	}
	
	public MyHomePage clickOnCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
