package selenium_advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();	
		
		String Old_Window = driver.getWindowHandle();                   // To handle old window  
		
		WebElement HomeButton = driver.findElement(By.id("home"));
		HomeButton.click();
		
		Set<String> Handles = driver.getWindowHandles();                // To handle multiple windows
		
		for (String New_Window : Handles) {	
			driver.switchTo().window(New_Window);	
		}
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		Button.click();
	
		WebElement Mail_id = driver.findElement(By.id("email"));          // Doing some actions in new window
		Mail_id.sendKeys("Balaji.Varadharaj@gmail.com");
		
		driver.close();
		
		driver.switchTo().window(Old_Window);                             // It switch to main url page
		
		WebElement Multiple_windows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Multiple_windows.click();
		
		int NumberOfWindows = driver.getWindowHandles().size();           // To find multiple no of windows
		System.out.println("Total No of windows opened are:" + NumberOfWindows);
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		Set<String> NewWindowHandles = driver.getWindowHandles();
		
		for (String allwindows : NewWindowHandles) {
			if (!allwindows.equals(Old_Window)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		}
		
	}

}
