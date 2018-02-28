
public class Prog7 {

//	Write a program to accept the string inputs from Command line arguments and perform the
//	following.
//	a. Print the length of each string input.
//	b. Count the string inputs starts with ‘A’.
	public static void main(String[] args) {
		
		if (args.length==0) {
			System.out.println("Invalid input, pls input from commandline mode");
			return;
		}
		
		int nCount=0;
		
		for(String str:args){
			if ( str.length()>0) {
				System.out.printf("Len(%s) : %d\n",str,str.length() );
				if (str.charAt(0)=='A') nCount++;
	
				
			}
						
		}
		
		System.out.printf("There are %d strings start with 'A'",nCount);

	}

}
