package Temp;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpTest {

	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("name1", 1600.0));
		emplist.add(new Employee("name3", 1300.0));
		emplist.add(new Employee("name4", 1400.0));
		emplist.add(new Employee("name2", 1200.0));
		
		System.out.println("Unsorted Employee List");
		System.out.println(emplist);
		
		
		
		System.out.println("Sorted Employee List (By Name)");
		Collections.sort(emplist, new NameComparator<Employee>());
		System.out.println(emplist);
		
		System.out.println("Sorted Employee List (By Salary)");
		Collections.sort(emplist, new SalaryComparator());
		System.out.println(emplist);
		
		//Iterator<String> iter= emplist.iterator();

	}

}
