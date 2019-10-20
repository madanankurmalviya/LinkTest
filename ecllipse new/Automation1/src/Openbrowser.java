
public class Openbrowser
{
static
{
	System.setProperty
}

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(1000);
		a.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		a.navigate().to("http://www.youtube.com");
		a.navigate().back();
		Thread.sleep(1000);
		a.navigate().forward();
		Thread.sleep(1000);
		a.navigate().forward();
		Thread.sleep(1000);
		a.close();

	}

}
