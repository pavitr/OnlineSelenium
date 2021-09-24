package SeleniumPrograms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		//1st way not recommended, but mostly used in Industry
		java.util.List<WebElement> month=driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println("Month "+ month.size());
		month.get(8).click();
		
		//2nd way Recommended
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		//Will use select class Constructor
		Select birth=new Select(bm);
		birth.selectByIndex(10);
		Thread.sleep(2000);
		birth.selectByValue("12");
		Thread.sleep(3000);
		birth.selectByVisibleText("Apr");
		Thread.sleep(3000);
		System.out.println(birth.getFirstSelectedOption().getText());
		
		//3rd way , all web element will be stored in a list
		java.util.List<WebElement> drop=birth.getOptions();
		
		for(int i=0; i<drop.size(); i++)
		{
			if(drop.get(i).getText().equalsIgnoreCase("May"))
			{
				drop.get(i).click();
				break;
			}
		}
		
		//4th way
		System.out.println("Multiple enabled" +birth.isMultiple());//False
		birth.selectByIndex(2);
		//birth.deselectByIndex(3);
		
		//5th Way
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
	}

}
