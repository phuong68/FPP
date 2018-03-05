package Lesson5;

public class Invoice implements Payable{
	String partNumber;
	String partDescription;
	int quantity;
	double pricePerItem;
	
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}


	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}
	
	

}
