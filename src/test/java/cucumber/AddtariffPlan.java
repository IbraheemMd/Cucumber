package cucumber;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddtariffPlan {

static WebDriver Hookdriver;
	
@Given("The user must be in Telecom Homepage")
public void the_user_must_be_in_Telecom_Homepage() {
    Hook.driver.get("http://demo.guru99.com/telecom/");
    
}

@Given("the user should click on AddTariffPlans")
public void the_user_should_click_on_AddTariffPlans() {
     Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("The User should fill required details")
public void the_User_should_fill_required_details(DataTable TariffPlans) {
    Map<String, String> tariffPlansMap = TariffPlans.asMap(String.class, String.class);
	System.out.println(tariffPlansMap);
    
	Hook.driver.findElement(By.id("rental1")).sendKeys(tariffPlansMap.get("MonthlyRental"));
	Hook.driver.findElement(By.id("local_minutes")).sendKeys(tariffPlansMap.get("FreeLocalMinutes"));
	Hook.driver.findElement(By.id("inter_minutes")).sendKeys(tariffPlansMap.get("FreeInternational Minutes"));
	Hook.driver.findElement(By.id("sms_pack")).sendKeys(tariffPlansMap.get("FreeSMSPack"));
	Hook.driver.findElement(By.id("minutes_charges")).sendKeys(tariffPlansMap.get("LocalPerMinutesCharges"));
	Hook.driver.findElement(By.id("inter_charges")).sendKeys(tariffPlansMap.get("InternationalPerMinutesCharges"));
	Hook.driver.findElement(By.id("sms_charges")).sendKeys(tariffPlansMap.get("SMSPerCharges"));

}

@When("The user should click on Submit")
public void the_user_should_click_on_Submit() {
    Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}

@Then("the user see the confirmation message")
public void the_user_see_the_confirmation_message() {
    Assert.assertTrue(Hook.driver.findElement(By.xpath("//h2[contains(text(),'you')]")).isDisplayed());
	
}


@Given("The user should be in home page")
public void the_user_should_be_in_home_page() {
    Hook.driver.get("http://demo.guru99.com/telecom/");
}

@Given("The user should click on Addtariffplan")
public void the_user_should_click_on_Addtariffplan() {
	Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("The user should give valid details{string},{string},{string},{string},{string},{string},{string}")
public void the_user_should_give_valid_details(String MonthlyRental, String FreeLocalMinutes, String FreeintMinutes, String FreeSMSPack, String LocalPerMinutesCharges, String InternationalPerMinutesCharges, String SMSPerCharges) {
	Hook.driver.findElement(By.id("rental1")).sendKeys(MonthlyRental);
	Hook.driver.findElement(By.id("local_minutes")).sendKeys(FreeLocalMinutes);
	Hook.driver.findElement(By.id("inter_minutes")).sendKeys(FreeintMinutes);
	Hook.driver.findElement(By.id("sms_pack")).sendKeys(FreeSMSPack);
	Hook.driver.findElement(By.id("minutes_charges")).sendKeys(LocalPerMinutesCharges);
	Hook.driver.findElement(By.id("inter_charges")).sendKeys(InternationalPerMinutesCharges);
	Hook.driver.findElement(By.id("sms_charges")).sendKeys(SMSPerCharges);

}

@When("The user should click on the submit button")
public void the_user_should_click_on_the_submit_button() {
	Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("The user can see the congrats message")
public void the_user_can_see_the_congrats_message() {
	Assert.assertTrue(Hook.driver.findElement(By.xpath("//h2[contains(text(),'you')]")).isDisplayed());
}

}
