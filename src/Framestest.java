import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(frame);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		System.out.println(driver.findElement(By.id("draggable")).getText());
		
		Actions df=new Actions(driver);
		
		
		df.dragAndDrop(source, target).build().perform();
		

	}

}
