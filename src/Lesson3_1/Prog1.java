package Lesson3_1;

public class Prog1 {

	public static void main(String[] args) {

		Customer cus1 = new Customer("Lee","Jack","123456789");
		cus1.setBillingAddress(new Address("Street1","Chicago","state1","zip1"));
		cus1.setShippingAddress(new Address("Street11","city11","state11","zip11"));
		
		Customer cus2 = new Customer("John","Liam","11223344");
		cus2.setBillingAddress(new Address("Street2","city2","state2","zip2"));
		cus2.setShippingAddress(new Address("Street21","city21","state21","zip21"));
		
		Customer cus3 = new Customer("William","Jay","55667788");
		cus3.setBillingAddress(new Address("Street3","city3","state3","zip3"));
		cus3.setShippingAddress(new Address("Street31","city31","state31","zip31"));
		
		
		Customer[] cusarr = new Customer[3];
		
		cusarr[0] = cus1;
		cusarr[1] = cus2;
		cusarr[2] = cus3;
		
		// print all customers has billing address in Chicago
		for(Customer c: cusarr) {
			if (c.getBillingAddress().city == "Chicago") {
				System.out.println(c.toString());
			}
			
		}
		
		
		
		
	}

}
