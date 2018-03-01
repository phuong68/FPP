
public class Prog4 {
	
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("Invalid input, pls input from commandline mode");
			return;
		}
		
		String str = args[0];
				
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
			
		}

	}

}
