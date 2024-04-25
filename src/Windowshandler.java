import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//click on green blinking link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//Below set gives us the ids of the no. of windows/tabs opened
		Set<String> ids=driver.getWindowHandles(); //[parentid,childid]
		//We iterate through the ids using below method
		Iterator<String> it=ids.iterator();
		
		//There are two tabs and these are stored in variables parent and child
		String parent=it.next();
		String child=it.next();
		
		//System.out.println(parent);
		
		//Below method is used to switch to a paticular/specific tab by providing the stored id
		//of the tab.
		driver.switchTo().window(child);
		
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		//Below variable J stores the specific text extracted from the child tab
		String J=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		//below method switches to parent tab
		driver.switchTo().window(parent);
		
		//Sending the extracted text as an input to username field in parent tab.
		driver.findElement(By.id("username")).sendKeys(J);

	}

}
