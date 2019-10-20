package WebdriverSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selTxt 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("file:///E:/ANKUR%20MALVIYA/eclipse/ecllipse%20new/html/Scroll.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement list = driver.findElement(By.xpath("//body//select[1]"));
		Select sel = new Select(list);
		Thread.sleep(1000);
		
		List<WebElement> allOptions = sel.getOptions();
		int count = allOptions.size();
		
		for(int a = 0 ; a< count ; a++)
		{
			WebElement Option = allOptions.get(a);
			String txt = Option.getText();
			System.out.println(txt);
		}
		Thread.sleep(1000);
		driver.close();
	}
}
