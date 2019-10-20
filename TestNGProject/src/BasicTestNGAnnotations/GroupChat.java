package BasicTestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat {
	//grp create once
	//every methods public coz it call by jvm
	
	//module level
	@BeforeTest
	public void beforeChatModule()
	{
		System.out.println("Contacts should be loaded");
		
	}
	
	@AfterTest
	public void afterChatModule()
	{
		System.out.println("After Chat Module");
		System.out.println("*************************");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Create group");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Delete group");
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
		//System.out.println("Group Chat Test Case1");
		throw new SkipException("Group Chat Test Case 1");
		//it skips the test case 
		
	}


	@Test
	//annotation for testng
	public void test2()
	{
		System.out.println("Group Chat Test Case2");
		System.out.println(10/0);
	}


	@Test
	//annotation for testng
	public void test3()
	{
		System.out.println("Group Chat Test Case3");
	}


}
