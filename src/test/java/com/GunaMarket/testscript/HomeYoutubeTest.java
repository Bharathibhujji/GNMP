package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeYoutubePages;
import com.GunaMarket.generic.BaseClass;

public class HomeYoutubeTest extends BaseClass {
@Test
public void youtubeService() throws InterruptedException {

	HomeYoutubePages y=new HomeYoutubePages(driver);
	y.homeButton();
	y.youtubeChannel();
	y.startAds();
	y.enableService();
	y.homeYoutube();
	
}
}
