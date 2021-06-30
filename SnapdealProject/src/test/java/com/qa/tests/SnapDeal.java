package com.qa.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.SnapDealPage;

public class SnapDeal extends TestBase
{
	@Test
	public void Register() throws InterruptedException,IOException
	{
		SnapDealPage snapdeal=new SnapDealPage(driver);
		
		snapdeal.getSearch().click();
		Thread.sleep(4000);
		snapdeal.getProducts().sendKeys("Mobiles");
		Thread.sleep(4000);
		snapdeal.getsearching().click();
		Thread.sleep(4000);
		snapdeal.getPinCode().sendKeys("506709");
		Thread.sleep(4000);
		snapdeal.getCheck().click();
		Thread.sleep(4000);
		snapdeal.getSelectItem().click();
		Thread.sleep(4000);
		String title =driver.getTitle();

		
		
	

	if(title!="Mobiles") 
	{
		captureScreenShot(driver,"Register");
		 Reporter.log("Item is Searched",true);
		
  Assert.assertTrue(true);
	}
	else
	{
		
		 Reporter.log("Item is not searched",true);
		  Assert.assertTrue(false);

	}
	
	}
}

	
		
		
	
	


	


