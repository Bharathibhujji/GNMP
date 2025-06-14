package com.GunaMarket.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class PaymentPage {

	    private WebDriver driver;

	    @FindBy(id = "payment-option")
	    private WebElement paymentOptionDropdown;

	    @FindBy(id = "payment-method")
	    private WebElement paymentMethodDropdown;

	    @FindBy(id = "card-number")
	    private WebElement cardNumberInput;

	    @FindBy(id = "expiry-date")
	    private WebElement expiryDateInput;

	    @FindBy(id = "cvv")
	    private WebElement cvvInput;

	    @FindBy(id = "save-card")
	    private WebElement saveCardCheckbox;

	    @FindBy(id = "pay-button")
	    private WebElement payButton;

	    public PaymentPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    public void makePayment(String cardNumber, String expiry, String cvv) {
	        new Select(paymentOptionDropdown).selectByValue("internet-payment");
	        new Select(paymentMethodDropdown).selectByValue("card");

	        cardNumberInput.sendKeys(cardNumber);
	        expiryDateInput.sendKeys(expiry);
	        cvvInput.sendKeys(cvv);
	        saveCardCheckbox.click();
	        payButton.click();
	    }
}
