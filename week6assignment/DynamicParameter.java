package week6assignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameter extends BaseClassParameter{
	
	@Test(dataProvider = "fetchData")
	public void dParameter(String name) {
	
		//enter the name
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
		//Click save and verify
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}
	@DataProvider(name = "fetchData")
	public String[][] data() {
		
		String[][] name = new String[3][1];
		
		name[0][0]= "Yuvarani";
		name[1][0]= "Rosy";
		name[2][0] = "Monisha";
		
		return name;
	}

}
