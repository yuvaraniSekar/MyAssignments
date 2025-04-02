package runhooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/main/java/features/Accounts.feature",
		"src/main/java/features/Deleteaccount.feature", "src/main/java/features/Editaccount.feature"},
glue= {"stepdefinition", "hooksimplementation"},
monochrome = true, publish = true)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}
