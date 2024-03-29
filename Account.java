package bankaccountapp;

// ACCOUNT CLASS IS THE PARENT CLASS, CHECKING & SAVINGS ARE CHILD CLASSES
// NOT MAKING OBJECTS FROM THE ACCOUNT CLASS THUS ITS AN ABSTRACT CLASS

public abstract  class Account implements IBaseRate {
	//List common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10 , 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);	
		printBalance();
	}
	
	// List common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("DEPOSITING $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("WITHDRAWING $" + amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("TRANSFERRING $" + amount + " to " + toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is now: $" +balance);
	}
	
	public void showInfo() {
		System.out.println("NAME: " + name +
							"\nACCOUNT NUMBER: " + accountNumber +
							"\nBALANCE: $" + balance +
							"\nSSN: " + sSN +
							"\nRATE: " + rate + "%");
		
	}

}
