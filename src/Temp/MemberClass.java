package Temp;

public class MemberClass {
	private String s = "I am outer class member";
	public static void main(String[] args) {
		new MemberClass();
	}

	MemberClass() {
			MyInnerClass myInner = new MyInnerClass();
			System.out.println("I am " + myInner.age + " Years old Inner class member");
			myInner.innerMethod();
		}
		private class MyInnerClass{
			public int pd = 10;
			private int age = 30;
			private void innerMethod(){
				System.out.println(s);
			}
		}
}