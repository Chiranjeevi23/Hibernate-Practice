package chiruproject;
import java.util.Scanner;
public class area_of_circle {
	public static void main(String args[]) {
		int r;
		double pie = 3.17, a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of Circle:");
		r = s.nextInt();
		a = pie * r * r; 
		System.out.println("Area of circle is:" +a);
	}
	
}
