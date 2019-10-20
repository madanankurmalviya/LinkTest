package Demo1;

import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 
{
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
						
		Dimension d= new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		Dimension e = new Dimension(300,300);
		driver.manage().window().setSize(e );
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
	}

}