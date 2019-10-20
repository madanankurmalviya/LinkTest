package Testing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAnkur 
{
	private static final String TakesScreenshot = null;

	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/dropdown.html");
		WebElement sel1 = driver.findElement(By.id("A2B"));
		
		Select sel = new Select(sel1);
		List<WebElement> option = sel.getOptions();
		
		int count = option.size();
		int t1=0;
		
		for(int a=0;a<count;a++)
		{
			sel.selectByIndex(a);
			Thread.sleep(1000);
			t1+=1;
			System.out.println("select option: "+t1);
			TakesScreenshot sht = (TakesScreenshot) driver;
			File sr = sht.getScreenshotAs(OutputType.FILE);
			File dest = new File("C://Users/Prafulla/Desktop/Pic/Pic.jpeg");
			FileUtils.copyFile(sr,dest);
			Thread.sleep(500);
		}
		for (int b=count-1;b>=0;b--)
		{
			sel.deselectByIndex(b);
			Thread.sleep(1000);
			t1-=1;
			System.out.println("de-select option: "+t1);
		}
		driver.close();
	}

}