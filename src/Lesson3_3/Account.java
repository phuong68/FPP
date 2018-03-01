package Lesson3_3;

import Lesson3.AccountType;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance == " + balance;
	}

	public void makeDeposit(double deposit) {
		if (deposit>0) {
			
			this.balance+=deposit;
		}
		else {
			
			System.out.println("Invalid deposit amount");
		}
			
	}

	public boolean makeWithdrawal(double amount) {
		boolean success= false;
		
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
			
			return success;
		}

		if (this.balance < amount) {
			System.out.println("Balance insufficient");
			success= false;
		}
		else {
			
			this.balance -= amount;
			success= true;
			
		}

		return success;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}
	
	
}