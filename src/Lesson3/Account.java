package Lesson3;

class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
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
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
			return false;
		}

		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}

		return false;
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