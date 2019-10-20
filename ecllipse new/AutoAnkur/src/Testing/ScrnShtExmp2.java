package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShtExmp2
{
	static
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html");
		Thread.sleep(1000);
		
		TakesScreenshot sht = (TakesScreenshot)driver;
		File scrn= sht.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//ScreenShots/src2.jpeg");
		FileUtils.copyFile(scrn, dest);
		
		driver.close();
	}
}