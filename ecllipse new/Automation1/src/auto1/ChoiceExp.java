package auto1;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver; 
public class ChoiceExp {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the Browser Name: ");
		String br=a.nextLine();
		WebDriver br1=null;
		if (br.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\ANKUR MALVIYA\\eclipse\\ecllipse new\\Automation1\\Driver\\geckodriver.exe");
			br1= new FirefoxDriver();
		}
		else if (br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\ANKUR MALVIYA\\eclipse\\ecllipse new\\Automation1\\Driver\\IEDriverServer.exe");
			br1= new InternetExplorerDriver();
		}
		else if (br.equals("ch"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ANKUR MALVIYA\\eclipse\\ecllipse new\\Automation1\\Driver\\chromedriver.exe");
			br1= new ChromeDriver();
		}
		else 
		{
			System.out.println("Invalid Syntax");
		}
		Thread.sleep(3000);
		if (br1!=null)
			br1.close();// 
		

}
}
