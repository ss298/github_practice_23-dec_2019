package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstDemorun {
	WebDriver driver;
	@Given("The user is on the demowebshop homepage")
	public void the_user_is_on_the_demowebshop_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Sumanth\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
	 
	}

	@When("the user gives a {string} and {string}")
	public void the_user_gives_a_and(String Email, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(Email);
		  driver.findElement(By.id("Password")).sendKeys(password);
		  driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("the relevant login is displayed")
	public void the_relevant_login_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}


}
