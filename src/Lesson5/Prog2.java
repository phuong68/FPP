package Lesson5;

import java.time.LocalDate;
import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Kent",2000.0, LocalDate.of(2004,4,23),2);
		Professor prof2 = new Professor("John",3000.0, LocalDate.of(2001,2,11),3);
		Professor prof3 = new Professor("William",2500.0, LocalDate.of(2002,8,6),2);
		
		Secretary sec1 = new Secretary("Nina",1000.0, LocalDate.of(2004,3,15),0);
		Secretary sec2 = new Secretary("Wendy",1200.0, LocalDate.of(2005,5,5),0);
		
		DeptEmployee[] emps = new DeptEmployee[5];
		
		emps[0]=prof1;
		emps[1]=prof2;
		emps[2]=prof3;
		emps[3]=sec1;
		emps[4]=sec2;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to see the sum of all Professor salary?(y/n)");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("y")){
			System.out.println("Total Salary: " + SumAllProfSal(emps));
		}
		
		System.out.println("Would you like to see the sum of all Secretary salary?(y/n)");
		answer = sc.next();
		
		if(answer.equalsIgnoreCase("y")){
			System.out.println("Total Salary: " + SumAllSecSal(emps));
		}
		
		System.out.println("Would you like to see the sum of all staff salary?(y/n)");
		answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			System.out.println("Total Salary: " + SumAllSal(emps));
		}

	}
	
	static double SumAllProfSal(DeptEmployee[] emps ) {
		double sum = 0.0;
		for (DeptEmployee de: emps) {
			if (de.getClass().getSimpleName().equals("Professor")) {
				sum+=de.computeSalary();
			
			}
		}
		
		return sum;
	}
	
	static double SumAllSecSal(DeptEmployee[] emps ) {
		double sum = 0.0;
		
		for (DeptEmployee de: emps) {
			if (de.getClass().getSimpleName().equals("Secretary")){
				sum+=de.computeSalary();
			
			}
		}
		
		return sum;
	}
	
	static double SumAllSal(DeptEmployee[] emps ) {
		double sum = 0.0;
		
		for (DeptEmployee de: emps) {
			
				sum+=de.computeSalary();
			
		}
		
		return sum;
	}
	

}
