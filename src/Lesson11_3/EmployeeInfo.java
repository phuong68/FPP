package Lesson11_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		
		int size = employees.size();
		Employee[] source = new Employee[size];
		Employee[] temp = new Employee[size];
		 for (int i = 1; i < size; i++) {
			 temp[i] = new Employee("",0); 
		 }
		
		employees.toArray(source);
		
		
		int indexOutput = 1;
		temp[0]=source[0];
	    int j;
	    
	    for (int i = 1; i < size; i++) {            
	        j = 0;
	        while ((!temp[j].equals(source[i])) && j < indexOutput) {
	            j++;
	        }
	        if(j == indexOutput){
	        	temp[indexOutput] = source[i]; 
	           indexOutput++;
	        }         
	    }
		
		
    		//copy to dest 
    		List<Employee> dest = new ArrayList<Employee>(indexOutput);
  		for (int i=0;i<indexOutput; i++){
  			dest.add(temp[i]);
  		}
	  		
	  		
		return dest;
	}
	
	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}
	
	

	 
}
