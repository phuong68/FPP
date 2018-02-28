

public class Prog6 {

//	Write a program called RemoveDups. Create an array which accepts an array of
//	Strings only. Creates a new array in which all duplicate Strings in the original input array have
//	been removed.
//	For example, if the input array is
//	["horse", "dog", "cat", "horse","dog"]
//	then the output would be the following array:
//	["horse","dog","cat"]
	public static void main(String[] args) {
		String[] str = {"horse", "dog", "cat", "horse","dog"};
		
		String[] ret= {"", "", "", "",""};
		int count=0;
		ret[count] = str[0];
		for(int i=1; i<str.length-1; i++){
			for(int j=0; j<str.length-1; j++){
				if(ret[count]!=str[j]) {
					ret[++count]=str[j];
				}
			}

			
		}
		
		System.out.println(ret.toString());
		
	}
	


}
