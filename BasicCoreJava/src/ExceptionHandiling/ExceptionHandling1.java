package ExceptionHandiling;

import Oops.Abstraction.ICICI;

public class ExceptionHandling1 {


static ICICI bank;
		public static void main(String[] args) {
			
			try {
				//Example 1 //ArithmeticException:
				//System.out.println(10/0);
				
				
				System.out.println(10/0);
				//ArithmeticException:
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
				//recovery scenario
			}
			//abnormal behaviour
			
			try {
				//Example 2 //ArrayIndexOutOfBoundsException
				String[] arr=new String[2];
				arr[0]="Anand";
				arr[1]="Bhayre";
				//arr[2]="dfdfds";
							
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
				
			}
			
			try {
				//Example 3:NullPointerException
				//refernce point to null 
				//global variable default value=credit card call reference static ICICI bank=new ICICI otherwise static ICICI bank=null
				bank.creditCard();
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
			
			
			
			


	}

}
