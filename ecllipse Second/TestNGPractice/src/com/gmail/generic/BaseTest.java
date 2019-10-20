package com.gmail.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class BaseTest implements AutoConstant
{
	public WebDriver driver;
	static
	{
		System.setProperty("Chrome_Key", "Chrome_Value");
		System.setProperty("Gecko_Key","Gecko_Value");
	}
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
	}
	
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int status = res.getStatus();
		if(status==2)
		{
			String name = res.getName();
			GenericUtils.getScreenShot(driver,name);
		}
		driver.close();
	}
	
}
