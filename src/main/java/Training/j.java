package Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kw.vuse.com/account/register");
		driver.manage().window().maximize();
		WebElement aged= driver.findElement(By.xpath("//button[@class='age_cookie_button_2 age_2']"));
        aged.click();
        
        Actions a = new Actions(driver);
        WebElement contact= driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link-svg  hover-red ']"));
        a.moveToElement(contact);
        a.click(contact).build().perform();

        

		/*WebElement search= driver.findElement(By.xpath("//input[@class='site-header__search-input']"));
		search.sendKeys("watermelon");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		WebElement product= driver.findElement(By.xpath("//a[@href='/products/watermlon-vuse-go']"));
		product.click();
		WebElement addToBasket= driver.findElement(By.xpath("//button[@name='add']"));
		addToBasket.click();*/
	

       
		
		
	}

}
