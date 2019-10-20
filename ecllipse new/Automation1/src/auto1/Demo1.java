package auto1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("Hello The Method Started ");
		//System.setProperty("webdriver.gecko.driver", "E:\\ANKUR MALVIYA\\eclipse\\ecllipse new\\Automation1\\Driver\\geckodriver.exe");
		ChromeDriver a = new ChromeDriver();
		Thread.sleep(3000);
		a.close();
	}

}
