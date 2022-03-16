package selenium_advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		List<WebElement> selectable = driver.findElements(
				By.xpath("//*[@id=\'selectable\']/li"));   // Xpath madatory along with /li for selecting items
		
		int Total_Items  = selectable.size();
		System.out.println(Total_Items);
		
		/* Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))                           // Selecting 0th index     *****
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform(); */
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));            // Using clickAndHold option   *****
		actions.clickAndHold(selectable.get(2));
		actions.clickAndHold(selectable.get(3));
		actions.build().perform();
		
	}

}
