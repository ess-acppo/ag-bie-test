/**************************************
 * 	Author		:	Mayur Thakur
 *  Date 		:	10/03/2018
 * 	Purpose 	:	Smoke Tests for Agbie
 *  Version 	:	1.5.1
 * 	Functions 	: 	Step Definitions for AgbiePageSmokeTest.feature
 **************************************/

package com.cucmber.AgBie;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgBiePageSmokeTest {

	WebDriver driver;
	Scenario scenario;
	String URL = BeforeAfter.URL;
	
	@Before("@Smoke")
	public void Setup(Scenario scenario) {


		driver=BeforeAfter.drivers;
	}

	@After("@Smoke")
	public void teardown(Scenario scenario) throws IOException {
		
		BeforeAfter.drivers=driver;
		BeforeAfter.scenarios=scenario;
		
	}

	@Given("^Go to URL$")
	public void go_to_URL() throws Throwable {

		driver.get(URL);
	}

	@When("^I do search$")
	public void i_do_search() throws Throwable {
		
		driver.findElement(By.cssSelector("[id = 'search']")).sendKeys("acacia");
		driver.findElement(By.cssSelector("[type ='submit']")).click();
		Thread.sleep(2000);

	}

	@When("^select a record$")
	public void select_a_record() throws Throwable {

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='scientific-name rank-genus']")).click();

	}

	@Then("^should be able to visit Overview tab$")
	public void should_be_able_to_visit_Overview_tab() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.linkText("Overview")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Overview")).isDisplayed());
	}

	@Then("^should be able to visit Names tab$")
	public void should_be_able_to_visit_Names_tab() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.linkText("Names")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Names")).isDisplayed());
	}

	@Then("^should be able to visit Classification tab$")
	public void should_be_able_to_visit_Classification_tab() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Classification")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Classification")).isDisplayed());
	}

	@Then("^should be able to visit Literarture tab$")
	public void should_be_able_to_visit_Literarture_tab() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Literature")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Literature")).isDisplayed());
	}

	@Then("^should be able to visit Sequences tab$")
	public void should_be_able_to_visit_Sequences_tab() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sequences")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Sequences")).isDisplayed());
	}

	@Then("^Refine search on Species$")
	public void refine_search_on_Species() throws Throwable {
		Thread.sleep(2000);
		System.out.println("inside species ");
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li[1]/a")).click();
		Assert.assertTrue(
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li/a/span")).isDisplayed());
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li/a/span")).click();

	}

	@Then("^Refine search on Common Name$")
	public void refine_search_on_Common_Name() throws Throwable {
		Thread.sleep(2000);
		System.out.println("inside Common Name ");
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li[2]/a"))
						.isDisplayed());
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div/ul/li/a/span")).click();

	}

	@Then("^Refine search on TaxonStatus Accepted$")
	public void refine_search_on_TaxonStatus_Accepted() throws Throwable {

		Thread.sleep(2000);
		System.out.println("inside TaxonStatus Accepted ");
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[4]/ul/li[1]/a"))
						.isDisplayed());
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[4]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li/a/span")).click();

	}

	@Then("^Refine search on TaxonStatus Synonym$")
	public void refine_search_on_TaxonStatus_Synonym() throws Throwable {

		Thread.sleep(2000);
		System.out.println("inside TaxonStatus Synonym");
		Assert.assertTrue(
				driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[4]/ul/li[2]/a"))
						.isDisplayed());
				
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[4]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div/div/div[1]/ul/li/a/span")).click();

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

