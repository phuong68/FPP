package Lesson5;

public class CommissionEmployee extends Employee {
	double grossSale;
	double commissionRate;
	
	public double getGrossSale() {
		return grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	
	
	@Override
	public String toString() {
		return "CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	@Override
	public double getPaymentAmount() {
		return grossSale * commissionRate;
	}
	
	
	
}
