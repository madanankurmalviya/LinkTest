package com.actitime.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException 
	{
		String loginTitle=ExcelData.getData(filePath, "Sheet1", 1, 2);
		String expectedErrorMsg = ExcelData.getData(filePath, "Sheet2", 1,2);
		LoginPage lp=new LoginPage(driver);
		lp.verifyPage(loginTitle);
		int rc = ExcelData.getRowCount(filePath, "Sheet2");
		for (int i=1;i<=rc;i++)
		{
			String username=ExcelData.getData(filePath, "Sheet2", i, 0);
			String password = ExcelData.getData(filePath, "Sheet2", i, 1);
			
			// Enter Invalid username
			Reporter.log("Invalid username: "+username,true);
			lp.enterUsername(username);
			
			//Enter Invalid Password
			
			Reporter.log("Invalid password: "+password,true);
			lp.enterPassword(password);
			
			//CLick on Login
			
			lp.clickOnLogin();
			Thread.sleep(1000);
			
			//Verify Error msg
			
			String actualErrorMessage = lp.verifyErrorMsg(null);
			Reporter.log("ActualErrormsg: "+actualErrorMessage,true);
			Reporter.log("ExpectedErrormsg: "+expectedErrorMsg,true);
			assertEquals(actualErrorMessage, expectedErrorMsg,"Error Message is not Matching");
			Reporter.log("Error Message is not Matching " , true);
			Reporter.log("-------------------");
		}
	}

}
