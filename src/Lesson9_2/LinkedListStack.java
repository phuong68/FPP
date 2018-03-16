package Lesson9_2;

public class LinkedListStack {

	protected Node top;
	protected int size;

	public LinkedListStack() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int getSize() {
		return size;
	}

	public void push(int data) {
		Node nptr = new Node(data, null);
		if (top == null)
			top = nptr;
		else {
			nptr.setLink(top);
			top = nptr;
		}
		size++;
	}

	public int pop() {
		if (isEmpty())
			System.out.println("Stack is empty");
		Node ptr = top;
		top = ptr.getLink();
		size--;
		return ptr.getData();
	}

	public int peek() {
		if (isEmpty())
			System.out.println("Stack is empty");
		return top.getData();
	}

	public void display() {
		System.out.print("Stack = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr = top;
		while (ptr != null) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();

		stack.push(10);
		System.out.println("Push 10, size: " + stack.getSize());
		stack.display();

		stack.push(20);
		System.out.println("Push 20, size: " + stack.getSize());
		stack.display();

		stack.push(30);
		System.out.println("Push 30, size: " + stack.getSize());
		stack.display();

		stack.push(40);
		System.out.println("Push 40, size: " + stack.getSize());
		stack.display();

		System.out.println("Top: " + stack.peek());

		System.out.println("Pop: " + stack.pop());
		stack.display();

		System.out.println("Pop: " + stack.pop());
		stack.display();

	}

}
