import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implementing implicit wait of 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		nextStep(driver);

	}

	public static void nextStep(WebDriver driver) {
		int j = 0;

		/*
		 * Login page implementation
		 */
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		/*
		 * Assigning explicit wait for the pop-up to display and click on okay button.
		 */
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		/*
		 * Creating an object for Select class for selection from select static
		 * dropdown.
		 */

		WebElement e = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sd = new Select(e);

		sd.selectByValue("consult");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

		/*
		 * Next page: Adding products to the cart
		 */

		// Creating an array of products to be selected
		String products[] = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		// Converting the products to be selected to list.
		List<String> fg = Arrays.asList(products);

		// Getting all the products from webpage and storing it in "prod" list
		List<WebElement> prod = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < prod.size(); i++) {

			String name = prod.get(i).getText();

			if (fg.contains(name)) {
				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				if (j == fg.size()) {
					break;
				}
			}

		}

		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

	}

}
