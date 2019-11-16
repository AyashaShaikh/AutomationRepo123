package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	WebDriver dr;
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		

		//element no such element exception-element is present in the dom but page is not loaded to per perform the action-divide in 4 parts and check for that
		//To handle such exception use implicit wait
		dr.get("https://www.naukari.com/");
		
	}

}
