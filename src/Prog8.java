
public class Prog8 {
//
//	Create a class Prog8 that outputs the minimum of an array of ints.
//	Example: Input array : [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22]
//	 Output : -21
//	Note: Get the input of an array either using console or by direct assignment.
//	NOTE: You may not use the sorting tools available in the Java libraries; for instance, you may
//	not call Arrays.sort() to sort the input array. (No credit if you do it this way). 
	
	public static void main(String[] args) {
		int[] arr = {2,-21,3,45,0,12,18,6,3,1,0,22};
		
		int min = Integer.MAX_VALUE;
		for (int i =0; i< arr.length;i++){
			if (arr[i]<min) min = arr[i];
			
		}
		
		System.out.println("Min is :" + min);
		

	}

}
;