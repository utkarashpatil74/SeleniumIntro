import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Calender1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\utkar\\\\OneDrive\\\\Documents\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		
		
		//driver.findElement(By.xpath("//a[contains(@text,'Delhi')]")).click();

		/*
		 * Below line of code is for the parent - child relationship
		 */
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Jaipur (JAI)']")).click();

		Thread.sleep(2000);
		
		/*
		 * Below line of code isn't accepted by some client as it contains
		 * index eg. [2]
		 */
		
		//driver.findElement(By.xpath("(//a[@text='Jharsuguda (JRG)'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Pune (PNQ)']")).click();
		
	 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

	}

}
