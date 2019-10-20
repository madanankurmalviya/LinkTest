package Testing;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		Thread.sleep(1000);
		
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		all.remove(parent);
		
		for(String a:all)
		{
			driver.switchTo().window(a);
			driver.close();
		}

		driver.switchTo().window(parent);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
