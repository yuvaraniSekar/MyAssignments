package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on account 
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//clcik on find account
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		
		//search the account  name
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("yuva");
		//click on find account
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		//select the desired account
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//driver.executeScript("arguments[0].click", element);
		//delete account
		driver.findElement(By.xpath("//a[text()='Deactivate Account']")).click();
		//handle alert
		driver.switchTo().alert().accept();
		//close the browser
		driver.close();
		
		

	}

}
