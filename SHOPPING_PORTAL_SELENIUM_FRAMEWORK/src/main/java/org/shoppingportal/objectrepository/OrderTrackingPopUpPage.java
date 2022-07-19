package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yantra.genericutility.WebDriverUtility;

public class OrderTrackingPopUpPage {

	public  OrderTrackingPopUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//table/tbody/tr[3]/td")
	private WebElement orderprocesstext;
	@FindBy(xpath = "//table/tbody/tr[2]/child::td/following-sibling::td")
	private WebElement orderid;
	
	
	public void childpopup(WebDriverUtility webdriverutility) {
		
		webdriverutility.switchTowindow("Order Tracking Details", "title" );
	}
	public String orderProcessText() {
		return orderprocesstext.getText();
	}
	public String orderId() {
		return	orderid.getText();
	}
	
}

