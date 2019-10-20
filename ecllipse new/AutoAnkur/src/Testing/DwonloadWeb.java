package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DwonloadWeb 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		TakesScreenshot sht = (TakesScreenshot) driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/pic11.jpeg");
		FileUtils.copyFile(src,dest);
		Thread.sleep(1000);
		
		driver.findElement(By.id("A6l2Ze")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
