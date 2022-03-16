package selenium_advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		/*
		WebElement FirstImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		FirstImage.click();
		*/
		WebElement BrokenImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//"naturalWidth" = 0
		if(BrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("This image is Broken");
		}else {
			System.out.println("This image is not broken");
		}

	}

}
