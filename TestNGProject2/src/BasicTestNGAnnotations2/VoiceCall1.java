package BasicTestNGAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VoiceCall1{
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("pre condtion for Voice Call");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Post condition for Voice Call");
	}
	
	@BeforeMethod
	public void PreCondtionForTestCase()
	{
		System.out.println("Ear phone should be enabled");
	}
	
	@AfterMethod
	public void PostCondtionForTestCase()
	{
		System.out.println("Ear phone should be disabled");
	}



	@Test
	public void Test1()
	{
		System.out.println("Voice Call1 Test case1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Voice Call1 Test case2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Voice Call1Test case3");
	}

}
