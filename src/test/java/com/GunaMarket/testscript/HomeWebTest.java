package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeWebPages;
import com.GunaMarket.generic.BaseClass;

public class HomeWebTest extends BaseClass {
@Test
public void homeWebService() {
	HomeWebPages hwb = new HomeWebPages(driver);
	hwb.homeWeb();
}
}
