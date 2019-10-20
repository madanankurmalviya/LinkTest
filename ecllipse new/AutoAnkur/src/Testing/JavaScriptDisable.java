package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDisable 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///E:/java/html/Sample.html");
			
			JavascriptExecutor j=(JavascriptExecutor) driver;
			Thread.sleep(1000);
			String enterText = "document.getElementById('n').value='bubu'";
			j.executeScript(enterText);
			Thread.sleep(1000);
			
			String clearText = "document.getElementById('n').value=''";
			j.executeScript(clearText);
			
			String clicklink = "document.getElementById('fb').click()";
			j.executeScript(clicklink);
			
			
}
}