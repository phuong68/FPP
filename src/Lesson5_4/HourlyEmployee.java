package Lesson5_4;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	
	public double getWage() {
		return wage;
	}


	public double getHours() {
		return hours;
	}
	
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", firstName=" + firstName + ", lastName="
				+ lastName + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}


	@Override
	public double getPaymentAmount() {
		return wage * hours;
	}
}
