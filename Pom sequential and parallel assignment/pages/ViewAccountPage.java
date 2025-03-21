package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewAccountPage extends BaseClass{

	
	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewAccountPage verifyAcc() {
		String text = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		if(text.contains("Account")) {
			System.out.println("Account created successfully");
		}else {
			System.out.println("Account is not created");
		}
		return this;
	}
}
