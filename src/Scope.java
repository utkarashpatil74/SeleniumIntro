import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//gives the count of link present in the web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//gives the count of link present in the footer section of a web page
		WebElement footer=driver.findElement(By.id("gf-BIG")); //limiting the scope of webdriver
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//gives the count of link present in the footer column of a web page.
		WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		
		System.out.println(column.findElements(By.tagName("a")).size());	
		
		
		//Click on each link in the column and check if the pages are opening.
		
		for(int i=1; i<column.findElements(By.tagName("a")).size();i++)
		{
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			column.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000);
		}
		
		Set<String> ids=driver.getWindowHandles();
		
	
		for(int i=0;i<ids.size();i++)
		{
			String
		}

	}

}
