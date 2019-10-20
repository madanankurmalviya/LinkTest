package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExample
{
	static
	{
		System.setProperty("webdriver.gecko.driver", ".//DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/java/html/buttonExample.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Banana']")).click();
		Thread.sleep(1000);
		
		int a = driver.findElements(By.xpath("//input[@name='grp1']")).size();
		System.out.println("Here is the dimension= "+a);
		for(int b=0; b<a ; b++)
		{
			driver.findElements(By.xpath("//input[@name='grp1']")).get(b).click();
		}
		
		int d=driver.findElements(By.xpath("//input[@name='grp2']")).size();
		System.out.println("Here the second size of button table= "+d);
		
		for (int e=0; e<d ; e++)
		{
			driver.findElements(By.xpath("//input[@name='grp2']")).get(e).click();
		}
			
		Thread.sleep(1000);
		driver.close();
	}

}
