
public class Prog2 {

//	Problem – 2
//	Create a class Prog2. Inside its main method, create float variables to store each of the following
//	numbers:
//	1.27, 3.881, 9.6
//	Output to the console the following two values:
//	1. the sum of the floats as an integer, obtained by casting the sum to type int
//	2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
//	using the Math.round function
	
	public static void main(String[] args) {
		
		float x = 1.27f;
		float y = 3.881f;
		float z = 9.6f;
		
		System.out.println("the sum of the floats as an integer (Int): " + (int)(x+y+z) );
		System.out.print("the sum of the floats as an integer Math.Round(): " + Math.round(x+y+z) );

		
	}

}
