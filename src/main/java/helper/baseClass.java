package helper;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static WebDriver driver;

	//for change of browser we will use concept of property
	// create a folder testdata
	//then a file in that folder
	//put data in that file
	//create this code....IDE will automatically surround ur code with try/catch for any exception
	//then copy/paste ur url data in testdatafile and write only key name=url in driver.get input
	//then create prop object
	//prop.load then IDE will automatically will ask to try try/catch
	//then we will define if and else for the browser value
	public static Properties prop;
	static{
		
		try {
			FileInputStream file =new FileInputStream("testData/testData properties");
			
			 prop=new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
@Before
		public static void setup() {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
			
		driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--incognito");
		 driver = new ChromeDriver(option);
		}
			else if (browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions option = new FirefoxOptions();
				option.addArguments("--incognito");
				driver = new FirefoxDriver();
			}else if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement aged= driver.findElement(By.xpath("//button[@class='age_cookie_button_2 age_2']"));
        aged.click();
	
}

		public void signin() {
			WebElement signin= driver.findElement(By.xpath("//a[@class=' no-customer site-nav__link_account site-nav__link site-nav__link--icon']"));
			signin.click();
			
		}
		
		public void signEmail(){
			
			WebElement signEmail= driver.findElement(By.xpath("//input[@id='CustomerEmail']"));
			signEmail.sendKeys("iamrohit@gmail.com");
			
			
		}
		public void signPass() {
			WebElement signPass= driver .findElement(By.xpath("//input[@id='CreatePassword']"));
			signPass.sendKeys("123456789");
		}
		public void signIn() {
			
			WebElement signIn= driver.findElement(By.xpath("//button[@class='btn login_customer']"));
			signIn.click();
			}
		public void register() {
			 WebElement register=driver.findElement(By.xpath("//a[@class='active']"));
			 register.click();
			 }
		public void title() {
			WebElement title = driver.findElement(By.xpath("//select[@id='Title']"));
		
		 Select t=new Select(title);
		 t.selectByVisibleText("Mr.");
		}
		 
		 public void fName() {
		 WebElement fName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		 fName.sendKeys("Rohit");
		 }
		 
		 public void lName() {
		 WebElement lName = driver.findElement(By.xpath("//input[@id='LastName']"));
		 lName.sendKeys("Mangla");
		 }
		 
		 public void regEmail() {
		 WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		 email.sendKeys("mangla123@gmail.com");
		 }
		 public void dob() {
		 WebElement dob = driver.findElement(By.xpath("//input[@id='datepicker']"));
		 dob.sendKeys("18-09-1999");
		 } 
		 public void lang() {
			 WebElement lang = driver.findElement(By.xpath("//select[@id='Preferred_Language']"));
		 
		 Select l=new Select(lang);
		 l.selectByVisibleText("Arabic");
		 }
		 public void nation() {
			 WebElement nation = driver.findElement(By.xpath("//select[@id='Nationality']"));
		 
		 Select n=new Select(nation);
		 n.selectByVisibleText("Indian");
		 }
		 public void phone() {
		 WebElement phone = driver.findElement(By.xpath("//input[@id='phone_number']"));
		 phone.sendKeys("8881881818");
		 }
		 public void pass() {
			 WebElement pass = driver.findElement(By.xpath("//input[@id='CreatePassword']"));
		 
		 pass.sendKeys("H2h2h2h2@");
		 }
		 public void conpass() {
			 WebElement conpass = driver.findElement(By.xpath("//input[@id='cnfrm_Password']"));
		 
		 conpass.sendKeys("H2h2h2h2@");
		 }
		 public void tnc(){
			 WebElement tnc=driver.findElement(By.xpath("//span[@class='checkmark']"));
		 tnc.click();
		 }
		 public void createAcc() {
			 WebElement createAcc= driver.findElement(By.xpath("//button[@class='btn register_customer']"));
			 createAcc.click();
		 }
		 
		 public void search() {

				WebElement search= driver.findElement(By.xpath("//input[@class='site-header__search-input']"));
				search.sendKeys("watermelon");
				
				Actions action=new Actions(driver);
				action.sendKeys(Keys.ENTER).build().perform();
		 }
				
				public void product(){
					
				WebElement product= driver.findElement(By.xpath("//a[@href='/products/watermlon-vuse-go']"));
				product.click();
				}
				public void addToBasket()
				{
				WebElement addToBasket= driver.findElement(By.xpath("//button[@name='add']"));
				addToBasket.click();
		 }
				public void contactUs()
				{
					 Actions a = new Actions(driver);
				        WebElement contact= driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link-svg  hover-red ']"));
				        a.moveToElement(contact);
				        a.click(contact).build().perform();

		 }
				public void firstName() {
					WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
					firstName.sendKeys("rohit");
				}
				public void lastName() {
					WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
					lastName.sendKeys("mangla");
				}
				public void emailAdd() {
					WebElement emailAdd=driver.findElement(By.xpath("//input[@id='email-6e32357a-2ce0-4ec8-a39a-c3f7742ece58']"));
                     emailAdd.sendKeys("dyfy@54gmail.com");
				}
				public void contct() {
					WebElement contct=driver.findElement(By.xpath("//input[@id='mobilephone-6e32357a-2ce0-4ec8-a39a-c3f7742ece58']"));
					contct.sendKeys("9999999999");
				}
				public void feedbck() {
					WebElement feedbck=driver.findElement(By.xpath("//textarea[@id='message-6e32357a-2ce0-4ec8-a39a-c3f7742ece58']"));
                     feedbck.sendKeys("how are you bro");
				}
				public void sendMsg() {
					WebElement sendMsg=driver.findElement(By.xpath("//input[@value='SEND MESSAGE']"));
                     sendMsg.click();
				}
				public boolean validateSite() {
					WebElement validateSite=driver.findElement(By.xpath("path of desired element"));
					return validateSite.isDisplayed();//isdisplayed used for the given path is showing or not and validate our scenario
					 
				}
				public void user_enters_the(String username2, String password3) {
					WebElement heading = driver.findElement(By.xpath(""));
					String headingText= heading.getText();
				    AssertEquals("manish",headingText);
					
							
						WebElement username1= driver.findElement(By.xpath("//input[@id='CustomerEmail']"));
						username1.sendKeys("username2");
						WebElement passwrd= driver.findElement(By.xpath("//input[@id='CreatePassword']"));
						passwrd.sendKeys("pass");
						
						
					
				}
	

	private void AssertEquals(String string, String headingText) {
					// TODO Auto-generated method stub
					
				}

	public void waitForAlert(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public void waitForElement(WebElement ele,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
	/*public void takeScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrFile= ts.getScreenshotAs(OutputType.FILE);
		
		try {
		//	FileUtils.copyFile(scrFile, new File("Screenshots/test.png"));-as in this system will take only one format so we will change the file name to default
			FileUtils.copyFile(scrFile, new File("Screenshots/"+System.currentTimeMillis()+"png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}
	@After
	public void closeBrowser(Scenario s) {
		if(s.isFailed()) {
			takeScreenshot();
			driver.quit();
			
		}
		}
		
		
	}*/
	

 
	

