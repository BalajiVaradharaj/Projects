package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteExample {
	WebDriver driver;
	long endTime;
	long startTime;
	
	@BeforeSuite
	public void LaunchDriver() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
		driver.get("http://www.leafground.com/");
	}   
	
	@Test
	public void openBing() {
		driver.get("http://wwww.bing.com");
	}
	
	@Test
	public void openYahoo() {
		driver.get("http://wwww.yahoo.com");
	}
	
	@AfterSuite
	public void CloseDriver() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long TotalTime = endTime-startTime;
		System.out.println("Total time taken : " + TotalTime);
		
	}

}
