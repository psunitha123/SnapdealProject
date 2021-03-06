package com.qa.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
    public void setUp(String Browser, String url)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ammu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\virtusa\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
	
	
	
	driver.manage().window().maximize();
	driver.get(url);
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	public void captureScreenShot(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		File Sources=screenShot.getScreenshotAs(OutputType.FILE);
		String Dest= System.getProperty("user.dir")+"/Screenshots/"+tname+".png";
		FileUtils.copyFile(Sources,new File(Dest));
		
	}
	
}