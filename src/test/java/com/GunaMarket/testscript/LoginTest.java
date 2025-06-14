package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.LoginPage;
import com.GunaMarket.POM.PaymentPage;
import com.GunaMarket.POM.ServicePage;
import com.GunaMarket.generic.BaseClass;

public class LoginTest extends BaseClass {

	@Test	        
	public void login() {
		
		LoginPage l=new LoginPage(driver);
		l.login("bharathir605@gmail.com", "ThN6eAEQ");
		
		ServicePage s=new ServicePage(driver);
		s.servicing();
		
		PaymentPage p=new PaymentPage(driver);
		p.makePayment("9867348965342918","22/28", "577");
		
		
	}


	
	}


