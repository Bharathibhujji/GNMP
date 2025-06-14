package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.ContactPage;
import com.GunaMarket.generic.BaseClass;

public class ContactTest extends BaseClass {
@Test
public void contact() {
	ContactPage  c= new ContactPage(driver);
	c.contact("bhujji","abc@gmail.com", "valid messages");
}
}
