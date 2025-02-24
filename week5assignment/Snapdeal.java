package week5assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");//load the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
		//Go to "Men's Fashion".
		WebElement element = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		//Go to "Sports Shoes".
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		act.click(element2).perform();
		//Get the count of sports shoes.
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(text);
		//Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//Sort the products by "Low to High".
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()[normalize-space()='Price Low To High']]")).click();
		//select price range
		WebElement element3 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		element3.clear();
		element3.sendKeys("500");
		WebElement element4 = driver.findElement(By.xpath("//input[@name='toVal']"));
		element4.clear();
		element4.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		//Filter by any color.
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//a[contains(text(),'White & Blue')]"));
		act.moveToElement(element5).click().perform();
		//Verify all the applied filters.
		//Mouse hover on the first resulting "Training Shoes".
		Thread.sleep(2000);
		WebElement element6 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(element6).perform();
		//Click the "Quick View" button.
		driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]")).click();
		//Print the cost and the discount percentage.
		String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost is :" + text2);
		String text3 = driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		System.out.println("Discount: " + text3);
		//Take a snapshot of the shoes.
		WebElement shoe = driver.findElement(By.id("bx-slider-qv-image-panel"));
		File source = shoe.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/shoe.png");
		FileUtils.copyFile(source, destination);
		//Close the current and main window.
		driver.quit();
	}

}
