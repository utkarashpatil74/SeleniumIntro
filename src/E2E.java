import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*
		 * from line 20 to 32 code is regarding the from and to city drop downs.
		 */
		
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
		
		
		//To click on current date from calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		//Code to select the passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Code to click on check box
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Code to validate if return date option is enabled or not
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Its enabled");
			Assert.assertFalse(false);
		}
		
		
		
		//Click on search button
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
	}

}
