package Temp;

class Out {
	int y = 20;

	public void display() {
		class Inner // Inner class defined inside method
		{
			int x = 10;

			public void show() {
				System.out.println("x + y : " + (x + y));
			}
		}
		Inner in = new Inner();
		in.show();
	}
}

public class LocalClass {

	public static void main(String[] args) {
		Out ot = new Out();
		ot.display();
	}
}