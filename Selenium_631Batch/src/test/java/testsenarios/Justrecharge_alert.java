package testsenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Justrecharge_alert {
	
	 static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUserName")).sendKeys("sreenivas631batch@yopmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		Scanner S = new Scanner(System.in);
		System.out.println("enter captcha");
		String captcha = S.next();
		driver.findElement(By.id("Captcha")).sendKeys("captcha");
		driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(("//*'[@id=\"listingtable_btnGridDelete_3\"]"))).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
	}
	}


