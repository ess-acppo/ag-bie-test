/**************************************
 * 	Author		:	Mayur Thakur
 *  Date 		:	15/05/2018
 * 	Purpose 	:	Testing AgBie - Setting up Environments 
 *  Version 	:	1.5.1
 * 	Functions 	: 	Common Before and After Methods 
 **************************************/

package com.cucmber.AgBie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfter {

	public static String URL;
	public static Scenario scenarios;
	public static WebDriver drivers;

	@Before(order = 1)
	public void Initialise(Scenario scenario) throws IOException {

		System.out.println("---------GLOBAL TEST ENVIRONMENT---------");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "BROWSERS" + File.separator + "geckodriver.exe");

		/* CONFIG Properties */
		Properties p = new Properties();
		InputStream input = null;
		File f = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "config.properties");
		input = new FileInputStream(f);
		p.load(input);
		URL = p.getProperty("URL");

		drivers = new FirefoxDriver();
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@After(order = 1)
	public void GlobalTestTearDown(Scenario scenarios) {

		scenarios.write("Finished Scenario :" + scenarios.getName());
		if (scenarios.isFailed()) {
			// take ScreenShot
			{
				System.out.println("---Test has Failed---");
				final byte[] screenshot = ((TakesScreenshot) drivers).getScreenshotAs(OutputType.BYTES);
				scenarios.embed(screenshot, "image/png"); // stick it in the report

			}
		}
		drivers.quit();
		System.out.println("--------Test Environment Closed--------");
		System.out.println("---------------------------------------");

		
	}

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