package Testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSortedorNot
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
		driver.get("E:\\java\\html\\DropDown2.html");
		
		WebElement list = driver.findElement(By.id("A2B"));
		Select sel=new Select(list);
		
	   ArrayList<String> allText=new ArrayList();
		
		List<WebElement> alloption = sel.getOptions();
		
		for(WebElement option:alloption)
		{
			String text=option.getText();
			allText.add(text);
		}
		Collections.sort(allText);
		for(String text:allText)
		{
			System.out.println(text);
		}
		
	}
		
}
