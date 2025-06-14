package com.GunaMarket.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWebsitePages {
WebDriver driver;
@FindBy(xpath="//a[text()='Home']")
WebElement home;

@FindBy(xpath="//h4[text()='Website Service']")
WebElement webSite;

@FindBy(className="cta-btn")
WebElement button;

@FindBy(xpath="//h3[text()='Web Design']")
WebElement webDesign;

@FindBy(xpath="//h3[text()='E-Commerce']")
WebElement commerce;

@FindBy(xpath="//h3[text()='SEO Optimization']")
WebElement optimization;

public  HomeWebsitePages(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public void homeButton() {
	home.click();
}
public void webservice() {
	webSite.click();
}
public void getButton() {
	button.click();
}
public void design() {
	webDesign.click();
}
public void ecommerce() {
	commerce.click();
}
public void seoOptimization() {
	optimization.click();
}
/*public void webSiteServices() {
	home.click();
	webSite.click();
	
	button.click();
	
	webDesign.click();
	
	commerce.click();
}*/
public void webSiteServices() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    home.click();
    webSite.click();
    wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    webDesign.click();
    Thread.sleep(1000);
    commerce.click();
    Thread.sleep(1000);
    optimization.click();
}
}
