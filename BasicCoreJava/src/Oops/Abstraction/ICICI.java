package Oops.Abstraction;

public class ICICI implements RBI{
	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Saving Account");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Current Account");
		
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Credit Card");
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Debit Card");
		
	}

}
