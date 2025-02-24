package week5assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		driver.findElement(By.xpath("//table[@data-testid='table-container']"));
		List<WebElement> elements = driver.findElements(By.xpath("//table[@data-testid='table-container']/tbody/tr/td[2]"));
		for (WebElement name : elements) {
			System.out.println(name.getText());
		}

	}

}
