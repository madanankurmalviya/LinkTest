package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableAnk 
{
static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		
	}

}
