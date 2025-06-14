package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeImage;
import com.GunaMarket.generic.BaseClass;

public class HomeImageTest extends BaseClass{

		@Test
		public void AdvertisementServices()  {
      HomeImage hi= new HomeImage(driver);
      hi.AdvertisementServices();
	}
	
}
