package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeWebsitePages;
import com.GunaMarket.generic.BaseClass;

public class HomeWebsiteTest extends BaseClass{
@Test
public void webSite() throws InterruptedException {
	HomeWebsitePages hweb=new HomeWebsitePages(driver);
	hweb.webSiteServices();
}
}
