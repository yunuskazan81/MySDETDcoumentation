package com.orangehrm.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/AddEmployee.feature"
		,glue="com/orangehrm/steps"
		,dryRun=true
		,monochrome=true
		//,tags= {"@login"}
		)

public class TestRunner  { 

}
