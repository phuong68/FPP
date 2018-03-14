package Temp;


class Abs {
	public static void main(String[] a) {
		
		System.out.println("" + (Integer.parseInt("5")+ Integer.parseInt("3")));
		System.out.println("" + (Integer.parseInt("5")- Integer.parseInt("3")) );
		
		System.out.println("" + findPower(2,3) );
		System.out.println("" + findPower(0,3) );
		System.out.println("" + findPower(2,1) );
		System.out.println("" + findPower(2,0) );
		
		
	}
	
	static int findPower(int x, int y) {
		
		if (y<=0) return 1;
		else
			return x * findPower(x,y-1);
		
	}
	
}
//
// class Abs1 {
//	abstract void unfinished() { // asbtract method should be in abstract class
//											};
//	}
//}
//
//public class abstract  Abs2 { // "abstractor" keyword needs to be infront of "class"
//	abstract void unfinished();
//}
//
//abstract class Abs3{//
//	protected void unfinished() ;// protected need emty method body
//}