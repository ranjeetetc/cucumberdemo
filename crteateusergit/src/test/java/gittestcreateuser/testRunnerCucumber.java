package gittestcreateuser;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features= {"src/main/resources"},
		glue={"stepdefination"},
		tags= {"@FirstCustome"})						
public class testRunnerCucumber {
	
}
