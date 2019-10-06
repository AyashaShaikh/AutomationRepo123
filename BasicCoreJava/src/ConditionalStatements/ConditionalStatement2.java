package ConditionalStatements;

public class ConditionalStatement2 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}else if(a==b)
		{
			System.out.println("a is equal to b");
		//mine code
		}else if(a!=b)
		{
			System.out.println("a is not equal to b");
			System.out.println("a is less");

		}
		else
		{
			System.out.println("a is less than b");
		}
	}
}
