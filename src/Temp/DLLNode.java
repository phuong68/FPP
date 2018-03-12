package Temp;

public class DLLNode {
	
	DLLNode prev;
	Object data;
	DLLNode next;
	
	public DLLNode(DLLNode prev, Object data,DLLNode next) {
		
		this.next = next;
		this.data = data;
		this.prev = prev;
	}

	public DLLNode() {
		next = null;
		prev = null;
		data = null;
		
	}
	
	@Override
	public String toString() {
		return " "+ data.toString();
	}
	
	
}

