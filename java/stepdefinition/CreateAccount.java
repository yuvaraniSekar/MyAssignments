package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass{
	
	
	@When("Enter the username as {string}")
	public void enter_the_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on accounts tab")
	public void click_on_accounts_tab() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	}

	@When("click on create account button")
	public void click_on_create_account_button() {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}

	@When("enter the account name as {string}")
	public void enter_the_account_name_as(String name) {
		driver.findElement(By.id("accountName")).sendKeys(name);
	}

	@When("enter the description as {string}")
	public void enter_the_description_as(String desc) {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc);
	}

	@When("enter the no of employees {string}")
	public void enter_the_no_of_employees(String nEmp) {
		driver.findElement(By.id("numberEmployees")).sendKeys(nEmp);
	}

	@When("enter the site name as {string}")
	public void enter_the_site_name_as(String sName) {
		driver.findElement(By.id("officeSiteName")).sendKeys(sName);
	}
	@When ("click on create account")
	public void click_on_create_account() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

	@Then("Verify the account created page")
	public void verify_the_account_created_page() {
	String text = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
	if (text.contains("Account Details")) {
		System.out.println("Account created successfully");
	} else {
System.out.println("Account not created successfully");
	}
	
	}


}
