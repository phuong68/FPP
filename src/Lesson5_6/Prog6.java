package Lesson5_6;

public class Prog6 {

	public static void main(String[] args) {
				 
        Person1 man1 = new Person1();
        man1.computer = new Computer("Dell", "i5", 1000,1000,400);
 
        Person1 man2 = null;
 
        try
        {
            //Creating a clone of man1 and assigning it to man2
         	man2 = (Person1) man1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the manufacturer of computer of man1
        System.out.println("Man-1 PC: "+man1.computer.manufacturer);       //Output : Dell
        System.out.println("Man-2 PC: "+man2.computer.manufacturer);       //Output : Dell

        //Changing the manufacturer of 'man2'
         System.out.println("Deepclone Man-2 from Man-1, and set Man-02 PC to Apple");
         man2.computer.manufacturer= "Apple";
 
        //This change will not be reflected in original man1
        System.out.println("Man-1 PC: "+man1.computer.manufacturer);       //Output : Dell
        System.out.println("Man-2 PC: "+man2.computer.manufacturer);       //Output : Apple

	}

}
