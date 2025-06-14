package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {


	    private WebDriver driver;

	    @FindBy(xpath = "//a[text()='Explore Our Services']")
	    private WebElement servicelink; 

	    @FindBy(id = "videoAdvertisement")
	    private WebElement videoAdOption;

	    @FindBy(xpath = "//input[@value='Activate']")
	    private WebElement activateButton;

	    public ServicePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void exploreService() {
	        servicelink.click();
	    }

	    public void clickVideoAdvertisement() {
	        videoAdOption.click();
	    }

	    public void clickActivateButton() {
	        activateButton.click();
	    }

	    // Combined flow
	    public void servicing() {
	        exploreService();
	        clickVideoAdvertisement();
	        clickActivateButton();
	    }
	}
	









