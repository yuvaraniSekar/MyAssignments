package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Click on your favorite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[8]")).click();
		//Click on the "Toggle Switch."
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		//Select multiple options on the page
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu')]")).click();
		//Perform any additional actions or verifications required
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		//close driver
		driver.close();
		
	}

}
