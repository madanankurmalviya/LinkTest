package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCheckBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/tablecheckbox.html");
		Thread.sleep(2000);
		List<WebElement> click1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		System.out.println(click1.size());
		for (WebElement a:click1)
		{
			System.out.println("Print: "+a);;
		}
		Thread.sleep(2000);
		driver.close();
	}
}
