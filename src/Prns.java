import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prns {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\utkar\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 * 
		 * 
		 * 
		 * WebElement e=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		 * 
		 * Actions act=new Actions(driver); act.moveToElement(e).build().perform();
		 * 
		 * WebElement f=driver.findElement(By.id("twotabsearchtextbox"));
		 * act.moveToElement(f).click().sendKeys("Utkarsh").build().perform();
		 */
		
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(frame);
		
		Actions g=new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		g.dragAndDrop(drag,droppable).build().perform();
		
		
	}

}
