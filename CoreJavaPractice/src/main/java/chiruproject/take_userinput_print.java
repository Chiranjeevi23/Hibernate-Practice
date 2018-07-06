package chiruproject;

import java.util.Scanner;

public class take_userinput_print {
	public static void main(String args[]) {
		int a;
		String s;
		float f;
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter an integer:");
		a = obj.nextInt(); // Take integer input and assign to variable
		System.out.println("The integer is: " + a);

		System.out.println("Enter a String:");
		s = obj.nextLine();
		System.out.println("The entered string is:" + s);

		System.out.println("Enter a number:");
		f = obj.nextFloat();
		System.out.println("The entered float is:" + f);

	}

}
