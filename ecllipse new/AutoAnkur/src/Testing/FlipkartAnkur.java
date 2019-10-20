package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAnkur 
{
static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.flipkart.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("q")).sendKeys("iphone");
			Thread.sleep(1000);
			List<WebElement> browse = driver.findElements(By.xpath("//div[@class='_2kpuIQ']"));
			Thread.sleep(1000);
			int count = browse.size();
			System.out.println("Here are the numbers : "+count);
			Thread.sleep(1000);
			
			for(WebElement suggestion:browse)
			{
				String textp=suggestion.getText();
				System.out.println("The search list are : "+textp);
			}
		}
}