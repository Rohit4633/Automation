package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClass {

	public static void main(String[]args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			Actions action =new Actions(driver);
			
			WebElement product = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
			WebElement live = driver.findElement(By.xpath("//a[class='menu-item-live']"));
			
			action.moveToElement(product);
			action.click(live).build().perform();
			
			WebElement url= driver.findElement(By.xpath("//input[@id='live-form-url']"));
			
			//JavascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",url);
			// Thread.sleep(3000);  -- used for sure click
			
			url.sendKeys("rohit");
			
			action.sendKeys(Keys.ENTER).build().perform();
			
	 
		/*public void visbilityOfElementWait(WebElement ele){
		 * WebDriverWait wait-=new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(Expectedconditions.visibilityOf(ele));
		
		
		*/
		
		}		
	
}
