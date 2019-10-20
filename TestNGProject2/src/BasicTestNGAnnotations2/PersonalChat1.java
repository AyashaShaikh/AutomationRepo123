package BasicTestNGAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalChat1 {
	
	@BeforeClass
	public void beforeClassModule()
	{
		System.out.println("Pre condition for personal Chat");
	}
	
	@AfterClass
	public void afterClassModule()
	{
		System.out.println("Post Condtion for personal Chat");
	}
	
	@BeforeMethod
	public void preconditionforTestCase()
	{
		System.out.println("Keypad should be enable");
	}
	
	@AfterMethod
	public void postconditionforTestCase()
	{
		System.out.println("Keypad should be disabled");
	}
	

	@Test
	public void Test1()
	{
		System.out.println("Personal Chat1 Test case1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Personal Chat1 Test case2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Personal Chat1Test case3");
	}

}
