package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_8 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		driver.quit();
		
				
	}

}
