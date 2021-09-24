package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		//creating web element reference
		WebElement electronics=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		//mouse simulation using action class
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		//Mouse Hover to electronics web element
		act.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		//Right Click on Web element
		act.contextClick().build().perform();
		
		Thread.sleep(3000);
		
		//Release control from electronics
		act.release(electronics).build().perform();
		
		Thread.sleep(3000);
		
		//Perform Key Events
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Entered");
		
		Thread.sleep(3000);
		//Press enter key to home web element
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement home=driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
		act.sendKeys(home,Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
