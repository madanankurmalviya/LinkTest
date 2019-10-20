package Testing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowChildIterator
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div/h2[.='Guru99 Bank']/../../p/a[.='Click Here']")).click();
		
		String mainwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> it = childwindow.iterator();
		while(it.hasNext())
		{
			String chldwnd1 = it.next();
			{
				if(!mainwindow.equalsIgnoreCase(chldwnd1))
				{
					driver.switchTo().window(chldwnd1);
					driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ank@mail.com");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='submit']")).click();				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div/h2[.='Guru99 Bank']/../../p/a[.='Click Here']")).click();
					Thread.sleep(2000);
					driver.close();
				}
			}
			driver.switchTo().window(mainwindow);
			Thread.sleep(2000);
		}
		driver.close();
	}
}
