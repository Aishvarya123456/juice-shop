package org. runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 tags="@all",plugin= {"html:src\\test\\resources\\Reports\\HtmlReport",
                		               "json:src\\test\\resources\\Reports\\JsonReport\\jsonreport.json"}
                 )
	        
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JvmReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\jsonreport.json");
	}
	
	
}
