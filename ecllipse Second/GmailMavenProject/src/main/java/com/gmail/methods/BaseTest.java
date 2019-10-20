package com.gmail.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
		static
	{
		System.setProperty(Chrome_Key, Crome_Value);
	}
	
	@BeforeMethod(enabled=false)
	public static void preConditions()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications-");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);		
	}
	
	@AfterMethod (enabled=false)
	public static void postConditions()
	{
		driver.close();
	}

}
