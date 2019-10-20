package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	public void getTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("The Title is : "+title);
		
	}
	
	@Test
	public void titleTest()
	{
	  String title = driver.getTitle();
	  Assert.assertEquals(title,"google","there is and error");
	 
	}
	
	@Test
	public void linkTest()
	{
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@Test(dependsOnMethods="titleTest")
	public void searchItemGoogle()
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@class='gNO89b']")).click();
		String title2=driver.getTitle();
		System.out.println("The second page title is :"+title2);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		System.out.println("Here is the tear down Method");
	}

}
