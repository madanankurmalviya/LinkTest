package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download");
		Thread.sleep(1000);
		driver.findElement(By.linkText("3.141.59")).click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
