package com.basic.GoogleTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//don't forget to write / at the end 
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"src/test/resources/com/basic/B17GoogleTest/"},
		glue={"com/basic/GoogleTest/"}
		)

public class RunMyGoogleTest {	
	
}
