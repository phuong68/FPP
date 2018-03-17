package Lesson9_1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = -1;

	public int peek() {
		if (!this.isEmpty())
			return arr[front];
		else
			throw new NullPointerException("Queue is empty");
		// implement
	}

	public void enqueue(int obj) {
		
		if (arr.length == rear+1) resize();
		arr[++rear]= (int)obj;
		
		if(front == -1) front = 0;
	}

	public int dequeue() {
		
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int value = arr[front++];
		
		if (front == rear) front = rear =-1;
		
		return value ;
		
		
	}


	public boolean isEmpty() {
		
		return rear==front;
	}

	public int size() {
		// implement
		return (rear - front)+1;
	}

	private void resize() {
		int[] newArr = new int[20];
		System.arraycopy(arr, front, newArr, 0, rear-front+1);
		
		arr = newArr;
		rear = rear-front;
		front=0;
		
			
		
	}
	
	public void print() {
		for (int i=front; i<=rear;i++){
			
			System.out.print("-> " + arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] a) {
		
		ArrayQueueImpl q = new ArrayQueueImpl();
			
		q.enqueue(10);
		System.out.println("Enqueue 10, size: " + q.size());
		q.print();
		
		
		q.enqueue(20);
		System.out.println("Enqueue 20, size: " + q.size());
		q.print();
		
		
		q.enqueue(30);
		System.out.println("Enqueue 15, size:  " + q.size());
		q.print();
		
		
		q.enqueue(40);
		System.out.println("Enqueue 50, size: " + q.size());
		q.print();
				
		q.enqueue(50);
		System.out.println("Enqueue 30, size: " + q.size());
		q.print();
		
	
		System.out.println("Peek: " + q.peek());
		System.out.println("Dequeue: " + q.dequeue() + ", size: " +q.size());
		q.print();
		
		
		System.out.println("Peek: " + q.peek());
		System.out.println("Dequeue: " + q.dequeue() + ", size: " +q.size());
		q.print();
		
		q.enqueue(10);
		System.out.println("Enqueue 10, size: " + q.size());
		q.print();
		
		q.enqueue(20);
		System.out.println("Enqueue 20, size: " + q.size());
		q.print();
		
		q.enqueue(70);
		System.out.println("Enqueue 70, size: " + q.size());
		q.print();
		
		q.enqueue(80);
		System.out.println("Enqueue 80, size: " + q.size());
		q.print();
		
		q.enqueue(90);
		System.out.println("Enqueue 90, size: " + q.size());
		q.print();
		
		q.enqueue(99);
		System.out.println("Enqueue 99, size: " + q.size());
		q.print();
		
		q.enqueue(100);
		System.out.println("Enqueue 100, size: " + q.size());
		q.print();
		
		
	}
}