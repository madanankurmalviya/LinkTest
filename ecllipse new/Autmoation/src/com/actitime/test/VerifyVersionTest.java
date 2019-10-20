package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.LoginPage;

public class VerifyVersionTest extends BaseTest
{
 @Test(priority=3)
 public void testVerifyVersion()
 {
	 String loginTitle=ExcelData.getData(filePath, "Sheet1", 1, 2);
	 String expectedVersion=ExcelData.getData(filePath, "Sheet3", 1, 0);
	 LoginPage lp=new LoginPage(driver);
	 
	 //To Verify Login Page
	 
	 lp.verifyPage(loginTitle);
	 
	 //verify version
	 
	 String actualVersion = lp.verifyVersion();
	 Reporter.log("ActualVersion: "+actualVersion,true);
	 Reporter.log("Expected Version: "+expectedVersion,true);
	 
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(actualVersion, expectedVersion ,"Version is not matching" );
     sa.assertAll();
     
     Reporter.log("Version is matching ",true);
 }   
}
