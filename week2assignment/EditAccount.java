package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditAccount {

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
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("rani");
		//click on find account
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(3000);
		//select the desired account
		driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();
		//click on edit 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear the name
		driver.findElement(By.id("accountName")).clear();
		//edit account name
		driver.findElement(By.id("accountName")).sendKeys("Rani");
		//clear the desc
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		//enter description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("selenium automation");
		//select industry type
		WebElement element = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select s1 = new Select(element);
		s1.selectByIndex(3);
		//click on save
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		//close the driver
		driver.close();

	}

}
