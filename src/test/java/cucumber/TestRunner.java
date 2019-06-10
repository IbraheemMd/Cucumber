package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Addcustomerlist.feature", dryRun=false , strict=true,monochrome=true,
tags= {} ,  glue="cucumber1",plugin= "json:src/test/resources/report.jason")
public class TestRunner {

}
