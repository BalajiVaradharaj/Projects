package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		WebElement Language = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input"));
		Language.click();

		WebElement Sel_Checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean Status = Sel_Checked.isSelected();
		System.out.println(Status);


		// Selecting and deselecting
		WebElement FirstElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if(FirstElement.isSelected()) {
			FirstElement.click();
		}
		WebElement SecondElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(SecondElement.isSelected()) {
			SecondElement.click();
		}
 
		WebElement Click_all_1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		Click_all_1.click();

		WebElement Click_all_2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		Click_all_2.click();

	}

}
