package week6assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassParameter {

	public ChromeDriver driver;
	
	@Parameters({"url", "uName", "pwd"})
	@BeforeMethod
	public void preCondition(String url, String uName, String pwd) throws InterruptedException {
		
		 driver = new ChromeDriver();
		//locate the url
		driver.get(url);
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		//Enter username
		driver.findElement(By.id("username")).sendKeys(uName);
		//enter password
		driver.findElement(By.id("password")).sendKeys(pwd);
		//click on login
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		//click on menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//select view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		//click on legal entities
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()", element);
		//click on new
		driver.findElement(By.xpath("//div[@title='New']")).click();

	}
	@AfterMethod()
	public void postCondition() {
		driver.close();
		}
}
