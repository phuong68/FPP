package Lesson5;

import java.time.LocalDate;


public class DeptEmployee {
	String name;
	double salary;
	LocalDate hireFate;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireFate() {
		return hireFate;
	}

	public void setHireFate(LocalDate hireFate) {
		this.hireFate = hireFate;
	}

	public DeptEmployee(String name, double salary, LocalDate hireFate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireFate = hireFate;
	}
	
	public double computeSalary() {
		return this.salary;
	}

}
