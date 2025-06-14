package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeImage {
	private WebDriver driver;
	@FindBy(xpath="//a[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//h4[text()='Image Advertisement Service']")
	WebElement ImageAds;
	
	@FindBy(className="ad-text")
	WebElement Ads;
	
	@FindBy(xpath="//div[text()='Limited Time Deal!']")
	WebElement LimitedDeal;
	
	@FindBy(xpath="//div[text()='New Arrival - Shop Now']")
	WebElement  newArrivals;
	
	@FindBy(xpath="//div[text()='Huge Discounts on Hand Bags']")
	WebElement HugeDiscount;

	
	
	public HomeImage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	public void homeButton() {
		home.click();
	}
	public void ImageAdvertisement() {
		ImageAds.click();
	}
    public void AdText() {
    	Ads.click();
    }
    public void limitedTimeDeals() {
    	LimitedDeal.click();
    }
    public void newArrival() {
    	newArrivals.click();
    }
    public void hugeDis() {
    	HugeDiscount.click();
    }
    public void AdvertisementServices() {
    	home.click();
    	ImageAds.click();
    	Ads.click();
    	LimitedDeal.click();
    	newArrivals.click();
    	HugeDiscount.click();
    }
}
