import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class Prcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions action=new Actions(driver);
		
		//action.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyDown(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).keyDown(Keys.END).keyDown(Keys.CONTROL).perform();
		
		

	}

}
