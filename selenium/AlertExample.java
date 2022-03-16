package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBox.click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();       // Switching control  to alert
		alert.accept();                               // clicking ok to in the alert box & hear alert is a interface
		
		WebElement ConfirmButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmButton.click();
		Thread.sleep(2000);
		Alert ConfirmAlert= driver.switchTo().alert();
		ConfirmAlert.dismiss();                       // clicking Cancel to in the alert box
		
		WebElement PromptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		PromptBox.click();
		Thread.sleep(2000);
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("Naviksha");            // Sending values to the alert
		PromptAlert.accept();

	}

}
