package Lesson3_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Enter C for Circle");
	    System.out.println("Enter R for Rectangle");
	    System.out.println("Enter T for Triangle");
	    
	    String sChoice = scanner.nextLine();

	    	    
	    switch (sChoice.toUpperCase()) {
	        case "C":
	        		try {
		        		System.out.println("Enter the radius Circle");
		        		double radius = scanner.nextDouble();
		        		Circle c = new Circle(radius);
		        		
		        		System.out.println("The Area of Circle is: " + c.ComputeArea());
		        	
	        		}
	        		catch(InputMismatchException ex){
	        			System.out.println("Invalid input");
	        		}
	        		
	            break;
	        case "R":
		        	try {
		        		
		        		System.out.println("Enter the Width of Rectangle:");
		        		double w = scanner.nextDouble();
		        		
		        		System.out.println("Enter the Height of Rectangle:");
		        		double h = scanner.nextDouble();
		        				        		
		        		Rectangle r = new Rectangle(w,h);
		        		
		        		System.out.println("The Area of Rectangle is: " + r.ComputeArea());
		        	
	        		}
	        		catch(InputMismatchException ex){
	        			System.out.println("Invalid input");
	        		}
	            break;
	        case "T":
		        	try {
		        		
		        		System.out.println("Enter the Height of Triangle:");
		        		double h = scanner.nextDouble();
		        		
		        		System.out.println("Enter the Base of Triangle:");
		        		double b = scanner.nextDouble();
		        				
		        		Triangle t = new Triangle(h,b);
		        		
		        		System.out.println("The Area of Rectangle is: " + t.ComputeArea());
		        	
	        		}
	        		catch(InputMismatchException ex){
	        			System.out.println("Invalid input");
	        		}
	       
	            break;
	        default:
	        	  System.out.println("Invalid input");
	        	  
	        	 
	    }
	    
	    scanner.close();

	}

}
