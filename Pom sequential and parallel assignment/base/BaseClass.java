package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void preCond()
	{
		driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	@AfterMethod
	public void postCond() {
		driver.close();
	}
}
