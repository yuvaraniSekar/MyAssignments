package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
		//enter username
		driver.findElement(By.id("user_name")).sendKeys("admin");
		//enter pass
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		//click on login
		driver.findElement(By.id("sysverb_login")).click();
		//use shadow class
		Shadow shadow = new Shadow(driver);
		//click All
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		//elementByXPath2.click();
		//select service catalog
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		//elementByXPath.click();
		//click on mobile
		Thread.sleep(2000);
		WebElement elementByXPath = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elementByXPath);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.switchTo().defaultContent();
		//driver.executeScript("arguments[0].click()", element);
//		Actions act = new Actions(driver);
//		act.scrollToElement(element).click().build().perform();
		//Select Apple iphone13pro
		WebElement elementByXPath2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elementByXPath2);
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		driver.switchTo().defaultContent();
		//Choose yes option in lost or broken iPhone
		WebElement elementByXPath1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elementByXPath1);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		//Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("(//input[contains(@class,'cat_item_option')])[4]")).sendKeys("99");
		//Select Unlimited from the dropdown in Monthly data allowance
		driver.findElement(By.xpath("//span[@aria-label='Monthly data allowance']/following::div")).click();
		driver.findElement(By.xpath("//option[text()='Unlimited [add $4.00]']")).click();
		//Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		//Click on Order now option
		driver.findElement(By.xpath("//button[text()='Order Now']")).click();
		driver.switchTo().defaultContent();
		//Verify order is placed and copy the request number
		//driver.findElement(By.id(("requesturl")).
		//Take a Snapshot of order placed page	
		
		Thread.sleep(1000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/orderPlaced.png");
		FileUtils.copyFile(source, destination);
		
		

	}

}
