package Lesson2;
import java.util.Arrays;
import java.util.StringJoiner;

public class Prog6 {

	public static void main(String[] args) {
		
		String[] source = {"horse", "dog", "cat", "horse","dog"};
		String[] temp ={null, null, null, null,null};
		
		
		int indexOutput = 1;
		temp[0] = source[0];
	    int j;
	    
	    for (int i = 1; i < source.length; i++) {            
	        j = 0;
	        while ((temp[j] != source[i]) && j < indexOutput) {
	            j++;
	        }
	        if(j == indexOutput){
	        	temp[indexOutput] = source[i];
	           indexOutput++;
	        }         
	    }
		
		
		//copy to dest string
		String[] dest = new String[indexOutput];
		System.arraycopy(temp,0, dest, 0, indexOutput);
		
		// print result dest
		for(String s: dest ) {
			
			System.out.print(s+" ");
		}
		
	}
	

}
