package Lesson5_5;

public class Prog5 {

	public static void main(String[] args) {
		Computer pc1 = new Computer("Hp", "i5",1000,1000,1200.0);
		Computer pc2= new Computer("Hp", "i5",1000,1000,1200.0);
		
		System.out.println("Check if two computers are same? " + (pc1.equals(pc2) ));
		

	}

}
