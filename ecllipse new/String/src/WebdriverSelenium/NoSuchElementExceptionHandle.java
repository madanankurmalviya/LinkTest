package WebdriverSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoSuchElementExceptionHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//input[@class='gLFyf gsfi']")).sendKeys("Hello my Name is Ankur Malviya");
		try
		{		
		    driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@value='Google Search']")).click();
		}
		catch (Exception e)
		{
			System.out.println("Here the exception handled  ankur");
		}
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		Thread.sleep(2000);
		WebElement element = driver1.findElement(By.xpath(".//input[@class='gLFyf gsfi']"));
		element.sendKeys("Sri Shiddhi Vinay ");
		element.submit();
				
		Thread.sleep(2000);
		driver1.quit();
	}

}