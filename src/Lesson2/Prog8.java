package Lesson2;

public class Prog8 {

	
	public static void main(String[] args) {
		int[] arr = {2,-21,3,45,0,12,18,6,3,1,0,22};
		
		int min = Integer.MAX_VALUE;
		for (int i =0; i< arr.length;i++){
			if (arr[i]<min) min = arr[i];
			
		}
		
		System.out.println("Min is :" + min);
		

	}

}
