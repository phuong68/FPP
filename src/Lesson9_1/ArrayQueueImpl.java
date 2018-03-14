package Lesson9_1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		return arr[0];
		// implement
	}

	public void enqueue(int obj) {
		
		if (arr.length == rear+1) resize();
		arr[++rear]= (int)obj;
		front=0;
		
		// implement
	}

	public int dequeue() {
		
		int[] newArr = new int[arr.length-1];
		int retItem =  arr[0];
				
		for (int i=1; i<arr.length;i++){
			
			newArr[i-1] = arr[i];
		}
		
		arr = newArr;
		return retItem;
		
		// implement
	}

	public boolean isEmpty() {
		
		return (rear-front)>0;
	}

	public int size() {
		// implement
		return rear - front;
	}

	private void resize() {
		int[] newArr = new int[20];
		int i;
		for (i=0; i<arr.length;i++){
			
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		front=0;
		rear = i-1;
		// implement
	}
	
	public void print() {
		for (int i=0; i<size();i++){
			
			System.out.print("-> " + arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] a) {
		
		ArrayQueueImpl q = new ArrayQueueImpl();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(15);
		q.enqueue(50);
		q.enqueue(30);
		System.out.println("Queue: ");
		q.print();
		
		
		System.out.println("Peek: " + q.peek());
		System.out.println("Dequeue: " + q.dequeue());
		q.print();
		
		System.out.println("Peek: " + q.peek());
		System.out.println("Dequeue: " + q.dequeue());
		q.print();
		
		
		
		
		
		
	}
}