package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataRead 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("E://java/html/tablenew.html");
		Thread.sleep(500);
		
		String txt1 = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
		System.out.print(txt1);
		Thread.sleep(1000);
		
		String txt2 = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
		System.out.print(txt2);
		Thread.sleep(5000);
		
		String txt3 = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
		System.out.print(txt3);
		Thread.sleep(1000);
		
		String txt = driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
		System.out.println(txt);
		driver.close();
		
	}

}
