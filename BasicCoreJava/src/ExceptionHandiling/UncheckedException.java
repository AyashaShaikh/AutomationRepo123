package ExceptionHandiling;

import Oops.Abstraction.ICICI;

public class UncheckedException {
	//not checked by compilers =unchecked

	static ICICI bank;//need to import it
	public static void main(String[] args) {
		//abnormal behaviour
		
		//Example 1 //ArithmeticException:
		//System.out.println(10/0);
		
		
		System.out.println(10/1);
		//ArithmeticException:
		
		//Example 2 //ArrayIndexOutOfBoundsException
		String[] arr=new String[2];
		arr[0]="Anand";
		arr[1]="Bhayre";
		//arr[2]="dfdfds";
		
		//Example 3:NullPointerException
		//refernce point to null 
		//global variable default value=credit card call reference static ICICI bank=new ICICI otherwise static ICICI bank=null
		bank.creditCard();
		
		
		

	}

}
