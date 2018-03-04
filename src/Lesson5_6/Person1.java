package Lesson5_6;

public class Person1 implements Cloneable{
	String name;
	Computer computer;
	
	// Deep clone
	public Object clone() throws CloneNotSupportedException{
		Person1 p1 = (Person1)super.clone(); 
		p1.computer = (Computer) computer.clone();
				
		return p1;
	}

}
