package chiruproject;

public class ArrSum {
	public static void main(String[] args) {
		int chiru[] = {54, 21, 64, 96, 25};
		int sum=0;
		
		
		for(int counter: chiru) {     //enhanced for loop
			sum+= counter;
		}
		
		
		/*
		for(int counter=0; counter<chiru.length; counter++) {
			sum+= chiru[counter];
		}
		*/
		System.out.println("The sum of array is: " +sum);
	}

}
