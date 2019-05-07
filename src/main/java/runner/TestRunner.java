package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/chayanikaghosh/Documents/BDDCucumberSeleniumFramework/src/main/java/features", //the path of the feature files
		glue={"stepDefinitions"} //the path of the step definition files
		)
 
public class TestRunner {
 
}

  