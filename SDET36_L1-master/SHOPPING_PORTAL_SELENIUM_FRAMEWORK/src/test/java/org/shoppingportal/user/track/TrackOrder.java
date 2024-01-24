package org.shoppingportal.user.track;

import org.openqa.selenium.WebDriver;
import org.shoppingportal.objectrepository.CommonPage;
import org.shoppingportal.objectrepository.TrackYourOrderPage;
import org.shoppingportal.objectrepository.UserLoginPage;
import org.yantra.genericutility.ExcelUtility;
import org.yantra.genericutility.FileUtility;
import org.yantra.genericutility.IConstants;
import org.yantra.genericutility.WebDriverUtility;
import org.yantra.genericutility.javaUtility;

public class TrackOrder {
	public static void main(String[] args) {
		// create an object for all utility classes
		FileUtility fileutility=new FileUtility();
		javaUtility javautility=new javaUtility();
		WebDriverUtility utility=new WebDriverUtility();
		ExcelUtility excelutility=new ExcelUtility();
		
		// initialize the data from property file
		fileutility.InitializePropertyFile(IConstants.SHOPPINGPORTALPROPERTYPATH);
		excelutility.Initialize(IConstants.SHOPPINGPORTALEXCELPATH);
		
		// fetch the data from property file
		String browser = fileutility.getDatafromPropertyFile("browser");
		String url = fileutility.getDatafromPropertyFile("url");
		String username = fileutility.getDatafromPropertyFile("username");
		String password = fileutility.getDatafromPropertyFile("password");
		String time = fileutility.getDatafromPropertyFile("timeouts");
		
		long timeouts = javautility.ConvertStringToLong(time);
		
		// launching the browser in the run time based on browser key
		 WebDriver driver = utility.setUpDriver(browser);
		 utility.geturl(url);
		 utility.MaximizeBrowser();
		 utility.WaitImplicitly(timeouts);
		 
		// creating objects for pom classes 
		 UserLoginPage userloginpage=new UserLoginPage(driver);
		 CommonPage commonpage=new CommonPage(driver);
		 TrackYourOrderPage trackorder=new TrackYourOrderPage(driver);
		 
		 
		 commonpage.clickLoginLink();
		 userloginpage.PerfomLogin(username, password);
		 userloginpage.submitLogin();
		 
		 commonpage.trackOrderLink();	// click on track order present in home page
		 
		 String excel = excelutility.getExcelData("sheet1", 1, 0);
		 trackorder.orderId(excel);
		 trackorder.registeredMailId(username);
		 trackorder.submitTrackButton();
		 
		 
		 

	}
	
}
