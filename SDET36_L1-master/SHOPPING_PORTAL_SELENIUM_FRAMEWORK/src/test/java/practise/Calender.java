package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yantra.genericutility.javaUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
public static void main(String[] args) {
	javaUtility ju=new javaUtility();
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=EAIaIQobChMIv4zawcvw-AIVepFmAh0Nigx3EAAYASAAEgJcR_D_BwE");
driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 hasDatepicker'][1]")).click();
String reqDate = "23/08/2022";

WebElement mntyr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));





String[] arrmntyr = mntyr.getText().split(" ");
String mnt = arrmntyr[0];
String yr = arrmntyr[1];
int si = ju.ConvertStringtoIneger(yr + mnt);

System.out.println(si);

/*String[] vam = reqDate.split(" ");

System.out.println(vam);*/







}
}
