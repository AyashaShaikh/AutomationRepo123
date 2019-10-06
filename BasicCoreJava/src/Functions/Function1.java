package Functions;

public class Function1 {

	public static void main(String[] args) {
		
		//static function can only call static variables and static functions.
		// if you are returning integer value so you need to store it in int variable a and b, when give addtion will show
		int a=sum(10,20);
		int b=sum(30,40);
		System.out.println(a+b);
		
		
		//If you use non static functions in static class create variable
		NonstaticFunctions obj=new NonstaticFunctions();
		System.out.println(obj.sum(10, 20));
		
		
			
		// TODO Auto-generated method stub
		//same thing is happening in below but we use function to call multiple times
		/*
		 * int a=10; int b=20;
		 * 
		 * int sum=a+b;
		 * 
		 * System.out.println(sum);
		 */	
	}
	/*
	 * public static void sum() { int a=10; int b=20; int sum=a+b;
	 * System.out.println(sum);
	 * 
	 * }
	 */
	
	// If you dont want same no so pass parameters also pass values in funtions
	/*
	 * public static void sum(int a, int b) {
	 * 
	 * int sum=a+b; System.out.println(sum);
	 * 
	 * }
	 */
	
	public static int sum(int a, int b)
	{
		
		 int sum=a+b;
		 //you need to return integer value you can give anything 10 but sum is ok for that
		 	return sum;

	}

}
