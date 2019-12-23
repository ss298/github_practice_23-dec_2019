package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstJava {
	WebDriver driver;
	@Given("The user is on the testmeapp homepage")
	public void the_user_is_on_the_testmeapp_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Sumanth\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://10.232.237.143:443/TestMeApp");
		  
	
	}

	@When("the user gives a login id and password")
	public void the_user_gives_a_login_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.name("Login")).click();
		 
	}

	@Then("the user should move to the next page")
	public void the_user_should_move_to_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
			System.out.println("Login Successful");
			driver.close();
	}


}
