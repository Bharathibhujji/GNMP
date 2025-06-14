package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	 WebDriver driver;
	  @FindBy(className = "login")
	    private WebElement loginLink;

	    @FindBy(name = "email")
	    private WebElement emailInput;

	    @FindBy(name = "password")
	    private WebElement passwordInput;

	    @FindBy(name = "btn") 
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void openLoginForm() {
	        loginLink.click();
	    }

	    public void enterEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }

	    public void login(String email, String password) {
	        openLoginForm();
	        enterEmail(email);
	        enterPassword(password);
	        clickLoginButton();
	    }
	}