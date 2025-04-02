package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class EditAccount extends BaseClass{
	
	@When("Click on find account")
	public void click_on_find_account() {
	driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();   
	}

	@When("Enter the account name to search")
	public void enter_the_account_name_to_search() {
	driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("yuva");   
	}
	
	@When("Click on search account")
	public void click_on_search_account() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}

	@When("Select the desired account")
	public void select_the_desired_account() throws InterruptedException {
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();;
	}
	@When("Click on edit button")
	public void click_on_edit_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}

	@When("Clear the name")
	public void clear_the_name() {
		driver.findElement(By.id("accountName")).clear();
	}

	@When("enter the name in edit field")
	public void enter_the_name_in_edit_field() {
		driver.findElement(By.id("accountName")).sendKeys("yuva");
	}

	@When("Clear the description")
	public void clear_the_description() {
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	}

	@When("enter the descriiption")
	public void enter_the_descriiption() {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("selenium automation");
	}

	@When("click on save")
	public void click_on_save() {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}


}
