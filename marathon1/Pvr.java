package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		//driver.findElement(By.className("p-dropdown-label p-inputtext p-placeholder")).click();
		//driver.findElement(By.className("cities-overlay cities-active")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'INOX National,Virugambakkam')]")).click();
		//WebElement element = driver.findElement(By.xpath("//div[@id='cinema']//following::select"));
		//Select s1 = new Select(element);
		//s1.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("movie")).click();
		driver.findElement(By.xpath("(//span[text()='SIKANDAR'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		driver.findElement(By.xpath("//span[text()='01:00 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[text()='17'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String text = driver.findElement(By.xpath("//p[text()='SILVER']/following::p")).getText();
		System.out.println("Seat No:" + text);
		String text2 = driver.findElement(By.xpath("(//div[contains(@class,'grand-tota')])[3]")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[1]"));
		driver.executeScript("arguments[0].click()", element);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
