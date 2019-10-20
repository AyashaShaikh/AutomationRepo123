package BasicTestNGAnnotations2;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat1 {
	
	//Import BeforeTest Annotations
	@BeforeTest
	public void beforeChatModule()
	{
		System.out.println("Contacts should be loaded");
		
	}
	
	@AfterTest
	public void afterChatModule()
	{
		System.out.println("After Chat Module");
		System.out.println("*********#######*******");
		
	}
	
	@BeforeClass
	public void beforeClassModule()
	{
		System.out.println("Create group");
	}
	
	@AfterClass
	public void afterClassModule()
	{
		System.out.println("Delete group");
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
		//System.out.println("Group Chat1 Test case1");
		throw new SkipException("Group Chat Test Case 1");

	}
	
	@Test
	public void Test2()
	{
		System.out.println("Group Chat1 Test case2");
		System.out.println(10/0);
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Group Chat1Test case3");
	}
	
	
}
