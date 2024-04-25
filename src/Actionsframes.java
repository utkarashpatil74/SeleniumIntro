import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/");
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
		WebElement f=driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(f).click().keyDown(Keys.SHIFT).sendKeys("utkarsh").build().perform();
		WebElement g=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		act.moveToElement(g).contextClick().build().perform();

	}

}
