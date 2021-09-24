package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();

		//Total no of frames in web page
		int TotalFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println(TotalFrames);
		
		//go inside each frame and check which frame has our element
		for(int i=0; i<TotalFrames; i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),' Watch Video')]")).click();
			
			
		}
		
	}

}
