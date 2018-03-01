package Lesson3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

public class Employee1 {
	// instance fields
	private String name;
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private LocalDate hireDay;

	// constructor
	Employee1(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDay = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	// instance methods
	public String getName() {
		return name;
	}
	
	// needs to be improved
	public Date getHireDay() {
		return Date.from(hireDay.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(new Employee(),AccountType.CHECKING);
		this.checkingAcct.makeDeposit(startAmount);
	}
	
	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(new Employee(),AccountType.SAVINGS);
		this.savingsAcct.makeDeposit(startAmount);
	}
	
	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(new Employee(),AccountType.RETIREMENT);
		this.retirementAcct.makeDeposit(startAmount);
	}
	
	public void deposit(AccountType acctType,double amt) {
		
		   switch (acctType) {
		        case CHECKING:
		        		
		        		this.checkingAcct.makeDeposit(amt);
		        		
		            break;
		        case SAVINGS:
		        		
		        		this.savingsAcct.makeDeposit(amt);
		            
		        		break;
		        case RETIREMENT:
			        
		        		this.retirementAcct.makeDeposit(amt);
		            
		        		break;
		        default:
	        	  
		   }
	}
	
	public void withdraw(AccountType acctType,double amt) {
		
		   switch (acctType) {
		        case CHECKING:
		        		
		        		this.checkingAcct.makeWithdrawal(amt);
		        		
		            break;
		        case SAVINGS:
		        		
		        		this.savingsAcct.makeWithdrawal(amt);
		            
		        		break;
		        case RETIREMENT:
			        
		        		this.retirementAcct.makeWithdrawal(amt);
		            
		        		break;
		        default:
	        	  
		   }
	}
	
	
	public String getFormatedAccountInfo() {
		//private String format = "name = %s, salary = %.2f, hireDay = %s";
		return null;//String.format(format, name,  Util.dateAsString(hireDay));
	}
}
