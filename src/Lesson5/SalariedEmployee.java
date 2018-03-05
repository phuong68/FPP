package Lesson5;

public class SalariedEmployee extends Employee {
	double weeklySalary;
	
	public double getWeeklySalary() {
		return weeklySalary;
	}


	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}


	@Override
	public double getPaymentAmount() {
	
		return weeklySalary;
	}
}
