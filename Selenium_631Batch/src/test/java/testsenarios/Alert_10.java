package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_10 {
	static WebDriver Driver;
	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			Thread.sleep(4000);
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(5000);
			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(3000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(6000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			driver.findElement(By.id("confirmButton")).click();
			Thread.sleep(3000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
		System.out.println(driver.findElement(By.className("text-success")).getText());

			


	}
	
	}

