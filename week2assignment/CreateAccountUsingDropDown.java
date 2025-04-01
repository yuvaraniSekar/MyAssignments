package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingDropDown {

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
		//select accounts
		driver.findElement(By.linkText("Accounts")).click();
		//click on create account
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter account name
		driver.findElement(By.id("accountName")).sendKeys("Yuvarani D");
		//Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//select from industry
		WebElement ind = driver.findElement(By.name("industryEnumId"));
		Select s = new Select(ind);
		s.selectByIndex(3);
		//select from ownership
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select s2 = new Select(own);
		s2.selectByVisibleText("S-Corporation");
		//select from source
		WebElement sou = driver.findElement(By.id("dataSourceId"));
		Select s3 = new Select(sou);
		s3.selectByValue("LEAD_EMPLOYEE");
		//Select from market
		WebElement mark = driver.findElement(By.id("marketingCampaignId"));
		Select s4 = new Select(mark);
		s4.selectByIndex(6);
		//Select state
		WebElement sta = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s5 = new Select(sta);
		s5.selectByValue("TX");
		//click on create account
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
