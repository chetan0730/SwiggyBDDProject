package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.FindLocation;
import pageObjects.AddFoodItems;
import pageObjects.SearchRestaurants;
import utilities.ActionUtil;

public class Steps extends baseTest {


	@Before
	public void setUp() {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		action = new ActionUtil(driver);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {

		findLocation = new FindLocation(driver,action);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@And("User enter location")
	public void user_enter_location() {
		findLocation.typeLocation();
	   
	}
	@And("User search for restaurants")
	public void user_search_for_restaurants() {
		searchRestaurants = new SearchRestaurants(driver, action);
		searchRestaurants.enterRestaurantToSearch();
	}
	
	@And("I am on Irani cafe restaurant page")
	public void i_am_on_irani_cafe_restaurant_page() {
		addFoodItems = new AddFoodItems(driver, action);

	}
	@And("I add food items to cart")
	public void i_add_food_items_to_cart() {
		addFoodItems.addFoodItemsTocart();
	}
	@And("I remove some items from cart")
	public void i_remove_some_items_from_cart() {
		addFoodItems.RemoveFoodItemsFromCart(); 
	}
	@Then("I check the bill to be paid")
	public void i_check_the_bill_to_be_paid() throws InterruptedException {
		addFoodItems.checkPrice();
	}
	
	

}
