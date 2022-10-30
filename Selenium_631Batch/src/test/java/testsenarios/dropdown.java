package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropdown {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();	
	
	
	driver.get("https://collegeweeklive.com/go-signup");
	Thread.sleep(5000);
	
	driver.findElement(By.name("firstName")).sendKeys("viji");
	Thread.sleep(2000);
	driver.findElement(By.name("lastName")).sendKeys("kumar");
	
	Thread.sleep(2000);
	driver.findElement(By.name("emailAddress")).sendKeys("viji.ras19@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("phoneNumber")).sendKeys("7623714479"); 
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("123456we");
	Thread.sleep(2000);
	driver.findElement(By.name("ConfirmPassword")).sendKeys("123456we");
	Thread.sleep(2000);
	driver.findElement(By.name("nationality")).sendKeys("India");
	Thread.sleep(2000);
	driver.findElement(By.name("attendeeType")).sendKeys("");
	Thread.sleep(2000);
	
	
	driver.findElement(By.name("questions[q_135]")).click();
	driver.findElement(By.name("questions[q_136]")).click();
	driver.findElement(By.name("questions[q_137]")).click();		 
	}

}
