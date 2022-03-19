package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumsesson {
  
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
	driver.get("http://www.salesforce.com");
	  driver.navigate().to("http://www.google.com");
	driver.manage().window().maximize();  
	
	/*driver.findElement(By.name("username")).sendKeys("devi.feb22@tekarch.com");
	driver.findElement(By.id("password")).sendKeys("Salesforce@1");
	driver.findElement(By.name("Login")).click();
	driver.close();*/
	
	System.out.println(driver.getTitle());
	
	
	//driver.findElement(By.linkText("Privacy")).click();
	//driver.findElement(By.partialLinkText("forgot")).click();
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.xpath(null))
	//driver.findElement(By.cssSelector(
	//driver.findElement(By.)
	/*if (driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).isDisplayed())
	{
		System.out.println("Test is passed");
	}
   else
	{
		System.out.println("Test is fail");
	}
	
	}*/
    String  actualtitle = "Salesforce: We Bring Companies and Customers Together";
    if (actualtitle.equals(driver.getTitle()))
    {
    	System.out.println("test is pass");
    }

    else
    {
    	System.out.println("test is fail");
    }
	
	
	String s = "good";
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("devi.feb22@tekarch.com");
	username.click();
	
	//li
	List<WebElement> ribbonElements = driver.findElements(By.xpath("//li"));
	
	
	
	
	
	}
	}
