package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFacebookPage {
	@FindBy(xpath="//a[text()='Home']")
	WebElement home;

	@FindBy(xpath="//h4[text()='Facebook Advertising Service']")
	WebElement facebookAd;

	@FindBy(xpath="//a[text()='Get Started']")
	WebElement getStart ;

	@FindBy(xpath="//h3[text()='Basic Plan']")
	WebElement basePlan ;

	@FindBy(xpath="//h3[text()='Pro Plan']")
	WebElement proPlan;

	@FindBy(xpath="//h3[text()='Enterprise Plan']")
	WebElement enterprisePlan;

	private WebDriver driver;


	public HomeFacebookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void homebutton()
	{
		home.click();
		}
	public void faceBookAdvertisement() {
		facebookAd.click();
	}
	public void getStartedButton() {
		getStart.click();
	}
	public void basePlanService()
	{
		basePlan.click();
	}
	public void proPlanService() {
		proPlan.click();
	}
	public void enterprisePlanService()
	{
		enterprisePlan.click();
	}
	public void homeFacebookAdPlans() throws InterruptedException
	{
		home.click();
		facebookAd.click();
		getStart.click();
		basePlan.click();
		Thread.sleep(1000);
		proPlan.click();
		Thread.sleep(1000);
		enterprisePlan.click();
	}
}
