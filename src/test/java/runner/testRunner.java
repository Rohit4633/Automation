package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin={"pretty","html:target/testReport/report.html"},glue=("stepDefination"),tags="")
public class testRunner {
	
}
	
	//features=path of features package-login
	//glue=path or name of steps defination package
	//tags= we will put tags on scenarios in feature file then we will ad the required tag in tag option
    //plugin-reports
	//dryrun=true(it runs only if all steps are mapped)/false(runs if unmapped
	//monochrome= it converts console outputs in readable form
	//prertty is a format of file like json	
	

