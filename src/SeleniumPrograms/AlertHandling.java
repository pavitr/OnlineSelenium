package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		
		//verify alert Text
		System.out.println(driver.switchTo().alert().getText());
		String ExpectedResult="Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), ExpectedResult);
		System.out.println("Alert content verified");
		
		//Accept the alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//Dismiss the alert
		driver.navigate().refresh();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Rejected");
		
		
		

	}

}
