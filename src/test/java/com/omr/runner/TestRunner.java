package com.omr.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omr.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)

@CucumberOptions(dryRun = false, snippets = SnippetType.CAMELCASE, stepNotifications = true, publish = true, monochrome = true, plugin = {
	    "pretty", "json:target/output.json" }, name = {
	        "Amazon Product Search" }, glue = "com.omr.stepdefinition", features = "src/test/resources")

public class TestRunner {
	
	@AfterClass
	  public static void afterClass() {
	    Reporting.generateJvmReport("/Users/yogeshpraveen/Testing/Cucumber/target/output.json");
	  }
}
