package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.seleniumhq.org/download/");
			
			WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
			int axis = java.getLocation().getY()-250;
			
			JavascriptExecutor j=(JavascriptExecutor) driver;
			Thread.sleep(1000);
			String scroll = "window.scrollBy(0,'"+axis+"')";
			j.executeScript(scroll);
			
			Thread.sleep(1000);
}
}
