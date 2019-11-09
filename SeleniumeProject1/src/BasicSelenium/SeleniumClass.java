package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass {
	
	@Test
	public void selectTripType() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		//Text box
		WebElement username=dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
				
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		

		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
		
		//Radio button
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		//see wheter selected or not first check 
		
		oneway.click();
		
		System.out.println(oneway.isSelected());
		//then click on one way
		
		//Dropdown
		WebElement pass=dr.findElement(By.xpath("//select [@name='passCount']"));

		Select sel1=new Select(pass);
		//create and object of class and pass is the web element that need to pass 
		sel1.selectByIndex(2);//check for 3 coz start from 0
		Thread.sleep(2000);
		
		sel1.selectByValue("1");//
		Thread.sleep(2000);
		
		sel1.selectByVisibleText("4"); 
		Thread.sleep(2000);
		
		//buttons-code is written in one line for clicking
		dr.findElement(By.xpath("//input [@name='findFlights']")).click();
		
		dr.findElement(By.xpath("//input [@name='reserveFlights']")).click();

		WebElement ticketLess=dr.findElement(By.xpath("//input[@value='checkbox']"));
		System.out.println(ticketLess.isSelected());
		//see wheter selected or not first check 
		
		ticketLess.click();
		
		System.out.println(ticketLess.isSelected());
		
		WebElement count=dr.findElement(By.xpath("//select [@name='delCountry']"));

		Select sel2=new Select(count);
		sel2.selectByIndex(2);//check for 3 coz start from 0
		
		//switch to the alert window and use that text
		//use to check the alert and what happen again
		Alert alt=dr.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();//alt.dismiss
		
	}

}
