package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Create list of all Company
		List<WebElement> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println("Total company"+allCompanies.size());
		
		//Create list of all Current Price
		
		String ExpectedResult="Yug Decor";
		
		List<WebElement> allCurrentPrice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total company"+allCurrentPrice.size());
		
		for(int i=0;i<allCompanies.size();i++)
		{
			if(allCompanies.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				System.out.println(allCompanies.get(i).getText()+ "=====" +allCurrentPrice.get(i).getText());
			}
		}
		
		

	}

}
