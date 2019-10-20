package com.railway.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	static
	{	
		System.setProperty(chrome_key,chrome_value);
		System.setProperty(gecko_key,gecko_value);
	}
	
	@BeforeMethod(enabled=false)
	public void preCondition()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
	
	@AfterMethod(enabled=false)
	public void postCondition(ITestResult res)
	{
//		int res =res.getStatus();
//		if(status==2)
//		{
//			String name = res.getName();
//			GenericUtils.getScreenShot(driver ,name);
//		}
		driver.close();
	}
	
}
