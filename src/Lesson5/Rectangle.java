package Lesson5;

import java.awt.Color;

public class Rectangle extends Shape{

	double width;
	double height;
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
		
	}
	
	@Override
	public double calculateArea(){
		System.out.println(width*height);
		return width*height;
	}
	
	@Override
	public double calculatePerimeter(){
		System.out.println((width+height)*2);
		return (width+height)*2;
	}

}
