package testsenarios;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Exam {

	
	static WebDriver driver;
	static String URL = "file:///Users/rajjothi_mac/Downloads/QE%20-%20index.html";
		 public static void  test6() {
			 WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get(URL);
			
			//Navigate to the home page
			//Write a method that allows you to find the value of any cell on the grid
			//Use the method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
			//Assert that the value of the cell is "Ventosanzap"

	}

}
