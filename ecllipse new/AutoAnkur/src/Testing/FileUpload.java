package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/contact-support");
		Thread.sleep(1000);
		
		driver.findElement(By.id("cookie-button--got-it")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.id("fileupload")).click();
		Thread.sleep(500);
		
		String path = "C:\\Users\\Prafulla\\Desktop\\ank.docx";
		
		StringSelection sel = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		driver.close();
		
		
	}
}
