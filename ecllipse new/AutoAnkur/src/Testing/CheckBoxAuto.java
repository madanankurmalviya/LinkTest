package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAuto
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html/checkBox.html");
		Thread.sleep(1000);
		List<WebElement> src = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		int count = src.size();		
		System.out.println("hello: "+count);
		for(int a=0;a<=count;a++)
		{
			src.get(a).click();
			Thread.sleep(500);
		}
		
		driver.close();
	}

}
