package Lesson8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Marketing implements Comparator<Marketing>{
	String employeename;
	String productname;
	double salesamount;
	
	public Marketing(String employeename, String productname, double salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}
	
	
	
	@Override
	public String toString() {
		return "[" + employeename + " " + productname + " "	+ salesamount + "]";
	}


	@Override
	public int compare(Marketing o1, Marketing o2) {
		
		return Double.compare(o1.salesamount, o2.salesamount);
	}
	
	
	public int equals(Marketing o2) {
		
		return Double.compare(this.salesamount, o2.salesamount);
	}
	
	
	public static void main(String[] agr) {
		ArrayList<Marketing> mList = new ArrayList<Marketing>();
		
		mList.add(new Marketing("Jack","Coke", 10000.0));
		mList.add(new Marketing("Hanna","Pepsi", 9900.0));
		mList.add(new Marketing("Jessica","Sprite", 5000.0));
		mList.add(new Marketing("Mike","Soda", 3000.0));
		mList.add(new Marketing("Howie","Dr. Pepper", 1000.0));
		
		System.out.println("Unsorted Marketing List");
		System.out.println(mList);
		
		System.out.println("Sorted Marketing List");
		System.out.println(Collections.sort());



	



	
	
	
}
