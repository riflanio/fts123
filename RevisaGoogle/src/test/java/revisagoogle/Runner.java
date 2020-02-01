package revisagoogle;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		monochrome = true,
		features = {"src/test/resources/"},
		glue = {"revisagoogle/"},
		plugin = {"pretty",
				"html:target/relatorio1.html",
				"json:target/relatorio1.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatório2.html"
				
		}
		
		
)
public class Runner {

}
