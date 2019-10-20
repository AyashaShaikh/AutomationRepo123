package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageStatus {
	
	@BeforeTest
	public void beforeStatusModule()
	{
		System.out.println("Gallery should be accessible");
		
	}
	
	@AfterTest
	public void afterStatusModule()
	{
		System.out.println("After Status Module");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("pre condtion for image status");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Post condition for image status");
	}
	
	@BeforeMethod
	public void PreCondtionForTestCase()
	{
		System.out.println("Keypad should be enabled");
	}
	
	@AfterMethod
	public void PostCondtionForTestCase()
	{
		System.out.println("Keypad should be disabled");
	}
	@Test
	public void test1()
	{
		System.out.println("ImageStatus Test Case1");
	}


	@Test
	//annotation for testng
	public void test2()
	{
		System.out.println("ImageStatus Test Case2");
	}


	@Test
	//annotation for testng
	public void test3()
	{
		System.out.println("ImageStatus Test Case3");
	}


}
