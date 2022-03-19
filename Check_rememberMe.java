package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_rememberMe {

	static WebDriver driver;
    static WebElement username,password,loginButton;
    
    static {
  	  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    driver.get("http://www.google.com");
	
		driver.navigate().to("http://login.salesforce.com");
		username = driver.findElement(By.id("username"));
          username.sendKeys("devi.feb22@tekarch.com");
	    password = driver.findElement(By.id("password"));
	    password.sendKeys("Salesforce@1");
	     driver.findElement(By.name("rememberUn")).click();
	    driver.findElement(By.id("Login")).click();
	    
	      //driver.findElement(By.id("userNavLabel")).click();
	    
	    //driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
	    
	    if (driver.findElement(By.id("userNavLabel")).isDisplayed())
	    {
	    	System.out.println("Usermenu is displayed");
	    	driver.findElement(By.id("userNavLabel")).click();
	    }
	    else
	    {
	    	System.out.println("not displayed");
	    }
	    
	    driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
	    
	    driver.close();
	    
	    
	}



}
