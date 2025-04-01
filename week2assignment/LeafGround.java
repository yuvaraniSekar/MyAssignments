package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		//navigate to main page
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		boolean enabled = driver.findElement(By.xpath("(//button[@type='button'])[2]")).isEnabled();
		System.out.println(enabled);
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(cssValue);
//		Point location2 = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getLocation();
//		System.out.println(location2);
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size);
		driver.close();

	}

}
