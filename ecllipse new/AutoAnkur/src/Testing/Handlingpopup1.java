package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handlingpopup1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com");
		Thread.sleep(500);
		
		WebElement hc = driver.findElement(By.linkText("Help Center"));
		Thread.sleep(500);
		
		Actions act=new Actions(driver);
		Action Help = act.moveToElement(hc).build();
		Help.perform();		
		Thread.sleep(500);
		

		driver.findElement(By.linkText("Contact Support")).click();
		Thread.sleep(500);
		
		try
		{
			driver.findElement(By.id("cookie-button--got-it")).click();
			Thread.sleep(200);
		}
		catch (Exception e)
		{
			System.out.println("No Such Elemnt Present");
		}
		
		driver.findElement(By.id("fileupload")).click();
		String path = "C:\\Users\\Prafulla\\Desktop\\ank.docx";
		StringSelection s = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemSelection().setContents(s, null);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
		driver.close();
	}
	
}


