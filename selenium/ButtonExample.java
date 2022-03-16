package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		// 1.Getting xy position
		WebElement getPositionButton = driver.findElement(By.id("position"));
		
		Point xypoint=getPositionButton.getLocation(); 
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		
		System.out.println("X value is" + xValue + "Y value is"+ yValue);    // syso 
		
		// 2.Find the color
		WebElement ButtonColor = driver.findElement(By.id("color"));
		String Color = ButtonColor.getCssValue("background-color");
		System.out.println("Button color is:" + Color );
		
		// 3.Button Size
		WebElement ButtonSize = driver.findElement(By.id("size"));
		int Height = ButtonColor.getSize().getHeight();
		int Width = ButtonColor.getSize().getWidth();
		System.out.println("Heigh is:"+Height+"Width is:"+Width);
		
		// 4. go to home	
		WebElement Home = driver.findElement(By.id("home"));
		Home.click();
	}

}
