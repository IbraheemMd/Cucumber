package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;
	
	@Given("The user has to give the url to enter into homepage")
	public void the_user_has_to_give_the_url_to_enter_into_homepage() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashad\\Desktop\\shahid\\cucumber\\Driver1\\chromedriver.exe");    
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("The user should click on add customer")
	public void the_user_should_click_on_add_customer() {
	   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("The user has to fill the details")
	public void the_user_has_to_fill_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	   
	}

	@When("The user should click on submit button")
	public void the_user_should_click_on_submit_button() {
	 driver.findElement(By.id("fname")).sendKeys("Bhuvaneswaran");
	 driver.findElement(By.id("lname")).sendKeys("k");
	 driver.findElement(By.id("email")).sendKeys("Bhuvaneswaran919@gmail.com");
	 driver.findElement(By.name("addr")).sendKeys("Adayar");
	 driver.findElement(By.id("telephoneno")).sendKeys("9952956178");
	 driver.findElement(By.name("submit")).click();	
	}

	@Then("The customer will get thee customerId")
	public void the_customer_will_get_thee_customerId() {
	
		
	}



}
