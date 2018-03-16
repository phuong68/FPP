package Lesson11_3;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
	
	@Override
	public boolean equals(Object e) {
		if (e == null ||  e.getClass().getSimpleName() != "Employee") return true;
		
		Employee em = (Employee)e;
		return name==em.name && salary==em.salary;
	}
	@Override
	public int hashCode() {
		return 11 + name.hashCode() + this.salary;
	}
	
}
