package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_To_SFDC {
      static WebDriver driver;
      static WebElement username,password,loginButton;
      
      static {
    	  WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
        }
	 
	public static void Login_Error1(){
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.navigate().to("http://login.salesforce.com");
		username = driver.findElement(By.id("username"));
		 username.sendKeys("devi.feb22@tekarch.com");
		 loginButton = driver.findElement(By.id("Login"));
		 loginButton.click();
	String text = driver.findElement(By.id("error")).getText();
	  driver.close();
	 
	
	}
	public static void Logintosalesforce() {
		driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		  username = driver.findElement(By.id("username"));
	      username.sendKeys("devi.feb22@tekarch.com");
	      password = driver.findElement(By.id("password"));
	     password.sendKeys("Salesforce@1");
	      loginButton = driver.findElement(By.id("Login"));
		  loginButton.click();
		 driver.getTitle();
	    driver.close();
	  }
	
	public static void main(String[] args) {
		
		Login_Error1();
		Logintosalesforce();
	
	
	}

}
