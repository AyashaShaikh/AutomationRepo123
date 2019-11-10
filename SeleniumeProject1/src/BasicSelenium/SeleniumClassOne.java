package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClassOne {
	
	@Test
	public void flightDetails() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
	ChromeDriver cd=new ChromeDriver();
	
	cd.manage().window().maximize();
	
	cd.get("http://newtours.demoaut.com/");
	
	//TextBox
	WebElement username=cd.findElement(By.name("userName"));
	username.sendKeys("mercury");
	
	WebElement password=cd.findElement(By.name("password"));
	password.sendKeys("mercury");
	
	WebElement signin=cd.findElement(By.name("login"));
	signin.click();
	
	WebElement oneway=cd.findElement(By.xpath("//input[@value='oneway']"));
	System.out.println(oneway.isSelected());
	
	oneway.click();
	System.out.println(oneway.isSelected());
	
	//Passengers
	WebElement dps=cd.findElement(By.xpath("//select [@name='passCount']"));
	Select dp1=new Select(dps);
	
	dp1.selectByIndex(2);
	Thread.sleep(2000);
	
	dp1.selectByValue("1");//
	Thread.sleep(2000);
	
	dp1.selectByVisibleText("4"); 
	Thread.sleep(2000);
	
	//Departing From
	WebElement dps1=cd.findElement(By.xpath("//select [@name='fromPort']"));
	Select dp2=new Select(dps1);
	
	dp2.selectByVisibleText("London"); 
	Thread.sleep(2000);
	
	//Departing Date
	WebElement month=cd.findElement(By.name("fromMonth"));
	Select dp3=new Select(month);
	
	dp3.selectByVisibleText("February");
	Thread.sleep(2000);
	
	WebElement date=cd.findElement(By.name("fromDay"));
	Select dp4=new Select(date);
	
	dp4.selectByVisibleText("20");
	Thread.sleep(2000);
	
	//Arriving In
	WebElement Arrive=cd.findElement(By.name("toPort"));
	Select dp5=new Select(Arrive);
	
	dp5.selectByVisibleText("Frankfurt");
	Thread.sleep(2000);
	
	//Returning Date
	WebElement Rmonth=cd.findElement(By.name("toMonth"));
	Select dp6=new Select(Rmonth);
	
	dp6.selectByVisibleText("March");
	Thread.sleep(2000);
	
	WebElement Rdate=cd.findElement(By.name("toDay"));
	Select dp7=new Select(Rdate);
	
	dp7.selectByVisibleText("20");
	Thread.sleep(2000);
	
	//Service Class
	WebElement class1=cd.findElement(By.xpath("//input [@value='Business']"));
	System.out.println(class1.isSelected());
	
	class1.click();
	//System.out.println(class1.isSelected());
	
	//Airline
	WebElement Air=cd.findElement(By.name("airline"));
	Select Ar=new Select(Air);
	
	Ar.selectByVisibleText("Blue Skies Airlines");
	Thread.sleep(2000);
	
	
	WebElement AirL=cd.findElement(By.name("airline"));
	Select Ar1=new Select(AirL);
	Ar1.selectByIndex(3);
	
	//Continue button
	cd.findElement(By.xpath("//input [@name='findFlights']")).click();
	Thread.sleep(2000);
	

	//Departure
	
	WebElement Dep=cd.findElement(By.xpath("//input [@value='Blue Skies Airlines$361$271$7:10']"));
	System.out.println(Dep.isSelected());
	
	Dep.click();
	
	//Return
	
	WebElement Ret=cd.findElement(By.xpath("//input [@value='Pangea Airlines$632$282$16:37']"));
	System.out.println(Ret.isSelected());
	
	Ret.click();
	
	//continue button
	cd.findElement(By.xpath("//input [@name='reserveFlights']")).click();
	Thread.sleep(2000);
	
	//pasenger
	WebElement Fname1=cd.findElement(By.name("passFirst0"));
	Fname1.sendKeys("Ashwarya");
	
	WebElement Lname=cd.findElement(By.name("passLast0"));
	Lname.sendKeys("Rai");
	
	WebElement Meal=cd.findElement(By.name("pass.0.meal"));
	Select pref=new Select(Meal);
	pref.selectByVisibleText("Diabetic");
	Thread.sleep(2000);
	
	//passenger2
	WebElement Fname2=cd.findElement(By.name("passFirst1"));
	Fname2.sendKeys("Sharukh");
	
	WebElement Lname2=cd.findElement(By.name("passLast1"));
	Lname2.sendKeys("Khan");
	
	WebElement Meal1=cd.findElement(By.name("pass.1.meal"));
	Select Pref2=new Select(Meal1);
	Pref2.selectByVisibleText("Kosher");

	//passenger3
	WebElement Fname3=cd.findElement(By.name("passFirst2"));
	Fname3.sendKeys("Vivek");
	
	WebElement Lname3=cd.findElement(By.name("passLast2"));
	Lname3.sendKeys("Oberoi");
	
	WebElement Meal3=cd.findElement(By.name("pass.2.meal"));
	Select Pref3=new Select(Meal3);
	Pref3.selectByVisibleText("Low Calorie");
	
	
	//passenger 4
	WebElement Fname4=cd.findElement(By.name("passFirst3"));
	Fname4.sendKeys("Salman");
	
	WebElement Lname4=cd.findElement(By.name("passLast3"));
	Lname4.sendKeys("Khan");
	
	WebElement Meal4=cd.findElement(By.name("pass.3.meal"));
	Select Pref4=new Select(Meal4);
	Pref4.selectByVisibleText("Vegetarian");
	
	//Credit card
	WebElement credit=cd.findElement(By.name("creditCard"));
	Select type=new Select(credit);
	type.selectByVisibleText("MasterCard");
	
	//No
	WebElement No=cd.findElement(By.name("creditnumber"));
	No.sendKeys("CD1587941121");
	
	//Expiration
	WebElement exp=cd.findElement(By.name("cc_exp_dt_mn"));
	Select month1=new Select(exp);
	month1.selectByVisibleText("12");
	
	//yearcc_exp_dt_yr
	WebElement exp1=cd.findElement(By.name("cc_exp_dt_yr"));
	Select year1=new Select(exp1);
	year1.selectByVisibleText("2010");
	
	//cc_frst_name
	//FirstName
	WebElement First=cd.findElement(By.name("cc_frst_name"));
	First.sendKeys("Ayasha");
	
	//MiddleNAme
	WebElement Middle=cd.findElement(By.name("cc_mid_name"));
	Middle.sendKeys("Irfan");
	
	//LastName
	WebElement Last=cd.findElement(By.name("cc_last_name"));
	Last.sendKeys("Shaikh");
	
	//Billing Address
	WebElement chkbx=cd.findElement(By.name("ticketLess"));
	System.out.println(chkbx.isSelected());
	chkbx.click();
	
	//billAddress1
	WebElement Billadd=cd.findElement(By.name("billAddress1"));
	Billadd.clear();
	Billadd.sendKeys("VadagaoSheri");
	
	WebElement Billcity=cd.findElement(By.name("billCity"));
	Billadd.clear();
	Billcity.sendKeys("Pune");
	
	
	WebElement Billstate=cd.findElement(By.name("billState"));
	Billadd.clear();
	Billstate.sendKeys("Maharashtra");
	
	
	WebElement Billzip=cd.findElement(By.name("billZip"));
	Billadd.clear();
	Billzip.sendKeys("411014");
	
	
	WebElement Billcountry=cd.findElement(By.name("billCountry"));
	Select country=new Select(Billcountry);
	country.selectByVisibleText("INDIA");
	
	//ByFlight Button
	cd.findElement(By.name("buyFlights")).click();
	
	

	}

}
