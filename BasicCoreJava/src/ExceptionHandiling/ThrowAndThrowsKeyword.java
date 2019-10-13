package ExceptionHandiling;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Step 1");
		
		pause(-3000);
		//both are static so we can call
		
		System.out.println("Step 2");

	}
	
	public static void pause(long miliSeconds) throws Exception
	{
		if(miliSeconds>=0) {
			
			Thread.sleep(miliSeconds);
		}
		else
		{
			throException("Please Enter positive value");
		}
	
	}
	
	public static void throException(String message) throws Exception
	{
		throw new Exception(message);
		//throw to throw exception intentionally
		//We use throw keyword to throw exception intentionally
		//not sure in handling use throws in checked not with unchecked
	}
}
