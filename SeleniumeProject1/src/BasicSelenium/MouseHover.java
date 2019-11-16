package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver dr;

	@Test
	public void test1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		

		//element no such element exception-element is present in the dom but page is not loaded to per perform the action-divide in 4 parts and check for that
		//To handle such exception use implicit wait
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
		//For closing the login window cross sign tagname=button attr name class and value is 2AkmmA _29YdH8'
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//To find the xpath of the mega menu //span[text()='Men'] you need to find the text and use it
		//import interaction-Actions are for mouse related things
		Actions act=new Actions(dr);
		
		//build and perform are mandatory to perform the action
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		WebDriverWait wait=new WebDriverWait(dr, 5);
		

		//for the different occurance means like two checkboxes
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
		
		Thread.sleep(2000);
		//For left poin
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
		
		//Explicit wait for that particular element and its property for shirt selection
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='_3togXc']"))).click();
		
		
	
	}

}
