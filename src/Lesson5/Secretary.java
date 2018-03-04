package Lesson5;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	double overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public Secretary(String name, double salary, LocalDate hireFate, double overtimeHours) {
		super(name, salary, hireFate);
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary(){
		return super.computeSalary() + 12*this.overtimeHours;
	}
	
}
