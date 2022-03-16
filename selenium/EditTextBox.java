package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class EditTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("Balaji@gmail.com");                 // return type
		
		WebElement AppendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		AppendBox.sendKeys("Added Text");
		
		String value = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled  = disabledbox.isEnabled();
		System.out.println(enabled);
	}

}
