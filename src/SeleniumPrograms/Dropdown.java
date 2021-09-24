package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//select[@id='day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='2']")).click();
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		
		List<WebElement> radio=driver.findElements(By.xpath("//select[@id='day']//option"));
		String day="16";
		System.out.println("Size" +radio.size());
		
		for(int i=0; i<radio.size(); i++)
		{
	
			if(radio.get(i).getText().equalsIgnoreCase(day))
			{
		
				radio.get(i).click();
			}
		}
		Thread.sleep(2000);
		
		List<WebElement> radio1=driver.findElements(By.xpath("//select[@id='month']//option"));
		String month="Sep";
		System.out.println("Size" +radio1.size());
		
		for(int i=0; i<radio1.size(); i++)
		{
			
			if(radio1.get(i).getText().equalsIgnoreCase(month))
			{
				
				radio1.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		List<WebElement> radio2=driver.findElements(By.xpath("//select[@id='year']//option"));
		String year="1996";
		System.out.println("Size" +radio2.size());
		
		for(int i=0; i<radio2.size(); i++)
		{
			
			if(radio2.get(i).getText().equalsIgnoreCase(year))
			{
				
				radio2.get(i).click();
			}
		}

	}

}
