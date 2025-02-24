package week4assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Merge Contacts.
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//window handle
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<String> (windowHandles);
		driver.switchTo().window(arrayList.get(1));
		//Click on the first resulting contact.
		
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		//switch to original window
		driver.switchTo().window(arrayList.get(0));
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//window handle
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String> (windowHandles2);
		driver.switchTo().window(arrayList1.get(1));
		//Click on the second resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		//switch to original window
		driver.switchTo().window(arrayList1.get(0));
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept the alert.
		driver.switchTo().alert().accept();
		//Verify the title of the page.
		
		

	}

}
