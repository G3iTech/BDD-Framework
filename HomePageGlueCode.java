package glueCode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

// gluecode is also callled STEP DEFINITION
// need to import because the extends class is from a different packge

public class HomePageGlueCode extends WebConnector {

	@Given("I am on the home page")
	public void i_am_on_the_home_page() throws InterruptedException {
		driver.get(baseurl);

		Thread.sleep(3000);
	}

	@Then("I should see {string} title")
	public void i_should_see_title(String expectedTitle) {
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

	@When("I click on {string} button")
	public void i_click_on_button(String locator) { // change the string to locator
		driver.findElement(By.xpath(locator)).click(); // change the String replacing with locator
	}

	@Then("the page url should contain {string}")
	public void the_page_url_should_contain(String expectedPath) throws InterruptedException {
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedPath));
		Thread.sleep(3000);

	}

// retrieve quote button (passed)
	@When("I click on {string} buton")
	public void i_click_on_buton(String string) {
		driver.findElement(By.xpath(string)).click();

	}


@Given("the product guide is visible {string}")
public void the_product_guide_is_visible(String string) throws InterruptedException {
  WebElement ele = driver.findElement(By.xpath(string));
  ele.isDisplayed();
  Thread.sleep(3000);
}

@Given("I click {string} button")
public void i_click_button(String string) {
    driver.findElement(By.xpath(string)).click();
}
}
	
