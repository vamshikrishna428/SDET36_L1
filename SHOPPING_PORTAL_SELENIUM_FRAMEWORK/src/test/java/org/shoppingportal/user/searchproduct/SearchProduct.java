package org.shoppingportal.user.searchproduct;

import org.openqa.selenium.WebDriver;
import org.shoppingportal.objectrepository.ChoosePaymentPage;
import org.shoppingportal.objectrepository.CommonPage;
import org.shoppingportal.objectrepository.LogOutPage;
import org.shoppingportal.objectrepository.MyCartPage;
import org.shoppingportal.objectrepository.OrderPlacedPage;
import org.shoppingportal.objectrepository.PostSearchPage;
import org.shoppingportal.objectrepository.UserLoginPage;
import org.yantra.genericutility.ExcelUtility;
import org.yantra.genericutility.FileUtility;
import org.yantra.genericutility.IConstants;
import org.yantra.genericutility.JSExecutorUtility;
import org.yantra.genericutility.WebDriverUtility;
import org.yantra.genericutility.javaUtility;

public class SearchProduct {

	public static void main(String[] args) {
		// create an object for all utility classes
		FileUtility fileutility=new FileUtility();
		javaUtility javautility=new javaUtility();
		WebDriverUtility webdriverutility=new WebDriverUtility();
		ExcelUtility excelutility=new ExcelUtility();
		JSExecutorUtility javascriptutility=new JSExecutorUtility();
		excelutility.Initialize(IConstants.SHOPPINGPORTALEXCELPATH);
		// initialize the data from property file
		fileutility.InitializePropertyFile(IConstants.SHOPPINGPORTALPROPERTYPATH);

		// fetch the data from property file
 
		String browser = fileutility.getDatafromPropertyFile("browser");
		String url = fileutility.getDatafromPropertyFile("url");
		String username = fileutility.getDatafromPropertyFile("username");
		String password = fileutility.getDatafromPropertyFile("password");
		String time = fileutility.getDatafromPropertyFile("timeouts");
		long timeouts = javautility.ConvertStringToLong(time);

		// launching the browser in the run time based on browser key
		WebDriver driver = webdriverutility.setUpDriver(browser);
		webdriverutility.geturl(url);
		webdriverutility.MaximizeBrowser();
		webdriverutility.WaitImplicitly(timeouts);

		// creating objects for pom classes 
		UserLoginPage userloginpage=new UserLoginPage(driver);
		CommonPage commonpage=new CommonPage(driver);
		PostSearchPage postsearchpage=new PostSearchPage(driver);
		javascriptutility.initializejavaScriptExceutor(driver);
		MyCartPage mycartpage=new MyCartPage(driver);
		LogOutPage logoutpage=new LogOutPage(driver);

		webdriverutility.WaitImplicitly(timeouts);

		commonpage.clickLoginLink();

		userloginpage.PerfomLogin(username, password);
		userloginpage.submitLogin();

		String exceldata = excelutility.getExcelData("sheet1", 1, 1);
		commonpage.searchTxBtx(exceldata);
		commonpage.clickSearchBtn();
		webdriverutility.WaitImplicitly(timeouts);

		String productdata = excelutility.getExcelData("sheet1", 1, 2);
		javascriptutility.ScrollTillElement(postsearchpage.scroolElement(productdata));
		
		postsearchpage.clickOnProduct(productdata);

		mycartpage.addProductToCart();
		webdriverutility.acceptAlertPopUp();
		mycartpage.proceedToCheckOutcart();

		ChoosePaymentPage choosepaymentpage=new ChoosePaymentPage(driver);
		choosepaymentpage.cashOnDelivery();
		choosepaymentpage.paymentSubmit();

		OrderPlacedPage order=new OrderPlacedPage(driver);

		String orderinfo = order.listOrders(null, null);
		if(productdata.contains(orderinfo)) {
			System.out.println(" valid data");
		}
		else{
			System.out.println("invalid data");
		}

		
		
		
		
		
		
		
		
	//	webdriverutility.compareDataContains(productdata, orderinfo);

		logoutpage.logOutLink();



	}
}


