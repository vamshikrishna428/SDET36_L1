package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub1 {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://192.168.179.138:4444/wd/hub");
		DesiredCapabilities desired=new DesiredCapabilities();
		desired.setBrowserName("firefox");
		desired.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(url, desired);
		driver.get("https://www.flipkart.com/");
		
	}
}
