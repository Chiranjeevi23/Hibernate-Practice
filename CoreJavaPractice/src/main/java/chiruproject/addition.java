package chiruproject;
import java.util.Scanner;
class addition {
	public static void main(String args[]) {
		Scanner chiru = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = chiru.nextDouble();
		System.out.println("Enter second number: ");
		snum = chiru.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
