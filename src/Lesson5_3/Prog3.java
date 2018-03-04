package Lesson5_3;

public class Prog3 {

	public static void main(String[] args) {
		Figure[] fig =new  Figure[5];
		
		fig[0] = new UpwardHat();
		fig[1] = new UpwardHat();
		fig[2] = new DownwardHat();
		fig[3] = new FaceMaker();
		fig[4] = new Vertical();
		
		
		// Print Driver Class
		System.out.print("Print Driver Class\n");
		for(Figure f: fig) {
			f.getFigure();
		}
		
		// Print Driver Class with Class name
		System.out.print("\n\n\nPrint Driver Class with Class name\n");
		for(Figure f: fig) {
			System.out.print(f.getClass().getSimpleName()+ ": ");
			f.getFigure();
			System.out.print("\n");
		}

	}

}
