package com.selenium.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class ToolQA 
{
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/");
		WebElement tool = driver.findElement(By.xpath("(.//span[text()='Tools'])[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(tool).perform();	
		
		WebElement se =driver.findElement(By.xpath("(.//span[text()='UI Automation'])[1]"));
		act.moveToElement(se).perform();
		Thread.sleep(2000);
		
		WebElement selenium = driver.findElement(By.xpath("(.//span[text()='Selenium Tutorial'])[1]"));
	    List<WebElement> textAll = driver.findElements(By.xpath("(.//span[text()='Selenium Tutorial'])[1]/../../../..//span"));
	    act.moveToElement(selenium).perform();
	    int count = textAll.size();
		System.out.println(count);
		for(int a =0 ; a<count ; a++)
		{
			WebElement e = textAll.get(a);
			String tex = e.getAttribute("innerHTML");
			if(tex.contains("span"))
			{
				
			}
			else
			{
				System.out.println(tex);
			}
				
		}
		Thread.sleep(2000);
		
		selenium.click();
		
		List<WebElement> base = driver.findElements(By.xpath(".//h3[text()='Basic Java']/following-sibling::ul[1]/li//a"));
		int aa = base.size();
		for(int a = 0 ; a<aa;a++)
		{
			String str = base.get(a).getAttribute("href");
			System.out.println(str);
		}
		
		
		driver.close();
		
		
	
	
	
	
	
	}
}
