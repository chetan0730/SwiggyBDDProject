package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Swiggy.feature",
		glue="stepDefinations",
		dryRun = false,
		monochrome=true
		
		)
public class testRun {

}
