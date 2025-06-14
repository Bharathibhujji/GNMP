package com.GunaMarket.testscript;



import org.testng.annotations.Test;

import com.GunaMarket.POM.HomePage;
import com.GunaMarket.generic.BaseClass;


public class HomeTest extends BaseClass {
@Test
 public void home() {
	HomePage h = new HomePage(driver);
	h.home();
	
}
}
