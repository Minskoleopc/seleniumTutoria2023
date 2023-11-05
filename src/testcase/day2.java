package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Arrange 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		// Action 
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
//		// Assertion 
//		if(driver.getCurrentUrl().contains("inventory")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.close();
		
		
		// Testcase 2
		
		// arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		// actions
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		// assertion
		
		boolean display = driver.findElement(By.cssSelector("#login_button_container > div > form > h3")).isDisplayed();
		if(display) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.close();		
		
		
		
		
		
		
		
		
		
		
		

	}

}
