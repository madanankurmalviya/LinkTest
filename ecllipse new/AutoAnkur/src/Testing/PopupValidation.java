package Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupValidation 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html/POPUP.html");
		Thread.sleep(1000);
		driver.findElement(By.id("p")).click();
		Thread.sleep(1000);
		
		try
		{
			Alert alt = driver.switchTo().alert();
			System.out.println("Pop up is present");
			alt.sendKeys(" Ankur love Prabha :)");
			Thread.sleep(1000);
			alt.accept();
			WebElement txt1 = driver.findElement(By.id("Demo"));
			String txt = txt1.getText();
			System.out.println(txt);
			String atext="Welcome Ankur love Prabha :)";
			if(txt.equals(atext))
			{
				System.out.println("Matched paddu");
			}
			else
			{
				System.out.println("Not Matched Paddu");
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Error popup is not present");
		}
		Thread.sleep(1000);
		driver.close();
	}
}
