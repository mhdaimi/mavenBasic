package basicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFacebook {
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();	
		
		browser.get("http://www.facebook.com");
		
		browser.findElement(By.name("nam")).sendKeys("mhdaimi");
  }
}
