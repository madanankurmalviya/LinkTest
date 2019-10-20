package Testing;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildClassOnly 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		Thread.sleep(1000);
		
		Set<String> al = driver.getWindowHandles();
		for(String a:al)
		{
			driver.switchTo().window(a);
			String title = driver.getTitle();
			String txt = driver.getCurrentUrl();
			System.out.println(title);
			System.out.println(txt);
			if(title.equals("Sykes"))
			{
				System.out.println("here the print : "+title);
				driver.close();
			}
		}
		//driver.quit();
	}

}
