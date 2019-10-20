package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_ref_comp_dropdown-menu&stacked=h");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath(".//button[@id='menu1']"));
		ele.click();
		
//		Select sel = new Select(ele);
//		
//		List<WebElement> num = sel.getAllSelectedOptions();
//		int n = num.size();
//		System.out.println(num.size());
		driver.close();

	}

}
