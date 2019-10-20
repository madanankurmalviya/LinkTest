package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicsTest 

{

	@BeforeSuite
	public void setUp()
	{
		System.out.println("1. Here are the SetUp methods Run");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("2.Before Test Method-launch browser");
	}
	
	@BeforeClass(groups="Login Group")
	public void beforeClass()
	{
		System.out.println("3. Before Class Method Runs-Login to app");
	}
	
	@Test(priority=3,groups="Test Group")
	public void testMethod()
	{
		System.out.println("4. The First Method Runs");
	}
	
	@Test(priority=1,groups="Test Groups")
	public void testMethodTwo()
	{
		System.out.println("5. The second Method Runs");
	}
	
	@Test(priority=2,groups="Test Groups",invocationCount=5)
	public void testMethodThree()
	{
		System.out.println("6. The Third Method Runs");
	}
	
	@Test(timeOut=1000,priority=10)
	public void infiniteLoop()
	{
		int a=1;
		while (a==1)
		{
		  
		  System.out.println("loop no: "+a++);
		}
	}
	
	@AfterMethod
	public void afterMethodLogout()
	{
		System.out.println("7. Logout- methods run as After Method");
	}
	
	@AfterClass
	public void afterClassCloseBrowser()
	{
		System.out.println("8. after class method runs - close the browser");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("9. Delete all cookies Methods");
	}
	

}
