package stepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Training.login;
import helper.baseClass;
 
public class loginPageSteps extends baseClass

{
	
	login l = new login();

	WebDriver driver;
	@Given("user launch the url")
	public void user_enters_the_url() {
		setup();
	}

	@When("user click on register")
	public void user_click_on_register() {
		register();
	}

	@When("select the title")
	public void select_the_title() {
	   title();
	}

	@When("enters the first name")
	public void enters_the_first_name() {
	   fName();
	}

	@When("enters the last name")
	public void enters_the_last_name() {
	    lName();
	}

	@When("enters the email")
	public void enters_the_email() {
	  regEmail();
	}

	@When("enters the dob")
	public void enters_the_dob() {
	  dob();
	}

	@When("enters the lang")
	public void enters_the_lang() {
	    lang();
	    
	}

	@When("select the nation")
	public void select_the_nation() {
     nation();
	}

	@When("enters the contact")
	public void enters_the_contact() {
	  phone();
	}

	@When("create password")
	public void create_password() {
	  pass();
	}
	
	@When("confirm password")
	public void confirm_password() {
		conpass();
	}
	@When("tick the privacy tickbox")
	public void tick_the_privacy_tickbox() {
	   tnc();
	}

	@Then("create the account")
	public void create_the_account() {
	   createAcc();
	}

	
	
	
	
}
	
	
	
	