package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drpDwnExm2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/java/html/DragExp.html");
		Thread.sleep(1000);
		
		WebElement from = driver.findElement(By.cssSelector("img#drag1"));
		Thread.sleep(500);
		WebElement To = driver.findElement(By.cssSelector("div[id$='1']"));
		Thread.sleep(500);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, To).perform();
		Thread.sleep(500);
		
	}
		
	
}
