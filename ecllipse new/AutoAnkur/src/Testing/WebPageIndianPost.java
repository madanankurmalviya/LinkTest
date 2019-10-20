package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebPageIndianPost
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///I:/web/Web%20Based%20Customer%20Grievance%20Handling%20System%20-%20Complaints%20Entry.html");
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(500);
		int count=0;
		
		for(int a=1;a<=10;a++)
		{
			String scroll = "window.scrollBy(0,10)";
			j.executeScript(scroll);
			Thread.sleep(500);
			count+=1;
			System.out.println("Here are the total no of scrolls: "+count);
			//drop1=driver.findElement(By.id("DDLTransactionType"));
			//Thread.sleep(2000);
			//driver.findElement(By.id("DDLTransactionType")).sendKeys("Money Orders");
			Select drop1=new Select(driver.findElement(By.id("DDLTransactionType")));
			drop1.selectByVisibleText("Money Orders");
			Thread.sleep(2000);
			Select drop2=new Select(driver.findElement(By.id("DDLComplaintNature")));
			drop2.selectByVisibleText("Non Payment");
			Thread.sleep(1000);
			//driver.findElement(By.id("DDLDay")).sendKeys("24");
			//Thread.sleep(500);
			driver.findElement(By.id("RdDestPOYes")).click();
			Thread.sleep(500);
			
			//driver.findElement(By.id("DDLMonth")).sendKeys("December");
		}
		
		driver.close();
		
		
	}

}
