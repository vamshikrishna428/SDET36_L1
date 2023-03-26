package org.yantra.genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Vamshi
 *
 */
public class WebDriverUtility {
	private WebDriver driver;

	/**
	 * 
	 * @param args
	 */
	public WebDriver setUpDriver(String browser)
	{

		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("You have entered the wrong browser");
		}

		return driver;
	}

	/**
	 * 
	 * @param longtimeout
	 * @return 
	 * @return 
	 */
	public   void WaitImplicitly(long longtimeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtimeout));


	}
	/**
	 * 
	 * @param longtimeout
	 * @return 
	 */
	/*	public  WebDriverWait WaitExplicitliy( long longtimeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(longtimeout));
		return wait;
	}	*/
	/**
	 * 	
	 */
	public void MaximizeBrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * 
	 */
	public void CloseBrowser() {
		driver.close();
	}
	/**
	 * 
	 */
	public void QuitBrowser() {
		driver.quit();
	}
	/**
	 * 
	 */
	public void acceptAlertPopUp() {
		driver.switchTo().alert().accept();
	}
	/**
	 * 
	 */
	public void dismissAlertPopUp() {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 * @param key 
	 * @param args
	 */
	public void sendKeysToAlertPopUp(String key) {
		driver.switchTo().alert().sendKeys(key);
	}
	/**
	 * 
	 * @param index 
	 * @param args
	 */
	public void selectToDropDown(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * 
	 * @param value 
	 * @param args
	 */
	public void selectToDropDown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	/**
	 * 
	 * @param visibletext 
	 * @param args
	 */
	public void selectToDropDown(String visibletext, WebElement element) {
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	/**
	 * 
	 * @param element 
	 * @param index 
	 * @param args
	 */

	public void deselectToDropDown(WebElement element, int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 * 
	 * @param value 
	 * @param args
	 */
	public void deselectToDropDown(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	/**
	 * 
	 * @param visibletext 
	 * @param args
	 */
	public void deselectToDropDown(String visibletext,WebElement element) {
		Select select=new Select(element);
		select.deselectByVisibleText(visibletext);
	}
	/**
	 * 
	 * @param  
	 * @param deselectall 
	 * @param args
	 */
	public void deselectAllDropDown(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}

	public void geturl(String url) {
		driver.get(url);
	}
	public void compareData(String actual,String expected) {
		if(actual.equals(expected))
		{
			System.out.println("data is valid");
		}
		else
		{
			System.out.println("data is invalid");
		}	
	}
	public void waitTillElementClickable(long totalDuration,int pollingTime,WebElement element)
	{
		int currentTime=0;
		while(currentTime<=totalDuration)
		{
			try 
			{
				element.click();
				break;
			}catch(Exception e)
			{
				System.out.println("product details not found");
				try
				{
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1)
				{

					e1.printStackTrace();
				}
				currentTime++;
			}
		}
	}
	public void switchTowindow(String partialVisibleText,String Strategy)
	{
		Set<String> winID = driver.getWindowHandles();
		for (String Id : winID) 
		{

			if(Strategy.equalsIgnoreCase("url"))
			{
				driver.switchTo().window(Id);
				String actualUrl = driver.getCurrentUrl();
				if(actualUrl.contains(partialVisibleText))
				{
					break;		
				}
			}
			else if(Strategy.equalsIgnoreCase("title"))
			{
				driver.switchTo().window(Id);
				String actualTitle=driver.getTitle();
				if(actualTitle.contains(partialVisibleText))
				{
					break;		
				}
			}
		}
	}


	public void compareDataContains(String actual,String expected) {

		if(actual.contains(expected))
		{
			System.out.println("data is valid");
		}
		else
		{
			System.out.println("data is invalid");
		}	
	}
	public void switchWindow() {

		Set<String> windowid = driver.getWindowHandles();
		for(String id:windowid)
		{
			driver.switchTo().window(id);
		}

	}
}




