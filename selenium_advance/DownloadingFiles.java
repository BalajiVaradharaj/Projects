package selenium_advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		
		WebElement UserID = driver.findElement(By.id("usernameField"));
		UserID.sendKeys("balaji.varadharaj96@gmail.com");
		
		WebElement Password = driver.findElement(By.id("passwordField"));
		Password.sendKeys("Balaji@1996");
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[2]/div[3]/div/button[1]"));
		LoginButton.click();
		Thread.sleep(1000);
		WebElement ProfileName = driver.findElement(By.linkText("My Naukri"));
		ProfileName.click();
		
		WebElement DownloadResume = driver.findElement(By.xpath("//*[@id=\'lazyAttachCV\']/div/div/div[2]/div[1]/div[1]/div[2]/div/i"));
		DownloadResume.click();
		
		Thread.sleep(3000);
		
		File File_Location = new File("Downloads");
		
		File[] Total_Files = File_Location.listFiles();
		
		for (File file : Total_Files) {
			if(file.getName().equals("Resume")) {
				System.out.println("File is Downloaded");
				break;
			}
		}
	}	
}
