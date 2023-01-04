package com.nopcommerce.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		
		logger.info("UrRL is Opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user provided"); //logger message
		
		lp.setPassword(password);
		logger.info("Password provided");  //logger message
		
		lp.clickLogin();
		logger.info("Login is provided");   //logger message
		
		Thread.sleep(6000);
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Assert.assertTrue(true);
			lp.clickLogout();
		}else {
			Assert.assertTrue(false);
			logger.info("Login Failed");
		}
	}
	
	

}
