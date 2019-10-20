package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample1
{
	static
	{
		System.setProperty("webdriver.gecko.driver", ".//DriverAnkur/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/java/html/Sample%20Test%20Page.html");
		Thread.sleep(1000);
		
		WebElement testDropDown = driver.findElement(By.xpath("//*[contains(@id,'testingDropdown')]"));
		Select dropdown = new Select(testDropDown);
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Database Testing");
		Thread.sleep(1000);
		dropdown.selectByIndex(2);
		Thread.sleep(1000);
		
		driver.close();
	}

}

