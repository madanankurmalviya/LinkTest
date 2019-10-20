package Testing;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.build.ToStringPlugin.Exclude;

public class CloseChildWindowPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		
		for(String a:child)
		{
			driver.switchTo().window(a);
			String b = driver.getTitle();
			Thread.sleep(500);
			System.out.println(b);
			driver.close();
		}
		driver.quit();
	}
}
