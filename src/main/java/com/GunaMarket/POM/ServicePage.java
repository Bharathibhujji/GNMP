package com.GunaMarket.POM;

import java.time.Duration;

import org.openqa.selenium.By;
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

    // Remove this if not using anymore
    // @FindBy(xpath = "//a[contains(text(),'Explore Our Services')]")
    // private WebElement servicelink;

    @FindBy(id = "videoAdvertisement")
    private WebElement videoAdOption;

    @FindBy(xpath = "//input[@value='Activate']")
    private WebElement activateButton;

    public ServicePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        PageFactory.initElements(driver, this);
    }

    public void exploreService() {
        By serviceLinkLocator = By.xpath("//a[contains(text(),'Explore Our Services')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(serviceLinkLocator)).click();
    }

    public void clickVideoAdvertisement() {
        wait.until(ExpectedConditions.elementToBeClickable(videoAdOption)).click();
    }

    public void clickActivateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(activateButton)).click();
    }

    public void servicing() {
        exploreService();
        clickVideoAdvertisement();
        clickActivateButton();
    }
}