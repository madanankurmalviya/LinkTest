package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class JavaScriptExec
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html/fb.html");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		String entrtxt = "document.getElementById('n').value='Ankur Malviya Bubu'";
		je.executeScript(entrtxt);
		Thread.sleep(1000);
		
		String clearTxt = "document.getElementById('n').value='*********'";
		je.executeScript(clearTxt);
		Thread.sleep(1000);
		
		String click = "document.getElementById('fb').click()";
		je.executeScript(click);
		driver.close();
	}
}
