package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAnkurRows 
{
static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/table.html");
		Thread.sleep(1000);
		
		//WebElement e = driver.findElement(By.tagName("t2"));
		//Thread.sleep(500);
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		Thread.sleep(500);
		int count = allrows.size();
		System.out.println("here are the number of rows : "+count);
		Thread.sleep(1000);
		driver.close();
		
	}

}
