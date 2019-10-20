package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrnSht2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("NASA LIVE");
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath(".//span[.='nasa live']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div[@role='option']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot sht = (TakesScreenshot) driver;
		File scr = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/SHT2.jpeg");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(1000);
		driver.close();
	}

}
