package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="@rerun:src/main/resources/failed.txt", monochrome=true , glue="cucumber",plugin= {"html:target"})

	public class TestRunner2 {
		
}
