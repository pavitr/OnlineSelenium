package JavaPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumPrograms.JavaScript;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);

		
		// Switching frame
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames found=" + iframes.size());

		for (int i = 0; i < iframes.size(); i++) {
			driver.switchTo().frame(i);
			if (driver.findElement(By.id("draggable")).isDisplayed()
					&& driver.findElement(By.id("droppable")).isDisplayed()) {
				Actions act = new Actions(driver);
				act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
				
				
			}
		}

	}

}
