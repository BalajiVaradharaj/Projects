package selenium_advance;

import java.util.List;

import javax.management.relation.InvalidRoleInfoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		
		WebElement Input = driver.findElement(By.id("tags"));
		Input.sendKeys("s");
		
		Thread.sleep(3000); // Explisit wait 0r implisit wait 
		
		List<WebElement> Options_List = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement webElement : Options_List) {
			if( webElement.getText().equals("Web Services")) {
				webElement.click();
				// System.out.println("if part");
				break;                                 // used to terminate from the loop after finding the element
			}/* else {
				System.out.println("else part");
			}	*/
		}
	}

}
