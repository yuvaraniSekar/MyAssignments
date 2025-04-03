package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		Actions act = new Actions(driver);
		// MouseHover on 'Brands'
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(element2).build().perform();
		//MouseHover on 'Watches & Accessories'
		WebElement element3 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(element3).build().perform();
		//driver.findElement(By.xpath("//div[text()='Vark']")).click();
		//Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		// Select sortby: New Arrivals
		WebElement element = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select s1 = new Select(element);
		s1.selectByIndex(3);
		//choose men from catagories filter.
		driver.findElement(By.xpath("//div[text()='Men']/parent::div")).click();
		Thread.sleep(2000);
		//print all price of watches
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			System.out.println("Price of the watches are" + text);
			}
		//click on the first resulting watch.
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		//window handle
		Set<String> childWindow = driver.getWindowHandles();
		//convert to list
		ArrayList<String> listWindow = new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		//click Add to cart 
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		//get count from the cart icon.
		String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(text);
		//
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//compare two price are similar
		
		Thread.sleep(3000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/result.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		
	}

}
