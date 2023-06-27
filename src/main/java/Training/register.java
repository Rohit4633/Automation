 package Training;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//for incognito mode=ChromeOptions option=new ChromeOptions();
		//option.addArguments("--incognito");
		//driver = new ChromeDriver(option);
		driver.get("https://kw.vuse.com/account/register");
		driver.manage().window().maximize();
		
		WebElement aged= driver.findElement(By.xpath("//button[@class='age_cookie_button_2 age_2']"));
           aged.click();
		
		WebElement title = driver.findElement(By.xpath("//select[@id='Title']"));
		 Select t=new Select(title);
		 t.selectByVisibleText("Mr.");
		 
		 
		 
		 WebElement fName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		 fName.sendKeys("Rohit");

		 WebElement lName = driver.findElement(By.xpath("//input[@id='LastName']"));
		 lName.sendKeys("Mangla");
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		 email.sendKeys("mangla123@gmail.com");
		 
		 WebElement dob = driver.findElement(By.xpath("//input[@id='datepicker']"));
		 dob.sendKeys("18-09-1999");
		 
		 WebElement lang = driver.findElement(By.xpath("//select[@id='Preferred_Language']"));
		 Select l=new Select(lang);
		 l.selectByVisibleText("Arabic");
		 
		 WebElement nation = driver.findElement(By.xpath("//select[@id='Nationality']"));
		 Select n=new Select(nation);
		 n.selectByVisibleText("Indian");
		 
		 WebElement phone = driver.findElement(By.xpath("//input[@id='phone_number']"));
		 phone.sendKeys("8881881818");
		 
		 WebElement pass = driver.findElement(By.xpath("//input[@id='CreatePassword']"));
		 pass.sendKeys("H2h2h2h2@");
		 
		 WebElement conpass = driver.findElement(By.xpath("//input[@id='cnfrm_Password']"));
		 conpass.sendKeys("H2h2h2h2@");
		 
		 WebElement check=driver.findElement(By.xpath("//input[@id='accept_privacy']"));
		 check.click();
		 
		 WebElement validateSite=driver.findElement(By.xpath("path of desired element"));
		 validateSite.isDisplayed();//isdisplayed used for the given path is showing or not and validate our scenario
		 
		 
		/* WebElement check2=driver.findElement(By.xpath("//input[@id='accept_privacy']"));
		 check2.click();*/
		 







	}
}
