package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalChat {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Pre condtion for personal chat");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Post condition for personal chat");
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
	//annotation for testng
	public void test1()
	{
		System.out.println("PersonalChat Test Case1");
	}



	@Test
	//annotation for testng
	public void test2()
	{
		System.out.println("PersonalChat Test Case2");
	}


	@Test
	//annotation for testng
	public void test3()
	{
		System.out.println("PersonalChat Test Case3");
	}

}
