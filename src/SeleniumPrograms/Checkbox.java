package SeleniumPrograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
       
        Thread.sleep(2000);
        
        //scrolling upto checkbox
        
        WebElement element=driver.findElement(By.xpath("//input[@value='red']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        
        Thread.sleep(5000);
        

		List<WebElement> radio1=driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        String value="yellow";
        driver.findElement(By.xpath("//input[@value='red']")).click();
        
        for(int i=0; i<radio1.size(); i++)
		{
	
			if(radio1.get(i).getText().equalsIgnoreCase(value))
			{
		
				radio1.get(i).click();
			}
		}
	}

}
