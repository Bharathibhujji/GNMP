package com.GunaMarket.testscript;

import org.testng.annotations.Test;

import com.GunaMarket.POM.RegisterPage;
import com.GunaMarket.generic.BaseClass;

public class RegisterTest extends BaseClass {
	@Test
  public void register()
  {
RegisterPage r= new RegisterPage(driver);
r.register();
}

}
