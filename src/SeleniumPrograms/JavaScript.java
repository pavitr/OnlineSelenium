package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/");
        
        //introducing java script executor interface and casting the interfaces
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        
        //Locating web element using java script and will send data into input field
        jse.executeScript("document.getElementById('email').value='abc@gmmail.com'");
        jse.executeScript("document.getElementById('pass').value='pavi1609'");
        
        //scroll down using java script
        jse.executeScript("window.scrollBy(0,400)");
        
        Thread.sleep(3000);
        
        //Scroll up
        jse.executeScript("window.scrollBy(0,-400)");

	}

}
