package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Safari")).click();
		driver.findElement(By.linkText("American Tourister")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("s-result-sort-select"));
		Select s1 = new Select(element);
		s1.selectByVisibleText("Newest Arrivals");
		String text2 = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span")).getText();
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']/parent::span")).getText();
		System.out.println("Bag name is " + text2 +" and Price of bag is Rs" + text3);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
