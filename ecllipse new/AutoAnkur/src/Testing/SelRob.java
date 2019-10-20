package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelRob 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(1000);
		
//		String xp = "//td[.='Java']/..//a[.='Download']";
//		driver.findElement(By.xpath(xp)).click();
//		Thread.sleep(1000);
//		
		Robot r = new Robot();
		Thread.sleep(1000);
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		for(int a=0; a<10 ; a++)
		{
		r.keyPress(KeyEvent.VK_PRINTSCREEN);
		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(500);
		
		}
		driver.close();
		
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(500);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(500);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(500);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(500);
//	
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(500);
	}
}
