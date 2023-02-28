package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class) 
	@CucumberOptions
		(
			features=".//Features/Search.feature",
					glue="stepDefinitions",
					dryRun=false,
					monochrome=true,
					plugin= {"pretty","html:target/HtmlReports"},
					tags= "@sanity"
		
		) 

	public class TestRun {
	 
	
}
