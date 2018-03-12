package Temp;

public class StaticDemo {
	static int data=30; 
	int data1 = 100;
	  void print()
	  {
		    	  
		  System.out.println("data is "+data1);
	  }
	  static class Inner{  
	   static int x=50;
	   int k = 10;
	   static void msg()
	   {
		   System.out.println("data is "+x);
		   System.out.println("data is "+data);
		    
		  // System.out.println("data is "+data1);
	   }  
	   void display()
	   {
		   System.out.println("Static Method Demo");
        }
	  }  
	
	public static void main(String[] args) {
		new StaticDemo().print();
		// Invoke static method without creating objects, directly calling by class name
		Inner.msg();
		// Non-static method invoked by using objects
		Inner obj1=new Inner();  
		obj1.display();
	}//100

}
