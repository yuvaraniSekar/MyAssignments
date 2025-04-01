package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
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
		//Click on the "Create Account" button.
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("yuvarani");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Close the browser window.
		driver.close();

	}

}
