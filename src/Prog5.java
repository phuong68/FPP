
public class Prog5 {

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
					System.out.printf(String.format("\t\t+\t%2d", matrix[i][j]));
					//System.out.printf(String.format("%s", "----------"));
					
				}
				else {
					System.out.printf(String.format("\t\t\t%2d", matrix[i][j]));
					
				}
				
				
			}
			
			System.out.printf("\n");
			if (i==1 || i==3) System.out.printf("\t\t----------\t\t----------\t\t----------\t\t----------");
			if (i==1) System.out.printf("\n\n\n\n");
			
		}
	}

}
