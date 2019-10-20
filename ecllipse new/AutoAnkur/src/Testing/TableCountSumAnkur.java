package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCountSumAnkur 
{
	private static final String Interger = null;

	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("E:/java/html/table.html");
		
		int count=0,sum=0,count1=0;
		List<WebElement> allcells = driver.findElements( By.xpath("//td"));
		
		for (WebElement all:allcells)
		{
			String text = all.getText();
			try
			{
				int n = Integer.parseInt(text);
				System.out.println("here are the numbers: "+n);
				count++;
				sum+=n;
			}
			catch(Exception e)
			{
				count1++;
			}
			System.out.println("try count: "+count);
			System.out.println("try sum: "+sum);
			System.out.println("catch count: "+count1);
			}
		Thread.sleep(1000);
		driver.close();
	}

}
