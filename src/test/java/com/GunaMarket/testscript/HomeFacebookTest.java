package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeFacebookPage;
import com.GunaMarket.generic.BaseClass;

public class HomeFacebookTest extends BaseClass {
	@Test
	public void homeFacebookAdPlans() throws InterruptedException {
HomeFacebookPage hp=new HomeFacebookPage(driver);
hp.homeFacebookAdPlans();
	}
}
