package BasicSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {

	//add test ng libraries not j unit, when the mouse is hover two options are there so select test ng libraries
	@Test
	public void test1() throws InterruptedException
	{
		//everything webdirver in small, webdriver is key and value must be the path
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		//u need to import coz it is not created by us, need to createvobject of chrome driver
		ChromeDriver dr=new ChromeDriver();
		//default constructor -logic executed
		
		dr.manage().window().maximize();
		//To maximize the window fullscreen
		
		dr.get("http://newtours.demoaut.com/");
		//Method to navigate on that the application
		
		//use locator to find the element
		//use first findElement and use the first BY locator need to create the object of by coz when you hover it shows BY if like  int was there u need to put int 
		//by class gives you option how to select
		//copy from dom inspect the exact name i.e userName
		
		WebElement username=dr.findElement(By.name("userName"));
		//import webelement 
		//store the dr object in WebElement and username can be any variable
		
		username.sendKeys("mercury");
		//mercury is uname that u need to know this is data
		
		Thread.sleep(5000);

		
		username.clear();
		Thread.sleep(6000);
	
		username.sendKeys("mercury");

		
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		

		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
		
		
		
	
		


		
	
		
		
		
	
		
		//dr.close();
		//To close the browser
		
	}
}
