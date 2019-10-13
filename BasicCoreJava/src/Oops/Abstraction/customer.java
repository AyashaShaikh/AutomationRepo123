package Oops.Abstraction;

public class customer {
	public static void main(String[] args) {
		/*
		 * RBI acc; //reference of rbi and object of any bank can access acc=new
		 * Vijaya(); acc.savingAccount(); acc.currentAccount(); acc.debitCard();
		 * acc.creditCard();
		 * 
		 * acc=new SBI(); acc.savingAccount(); acc.currentAccount(); acc.debitCard();
		 * acc.creditCard();
		 * 
		 * acc=new HDFC(); acc.savingAccount(); acc.currentAccount(); acc.debitCard();
		 * acc.creditCard();
		 */
		//To call non static function u need to create object 
		//for static object can call statice object and variable
		customer obj=new customer();
		
		obj.createAccount("HDFC");
		obj.createAccount("ICICI");
		obj.createAccount("Vijaya");
	}
	public void createAccount(String bankName)
	{
		RBI acc=null;
		//global variable int=0, string=null, object reference=null
		//There is no local default valus so need to initialize it null coz condition is there
		//if not initialize null it will show another bank which is not present in our class
		if(bankName.equals("Vijaya")) {
			acc=new Vijaya();	
		}
		else if(bankName.equals("ICICI"))
			{
			acc=new ICICI();	
			}
			else if(bankName.equals("HDFC")) {
				acc=new HDFC();	
			}
		
		acc.savingAccount();
		acc.currentAccount();
		acc.debitCard();
		acc.creditCard();
		//acc.rti not possible
	}

}
