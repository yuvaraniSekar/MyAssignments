package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/. .");
		driver.manage().window().maximize();
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
				//Enter company name using xpath
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
			    //Enter first name
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Yuva");
				//Enter last name
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("s");
				//Enter first name local
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Rani");
				//Enter dep name
				driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
				//Enter desc
				driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation");
				//Enter the email
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ysyuvaranis@gmail.com");
				//select state
				WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select s = new Select(element);
				s.selectByVisibleText("New York");
				//click on create 
				driver.findElement(By.className("smallSubmit")).click();
				//click on edit
				driver.findElement(By.linkText("Edit")).click();
				//Clear desc
				driver.findElement(By.id("updateLeadForm_description")).clear();
				//write text in important note field
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium in java");
				//click on update 
				driver.findElement(By.className("smallSubmit")).click();
				driver.getTitle();//get title of the result page
				driver.close();
				
				
	}

}
