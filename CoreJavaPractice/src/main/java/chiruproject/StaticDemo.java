package chiruproject;

public class StaticDemo {
	public static void main(String[] args) {
		demo.show();
	}
}

class demo {
	static int i = 7;

	public static void show() {
		System.out.println("this is from show method");
		System.out.println(i);
	}
}