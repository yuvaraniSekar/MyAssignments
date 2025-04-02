package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DeleteAccount extends BaseClass{
	
	@When("Click on Delete button")
	public void click_on_delete_button() {
		driver.findElement(By.xpath("//a[text()='Deactivate Account']")).click();
	}

	@When("handle alert message")
	public void handle_alert_message() {
		driver.switchTo().alert().accept();
	}




}
