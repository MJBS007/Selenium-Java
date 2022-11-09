package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {

	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Pass the main URL 
		driver.get("https://www.gingersoftware.com/products/sentence-rephraser");
		
		//minimize the window
		driver.manage().window().minimize();
		//Close the browser
		driver.quit();
	}

}
