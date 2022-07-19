package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='login.php']")
	private WebElement loginlink;		//  click on loginlink
	
	@FindBy(xpath = "//a[@href='track-orders.php']")
	private WebElement trackorderlink;	//	click on trackorder link
	
	@FindBy(xpath = "//a[@href='my-cart.php'][1]")
	private WebElement mycartlink;	//	click on mycart link
	
		
	@FindBy(xpath = "//input[@class='search-field']")
	private WebElement searchtxbx;
	
	@FindBy(xpath = "//button[@name='search']")
	private WebElement searchbtn;
	
	
	/**
	 * 
	 */
	
	public	void clickLoginLink(){
		loginlink.click();
			}
	public void trackOrderLink() {
		trackorderlink.click();
	}
	public void myCartLink() {
		mycartlink.click();
	}
	
	public void searchTxBtx(String value) {
		searchtxbx.sendKeys(value);
	}
	public void clickSearchBtn() {
		searchbtn.click();
	}

	
}
