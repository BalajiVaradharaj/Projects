package selenium_advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/sortable.html");
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		WebElement FromElement = elements.get(6);
		WebElement ToElement = elements.get(1);
		
		Actions action = new Actions(driver);               //drag and drop operation
		action.clickAndHold(FromElement);
		action.moveToElement(ToElement);
		action.build().perform();

	}

}
