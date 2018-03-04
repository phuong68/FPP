package Lesson5_4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", grossSale=" + grossSale + ", commissionRate="
				+ commissionRate + ", firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}

	@Override
	public double getPaymentAmount() {
		return this.baseSalary + super.getPaymentAmount();
	}
}
