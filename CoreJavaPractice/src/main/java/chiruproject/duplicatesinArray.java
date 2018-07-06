package chiruproject;

import java.util.HashSet;
import java.util.Set;

public class duplicatesinArray {

	public static void main(String[] args) {
		String names[]= {"Python","Java","Cpp","C","JavaScript","Java", "JavaScript"};
//		//compare each element
//		for(int i=0; i<names.length; i++) {  //O(nxn) ..worst approach
//			for(int j=i+1; j<names.length; j++) {
//				
//				//print duplicate element
//				if(names[i]==(names[j])) {
//					System.out.println("Duplicate element is: " +names[i]);
//				}
//			}
//		}

		//2. using HashSet (it stores unique elements) time: O(n)  //best method
		Set<String> store = new HashSet<>();
		for(String name:names) {
			if(store.add(name)== false) {
				System.out.println("Duplicate element is: " +name);
			}
		}
		
		//Using HashMap O(2n) //complex code
		
		
		
		
		
	}

}
