package Testing;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrShtFlower
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Marrigold Beautiful Flower");
		Thread.sleep(1000);
		TakesScreenshot sht = (TakesScreenshot) driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/Scr1.jpeg");
		FileUtils.copyFile(src, dest);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//span[contains(.,'images hd')]")).click();
		Thread.sleep(1000);
		
		File src1 = sht.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShots/Scr2.jpeg");
		FileUtils.copyFile(src1, dest1);
				
		driver.findElement(By.id("dimg_16")).click();
		Thread.sleep(1000);
		File scr2 =sht.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./ScreenShots/Scr3.jpeg");
		FileUtils.copyFile(scr2, dest2);
		Thread.sleep(500);
		
		driver.close();
		
	}

}
