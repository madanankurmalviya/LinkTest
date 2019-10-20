package WebdriverSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisible 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/ANKUR%20MALVIYA/eclipse/ecllipse%20new/html/Scroll.html");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//option[@value='3']"));
		element.click();
		
		for(int n=0 ; n<=2 ; n++)
			{	
			WebElement list = driver.findElement(By.xpath(".//body//select[1]"));
			Select sel = new Select(list);
			
			sel.selectByIndex(n);
			Thread.sleep(2000);
			
			WebElement list1 = driver.findElement(By.xpath(".//body//select[2]"));
			Select sel1 = new Select(list1);
			
			sel1.selectByIndex(n);
			
			}

		Thread.sleep(1000);
		System.out.println("Wonderfull completed program");
		Thread.sleep(2000);
		driver.close();
	}
}
