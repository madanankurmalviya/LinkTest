package com.freeCrm.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LlinkTest 
{
	@Test
	public void linkTestPage()
	{
		System.setProperty("webdriver.chrome.driver","E:/ANKUR MALVIYA/eclipse/ecllipse Second/Practise/DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.close();
	}

}
