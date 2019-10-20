package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTimeAnkur
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("12345678910");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
