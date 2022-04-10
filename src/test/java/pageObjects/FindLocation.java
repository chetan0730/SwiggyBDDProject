package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ActionUtil;

public class FindLocation {

	private  WebDriver driver;
	private ActionUtil action;
	
	public FindLocation(WebDriver rdriver,ActionUtil action) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		this.action = action;
	}
	

	By enterLocation=By.xpath("//input[@id='location']");
	By selectPuneFromDropDown=By.xpath("//span[normalize-space()='Pune, Maharashtra, India']");
	
	
	public void typeLocation() {
		action.waitForElementVisibility(enterLocation, 20);
		action.typeIn(enterLocation, "Pune, Maharashtra, India");
		action.click(selectPuneFromDropDown);
	
	}
	
	

}
