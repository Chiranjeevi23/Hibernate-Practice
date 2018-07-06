package chiruproject;
import java.util.Scanner;
public class apples {
	/*the word "static" is used to access method without creating its object.
	 * The word "void" indicates that a method does not return a value. 
	 * main() is declared as void because it does not return a value.*/
	
	//main is a method; this is a starting point of a Java program.
	public static void main(String args[]) {   
		tuna tunaObject = new tuna("Nicole");
		tunaObject.saying();
	}		
}