package cucumber;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomer {
	static WebDriver driver;
	@Given("the user navigates into the Addcustomer page")
	public void the_user_navigates_into_the_Addcustomer_page() {
		Hook.driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("the user click on Addcustomer")
	public void the_user_click_on_Addcustomer() {
	    Hook.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("the user has to fill the valid details")
	public void the_user_has_to_fill_the_valid_details(DataTable CustomerDetails) {
		List<String> customerDetailsList = CustomerDetails.asList(String.class);
		System.out.println(customerDetailsList);
		
		Hook.driver.findElement(By.xpath("//label[text()='Done']"));
		Hook.driver.findElement(By.id("fname")).sendKeys(customerDetailsList.get(0));
		Hook.driver.findElement(By.id("lname")).sendKeys(customerDetailsList.get(1));
		Hook.driver.findElement(By.id("email")).sendKeys(customerDetailsList.get(2));
		Hook.driver.findElement(By.name("addr")).sendKeys(customerDetailsList.get(3));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(customerDetailsList.get(4));
		
	}

	@When("the user has to click submit button")
	public void the_user_has_to_click_submit_button() {
	    Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the user see the customer Id generated")
	public void the_user_see_the_customer_Id_generated() {
	    Assert.assertTrue(Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}

}
