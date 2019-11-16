package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BAFOneWayOnePassenger {
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
		//dr.quit();
		//multiple window close
		//close only close one window
	}
	@Test
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
		
		WebElement One=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(One.isSelected());
		
		One.click();
		System.out.println(One.isSelected());
		
		WebElement dps=dr.findElement(By.xpath("//select [@name='passCount']"));
		Select dp1=new Select(dps);
		
		dp1.selectByIndex(0);
		
		WebElement dps1=dr.findElement(By.xpath("//select [@name='fromPort']"));
		Select dp2=new Select(dps1);
		
		dp2.selectByVisibleText("London"); 
		
		//Departing Date
		WebElement month=dr.findElement(By.name("fromMonth"));
		Select dp3=new Select(month);
		
		dp3.selectByVisibleText("February");
		
		WebElement date=dr.findElement(By.name("fromDay"));
		Select dp4=new Select(date);
		
		dp4.selectByVisibleText("20");
		
		
		//Service Class
		WebElement class1=dr.findElement(By.xpath("//input [@value='Business']"));
		System.out.println(class1.isSelected());
		
		class1.click();
		//System.out.println(class1.isSelected());
		
		//Airline
		WebElement Air=dr.findElement(By.name("airline"));
		Select Ar=new Select(Air);
		
		
		
		
		WebElement AirL=dr.findElement(By.name("airline"));
		Select Ar1=new Select(AirL);
		Ar1.selectByIndex(3);
		
		//Continue button
		dr.findElement(By.xpath("//input [@name='findFlights']")).click();
		
		

		//Departure
		
		WebElement Dep=dr.findElement(By.xpath("//input [@value='Blue Skies Airlines$361$271$7:10']"));
		
		Dep.click();
		
		//continue button
				dr.findElement(By.xpath("//input [@name='reserveFlights']")).click();

			//pasenger
			WebElement Fname1=dr.findElement(By.name("passFirst0"));
			Fname1.sendKeys("Ashwarya");
			
			WebElement Lname=dr.findElement(By.name("passLast0"));
			Lname.sendKeys("Rai");
			
			WebElement Meal=dr.findElement(By.name("pass.0.meal"));
			Select pref=new Select(Meal);
			pref.selectByVisibleText("Diabetic");
			WebElement credit=dr.findElement(By.name("creditCard"));
			Select type=new Select(credit);
			type.selectByVisibleText("MasterCard");
			
			//No
			WebElement No=dr.findElement(By.name("creditnumber"));
			No.sendKeys("dr1587941121");
			
			//Expiration
			WebElement exp=dr.findElement(By.name("cc_exp_dt_mn"));
			Select month1=new Select(exp);
			month1.selectByVisibleText("12");
			
			//yearcc_exp_dt_yr
			WebElement exp1=dr.findElement(By.name("cc_exp_dt_yr"));
			Select year1=new Select(exp1);
			year1.selectByVisibleText("2010");
			
			//cc_frst_name
			//FirstName
			WebElement First=dr.findElement(By.name("cc_frst_name"));
			First.sendKeys("Aishwarya");
			
			//MiddleNAme
			WebElement Middle=dr.findElement(By.name("cc_mid_name"));
			Middle.sendKeys("Rai");
			
			//LastName
			WebElement Last=dr.findElement(By.name("cc_last_name"));
			Last.sendKeys("Bachhan");
			
			//Billing Address
			WebElement chkbx=dr.findElement(By.name("ticketLess"));
			System.out.println(chkbx.isSelected());
			chkbx.click();
			
				
			//ByFlight Button
			dr.findElement(By.name("buyFlights")).click();

}
	
}
