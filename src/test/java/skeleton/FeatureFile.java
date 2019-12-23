package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureFile {
	WebDriver driver;
	String Email,password;
	@Given("The user is on the demowebshop login page")
	public void the_user_is_on_the_demowebshop_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Sumanth\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		
		  
	 
	}

@Given("The user is on the demowebshop loin page")
public void the_user_is_on_the_demowebshop_loin_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Sumanth\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	
}
    


	@When("the user enters the id and password")
	public void the_user_enters_the_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		 //driver.findElement(By.id("Email")).sendKeys("karthik456@gmail.com");
		  //driver.findElement(By.id("Password")).sendKeys("karthik456");
		  driver.findElement(By.linkText("Log in")).click();
	}
	@When("the user clicks on the register page")
	public void the_user_clicks_on_the_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("Register")).click();
	}

	@Then("the user can enter the valid registration details")
	public void the_user_can_enter_the_valid_registration_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("the demowebshop page is displayed")
	public void the_demowebshop_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}



}
