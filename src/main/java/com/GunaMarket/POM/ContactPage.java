package com.GunaMarket.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

@FindBy(xpath="(//a[text()='Contact Us'])[1]")
private WebElement contactbutton;

@FindBy(name="fullName")
private WebElement namebox;

@FindBy(name="email")
private WebElement emailbox;

@FindBy(name="message")
private WebElement messagebox;

@FindBy(xpath="//input[@value='Send']")
private WebElement sendbutton;

private WebDriver driver;

public ContactPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public void contactTextButton() {
	contactbutton.click();
}
public void nameTextBox(String name) {
	namebox.sendKeys(name);
}
public void emailTextBox(String email) {
	emailbox.sendKeys(email);
}
public void messageDescription(String message) {
	messagebox.sendKeys(message);
}
public void send() {
	sendbutton.submit();
}
public void contact(String name,String email,String message)
{
	contactTextButton();
	nameTextBox(name);
	emailTextBox(email);
	messageDescription(message);
	send();
	
}
}