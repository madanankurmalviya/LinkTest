package Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolExmp
{
	static
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/news/releases/latest/index.html");
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int a= 0 ; a<=10 ;a++)
		{
		js.executeScript("scrollBy(0,100)");
		Thread.sleep(10);
		
		}
		Thread.sleep(1000);
		driver.close();
	}

}
