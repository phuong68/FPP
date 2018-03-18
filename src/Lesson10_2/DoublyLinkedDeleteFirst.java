package Lesson10_2;


public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		Node deletedNode;
		Node newFirst;
		
		if (isEmpty() ) throw new NullPointerException("List is Empty");
		
		deletedNode = header.next;
		
		if (header.next.next == null){// only 1 item in the list no second item
			newFirst = null;
			header.next = newFirst;
			
							
		}
		else{
			
			newFirst = header.next.next;
			
			newFirst.previous = null;
			deletedNode.next = null;
			
			header.next = newFirst;
			newFirst.previous = header;
		}
		
		
		return deletedNode.value;
		
		
		
	}
	
	public boolean isEmpty() {
		 
		return header.next == null;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		System.out.println(list);
		
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);
	

	}
}
