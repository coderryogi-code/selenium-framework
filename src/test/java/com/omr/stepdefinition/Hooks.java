package com.omr.stepdefinition;

import org.openqa.selenium.TakesScreenshot;

import com.frameworks.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	@Before
	public void setup() {	
		System.out.println("Before...");
		browserLaunch();
		enterApplicationUrl("https://omrbranch.com/");
		implicitWait(10);
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("After...");
		scenario.attach(takeScreenshotInByte(), "image/png",scenario.getName());
		driver.manage().deleteAllCookies();
		closeTheWindow();
	}

}
