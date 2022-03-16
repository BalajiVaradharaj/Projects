package selenium_advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement UploadButton = driver.findElement(By.name("filename"));
		Actions act = new Actions(driver);                              // action is used for mouse function
		act.click(UploadButton).perform();
		
		Thread.sleep(2000);
		
		String uploadfile = "C:\\Users\\balajiva\\Downloads\\testleaf.xlsx";
		
		StringSelection selection = new StringSelection(uploadfile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

	}

}

