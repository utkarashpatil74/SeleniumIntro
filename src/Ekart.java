import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Ekart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		getdetails(driver,j);
		nextstep(driver, w);
		
		
		
		}
		
		
		

	

public static void getdetails(WebDriver driver, int j)
{
	
	String[] veggies= {"Cucumber","Brocolli","Beetroot","Potato"};
	
	List veg2=Arrays.asList(veggies);
	
	List<WebElement> wb=driver.findElements(By.cssSelector("h4[class='product-name']"));
	
	for(int i=0;i<wb.size();i++)
	{
		String name[]=wb.get(i).getText().split("-");
		String formattedname=name[0].trim();
		
		if(veg2.contains(formattedname))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
		
		if(j==veggies.length)
		{
			break;
		}
		}
		
}

	

}

public static void nextstep(WebDriver driver, WebDriverWait w)
{
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	
}
}