package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();	
 
	driver.get("https://www.facebook.com");
	//Wait statement
	Thread.sleep(5000);
	//Type some test to username editbox
	
	driver.findElement(By.name("email")).sendKeys("vijicuteraji@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("24111983");
	//wait statement
	Thread.sleep(5000);
    driver.findElement(By.name("login")).click();
    Thread.sleep(5000);
   driver.findElements(By.name("profile.userdropdown-name"));
	Thread.sleep(2000);
   driver.findElement(By.name("logout")).click();
	}

	
	
		
	}
	
	