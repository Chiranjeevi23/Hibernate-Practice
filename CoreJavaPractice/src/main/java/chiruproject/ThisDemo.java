package chiruproject;

public class ThisDemo {
	public static void main(String[] args) {
		C obj = new C(9);
		obj.show();
	}

}

class C {
	private int x; // instance Variable

	public C(int x) { // local variable
		this.x = x; // current instance variable
	}

	public void show() {
		System.out.println("x is: " + x);
	}
}