package Lesson5_5;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	double computePower(){
		return this.ramSize*this.processorSpeed;
	}
	
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", diskSize=" + diskSize + ", processorSpeed=" + processorSpeed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean ret=false;
		
		if (obj == null ) return ret;
		if (obj.getClass()  != this.getClass()) return ret;
		
		Computer pc = (Computer)obj;
		
		ret = pc.getDiskSize() == this.getDiskSize() && pc.getProcessorSpeed() == this.getProcessorSpeed()
																		&& pc.getRamSize() == this.getRamSize();
		
		
		return ret;
	}
	
	@Override
	public int hashCode() {
		int hashCode =11;
		
		hashCode += manufacturer.hashCode() + this.processor.hashCode() 
							+ diskSize + Double.doubleToLongBits(this.getProcessorSpeed()) + ramSize;
		
		return hashCode;
	}
}
