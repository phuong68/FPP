
package Lesson3_3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import Lesson3_2.AccountType;


public class Employee {
	// instance fields
	private String name;
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private LocalDate hireDay;

	// constructor
	Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
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
		this.checkingAcct = new Account(this, AccountType.CHECKING);
		this.checkingAcct.makeDeposit(startAmount);
	}
	
	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, AccountType.SAVINGS);
		this.savingsAcct.makeDeposit(startAmount);
	}
	
	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT);
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
		StringBuilder sb = new StringBuilder();
		
		sb.append("ACCOUNT INFO FOR ");
		sb.append(this.name);
		sb.append(":\n\n");
		
		if (this.checkingAcct!=null) {
			sb.append("Account type: \tchecking\n");
			sb.append("Current bal: \t");
			sb.append(this.checkingAcct.balance + "\n");
		}
		
		if (this.savingsAcct!=null) {
			sb.append("Account type: \tsavings\n");
			sb.append("Current bal: \t");
			sb.append(this.savingsAcct.getBalance() + "\n");
		}
		
		if (this.retirementAcct!=null) {
			sb.append("Account type: \tretirement\n");
			sb.append("Current bal: \t");
			sb.append(this.retirementAcct.getBalance() + "\n");
		}
		
		return sb.toString();
	}
}
