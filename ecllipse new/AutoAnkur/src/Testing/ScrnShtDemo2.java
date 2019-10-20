package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShtDemo2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/mechanicalmentorsbyankurmalviya/");
		Thread.sleep(1000);
		TakesScreenshot sht = (TakesScreenshot) driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/scr2.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(1000);
		driver.close();
		
	}

}
