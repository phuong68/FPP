package Lesson4;

public class Lesson4 {

	public static void main(String[] args) {
		
		System.out.println("1. Merge two strings using recurrisive");
		System.out.println("Inputs: 1. ace\t 2. bdf");
		System.out.println("Result: " + mergeStrings("ace","bdf"));
		
		System.out.println("\n");
		
		System.out.println("2. Find the minimum character in a string");
		System.out.println("Input: akel");
		System.out.println("Result: " + findStringMinimum("akeZAl"));
		
		System.out.println("\n");
		
		System.out.println("3. Recursive search ");
		System.out.println("Input: abcdefgh - search for : e");
		System.out.println("Result: e is at " + binarySearch("abcdefgh",'e'));
		

	}
	
	static String mergeStrings(String s1, String s2){
		
		String tmp="";
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1==0 && len2==0){// s1 and s2 empty
			
			tmp= "";
		
		}else if(len1>0 && len2==0){ // s1 not empty s2  empty
			
			tmp=s1;
			
		}else if(len1==0 && len2>0){ // s1 empty s2 not empty
			
			tmp=s2;
			
		}else{// s1 and s2 not empty
			
			if (s1.charAt(0) > s2.charAt(0)) {
				
				tmp = s2.charAt(0) + mergeStrings(s1, s2.substring(1));
			}else {
				
				tmp = s1.charAt(0) + mergeStrings(s1.substring(1),s2);
			}
		}
		
		
		return tmp;
	}
	
	static char findStringMinimum(String s){
	
		return findMinimum(s,'z');
	}
		
	private static char findMinimum(String s, char currMin){

		char tmp=' ';
		
		if (s.length()==0) {
			tmp= currMin;
		}
		
		else {
			if (s.charAt(0)<currMin) {
				tmp = s.charAt(0);
				findMinimum(s.substring(1),tmp);
			}
		}
		
		return tmp;
	}

	static int binarySearch(String s, char ch) {
		return recursiveSearch(s,ch);
	}
	
	private static int recursiveSearch(String s, char ch) {
		int i=-1;
		int len = s.length();
		char mid=s.charAt(len/2);
		
		if (mid==ch){
			
			i=len/2;
			
		}else if(mid> ch) {
			
			i = recursiveSearch(s.substring(0,len/2-1), ch);
			
		}else {
			i = recursiveSearch(s.substring(len/2+1), ch);
		}
			
		
		return i;
		
	}
}
