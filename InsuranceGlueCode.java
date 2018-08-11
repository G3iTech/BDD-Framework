package insuranceGlueCode;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;


public class InsuranceGlueCode extends WebConnector{
	
	
	public static String insuranceUrl = "https://www.gocompare.com/insurance/";
	
	@Given("I am on the insurance page")
	public void i_am_on_the_insurance_page()  {
		driver.get(insuranceUrl);
}
	/*
//not working please help
@Then("I enter wrong car registration {string}AboutCarPanel_RegNumber{string}as LA {int} G")
public void i_enter_wrong_car_registration_AboutCarPanel_RegNumber_as_LA_G(String string, String string2, Integer int1) {
    driver.findElement(By.xpath(string)).sendKeys("LA 12 G");
}
// not working please help
@Then("I click on find car {string}about-car-panel{string} button")
public void i_click_on_find_car_about_car_panel_button(String string, String string2) {
    driver.findElement(By.xpath(string)).click();
}
//not working please help
@Then("I should see an error message")
public void i_should_see_an_error_message(Object expectedTitle) {
	Assert.assertEquals(expectedTitle, driver.getTitle());
}
*/	
	
//Locate Motorbike insurance link
@Then("I should see {string} button")
public void i_should_see_button(String string) {
	JavascriptExecutor ex = (JavascriptExecutor) driver;
	ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(By.xpath(string)).click();		
}

//Locate Gas and Electricity
@When("I click on {string} link")
public void i_click_on_link(String string) {
	driver.findElement(By.xpath(string)).click();
    
}
//Locate Gas and Electricity
@Then("I should see {string} link")
public void i_should_see_link(String string) {
	//Assert.assertEquals(string, driver.getTitle());
	String title = driver.getTitle();
			System.out.println(title);
   
}

@When("I click on  the link {string}")
public void i_click_on_the_link(String string) {
	JavascriptExecutor ex = (JavascriptExecutor) driver;
	ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(By.xpath(string)).click();	
}


@When("I click on {string}")
public void i_click_on(String string) {
	JavascriptExecutor ex = (JavascriptExecutor) driver;
	ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(By.xpath(string)).click();	
	
}

@Then("I should be able to see {string} title of the page")
public void i_should_be_able_to_see_title_of_the_page(String string) {
	JavascriptExecutor ex = (JavascriptExecutor) driver;
	ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Assert.assertEquals(string, driver.getTitle());
}


}


	


