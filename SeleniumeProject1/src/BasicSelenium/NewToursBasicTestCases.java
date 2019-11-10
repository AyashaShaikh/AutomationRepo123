package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewToursBasicTestCases {
	
	WebDriver dr;
	//interface browser can implement, globally assign for 8 methods
	String username="Ashuhk";
	String password="jgklkjjjgkhk";
	
	
	
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
	
	@Test(dependsOnMethods= {"registration"})
	public void login()
	{
		dr.get("http://newtours.demoaut.com/");
		
		WebElement username=dr.findElement(By.name("userName"));
		username.sendKeys(this.username);
		//instance variable
				
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys(this.password);
		
		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
	
		By logout=By.xpath("//a[text()='SIGN-OFF']");
		boolean res=isElementPresent(logout);
		//validation true and expected
		Assert.assertEquals(true, res);
		
		

	}
	
	@Test(dependsOnMethods= {"selectPassengers"})
	//annotation methods of dependasonmethods
	//this is depend on login unless it execute
	
	public void logout() 
	{
		dr.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		//Thread.sleep(4000);
	}
	
	@Test
	public void registration() 
	{
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.name("email")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("confirmPassword")).sendKeys(password);//type password
		
		dr.findElement(By.name("register")).click();
		//Instead of hardcoding asss need to check on usrename at runtime
		By message=By.xpath("//b[contains (text(), '"+username+"')]");
		
		boolean res=isElementPresent(message);
		//validation true and expected
		Assert.assertEquals(true, res);
		
		


		

	}
	
	@Test(dependsOnMethods= {"logout"})
	public void support()
	{
		dr.findElement(By.linkText("SUPPORT")).click();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void selectOneWay() 
	{
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		oneway.click();
		
		
	}
	
	@Test(dependsOnMethods= {"login","selectOneWay"})
	public void selectPassengers() 
	{
		WebElement pass=dr.findElement(By.xpath("//select [@name='passCount']"));
		Select sel1=new Select(pass);
		sel1.selectByIndex(2);
		
		
	}
	//if any element present any valuse is there otherwise 0
	//	public boolean isElementPresent(String xpath)=making iselement dynamic instead of string xpath use element of by class i.e. reference

	public boolean isElementPresent(By element)
	
	{
		int size=dr.findElements(element).size();
		
		if(size>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
