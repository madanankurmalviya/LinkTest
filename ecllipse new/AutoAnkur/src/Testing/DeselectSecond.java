package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DeselectSecond 
{
	static
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/DropDown2.html");
		Thread.sleep(1000);
		
		WebElement sel = driver.findElement(By.id("A2B"));
		Select sel1=new Select(sel);
		Thread.sleep(1000);
		List<WebElement> option = sel1.getOptions();
		
		int count = option.size();
		int b=0;
		for(int a=0;a<count;a++)
		{
			WebElement opt = option.get(a);
			sel1.selectByIndex(a);
			b+=1;
			
			String prnt = opt.getText();
			System.out.println(+b+prnt);
			
			
			
		}
		for(int a=count-1;a>=0;a--)
		{
			sel1.deselectByIndex(a);
			WebElement opt = option.get(a);
			String prnt = opt.getText();
			b-=1;
			System.out.println(+b+prnt);
		}
		Thread.sleep(1000);
		driver.close();
		
	}

}

