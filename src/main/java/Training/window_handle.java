package Training;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String window1 = driver.getWindowHandle();
	     System.out.println(window1);
	     
	   WebElement Btn =  driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
	   Btn.click();
	   
	Set<String> child=   driver.getWindowHandles();
	
	for(String s :child) {
		
		if(!window1.equals(s)) {
			driver.switchTo().window(s);
			String windowTitle= driver.getTitle();
			if (windowTitle.contains("Basic control"));
			// now write what we want to do on that page
			
			Alert a =driver.switchTo().alert();
			a.accept();
			break;
			}
		}
	driver.switchTo().window(window1);
			
			WebElement fname =driver.findElement(By.xpath("//input[@id='firstName']"));
			fname.sendKeys("rohit"); 
			
			driver.close();
			
			driver.switchTo().window(window1);
			
			WebElement type=driver.findElement(By.xpath("//input[@class='whTextBox']"));
			type.sendKeys("me");
			
			
			
		
		
	
	
	
	     
		
}


		
	}
