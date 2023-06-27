package Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import helper.baseClass;

public class login extends baseClass{
	
	


public void user_enters_the(String username2, String password3) {
	WebElement heading = driver.findElement(By.xpath(""));
	String headingText= heading.getText();
    Assert.assertEquals("manish",headingText);
	
			
		WebElement username1= driver.findElement(By.xpath("//input[@id='CustomerEmail']"));
		username1.sendKeys("username2");
		WebElement passwrd= driver.findElement(By.xpath("//input[@id='CreatePassword']"));
		passwrd.sendKeys("pass");
		
		
	
}
public void signIn() {
	
	WebElement signIn= driver.findElement(By.xpath("//button[@class='btn login_customer']"));
	signIn.click();
	}
public boolean validateSite() {
	WebElement validateSite=driver.findElement(By.xpath("path of desired element"));
	return validateSite.isDisplayed();//isdisplayed used for the given path is showing or not and validate our scenario
	 
}
}