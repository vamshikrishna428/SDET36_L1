package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {

	public MyCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "//button[@name='ordersubmit']")
		private WebElement proceedToCheckOut;	//present after clicking  mycart option
		
		@FindBy(xpath = "//i[@class='fa fa-shopping-cart inner-right-vs']")
		private WebElement addtocart;
		
	/*
	 * 
	 */
		public void	proceedToCheckOutcart(){
			proceedToCheckOut.click();
		}
		
		public void addProductToCart() {
			addtocart.click();
		}
		
		
		
	}
