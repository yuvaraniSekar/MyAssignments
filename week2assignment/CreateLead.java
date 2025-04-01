package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");//open the url
		driver.manage().window().maximize();//max the window
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm 
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on leads
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvarani");
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		//Enter the title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Test leaf");
		//Click on create lead
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();//Close the browser
		

	}

}
