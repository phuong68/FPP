package Lesson5;

public class Prog4 {

	public static void main(String[] args) {
		
		Payable[] pays = new Payable[5];
		
		pays[0] = new CommissionEmployee("Lenon", "Lee", "123-abc-123", 5000, 0.05);
		pays[1] = new HourlyEmployee("Jack", "Smith", "456-def-456", 20, 36.5);
		pays[2] = new SalariedEmployee("Henry", "Mann", "789-hjk-789", 1000);
		pays[3] = new BasePlusCommissionEmployee("Christine", "Sue", "098-rts-098",  5000, 0.05, 1000);
		pays[4] = new Invoice("acb-123","Car Break",4,205.5);
		
		double sumSal=0.0;
		
		for(Payable p: pays) {
			System.out.print(p.toString());
			System.out.print("Salary: " + p.getPaymentAmount()+"\n");
			sumSal += p.getPaymentAmount();
		}
		
		System.out.println("Total Salary: " + sumSal);

	}

}
