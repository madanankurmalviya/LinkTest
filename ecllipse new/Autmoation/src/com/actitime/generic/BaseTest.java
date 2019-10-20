package com.actitime.generic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	static 
	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
	}
	@BeforeMethod
	public void preCondition() throws MalformedURLException
	{
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		//driver = new ChromeDriver();
		
		driver=new RemoteWebDriver(url, dc);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postCondition(ITestResult res) throws IOException
	{
		int result = res.getStatus();
		if(result==2)
		{
			String name = res.getName();
			GenericUtil.getScreenShot(driver, name);
		}
		driver.close();
	}
	
}