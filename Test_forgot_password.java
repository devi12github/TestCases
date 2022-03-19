package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_forgot_password {
  static WebDriver driver;
  
  static {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }

  public static void forpassA() {
	  
      driver.get("http://login.salesforce.com");
        driver.findElement(By.id("forgot_password_link")).click();
   if(driver.findElement(By.id("forgotPassForm")).isDisplayed())
   {
	System.out.println("forgot password page is displayed");
}
   else
   {
   	System.out.println("not displayed");
   }
   
   driver.findElement(By.name("un")).sendKeys("devi.feb22@tekarch.com");
   driver.findElement(By.id("continue")).click();
   driver.close();
  }
    
	  public static void forgotpassB() {
		  driver = new ChromeDriver();
		  driver.get("http://login.salesforce.com");
		  driver.findElement(By.id("username")).sendKeys("123");
		  driver.findElement(By.id("password")).sendKeys("22131");
		  driver.findElement(By.id("Login")).click();
	  }
  
  
  
  
  
  public static void main (String[] args) {
	  forpassA();
	  forgotpassB();
	  
	   
	   
	   
	   
	   
	   
	   
	   }
  }


