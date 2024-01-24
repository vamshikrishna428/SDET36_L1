package org.shoppingportal.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PostSearchPage {
	WebDriver driver;
	public PostSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='admin/productimages/58/Samsung m12.jpg']")
	private WebElement clickonproduct;
	
	
	@FindBy(xpath = "//img[@src='admin/productimages/58/Samsung m12.jpg']")
	private WebElement scroolproduct;
	
	private String product="//a[.='%s']";
	
	/**
	 * 
	 */
	
	public WebElement scroolElement(String replace) {
		return convertDynamicxpathToWebElement(product , replace);
	}
	private WebElement convertDynamicxpathToWebElement(String xpath,String replace) {
		xpath=String.format(xpath, replace);
	return	driver.findElement(By.xpath(xpath));
	}
	public void clickOnProduct(String replace) {
		convertDynamicxpathToWebElement(product , replace).click();
		
		}
}


