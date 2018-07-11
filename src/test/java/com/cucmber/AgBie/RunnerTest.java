/**************************************
 * 	Author		:	Mayur Thakur
 *  Date 		:	10/03/2018
 * 	Purpose 	:	Testing Agbie - Runner class
 *  Version 	:	1.5.1
 * 	Functions 	: 	Running Feature Files and generating reports 
 **************************************/

package com.cucmber.AgBie;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { 
		"classpath:AgBiePageSmokeTest.feature"
		
}, 
					tags = { "@All" }, 
					plugin = { "pretty:target/cucumber-html-report", 
								"html:target/cucumber-htmlreport",
								"json:target/cucumber.json", 
								"junit:target/cucumber-results.xml" })
public class RunnerTest {

	
}
/**************************************
 * Change LOG 
 * CHANGED BY 	Version	Changes 
 * Mayur Thakur	0.1		Written new File 
 * Mayur Thakur 1.0 	Added HTML reports Functionality 
 * Mayur Thakur 1.1 	Added Extent Reports 
 * Mayur Thakur 1.2		Added Screen Shot functionality 
 * Mayur Thakur 1.3 	Attach Screen shots With Reports 
 * Mayur Thakur 1.4 	Added Tagged run 
 * Mayur Thakur 1.5 	Refactoring 
 * Mayur Thakur 1.5.1	Comments
 **************************************/
