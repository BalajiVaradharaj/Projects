package selenium_advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		
		WebElement Name = driver.findElement(By.id("age"));
		String ToolTipText = Name.getAttribute("title");          //   
		System.out.println(ToolTipText);
	}

}
