package chiruproject;

public class arr_reverse {
	public static void main(String[] args) {
		String[] name = {"C","h","i","r","a","n","j","e","e","v","i"}; // char is 2 bytes
		int z=name.length;
		int c;
		//print all elements
		for (int i=0; i < name.length; i++) {
			System.out.print(name[i]);			
		}
		System.out.println("  ");
		System.out.println("length is:" +z);
		System.out.println("Size of this array in bytes is: " +(name.length)*2);
		
		
		System.out.println(".....................");
				
		//reversing the current string
		System.out.print("The Reversed string is: ");
		for (int j=name.length-1; j>=0; j--) {
			
			System.out.print(name[j]);
		}
		
		System.out.println("  ");
	}

}
