package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TickTable 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/tablecheckbox.html");
		Thread.sleep(1000);
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		Thread.sleep(1000);
		int count = all.size();
		
		for(int a= 0 ; a<=count; a++)
		{
			WebElement set = all.get(a);
			set.click();
			Thread.sleep(1000);
		}
	
		driver.close();
		}

}
