package chiruproject;

public class SuperDemonstration {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
	}
}

class A {
	int i = 5;
}

class B extends A {
	int i = 8;

	public void show() {
		System.out.println(super.i);
	}
}