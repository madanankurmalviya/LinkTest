package com.railway.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver , 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
		}
		catch (Exception e)
		{
			Reporter.log("Title is not matching Expected title is:"+eTitle , true);
			
			//Reporter.log("Actual title is :"driver.getTitle(),true);
			Assert.fail();
		}
	
	}

}
