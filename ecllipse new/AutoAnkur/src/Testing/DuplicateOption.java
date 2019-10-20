package Testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOption 
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
		driver.get("E:\\java\\html\\dropdown.html");
		
		WebElement list = driver.findElement(By.id("A2B"));
		Select sel=new Select(list);
		ArrayList<String> allText=new ArrayList<>();
		List<WebElement> allOption = sel.getOptions();
		
		for(WebElement option:allOption)
		{
			String text = option.getText();
			allText.add(text);
		}
		HashSet<String> allTextCopy=new HashSet<>();
		if(allText.size()==allTextCopy.size())
		{
			
			System.out.println("dUPLICATE PRESENT");
		}
	}

}
