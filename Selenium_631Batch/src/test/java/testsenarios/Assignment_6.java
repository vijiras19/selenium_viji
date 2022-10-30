package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_6 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);		
driver.get("https://www.justrechargeit.com/");
Thread.sleep(5000);
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(5000);
driver.findElement(By.name("txtUserName")).sendKeys("wernbi@gmail.com");
Thread.sleep(2000);
driver.findElement(By.name("txtPasswd")).sendKeys("123567764");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.quit();




	}

}
