package Lesson5;

import java.awt.Color;

public class Circle extends Shape {
	
	double radius;

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		System.out.println(radius*radius*Math.PI);
		return radius*radius*Math.PI;
	}
	
	@Override
	public double calculatePerimeter(){
		System.out.println(radius*2*Math.PI);
		return radius*2*Math.PI;
	}
	

}
