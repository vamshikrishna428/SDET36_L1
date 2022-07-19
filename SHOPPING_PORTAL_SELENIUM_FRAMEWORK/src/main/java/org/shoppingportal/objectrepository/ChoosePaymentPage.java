package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePaymentPage {

	public ChoosePaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//form[@name='payment']/child::input[@value='Internet Banking']")
	private WebElement internetoption;
	@FindBy(xpath = "//form[@name='payment']/child::input[@value='COD']")
	private WebElement cashondelivery;
	@FindBy(xpath = "//form[@name='payment']/child::input[@value='Debit / Credit card']")
	private WebElement creditdebit;
	@FindBy(xpath = "//form[@name='payment']/child::input[@value='submit']")
	private WebElement paymentsubmit;
	
	/**
	 * 
	 */
	public void internetOption() {
		internetoption.click();
	}
	public void cashOnDelivery() {
		cashondelivery.click();
	}
	public void creditDebit() {
		creditdebit.click();
	}
	public void paymentSubmit() {
		paymentsubmit.click();
	}
	
}
