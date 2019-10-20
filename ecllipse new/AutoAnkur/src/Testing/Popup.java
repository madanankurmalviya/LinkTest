package Testing;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(1000);
		try
		{
		Alert alt = driver.switchTo().alert();
		System.out.println("Pop Up is Present");
		String atext = alt.getText();
		System.out.println(atext);
		
		String etext="Enter User ID";
		System.out.println(etext);
		
		if (atext.equals(etext))
		{
			System.out.println("SOP pass");
		}
		else
		{
			System.out.println("SOP fail");
		}
		alt.accept();
		}
		catch(Exception e)
		{
			System.out.println("Pop Is not present");
		}
		
		Thread.sleep(1000);
		driver.close();
	}

}
