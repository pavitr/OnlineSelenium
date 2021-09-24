package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObectRepository {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObectRepository objectrepro=new ObectRepository();
		
		//Specify the proprty file location
		
		File src=new File("C:\\Users\\pavthrc\\Documents\\selenium\\OnlineSelenium\\Repository\\ObjectRepository.properties");
		
		//Create FileInputStream class object to load the file
		FileInputStream fis=new FileInputStream(src);
		
		//Create properties class object to read the file
		Properties pro=new Properties();
		pro.load(fis);
		
		//Setting the webdriver property
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		objectrepro.hitUrl(driver, pro.getProperty("Url1"));
		objectrepro.hitUrl(driver, pro.getProperty("url"));
		driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys(pro.getProperty("EmailTestData"));
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public void hitUrl(WebDriver driver, String urlAddress)
	{
		driver.get(urlAddress);
	}
	
	

}
