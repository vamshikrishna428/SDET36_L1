package org.yantra.genericutility;


	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	/**
	 * This class contains all the JS reusable methods
	 * @author vamshi
	 *
	 */
	public final class JSExecutorUtility 
	{
		private JavascriptExecutor jse;
		/**
		 * This method is used to initialize the javascript executor
		 * @param browser
		 * @return
		 */
		public JavascriptExecutor initializejavaScriptExceutor(WebDriver driver)
		{

			jse=(JavascriptExecutor)driver;
			return jse;
		}
		/**
		 * This method is use to naviagte to the application using javaScriptExecutor
		 * @param url
		 */
		public void navigateToApp(String url)
		{
			jse.executeScript("window.location=arguments[0]", url);
		}
		/**
		 * This method is to send the values to the text feild by javascript exceutor
		 * @param element
		 * @param value
		 */
		public void enterData(WebElement element,String value)
		{
			jse.executeScript("arguments[0].value=arguments[1]",element,value);
		}
		/**
		 * This method is used to do click action using javascript executor
		 * @param element
		 */
		public void clickOnElement(WebElement element)
		{
			jse.executeScript("arguments[0].click()", element);
		}
		/**
		 * This method is used to scroll the page till bottom
		 */
		public void ScrollToBottom(String strategy) 
		{
			String sign=strategy.equalsIgnoreCase("UP")?"+":"-";
			jse.executeScript("window.scrollBy(0,"+sign+"document.body.scrollHeight)");
		}
		/**
		 * This method is used to scroll till the particular element is visible
		 * @param element
		 */
		public void ScrollTillElement(WebElement element) 
		{
			jse.executeScript("arguments[0].scrollIntoView()",element);
		}
		/**
		 * This method is used to scroll the webpage till the particular axis
		 * @param xaxis
		 * @param Yaxis
		 */

		public void ScrollTillPosition(int Yaxis,String strategy) 
		{
			String sign=strategy.equalsIgnoreCase("UP")?"+":"-";
			jse.executeScript("window.scrollBy(0,"+sign+"arguments[0])",Yaxis);	
		}
		/**
		 * This method is used to highlight the particular element
		 */
		public void highlightElement(WebElement element)
		{
			jse.executeScript("arguments[0].setAttribute('style','border:2px  solid red; background:yellow')",element);
		}

	}
