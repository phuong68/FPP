package Lesson5;

import java.awt.Color;

public class Prog1 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Shape(Color.BLACK);
		shapes[1] = new Rectangle(Color.BLACK,3.0,4.0); // 14 - 12
		shapes[2] = new Rectangle(Color.RED,5.0,8.0);//26 - 40
		shapes[3] = new Square(Color.BLACK,6.0);//24 - 36
		shapes[4] = new Circle(Color.BLACK,6.0);// 113.04 - 37.68
		
		Prog1.printTotal(shapes);
		

	}
	
	public static void printTotal(Shape[] shapes) {
		
		double sumArea= 0.0;
		double sumPerimeter=0.0;
		
		for(Shape sh: shapes) {
			
			sumPerimeter += sh.calculatePerimeter();
			sumArea +=sh.calculateArea();
			
		}
		
		System.out.println ("Toal Perimeter: " + sumPerimeter);
		System.out.println ("Toal Area: " + sumArea);
		
		
	}

}
