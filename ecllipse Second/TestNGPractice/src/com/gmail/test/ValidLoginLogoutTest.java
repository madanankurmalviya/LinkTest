package com.gmail.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.gmail.generic.BaseTest;
import com.gmail.generic.ExcelData;
import com.gmail.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String username = ExcelData.getData(filePath,"TC01",1,0);
		String password = ExcelData.getData(filePath, "TC01", 1, 1);
		String loginTitle= ExcelData.getData(filePath, "TC01",1,2);
		String enterTitle = ExcelData.getData(filePath,"TC01",1,3);
							
		LoginPage lp =new LoginPage(driver);
		lp.verifyPage(loginTitle);
		
		Reporter.log("Valid username: "+username,true);
		lp.enterUserName(username);
		
		Reporter.log("Valid password: "+password,true);
		lp.enterPassword(password);
		
		lp.clickOnLogin();
		lp.verifyPage("gmail");
	}

}
