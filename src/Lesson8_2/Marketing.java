package Lesson8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Marketing implements Comparator<Marketing>{
	String employeename;
	String productname;
	double salesamount;
	
	public Marketing() {
		super();
	}



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
	
	public static ArrayList<Marketing> listMoreThan1000(ArrayList<Marketing> list){
		ArrayList<Marketing> retList = new ArrayList<Marketing>();
		
		for(Marketing mkt:list) {
		 if (mkt.salesamount>1000)
			 retList.add(mkt);
		}
		
		return retList;
		
	}
	
	
	public static void main(String[] agr) {
		ArrayList<Marketing> mList = new ArrayList<Marketing>();
		Marketing jessie = new Marketing("Jessica","Sprite", 2000.0);
		
		mList.add(new Marketing("Jack","Coke", 1500.0));
		mList.add(new Marketing("Hanna","Pepsi", 9900.0));
		mList.add(jessie);
		mList.add(new Marketing("Mike","Soda", 3000.0));
		mList.add(new Marketing("Howie","Dr. Pepper", 1000.0));
		
		System.out.println("Unsorted Marketing List");
		System.out.println(mList);
		
		System.out.println("\nSorted Marketing List");
		Collections.sort(mList, new Marketing());
		System.out.println(mList);
		
		System.out.println("\nRemove Jessica From Marketing List");
		mList.remove(jessie);
		System.out.println(mList);
		
		System.out.println("\nSet Jessica to Marketing List at third position");
		mList.set(2, jessie);
		System.out.println(mList);
		
		System.out.println("\nFilter which Marketting has sales more than 1000");
		ArrayList<Marketing> list1k =  listMoreThan1000(mList);
		System.out.println(list1k);
		
		System.out.println("\nSorted has-sale-more-than-1000 MarketingList");
		Collections.sort(list1k, new Marketing());
		System.out.println(list1k);
		
		
		



	
	}


	
	
	
}
