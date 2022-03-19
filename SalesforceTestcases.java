package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceTestcases {

	   static WebDriver driver;
	  static
	  {
		  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	  }
	 public static void LoginError1 ()
	{
		   driver.get("http://www.google.com");
			  driver.navigate().to("http://login.salesforce.com");
			driver.manage().window().maximize();  
			
		WebElement username =driver.findElement(By.name("username"));
				username.sendKeys("devi.feb22@tekarch.com");
		WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Salesforce@1");
				WebElement login=driver.findElement(By.name("Login"));
				login.click();
			
			String  actualtitle = "Salesforce: We Bring Companies and Customers Together";
		    
		    if (actualtitle.equals(driver.getTitle())) {
		        
		      System.out.println("test is pass");
		    }
            else
		    {
		    	System.out.println("test is fail");
		    }
		 driver.close();
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginError1();
	
	
	
	}

}
