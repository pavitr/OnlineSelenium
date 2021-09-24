package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
        // Print how many windows are open'
		Thread.sleep(3000);
		Set<String> popupID=driver.getWindowHandles();
		System.out.println(popupID);
		System.out.println(popupID.size());
		
		Iterator<String> abc=popupID.iterator();
		String window1=abc.next();
		String window2=abc.next();
		String window3=abc.next();
		String window4=abc.next();
		
		//print tile of window 2
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		driver.close();
		
		//print title of window3
		driver.switchTo().window(window3);
		System.out.println(driver.getTitle());
		driver.close();
		
		//quit all window
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
