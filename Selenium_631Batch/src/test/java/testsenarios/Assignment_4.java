package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4 {
	static WebDriver Driver;
	public static void main(String[] args) throws Exception {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(6000);
			new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
	Thread.sleep(5000);
	
	new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
	Thread.sleep(3000);
	
	new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
	Thread.sleep(3000);
	
	new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
	Thread.sleep(3000);
    
	new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
	
	
	}
	
	
	
	
	
	

	}
				
	

  