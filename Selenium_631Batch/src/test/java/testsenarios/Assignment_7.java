package testsenarios;

import java.text.StringCharacterIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_7 {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(5000);
driver.findElement(By.id("email")).sendKeys("rbjckmanccns" );
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("w23erd");
driver.findElement(By.name("login")).click();
String errormsg = driver.findElement(By.className("_9ay5")).getText();
System.out.println("errormsg");
driver.close();

	
	
	
	
	
}
}
