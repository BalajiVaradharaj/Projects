package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
		WebElement Enjoing_class_Yes = driver.findElement(By.id("yes"));   // Clicking radio button
		Enjoing_class_Yes.click();
		
		WebElement Unchecked = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement Checked = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		
		boolean Status1 = Unchecked.isSelected();     // Checking default radio button selection true or false
		boolean Status2 = Checked.isSelected();
		System.out.println(Status1);
		System.out.println(Status2);
		
		WebElement Above40 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
		Above40.click();
		
	}

}
