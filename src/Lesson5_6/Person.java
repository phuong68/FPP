package Lesson5_6;

import Lesson5_5.Computer;

public class Person implements Cloneable{
	String name;
	Computer computer;
	
	
	
	// Shallow clone
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
