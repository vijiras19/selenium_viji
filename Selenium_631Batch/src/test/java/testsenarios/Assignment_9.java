package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_9 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		System.out.println("error message");
		driver.findElement(By.name("firstName")).getText();
		System.out.println("error message1");
		driver.findElement(By.name("lastName")).getText();
		System.out.println("error message2");
		Thread.sleep(3000);
		driver.findElement(By.id("emailAddress")).click();
		System.out.println("error message3");
		driver.findElement(By.name("phoneNumber")).getText();
		System.out.println("error message4");
		driver.findElement(By.name("password")).getText();
		System.out.println("error message5");
		driver.findElement(By.name("ConfirmPassword")).getText();
		System.out.println("error message6");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).getText();
		System.out.println("error message7");
		driver.findElement(By.xpath("//*[@id=\"register\"]/div[4]/div[2]/div/div/select")).getText();
		System.out.println("error message8");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	driver.quit();
		
		


	}

}
