package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableFindNoOFRowsAndColumn 
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
		
		WebElement row = driver.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/tboby/tr/td[2]"));
		Thread.sleep(1000);
		WebElement col = driver.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		Thread.sleep(1000);
		Dimension rowtxt = row.getSize();
		Dimension coltxt = col.getSize();
		System.out.println("Here are the Row Size: = "+ rowtxt);
		System.out.println("Here are the Coloumn Size: = " +coltxt);
		
		driver.close();
	}

}
