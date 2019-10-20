package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSElect 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("E:\\java\\html\\dropdown.html");
		
		WebElement list = driver.findElement(By.id("A2B"));
		Select sel=new Select(list);
		if(sel.isMultiple())
		{
			System.out.println("yes");
		}
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		List<WebElement> allOption = sel.getOptions();
		int count=allOption.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(100);
		}
		
	}
		
}
