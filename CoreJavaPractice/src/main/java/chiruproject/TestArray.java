package chiruproject;

public class TestArray {
	public static void main(String args[]) {
		double[] myList = { 1.9, 8.9, 3.4, 3.5 };

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

		// Print all the array elements using foreach
		for (double element : myList) {
			System.out.println(element);
		}

		// summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total = total + myList[i];
		}
		System.out.println("Total is " + total);

		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);
	}
}
