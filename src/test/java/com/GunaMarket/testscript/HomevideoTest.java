package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.HomeVideoPage;
import com.GunaMarket.generic.BaseClass;

public class HomevideoTest extends BaseClass{
@Test
public void homeAdVideo()
{
	HomeVideoPage hvp=new HomeVideoPage(driver);
	hvp.homeVideo();
}

}
