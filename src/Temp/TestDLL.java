package Temp;

public class TestDLL {

	public static void main(String[] args) {
		DLLNode head = new DLLNode(null,"abc",null);
				
		System.out.println(head.toString());
		
		// new node after head
		DLLNode n1 = new DLLNode(head,"def",null);
		head.next = n1;
		
		// new node after n
		DLLNode n2 = new DLLNode(n1,"igh",null);
		n1.next = n2;
		
		// new node before n1
		DLLNode n3 = new DLLNode(head,"xxx",n1);
		head.next = n3;
		n1.prev = n1;
		
		// modfy 2nd node
		head.next.data = "yyy";
		

		
		for (DLLNode i=head; i!=null; i=i.next) {
			System.out.print(i.toString()+" ");
		}
	}

}
