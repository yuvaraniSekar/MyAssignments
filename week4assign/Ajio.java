package week4assign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");//locate the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));//Implicit wait 
		//enter in search field
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER); 
		//click on gender
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(2000);
		//select fashion bag
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(2000);
		//locate the items found
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);// print the item
		//driver.findElement(By.xpath("//span[text()='brands']")).click();
		//locate list of brand and print
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		for (int i = 0; i < elements.size(); i++) {
			String text2 = elements.get(i).getText();
			System.out.println(text2);
			
		}
		//locate list of names of bag and print it
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement name : elements2) {
			String text3 = name.getText();
			System.out.println(text3);
			
		}
	}

}
