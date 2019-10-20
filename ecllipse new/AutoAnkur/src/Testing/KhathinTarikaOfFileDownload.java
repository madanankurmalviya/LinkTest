package Testing;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KhathinTarikaOfFileDownload 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(1000);
		
		Set<String> parent = driver.getWindowHandles();
		int count = parent.size();
		System.out.println(count);
		
		for(String onebyone:parent)
		{
			driver.switchTo().window(onebyone);
			Thread.sleep(1000);
			driver.close();
		}
		
		
	}
}
