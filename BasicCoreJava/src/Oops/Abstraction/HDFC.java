package Oops.Abstraction;

public class HDFC implements RBI {

	//If you don't want all the methods so you need make the class abstract but here we enter all so no need to make class abstract
	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Saving Account");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Current Account");
		
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Credit Card");
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Debit Card");
		
	}

}
