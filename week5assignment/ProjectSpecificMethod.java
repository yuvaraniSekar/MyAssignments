package week5assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
public RemoteWebDriver driver;
	
	@BeforeMethod
	public void preCondition() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");//locate the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Implicit wait 
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();//click on menu
		driver.findElement(By.xpath("//button[text()='View All']")).click();//select view all
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));//click on legal entities
		driver.executeScript("arguments[0].click()", element);
		
		
	}
	@AfterMethod
	public void postCondition() {
	driver.close();	
	}
}
