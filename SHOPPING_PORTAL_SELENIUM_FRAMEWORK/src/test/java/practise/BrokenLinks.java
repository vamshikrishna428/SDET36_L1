package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		for(WebElement links:alllinks)
		{
			String url = links.getAttribute("href");
			URL link=new URL(url);
			
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			httpcon.connect();
			int responsecode = httpcon.getResponseCode();
		
			if(responsecode>400)
			{
				
				System.out.println(url + "-->" + " is broken link ");
			}
			else
			{
				
				System.out.println(url + "-->" +" is valid link ");
			}
		}
		driver.quit();		
	}
}
