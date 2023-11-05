package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement cabbageElement = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		boolean avail = cabbageElement.isEnabled();
		System.out.println(avail);
		
		WebElement lettuceEleme = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean Ele = lettuceEleme.isEnabled();
		System.out.println(Ele);
		
		WebElement pumpkinEle = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean availe = pumpkinEle.isSelected();
		System.out.println(availe);
		
	
		// getText()
		// getAttribute()
		// isDisplayed()
		// isEnabled()
		// isSelected()
		// getTagName()
		
		// 11 to 15 ----- 16
		
		// postman
		
		
		
		
		driver.close();
		
	}

}
