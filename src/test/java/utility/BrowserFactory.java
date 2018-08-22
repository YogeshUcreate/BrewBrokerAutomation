package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url){
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\browserexe\\geckodriver.exe");
			driver=(WebDriver) new FirefoxDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\browserexe\\chromedriver.exe");
			driver=(WebDriver) new ChromeDriver();
		}		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	

}
