package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.EnterTimeTrackPage;
import com.actitime.page.LoginPage;

public class ValidlogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testValidliginLogout()
	{
		String username = ExcelData.getData(filePath,"Sheet1",1,0);
		String password = ExcelData.getData(filePath, "Sheet2", 1, 1);
		String loginTitle = ExcelData.getData(filePath, "Sheet3", 1, 2);
		String enterTimeTrackTitle= ExcelData.getData(filePath, "Sheet4", 1, 3);
	LoginPage lp = new LoginPage(driver);
	EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
	//verify login page
	lp.verifyPage(loginTitle);
	//Enter valid username
	Reporter.log("valid username: "+username,true);
	lp.enterUsername(username);
	//Enter Valid Pwd
	Reporter.log("valid pwd: "+password,true);
	lp.enterPassword(password);
	//click on login
	lp.clickOnLogin();
	//verify enter time track page
	lp.verifyPage(enterTimeTrackTitle);
	//click on logout
	//lp.clickOnLogout();
	//verify login page
	lp.verifyPage(loginTitle);
   }
}
