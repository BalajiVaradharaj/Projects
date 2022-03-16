package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleOpenWithFireFox {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\balajiva\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
	
		//enter the search term
		//enter link
		
		driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
		
		
		//driver.quit();
			
	}

}
