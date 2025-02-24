package week5assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationName extends ProjectSpecificMethod{
	
	@Test
	public void createName() {
		
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		
		//enter the name
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by yuvarani");
		//Click save and verify
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}

}
