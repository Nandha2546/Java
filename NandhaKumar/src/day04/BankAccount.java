package day04;

public class BankAccount {
	private long accountNumber;
	private int balance;
	
	
	public BankAccount() {
	}


	public BankAccount(long accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		
		this.balance = balance;
	}
	
	
	public int deposit(int amt) {
		
		balance+=amt;
		return balance;
	}
	
	public int withdraw(int amt) {
		
		balance-=amt;
		return balance;
	}

}
