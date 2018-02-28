
public class Prog5 {
//	Write a program that generates a random set of 8 addition problems (intended for a child in
//			elementary school). Numbers to be added should be randomly chosen from the range 1..99 [Use
//			the RandomNumbers.java class to produce random number in the range of 1..99]. Each run of
//			the program should result in a different set of problems (actually, there is a tiny probability that
//			two runs of the program will produce the same set of problems, but I don’t expect anyone will
//			encounter this). Console output should be formatted like this:
//			 8 23 31 99
//			 + 10 + 17 + 9 + 42
//			 _____ ____ ____ ____
//			 83 67 39 5
//			 + 17 + 7 + 19 + 49
//			 _____ ____ ____ ____
//			Hint : Use Multi-Dimensional array to store the random numbers in [4 x 4 ] matrix.
	public static void main(String[] args) {
int[][] matrix = new int[4][4];
		
		//Initialize with Random numbers
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				matrix[i][j] = RandomNumbers.getRandomInt(1, 99);
				
			}
			
		}
		
		
		
		//Print
		for(int i=0;i<4;i++){
			
			for(int j=0;j<4;j++){
				
				if (i==1 || i==3) {
					//System.out.printf(String.format("+%2d"));
					System.out.printf(String.format("+%8d", matrix[i][j]));
					//System.out.printf(String.format("%s", "----------"));
					
				}
				else {
					System.out.printf(String.format("%10d", matrix[i][j]));
					
				}
				
				
			}
			
			
			
			if (i==1) System.out.printf("\n\n\n\n");
			else System.out.printf("\n");
			
		}
	}

}
