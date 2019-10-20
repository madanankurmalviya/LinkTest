package WindowHandleProg;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesProgOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Set<String>allwn = driver.getWindowHandles();
		for(String wh : allwn) 
		{
			WebDriver a = driver.switchTo().window(wh);
			String title=a.getTitle();
			System.out.println(title);
			a.close();
		}
		
	}
}
