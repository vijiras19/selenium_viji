package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphone_test2 {
	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://opencart-prf.exense.ch/");
driver.findElement(By.name("search")).sendKeys("Iphone");
driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input"));
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"button-account\"]")).click();
Thread.sleep(5000);
driver.findElement(By.name("firstname")).sendKeys("test");
Thread.sleep(3000);
driver.findElement(By.name("lastname")).sendKeys("phone");
Thread.sleep(5000);
//driver.findElement(By.id("input-payment-email")).sendKeys("testphone@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("input-payment-email")).clear();
Thread.sleep(3000);
driver.findElement(By.id("input-payment-email")).sendKeys("phone@gmail.com");
driver.findElement(By.name("telephone")).sendKeys("37678898999");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"input-payment-password\"]")).sendKeys("1234567");
driver.findElement(By.name("confirm")).sendKeys("1234567");
driver.findElement(By.name("address_1")).sendKeys("456 london dr");
Thread.sleep(3000);
driver.findElement(By.name("city")).sendKeys("mclean");
driver.findElement(By.name("postcode")).sendKeys("23456");
Thread.sleep(3000);
driver.findElement(By.name("country_id")).sendKeys("United kingdom");
Thread.sleep(3000);
driver.findElement(By.name("zone_id")).sendKeys("Aberdeen");
driver.findElement(By.name("agree")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"button-register\"]")).click();
//driver.findElement(By.name("shipping_address")).click();
//Thread.sleep(3000);
//driver.findElement(By.name("button-guest"));
//driver.findElement(By.id("button-shipping-method"));
	}
	
	}
	
