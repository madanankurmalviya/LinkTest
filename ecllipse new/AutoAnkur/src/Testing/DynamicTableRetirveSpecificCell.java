package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableRetirveSpecificCell
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement cell = driver.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[3]"));
		Thread.sleep(1000);
		
		String rowtxt = cell.getText();
		
		System.out.println("Here are the Row Size: = "+ rowtxt);
		
		
		driver.close();
	}

}
