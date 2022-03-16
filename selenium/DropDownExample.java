package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		// 1. dropdown by index
		
		WebElement DD1_Index = driver.findElement(By.id("dropdown1"));
		Select select = new Select(DD1_Index);
		select.selectByIndex(4);     // Selecting By Index   
		
		select.selectByValue("2");   // Selecting By value
		
		select.selectByVisibleText("selenium");   // Selecting By visibletext
		
		List<WebElement> ListOfOptions  = select.getOptions();  //Finding list of elements
		int Size = ListOfOptions.size();
		System.out.println("No of Elements:"+ Size);
		
		DD1_Index.sendKeys("Loadrunner");       // Dropdown using sendkeys
		
		WebElement Multi_Select = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select Multi_Select_Box = new Select(Multi_Select);
		
		Multi_Select_Box.selectByIndex(1);
		Multi_Select_Box.selectByIndex(2);
		Multi_Select_Box.selectByIndex(3);
	}

}
