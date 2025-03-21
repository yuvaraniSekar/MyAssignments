package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyAccountPage clickAccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();	
		return new MyAccountPage(driver);
	}
	
}
