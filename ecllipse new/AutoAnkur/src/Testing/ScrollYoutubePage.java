package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollYoutubePage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mechanicalmentors.blogspot.com/");
		Thread.sleep(1000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		for(int a=0;a<10;a++)
		{
			String scrolldown = "window.scrollBy(0,100)";
			je.executeScript(scrolldown);
			Thread.sleep(1000);
		}
		for (int a=0;a<5;a--)
		{
			String scrollup = "window.scrollBy(10,-80)";
			je.executeScript(scrollup);
		    Thread.sleep(500);
		}
		
		driver.close();
	}

}

