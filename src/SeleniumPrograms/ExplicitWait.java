package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavithrac582@gmail.com");
		WebDriverWait wt=new WebDriverWait(driver, 30);//1 sec=2 retry, 30sec=60retry
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass1']"))).sendKeys("7353292671");
		
	}

}
