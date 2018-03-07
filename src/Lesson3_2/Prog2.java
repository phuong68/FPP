package Lesson3_2;

public class Prog2 {

	public static void main(String[] args) {
		Employee emp = new Employee("Jackie","Jake William",60000,2010,10,23);
		
		Account accCheckings = new Account(emp,AccountType.CHECKING,300);
		Account accRetire = new Account(emp,AccountType.RETIREMENT,300);
		Account accSavings = new Account(emp,AccountType.SAVINGS,300);
		
		accCheckings.makeWithdrawal(100);
		accSavings.makeDeposit(80);
		accRetire.makeDeposit(20);
		
		System.out.println(accCheckings.toString());
		System.out.println(accSavings.toString());
		System.out.println(accRetire.toString());

		

	}

}
