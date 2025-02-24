package week5assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");//load the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
		//Click on "Shop by Category".
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(2000);
		//Mouse over "Foodgrains, Oil & Masala".
WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Oil & Masala')])[2]"));
Actions act = new Actions(driver);
act.moveToElement(element).perform();
//Mouse over "Rice & Rice Products".
WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Rice')]"));
act.moveToElement(element2).perform();
//Click on "Boiled & Steam Rice".
driver.findElement(By.xpath("//a[contains(text(),'Boiled')]")).click();
//Filter the results by selecting the brand "bb Royal".
Thread.sleep(2000);
WebElement element3 = driver.findElement(By.id("i-BBRoyal"));
act.moveToElement(element3).click().perform();
//Click on "Tamil Ponni Boiled Rice".
Thread.sleep(3000);
WebElement element4 = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
act.moveToElement(element4).click().perform();
//window handle
Set<String> windowHandles = driver.getWindowHandles();
ArrayList<String> arrayList = new ArrayList<String> (windowHandles);
driver.switchTo().window(arrayList.get(1));
//Select the 5 Kg bag.  
Thread.sleep(2000);
WebElement element5 = driver.findElement(By.xpath("//span[text()='5 kg']"));
act.moveToElement(element5).click().perform();
//Check and note the price of the rice.
String text = driver.findElement(By.xpath("//td[contains(text(),'Price:')]")).getText();
System.out.println("Price of 5kg bag is : " + text);
//Click "Add" to add the bag to your cart.
driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
//Verify the success message that confirms the item was added to your cart.
//Take a snapshot of the current page
File source = driver.getScreenshotAs(OutputType.FILE);
File destination = new File("./snap/currentpage.png");
FileUtils.copyFile(source, destination);
//Close the current and main window
driver.quit();

	}

}
