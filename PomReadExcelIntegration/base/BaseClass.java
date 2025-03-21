package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {

	public ChromeDriver driver;
	 public String readExcelFile;
	
	
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
	
	@DataProvider(name = "fetchData", parallel = true)
	public String[][] sendData() throws IOException {
//		ReadExcel re = new ReadExcel();
//		re.receiveData();
		
		return ReadExcel.receiveData(readExcelFile);
	}
}
