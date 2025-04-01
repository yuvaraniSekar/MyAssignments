package week2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//verify that the title of the page is ‘dashboard
		//wiondow Handle
		driver.navigate().back();
//		Set<String> windowHandles = driver.getWindowHandles();
//		ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
//		driver.switchTo().window(arrayList.get(0));
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getLocation();
		System.out.println(location);
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValue = driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getCssValue("background-color");
		System.out.println(cssValue);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize();
		System.out.println(size);
		//close the browser
		driver.close();

	}

}
