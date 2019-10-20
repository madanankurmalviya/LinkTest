package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll
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
			
			JavascriptExecutor j=(JavascriptExecutor) driver;
			Thread.sleep(1000);
			for(int i=1;i<10;i++)
			{
			   String scrollDown="window.scrollBy(0,50)";
		       j.executeScript(scrollDown);
	           Thread.sleep(1000);
			}
		
//			String scrollDown="window.scrollBy(0,100000)";
//			j.executeScript(scrollDown);
//			Thread.sleep(3000);
//			String scrollUp="window.scrollBy(0,-100000)";
//			j.executeScript(scrollUp);
//			Thread.sleep(1000);

		}
}
