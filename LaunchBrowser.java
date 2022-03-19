package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

public static void main(String[] args) throws InterruptedException {
 

    WebDriverManager.chromedriver().setup();
 
 //WebDriverManager.firefoxdriver().setup();
 WebDriver driver = new ChromeDriver();  // Will launch Chrome Browser 
 
 
    Thread.sleep(2000);
 
 driver.manage().window().maximize();
 
 Thread.sleep(2000);
 
 driver.get("https://login.salesforce.com/?locale=in");
 
 //driver.quit();
}
}
	