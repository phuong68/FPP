package Lesson11_2;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		
		List<Employee> retEmps = new ArrayList<Employee>();
		java.util.Iterator<String> iterator  = socSecNums.iterator();
		String key;
		
		while(iterator.hasNext()) {
			key=iterator.next();
			if (table.containsKey(key)){
				Employee emp = table.get(key);
					if (emp.getSalary()>80000) {
						retEmps.add(emp);
					}
			}
			
		}
		
		if (retEmps.size() >0) retEmps.sort(new SSNComparator());
		
		return retEmps;
		
	}
	
}
