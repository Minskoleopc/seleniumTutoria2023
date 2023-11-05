package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<h3 class = "one" class = "two"> Heading </h3>
		// Web element methods 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement contactText = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		
		
		String txt = contactText.getText();
		System.out.println(txt);
		
	
		String tagName = contactText.getTagName();
		System.out.println(tagName);
		
		
		String attributeNameV = contactText.getAttribute("name");
		System.out.println(attributeNameV);
		

		String attributeClassV = contactText.getAttribute("class");
		System.out.println(attributeClassV);
		
		
		boolean avail = contactText.isDisplayed();
		System.out.println(avail);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
