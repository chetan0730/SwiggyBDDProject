package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ActionUtil;

public class AddFoodItems {

	private  WebDriver driver;
	private ActionUtil action;
	
	public AddFoodItems(WebDriver rdriver,ActionUtil action) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		this.action = action;
	}
	

	By restaurantTitle=By.xpath("(//h1[normalize-space()='Irani Cafe'])[1]");
	By chocolateWalnutCakeCakeAddBtn=By.xpath("//div[@id='h-1950595611']//div[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]");
	By spongeCakeAddBtn=By.xpath("//div[@id='h-1950595611']//div//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]");
	By creamRollAddBtn=By.xpath("//div[@id='h-1950595611']//div[3]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]");
	By creamRollRemoveBtn=By.xpath("//div[@id='h-1950595611']//div[3]//div[1]//div[1]//div[2]//div[2]//div[1]//div[3]");
	
	By billAmount=By.xpath("//div[@class='EEeV3']//span[1]");
	
	
	public void addFoodItemsTocart() {
		action.waitForElementVisibility(chocolateWalnutCakeCakeAddBtn, 20);
		action.click(chocolateWalnutCakeCakeAddBtn);
		action.click(spongeCakeAddBtn);
		action.click(creamRollAddBtn);
	}
	
	public void RemoveFoodItemsFromCart() {
		action.waitForElementVisibility(creamRollRemoveBtn, 20);
		action.click(creamRollRemoveBtn);
		
	}
	
	public void checkPrice() throws InterruptedException {
		action.waitForElementVisibility(billAmount, 20);
		Thread.sleep(3000);
		assertTrue(driver.findElement(billAmount).getText().contains("295"));
	}
	

}
