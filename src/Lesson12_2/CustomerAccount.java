package Lesson12_2;

/*Create a class called CustomerAccount with the following attributes and methods.
Attributes : Cus_name, Acc_No, Balance.
Functions : deposit() � Used to increase the balance
 Withdraw() � Used to reduce the balance.
Create a user defined exception to handle the following situation
1. Withdraw amount exceed the balance
2. Balance reach below 100$.*/
public class CustomerAccount {
	String Cus_name;
	String Acc_No;
	double Balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		super();
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
	}
	
	public void deposit(double dep) {
		if (dep>0) this.Balance+=dep;
		
	}  
	
	public void withdraw(double wth) throws InsufficentFundException, LowFundException{
		if (wth > this.Balance) throw new InsufficentFundException("Insufficent Fund");
		this.Balance -= wth;
		
		if (this.Balance <=100) throw new LowFundException("Your Balace is low");
	}
	
	public static void main(String[] args) throws LowFundException, InsufficentFundException {
		
		CustomerAccount cus = new CustomerAccount("Andrew","123-4355-345",100);
		
		
		try {
			
		cus.withdraw(1050);
		
		
		}catch(InsufficentFundException eISF) {
			System.err.println(eISF);
		
		}
		
		cus.deposit(900);
		
		
		try{
			cus.withdraw(910);
		}
		catch(LowFundException eLF) {
		
			System.err.println(eLF);
			
		}
		

	}

}
