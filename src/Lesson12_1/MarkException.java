package Lesson12_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Write your program to get the input of mark in the range of 0 to 100 from the
console. Apply the necessary Exception handling to avoid negative, nonnumbers.*/
public class MarkException {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Pls input a number:");
	    String sInput = scanner.nextLine();
	    
	    try {
	    		
	    		int i =Integer.parseInt(sInput);
	    		
	    		if (i <0 || i>100) throw new IllegalArgumentException(" Pls input a number from 1 to 100");
	    
	    }catch(NumberFormatException e){
	    		System.out.println( "Not a valid number");
	    }
	    
	    
	}

}
