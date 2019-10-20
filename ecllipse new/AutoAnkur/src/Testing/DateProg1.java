package Testing;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateProg1
{	
	static
	{
	System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException 
{
	Date date=new Date();
	SimpleDateFormat dt=new SimpleDateFormat("dd");
	String dd = dt.format(date);
	SimpleDateFormat mn = new SimpleDateFormat("MMMM");
	String mon = mn.format(date);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(1000);
	System.out.println(mon);
	driver.findElement(By.xpath("//span[.='"+mon+"']/../../..//a[.='"+dd+"']")).click();
	Thread.sleep(10000);
	
	
}
}