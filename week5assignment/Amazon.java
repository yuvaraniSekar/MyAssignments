package week5assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");//locate the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
		WebElement element2 = driver.findElement(By.id("twotabsearchtextbox"));//locate search box
		Actions act = new Actions(driver);//declaring action class
		act.sendKeys(element2, "oneplus 9 pro",Keys.ENTER).perform();//enter in search box
		
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();//get the price
		System.out.println(text);
		Thread.sleep(2000);
//		WebElement element = driver.findElement(By.xpath("//span[contains(@class,'weight-text')]"));
//	String text2 = element.getText();
//	System.out.println("no of customer rated:" + text2);
		WebElement element3 = driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-star-small a-star-small')])[1]"));
		act.moveToElement(element3).click().perform();//locate customer rating
		String text2 = driver.findElement(By.xpath("//span[@data-hook='total-review-count']")).getText();//get rating in text
		
		System.out.println(text2);//print stm
		WebElement element = driver.findElement(By.xpath("(//h2[contains(@class,'text-normal')])[2]/span"));//locate first text of image
		act.click(element).perform();
		Set<String> childWindow = driver.getWindowHandles();
		//convert set to list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to child 
		driver.switchTo().window(listWindow.get(1));
//		String windowHandle1 = driver.getWindowHandle();
//		System.out.println(windowHandle1);
//		String title = driver.getTitle();
//		System.out.println(title);
		WebElement product = driver.findElement(By.id("landingImage"));//locate product to take ss
		File source = product.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/product.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		driver.close();
		
	}

}
