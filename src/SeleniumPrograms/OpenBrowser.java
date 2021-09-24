package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		
		//use alwas exception its a parent method
		// TODO Auto-generated method stub
		//System is a predefined class, .Set property is an extension method
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		
		/*System.setProperty("webdriver.gecko.driver", "C://Users//pavthrc//Desktop//Software//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		//To Launch the chrome browser instance
		WebDriver driver=new ChromeDriver();
		
		//Manage is WebDriver method
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//get is a Webelement operational methods which is used to open url .driver is a reference of webdriver interface
		driver.get("https://m.facebook.com/");
		
		//Sleep for 2 seconds
		Thread.sleep(3000);
		
		//To navigate to different Browser
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		//Refresh the page
		driver.navigate().refresh();
		
		//navigate backward
		driver.navigate().back();
		//navigate forward
		driver.navigate().forward();
		
		//To get Current URL
		String d=driver.getCurrentUrl();
		System.out.println(d);
		
		System.out.println(driver.getTitle());
		
		//when u want to close current window
		driver.close();
		
		//when u want to close all window instance
		driver.quit();

	}

}
