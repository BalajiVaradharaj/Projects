package selenium_advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFiles_2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		
		WebElement DownloadExcel = driver.findElement(By.linkText("Download Excel"));
		DownloadExcel.click();
		
		File FileLocation = new File("C:\\Users\\balajiva\\Downloads");    // Location of the file 
		File[] Total_Files=FileLocation.listFiles();					// listing all files from that location and stored in new variable
		
		for (File file : Total_Files) {
			if(file.getName().equals("textleaf.xlsx")); 
				System.out.println("File is present");
				break;
		}
	}
}
