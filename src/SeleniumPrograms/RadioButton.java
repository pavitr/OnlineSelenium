package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(2000);
	    
	    //(1st Way)It is not a good Approach to handle with multiple Webelement of same Type
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='-1']")).click();
	    Thread.sleep(2000);
	    
	    //2nd way by creating Radio Button
	    java.util.List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("total Radio Buttons" +radios.size());
	    
	    System.out.println(radios.get(1).isEnabled());// Male radio button is enabled or not
	    System.out.println(radios.get(0).isDisplayed());//Female radio button is displayed or not
	    System.out.println(radios.get(2).isSelected());//If custom is selected or not
	    
	    Thread.sleep(3000);
	    radios.get(1).click();// male is clicked
	    
	    System.out.println(radios.get(1).isEnabled());// Male radio button is enabled or not
	    System.out.println(radios.get(0).isDisplayed());//Female radio button is displayed or not
	    System.out.println(radios.get(2).isSelected());//If custom is selected or not
	    
	    //3rd way -Correct 
	    
		List<WebElement> radios1=driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		String Expectedresult="female";
		
		for(int i=0; i<radios1.size(); i++)
		{
         if( radios1.get(i).getText().equalsIgnoreCase(Expectedresult))
         {
        	 radios1.get(i).click();
         }
	}
		Thread.sleep(3000);
		driver.close();

}
}
