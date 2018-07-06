package chiruproject;

public class JavaSwapExample {
	public static void main(String args[]) {
		int x = 20;
		int y = 10;
		Integer z = 4;
		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		// swap the values
		swap(x, y);
	}

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

	}
}
