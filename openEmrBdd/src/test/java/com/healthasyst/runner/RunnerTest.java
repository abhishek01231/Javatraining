package com.healthasyst.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/login.feature",
						glue="com.healthasyst.stepdefination",
						monochrome=true,
						publish=true
					//dryrun=false	
				)
public class RunnerTest {

}
