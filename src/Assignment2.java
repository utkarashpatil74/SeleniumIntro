import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

	}

}
