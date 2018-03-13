package Lesson8_4;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		Double totalSal = 0.0;
		
		for (EmployeeData ed : aList) {
			totalSal += ed.getSalary();
		}
		
		return totalSal;
		
	}
}
