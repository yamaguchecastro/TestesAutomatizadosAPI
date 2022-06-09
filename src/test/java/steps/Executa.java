package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@executa",
		plugin = {"pretty", "html:target/report.html"},
		monochrome = true,
		dryRun = false 
		
		
		
		)



public class Executa {

}
