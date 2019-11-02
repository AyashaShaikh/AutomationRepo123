package Assignement;

public class PatternPrintin {
	public static void main(String[] args) {
		System.out.println("########### 5star ###########");
	for(int j=1;j<=5;j++)
	{
		for(int i=1; i<=5;i++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	
	System.out.println("########### triangle star ###########");
	for(int j=1;j<=5;j++)
	{
		for(int i=1; i<=j;i++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	
	//System.out.println("########### triangle reverse star ###########");
	for(int j=1;j<=5;j++)
	{
		for(int i=5; i>=j;i--)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	
	System.out.println("########### triangle reverse star ###########");
	for(int j=1;j<=5;j++)
	{
		for(int i=5; i>=j;i--)
		{
		System.out.print("*");
		}
		System.out.println();
	}

	System.out.println("########### triangle no pattern ###########");
	
	for(int j=1;j<=5;j++)
	{
		for(int i=1; i<=j;i++)
		{
		System.out.print(i);
		}
		System.out.println();
		}
	
	System.out.println("########### triangle no pattern ###########");

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
	System.out.println();
	}
	}

}
