package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ActionUtil;

public class SearchRestaurants {

	private  WebDriver driver;
	private ActionUtil action;
	
	public SearchRestaurants(WebDriver rdriver,ActionUtil action) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		this.action = action;
	}
	

	By searchRestaurantsBtn=By.xpath("//span[normalize-space()='Search']");
	By restaurantSearchBar=By.xpath("//input[@placeholder='Search for restaurants or dishes']");
	By iraniCafe=By.xpath("(//div[normalize-space()='Irani Cafe'])[1]");
	
	
	public void enterRestaurantToSearch() {
		action.waitForElementVisibility(searchRestaurantsBtn, 20);
		driver.findElement(searchRestaurantsBtn).click();
		action.waitForElementVisibility(restaurantSearchBar, 10);
		action.typeIn(restaurantSearchBar, "Irani Cafe");
		driver.findElement(restaurantSearchBar).sendKeys(Keys.ENTER);
		action.waitForElementVisibility(iraniCafe, 10);
		driver.findElement(iraniCafe).click();
	}
	

}
