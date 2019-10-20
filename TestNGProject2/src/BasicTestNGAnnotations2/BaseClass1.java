package BasicTestNGAnnotations2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass1 {

@BeforeSuite
public void beforeSuit()
{
	System.out.println("Before Suite");
}

@AfterSuite
public void afterSuite()
{
	System.out.println("After Suite");
	}


}
