package org.shoppingportal.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {

	public UserLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy( xpath = " //input[@id='exampleInputEmail1']")
	private WebElement emailtxtfield;		//email text field 
	
	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	private WebElement passwordtxtfield;		//password text field
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement lobinbtn;		//login button
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	
	public void PerfomLogin(String username, String password) {
		
		emailtxtfield.sendKeys(username);
		passwordtxtfield.sendKeys(password);
		
	}
	public void submitLogin() {
		lobinbtn.click();
	}
	
}


	
	
	
	
	


