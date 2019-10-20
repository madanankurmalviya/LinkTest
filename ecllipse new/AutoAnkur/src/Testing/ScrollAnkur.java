package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAnkur
{
static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?source=hp&ei=_OarXKaENIiR9QPloLfgDA&q=ankur+malviya&oq=ankur+malv&gs_l=psy-ab.1.0.0j0i22i30l2.6943.8274..10579...0.0..1.204.1039.6j3j1......0....1..gws-wiz.....0..0i131.8LVf4RmICyM");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		
		for (int a=1;a<10;a++)
		{
			String scroll = "window.scrollBy(0,100)";
			j.executeScript(scroll);
			Thread.sleep(1000);
		}
	}
}
