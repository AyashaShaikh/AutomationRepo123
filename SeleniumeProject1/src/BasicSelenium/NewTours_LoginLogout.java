package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTours_LoginLogout {
	
	WebDriver dr;
	String username="AshuFatema";
	String password="Shaikh123";
	
	@BeforeClass
	public void launchApplication()
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
	
	}
	
	@AfterClass
	public void closeApplication()
	{
		dr.quit();
		//multiple window close
		//close only close one window
	}
	
	
	  @Test public void login() { dr.get("http://newtours.demoaut.com/");
	  
	  WebElement username=dr.findElement(By.name("userName"));
	  username.sendKeys(this.username); //instance variable
	  
	  WebElement password=dr.findElement(By.name("password"));
	  password.sendKeys(this.password);
	  
	  WebElement signin=dr.findElement(By.name("login")); signin.click();
	  
	  
	  
	  
	  
	  }
	 
	
	  @Test
		//annotation methods of dependasonmethods
		//this is depend on login unless it execute
		
		public void logout() throws InterruptedException 
		{
			dr.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
			Thread.sleep(4000);
		}

}
