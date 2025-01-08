package featurepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	
	@Given("print something")
	public void print_something() {
      System.out.println("I am background");
	}
	
	@Before
	public void tj(){
		
		driver = new ChromeDriver();
		System.out.println("i am before");
		
	}

	
	@Given("I can see search field on home page of amazon")
	public void visible_filed() {
		
		System.out.println("I can see search field");
		
	}
	
	@When("searched {string} in search result.")
	public void searchstring(String worrd) {
		System.out.println("Searched string successfully");
		
		
		
	}
	
	@Then("all bat results seen on page")
	public void resultseen() {
		
		System.out.println("can see multiple bat results");
		
		
	}
	
	
	
	//second
	
	

	
	@Given("Opened facebook page")
	public void opened_facebook_page() {
	    
	    driver.get("https://www.facebook.com/");
		
	
		
	}

	@When("Entered username as {string} Password as {string}")
	public void entered_username_as_password_as(String username, String password) {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
		
	}

	@When("hits login button")
	public void hits_login_button() {
	
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
		
		
	}

	@Then("login should be unsuccessful.")
	public void login_should_be_unsuccessful() {

		
		
		
	}

	
	//third
	
	
	@Given("{int} number one and {int} number two")
	public void sho_num(int number1, int number2) {
		
		System.out.println("number1 is :"+number1+"number2 is :"+ number2);
		
	}
	
	
	int total;
	
	@When("add {int} and {int}")
	public void addition(int number1, int number2) {
		
	total = number1 + number2;
		
		
	}
	
	@Then("{int} is diplayed")
	public void add_final(int nom) {
		
		
		int expected = nom;
		
		int actual = total;
		
		Assert.assertEquals(actual, expected);
		
		//System.out.println("Total is:"+ total);
		
	}
	
	

	
	
	@After 
	public void fi() {
		
		
		driver.quit();
		System.out.println("i am after");
	}
	
	
	
	
	
}
