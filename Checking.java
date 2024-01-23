package bankaccountapp;

public class Checking extends Account{
	// List the properties specific for the Checking accounts 
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10 ,  12));
		debitCardPIN = (int) (Math.random() * Math.pow(10 ,  4));
	}
	
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: CHECKING");
		super.showInfo();
		System.out.println("Your Checking Account Features -" +
							"\n DEBIT CARD NO: " +debitCardNumber+
							"\n DEBIT CARD PIN: " +debitCardPIN);
		
	}

}
