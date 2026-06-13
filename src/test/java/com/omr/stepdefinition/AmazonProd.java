package com.omr.stepdefinition;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import utilities.BaseClass;

import io.cucumber.java.en.*;

public class AmazonProd extends BaseClass{

	@Given("user is on the amazon page")
	public void userIsOnTheAmazonPage() {
		browserLaunch();
        enterApplicationUrl("https://www.amazon.in/ref=nav_logo");
	}
	@When("user search product name")
	public void userSearchProductName(io.cucumber.datatable.DataTable dataTable) {
		//List <String> asList = dataTable.asList();
		Map<String, String> asMap = dataTable.asMap();
		String v = asMap.get("Laptop");
		WebElement search = findLocatorById("twotabsearchtextbox");
		//sendKeysElement(search, v);
		search.sendKeys(v);
	}
	@Then("user should verify same product is listed")
	public void userShouldVerifySameProductIsListed() throws Exception {
		Thread.sleep(5);
		//closeTheWindow();
	}



	
}
