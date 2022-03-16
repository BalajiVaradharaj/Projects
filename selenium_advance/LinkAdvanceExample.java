package selenium_advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAdvanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://leafground.com/pages/Link.html");      // used to refresh,back etc
		
		WebElement HomePageLink = driver.findElement(By.linkText("Go to Home Page"));
		HomePageLink.click();
		
		driver.navigate().back();
		
		WebElement WhereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=WhereToGo.getAttribute("href");
		System.out.println("This page is redirecting to " + where);
		
		WebElement BrokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		BrokenLink.click();
		
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.err.println("Link is Broken");
		}
		
		driver.navigate().back(); 
		
		WebElement HomePageLink2 = driver.findElement(By.linkText("Go to Home Page"));
		HomePageLink2.click();   /* it create "scale element exception" is accure when one page is redirect to another page, 
								again back to same page to do certain operation on the same page or
								 when there is no element present currently which is present before.*/
		
		driver.navigate().back();
		
		List<WebElement> Total_Links = driver.findElements(By.tagName("a"));
		int Link_counts = Total_Links.size();
		System.out.println("Total Links in the Page : " + Link_counts);
		
	}

}
