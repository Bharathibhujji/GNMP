package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeWebPages {
WebDriver driver;
@FindBy(xpath="//a[text()='Home']")
WebElement home;

@FindBy(xpath="//h4[text()='Web Pages Service']")
WebElement webPages;

@FindBy(xpath="//a[text()='Get Started']")
WebElement getStart;

@FindBy(name = "fullName")
WebElement fullName;

@FindBy(id = "dob")
WebElement dob;

@FindBy(xpath = "//input[@value='Female']")
WebElement genderFemale;

@FindBy(name = "qualification")
WebElement qualificationDropdown;

@FindBy(name = "permanentAddress")
WebElement address;

@FindBy(name = "state")
WebElement stateDropdown;

@FindBy(name = "city")
WebElement cityDropdown;

@FindBy(name = "mobileNumber")
WebElement mobile;

@FindBy(name = "emailId")
WebElement email;

@FindBy(name = "businessDescription")
WebElement businessDescription;

@FindBy(xpath = "//input[@value='submit']")
WebElement submitButton;

public  HomeWebPages(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public void homeButton() {
	home.click();
}
public void WebPagesLink() {
	webPages.click();
}
public void getStartedButton()
{
	getStart.click();
}

public void homeWeb() {
    home.click();
    webPages.click();
    getStart.click();
    fullName.sendKeys("bharathi");
    dob.sendKeys("21/06/1997");
    genderFemale.click();
    new Select(qualificationDropdown).selectByVisibleText("M.Sc");
    address.sendKeys("9th ward vijayapura");
    new Select(stateDropdown).selectByVisibleText("Madhya Pradesh");
    new Select(cityDropdown).selectByVisibleText("Bhopal");
    mobile.sendKeys("9878657845");
    email.sendKeys("123@gmail.com");
    businessDescription.sendKeys("About the business");

    submitButton.click();
}

}
