package week6assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class StaticParameter extends BaseClassParameter{
	@Test
	public void sParameter() throws InterruptedException {
				//Enter the Company name as 'TestLeaf'
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		//Enter Description as 'Salesforces'.
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		//Select Status as 'Active'
		WebElement element1 = driver.findElement(By.xpath("//div[@role='none']"));
		driver.executeScript("arguments[0].click()", element1);
		//click on active
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//click on save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//handle alert
		driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Yuva");
		
		
	}

}