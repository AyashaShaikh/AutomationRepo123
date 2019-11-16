package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText {
	WebDriver dr;

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		
		//xpath of the date
		
		String date=dr.findElement(By.xpath("//td/font[@face='Arial, Helvetica, sans-serif, Verdana']/b")).getText();
		System.out.println(date);

	}

}
