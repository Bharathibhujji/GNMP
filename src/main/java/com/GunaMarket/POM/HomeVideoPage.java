package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeVideoPage {
 WebDriver driver;
 @FindBy(xpath="//a[text()='Home']")
 WebElement home;
 
 @FindBy(className="service-card")
 WebElement servicecard;
 
 @FindBy(className="cta-button")
 WebElement button;
 
 public HomeVideoPage(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);
 }
 
 public void homeVideo() {
	 home.click();
	 servicecard.click();
	 button.click();
	 }

}
