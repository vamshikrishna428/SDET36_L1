package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackYourOrderPage {

	public TrackYourOrderPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='orderid']")
	private WebElement orderid;			// order id
	@FindBy(xpath = "//input[@id='exampleBillingEmail1']")
	private WebElement registeredemailid;		// registered email id
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submittrackbutton;
	
	public void orderId(String id) {
		orderid.sendKeys(id);
	}
	
	public void registeredMailId(String username) {
		registeredemailid.sendKeys(username);
	}
	public void submitTrackButton() {
		submittrackbutton.click();
	}
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

