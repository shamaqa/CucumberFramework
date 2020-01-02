package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.contentEquals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.contentEquals("chrome"))
		{
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	
	
	
}
