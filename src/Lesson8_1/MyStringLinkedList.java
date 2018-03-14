package Lesson8_1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
	}

	// Implement the code

	public void addLast(String item) {
		
		Node node = this.findLast();
		
		//cant find, new header
		if (node == null) {
			
			header = new Node(null,item,null);
		 	
		}else {// lastnode found, add to tail
			
			Node lastNode = new Node(node,item,null);
			node.next = lastNode;
			
		}

	}

	// implement the code
	public void postAddNode(Node n, String value) {

		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.next == null) {
			// n is the first node
			addLast(value);
		} else {
			
			newNode = new Node(n,value,n.next);
			n.next = newNode;
			n.next.previous = newNode;
			
		}
	}	// implement the code

	public int Size() {
		
		int i =0;
		
		for (Node node = header; node!=null; node = node.next) {
			i++;
		}
		
		return i;
	}

	// implement code
	public boolean isEmpty() {
		return header == null;
	}

	// get the first item
	public Node getFirst() {
		return header;
		
	}
	
	//get Last node
	public Node getLast() {
		Node lastNode=null;
		
		for(Node node= header;node!=null;node=node.next) {
			lastNode = node;
					
		}
		
		return lastNode;
	}
	
	//remove first item
	public void removeFirst() {
	
		if (header == null) return;
		
		header.next.previous = null;
		header= header.next;
		
	}
	
	//remove last item
	public void removeLast() {
		
			this.deleteNode(getLast());
			
		}
	
	//print list
	public void printList() {
		this.print(header);
	}
	
	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}

	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void print(Node node) {
		
		if (node==null) {
			System.out.print(" -> NULL\n");
			return;
		}else {
			System.out.print(  " -> " + node.toString());
			print(node.next);
		}
		
	}
	
	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		
		System.out.println("Init");
		mySL.printList();
		
		System.out.println("Add last [Carrot Cake]");
		mySL.addLast("Carrot Cake");
		mySL.printList();
		
		System.out.println("Add last [Blueberry Muffin]");
		mySL.addLast("Blueberry Muffin");
		mySL.printList();
		
		System.out.println("Add last [Apple Pie]");
		mySL.addLast("Apple Pie");
		mySL.printList();
		
		System.out.println("Add last [Orange Juice]");
		mySL.addLast("Orange Juice");
		mySL.printList();
		
		System.out.println("Add last [Peach Sauce]");
		mySL.addLast("Peach Sauce");
		mySL.printList();
		
		System.out.println("Delete  [Apple Pie]");
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		mySL.printList();
		
		System.out.println("Delete  [Peach Sauce]");
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		mySL.printList();
		
		System.out.println("Delete  [Carrot Cake]");
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		mySL.printList();
		
		System.out.println("Add [Apple Pie] before [Blueberry Muffin]");
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie");
		mySL.printList();
		
		System.out.println("Add [Danish Delight] after [Carrot Cake]");
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight");
		mySL.printList();
		
		System.out.println("Add [Mango Smoothie] before [Orange Juice]");
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie");
		mySL.printList();
		
		System.out.println("Add [Peach Sauce] after [Orange Juice]");
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce");
		mySL.printList();
		
		System.out.println("Print the Size: " + mySL.Size());
		
		System.out.println("Is the list empty: " + mySL.isEmpty());
		
		System.out.println("Get First Node: " + mySL.getFirst());
		
		System.out.println("Get Last Node: " + mySL.getLast());
		
		System.out.println("Remove First Node");
		mySL.removeFirst();
		mySL.printList();
		
		System.out.println("Remove Last Node");
		mySL.removeLast();
		mySL.printList();
				
		System.out.println("Delete list");
		mySL.deleteList();
		mySL.printList();
		
		
	}

}
