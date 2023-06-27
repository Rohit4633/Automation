package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/* if in dropdown tagname is of button then we have use other method-
		   WebElement dropdown=driver.findElement(by.xpath(""));
		   list<webelement>dropdown= driver.webelements(by.xpath(xpath/parent;class/child;class/child));
		   
		   for each loop
		   
		   for(webelement ele:dropdown){
		   String OtionValue=ele.gettext();
		   System.out.println(optionvalue);
		   
		   if(optionvalue.equals("2")){
		   ele.click();
		   }
		   }
		   
		   
		*/
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		WebElement tutorial= driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
		tutorial.click();
		
		List<WebElement> tutVal =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
	
		for(WebElement values:tutVal) {
			
			
			
			System.out.println(values.getText());
			
			if(values.getText().equals("About Us")){
				values.click();
				break;
			}
			
		}
	}

}
