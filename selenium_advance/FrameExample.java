package selenium_advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);                         // Switching from webpage to Frame page        ****
		WebElement Button1=driver.findElement(By.id("Click"));
		Button1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);   
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);                         // Nested if frame work
		driver.switchTo().frame("frame2");
		WebElement Button2 = driver.findElement(By.id("Click1"));
		Button2.click();
		
		driver.switchTo().defaultContent();                 // Switch to default content          **** 
		
		List<WebElement> TotalFrame = driver.findElements(By.tagName("iframe"));
		int size = TotalFrame.size();
		System.out.println("No.of.Frames : "+ size);
		
	}

}
