package com.omr.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.frameworks.utility.BaseClass;
import com.omr.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class FeatureLoginStep extends BaseClass{
	WebDriver driver;
	
    LoginPage loginPage = new LoginPage();

	@Given("User is on GreensOMR Page")
	public void user_is_on_greens_omr_page() {
		browserLaunch();
        enterApplicationUrl("https://omrbranch.com/");
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String user, String pass) {
		 loginPage.enterUsername(user);
       loginPage.enterPassword(pass);
	}


	@And("User clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
        loginPage.clickLogin();
        Thread.sleep(3000);
	}
	
	@Then("User should verify welcome message after login")
	public void user_should_verify_welcome_message_after_login() {
		String actualText = loginPage.getWelcomeMessageText();

	    Assert.assertTrue("Welcome message not displayed",
	            actualText.contains("Welcome"));
//	    Assert.assertTrue("verified after login",true);
		closeTheWindow();
	}

}
