package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		// driver.close();
		
		// driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.partialLinkText("Go to")).click();
		
		
	}

}
