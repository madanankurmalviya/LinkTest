package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShtExmp
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		
		TakesScreenshot sht = (TakesScreenshot)driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest =new File(".//ScreenShots/scr1.jpeg");
		FileUtils.copyFile(src,dest);
		
		driver.close();
	}

}
