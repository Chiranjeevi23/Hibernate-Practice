package chiruproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrListDuplicates {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Chiranjeevi");
		names.add("Zeus");
		names.add("Kratos");
		names.add("Poseidon");
		names.add("Kratos");
		names.add("Poseidon");
		
		//print duplicate elements
		Set<String> s = new HashSet<>();
		
		for (String name:names) {
			
			if(s.add(name)==false) 
			System.out.println(name);
			}
		
	}

}
