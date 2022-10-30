package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://blazedemo.com/");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"))).selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("inputName")).sendKeys("viji");
		Thread.sleep(5000);
		driver.findElement(By.id("address")).sendKeys("10004 mulholland drive");
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys("Glen Allen");
Thread.sleep(2000);
driver.findElement(By.id("state")).sendKeys("virginia");
Thread.sleep(2000);
driver.findElement(By.id("zipCode")).sendKeys("23033");
Thread.sleep(2000);
driver.findElement(By.id("cardType")).sendKeys("visa");
Thread.sleep(2000);	
driver.findElement(By.id("creditCardNumber")).sendKeys("124535666");
Thread.sleep(2000);
driver.findElement(By.id("creditCardMonth")).sendKeys("12");
Thread.sleep(2000);
driver.findElement(By.id("creditCardYear")).sendKeys("2024");
Thread.sleep(3000);
driver.findElement(By.id("nameOnCard")).sendKeys("viji");
Thread.sleep(2000);
driver.findElement(By.id("rememberMe")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();



	}
}



