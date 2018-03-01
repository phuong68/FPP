
public class Prog7 {

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
