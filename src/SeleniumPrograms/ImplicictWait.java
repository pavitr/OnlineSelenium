package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicictWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");

		// How to Handle Auto Suggestion

		WebElement AllSuggestion = driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> suggestion = AllSuggestion.findElements(By.tagName("li"));

		System.out.println(suggestion.size());

		for (int i = 0; i < suggestion.size(); i++) {
			String fina = "How Stuff Works science";
			if (suggestion.get(i).getText().equalsIgnoreCase(fina)) {
				suggestion.get(i).click();
				break;
			}
		}

	}

}
