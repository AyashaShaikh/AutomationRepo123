package BasicTestNGAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VideoCall1 {
	@BeforeTest
	public void beforeVideoCallModule()
	{
		System.out.println("Camera should be accessible");
		
	}
	
	@AfterTest
	public void afterVideoCallModule()
	{
		System.out.println("After Video Call Module");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("pre condtion for Video Call");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Post condition for Video Call");
	}
	
	@BeforeMethod
	public void PreCondtionForTestCase()
	{
		System.out.println("Face detection should be enabled");
	}
	
	@AfterMethod
	public void PostCondtionForTestCase()
	{
		System.out.println("Face detection should be disabled");
	}


	@Test
	public void Test1()
	{
		System.out.println("Video Call1 Test case1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Video Call1 Test case2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Group Call1 Test case3");
	}
}
