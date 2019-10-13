package ExceptionHandiling;

import Oops.Abstraction.ICICI;

public class MultipleCatchBlock {
	
	static ICICI bank;//need to import it
	public static void main(String[] args) {

		try {
		
		System.out.println(10/1);
			
		String[] arr=new String[2];
		arr[0]="Anand";
		arr[1]="Bhayre";
		bank.creditCard();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		//Exception e is super class of all the exceptions so it can handle any of the above or except of the above
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Test case completed");
			System.out.println("Data base connection closed");
			System.out.println("Report Ending");
			System.out.println("Object flush");
			//If above thing want to do then use finally irrespective of try and catch if try is execute half catch half still finally execute at the end....100%surity if try block run or flow is run then use finally
			//finally is a block that will execute both try and catch
			//if comment to bank.creditCard() then it won't run catch block it is directly go to finally 
		}
		}
		

}
