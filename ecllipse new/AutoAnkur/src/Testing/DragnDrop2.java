package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html/drag.html");
		Thread.sleep(1000);
		
		WebElement src = driver.findElement(By.id("drag1"));
		Thread.sleep(1000);
		
		WebElement trg = driver.findElement(By.id("div1"));
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src,trg).perform();
		
		Thread.sleep(1000);
		driver.close();
	}

}
