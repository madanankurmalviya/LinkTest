package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		TakesScreenshot sht = (TakesScreenshot) driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/scr1.png");
		FileUtils.copyFile(src,dest);
		driver.close();
		
	}

}
