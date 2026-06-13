package com.omr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.frameworks.utility.BaseClass;

public class LoginPage extends BaseClass {

    private By email = By.id("email");
    private By password = By.id("pass");
    private By loginBtn = By.xpath("//button[@value='login']");
    private By welcomeMsg = By.xpath("//div[@class='text-center mb-5']/h5[@class='font35 font-weight-bold color11 welcome-heading']");


    // Getters
    public WebElement getEmail() {
        return visibilityOfElementbyLocator(email);
    }
    
    public String getWelcomeMessageText() {
        return getTextElement(visibilityOfElementbyLocator(welcomeMsg));
    }

    public WebElement getPassword() {
        return visibilityOfElementbyLocator(password);
    }

    public WebElement getLoginBtn() {
        return visibilityOfElementbyLocator(loginBtn);
    }
    
    public void enterUsername(String user) {
        sendKeysElement(getEmail(), user);
    }

    public void enterPassword(String pass) {
        sendKeysElement(getPassword(), pass);
    }

    public void clickLogin() {
        clickElement(getLoginBtn());
    }

    // Actions
    public void login(String user, String pass) {
//        sendKeysElement(getEmail(), user);
//        sendKeysElement(getPassword(), pass);
//        clickElement(getLoginBtn());
    	
    	enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}
