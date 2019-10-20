package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCount 
{
static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///E:/java/html/table.html");
		Thread.sleep(1000);
		List<WebElement> table = driver.findElements(By.xpath("//td[3]"));
		
		int count = table.size();
		System.out.println("here are the no of table: "+count);
		Thread.sleep(1000);
		driver.close();
	}
}
