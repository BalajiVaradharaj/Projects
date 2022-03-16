package selenium_advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Calendar.html");
		
		WebElement Cal_Field = driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		// Cal_Field.sendKeys("17/05/1996"+Keys.ENTER);
		Cal_Field.click();
		
		WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		NextButton.click();
		WebElement DateButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a"));
		DateButton.click();
	}

}
