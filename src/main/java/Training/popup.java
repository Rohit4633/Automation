package Training;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		//implicit wait- for synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btn =driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		
		btn.click();
		
		Alert a = driver.switchTo().alert();
		
	
		//String value=a.getText();	
		//System.out.println(value);

		//a.sendKeys("rohit");
		
		a.accept();		
		
		
	
	}

}
