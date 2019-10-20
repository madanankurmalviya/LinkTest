package FrameWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ankur123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		WebElement add= driver.findElement(By.xpath("//a[@title='Contacts' ]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(add).perform();
		Thread.sleep(1000);
		
		WebElement move = driver.findElement(By.xpath("//a[@title='Full Search Form']"));
		act.doubleClick(move).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
