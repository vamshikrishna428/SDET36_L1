package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yantra.genericutility.WebDriverUtility;

public class TrackProductDetailsPage {

	public TrackProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='Track order']")
	private WebElement tarackproductdetails;
	
	public void trackProductDetails() {
		
		if(tarackproductdetails.isEnabled()) {
		tarackproductdetails.click();
		}
		else {
		System.out.println("not displayed your product");
		}
	}
	public void customMethod(WebDriverUtility webdriverutility,long totalDuration,int pollingTime) {
		webdriverutility.waitTillElementClickable(totalDuration,pollingTime, tarackproductdetails);
	}
	
	
}
