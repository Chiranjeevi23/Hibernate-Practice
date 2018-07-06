package chiruproject;

public class practice {
	static int x = 60; // static variable

	static void fun() { // static method
		System.out.println("Within Static");
	}

	public static void main(String[] args) {
		practice.fun();
		System.out.println(practice.x);
		practice S1 = new practice();
		practice S2 = new practice();
		System.out.println(S1.x);
		S1.fun();
	}
}