package Assignement;

public class Assignment1_pgm1 {

	public static void main(String[] args) {
		//1) What will following lines print:
		
		System.out.println("############@@@@@@@@ First pgm @@@@@@@@@@@###############");

			String x="We are learning";
			String y="mistakes happen";
			int z=1000;
			System.out.println("Java is easy. "+x+" selenium and "+y+" "+z +" times");
		
	//	2) Write a for loop to print even numbers between 1 to 100
			System.out.println();
			System.out.println("############@@@@@@@@ Second pgm @@@@@@@@@@@###############");

		for(int i=0;i<=100;i=i+2)
		{
			System.out.println(i);
		}
	// 3) Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisble by 5 followed by that number'
		System.out.println();
		System.out.println("############@@@@@@@@ Third pgm @@@@@@@@@@@###############");
		
		for(int i=1; i<=100;i++)
		{
					
			 if(i%5==0)
			 	{ 
				 System.out.println(i+ " is divisible by 5"); 
			 	} 
		
		
			 else{
					System.out.println(i);
				 }
		}
		System.out.println();
		System.out.println("############@@@@@@@@ Fourth pgm @@@@@@@@@@@###############");

		//4) Write a for loop to find the sum of first 100 numbers(1 to 100)
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		/*
		 * //1 12 1234 12345 123456 1234567
		 */

		for(int i=1; i<=7;i++)
		{
			for(int j=1;j<=i;j++)

			
			{
			System.out.print(j);
			}
			System.out.println();
			}
		//6) Make an integer array. Write a for loop to print the integer array in reverse.
		System.out.println("");
		System.out.println("########### sixth pgm ##############");
		
		int [] arr=new int[]{1,2,3,4,5,6};
		System.out.println("original array:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println("");
		System.out.println("Reverse array is");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"");
		}
		
		System.out.println("");
		//7) Print alternate elements of String array array
	
			

		
	}
}
