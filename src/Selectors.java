import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Whenever there is a select tag is present for any dropdown that means
		 * it is a static drop down.
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\utkar\\\\OneDrive\\\\Documents\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*
		 * we have  to mark that element where dropdown is present by creating 
		 * a webelement and it will used as an argument for line no. 32 when the
		 * object of select class is created.
		 */
		
		WebElement sd=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		/*
		 * Creating an object for select class which is responsible for selecting 
		 * the drop down menu. 
		 */
		Select selectd=new Select(sd);
		
		selectd.selectByIndex(1);
		System.out.println(selectd.getFirstSelectedOption().getText());
		selectd.selectByVisibleText("AED");
		System.out.println(selectd.getFirstSelectedOption().getText());
		

	}

}
