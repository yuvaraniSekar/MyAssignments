package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select 'Your most favourite browser'
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		//click on the radio button 
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		//click on the same radio button again to verify that it becomes ‘unselected’
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();

		//Identify the radio button that is initially selected by default.
		boolean selected = driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')])[4]")).isEnabled();
		System.out.println(selected);
		//Check and select the age group (21-40 Years) if not already selected.
		boolean selected2 = driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')])[5]")).isEnabled();
		System.out.println(selected2);
		driver.close();
	}

}
