package com.GunaMarket.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a[contains(.,'Explore Our Services')]\")")
    private WebElement servicelink; 

    @FindBy(id = "videoAdvertisement")
    private WebElement videoAdOption;

    @FindBy(xpath = "//input[@value='Activate']")
    private WebElement activateButton;

    public ServicePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void exploreService() {
        wait.until(ExpectedConditions.visibilityOf(servicelink));
        servicelink.click();
    }

    public void clickVideoAdvertisement() {
        wait.until(ExpectedConditions.elementToBeClickable(videoAdOption));
        videoAdOption.click();
    }

    public void clickActivateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(activateButton));
        activateButton.click();
    }

    // Combined flow
    public void servicing() {
        exploreService();
        clickVideoAdvertisement();
        clickActivateButton();
    }
}