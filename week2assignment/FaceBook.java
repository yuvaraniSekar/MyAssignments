package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Yuvarani");
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("S");
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("9655757808");
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Yuva@2904");
		//Handle all three dropdowns in Date of birth
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(1);
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2015");
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Female']/input")).click();
	}

}
