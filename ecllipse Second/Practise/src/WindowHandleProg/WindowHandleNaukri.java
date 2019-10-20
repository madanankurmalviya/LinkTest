package WindowHandleProg;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class WindowHandleNaukri 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		Set<String> allOptions = driver.getWindowHandles();
		
		for(String wh : allOptions)
		{
			WebDriver a = driver.switchTo().window(wh+1);
			System.out.println(a.getTitle());
			System.out.println(a.getCurrentUrl());
			a.close();
		}		
		
//		Alert a = driver.switchTo().alert();
//		Thread.sleep(6000);
//		String text = a.getText();
//		System.out.println(text);
//		a.dismiss();
		

	}

}
