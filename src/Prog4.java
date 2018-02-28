
public class Prog4 {
	
//	Write a program (called Prog4) that asks the user to input a String. The output is the characters
//	of this String in reverse order, which should be written to the console. (For example, if the input
//	string is "Hello", the ouptut string would be "olleH") (Do not use arrays and do not create a
//	new String object. In particular, you may not use Java API library functions that peform the
//	reverse operation for you, such as the reverse functions found in StringBuilder and
//	StringBuffer.)Implement your own logic, NO API.
	
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
