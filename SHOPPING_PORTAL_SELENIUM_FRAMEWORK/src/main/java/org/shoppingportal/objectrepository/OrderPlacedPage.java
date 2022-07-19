package org.shoppingportal.objectrepository;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacedPage {
	public OrderPlacedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBys({@FindBy(xpath = "//tr/td[3]")})
	private List<WebElement> orderverifynum;
	@FindBys({@FindBy(xpath = "//tr/td[9]")})
	private List<WebElement> orderverifydate;
	
	public String listOrders(List<WebElement> i,List<WebElement> j)
	{
		i=orderverifynum;
		j=orderverifydate;
		Iterator<WebElement> itr=i.iterator();
		Iterator<WebElement> itr1=j.iterator();
		String str=null;
	
		
		while (itr.hasNext() && itr1.hasNext()) 
		{
			String s1=itr.next().getText();
			String s2=itr1.next().getText();
			str=s1+"  "+s2;
			
				
		}
		System.out.println(str);
		
		return str;
		
	}
	
	
}
