package chiruproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsandGenerics {
	
//If the array size is unknown/variable we have to go for "Collections"
//The Collection is an Interface; Collections is a Class
//collection is a concept with the type "object" that means it can take int, float, String, etc.
//syntax for default collection: 
//	Collection values = new ArrayList(); --> with type as an object
//syntax with specific type: 
// 	Collection<Integer> values = new ArrayList<Integer>(); or new ArrayList<>(); --> with type as an Integer(Wrapper class)
//now this <Integer> is called a Generic
//or <Float>, <Double> is called Generics.
//	 
//Collection do not work with Index number(eg array index) so we need to use "List" or "Set" to work with index numbers
//but here List can have duplicate values/numbers/elements but Set doesn't have duplicates it has Unique values/numbers/elements
//Syntax for "List" is List<Integer> numbers = new ArrayList<>(); -> for duplicate elements
//Set<Integer> numbers = new HashSet<>(); -> for Unique elements i.e it cannot store duplicate items
//or
//Set<Integer> numbers = new TreeSet<>();
//	  
//we also have a "Map"
//syntax is: Map<k, v> m = new HashMap<>();
//example: Map<Intger, String> m = new HashMap<>();  //here Integer is key and String is Value  
//or Map<Intger, String> m = new HashTable<>();
//	
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>(); 
		//List is popular because it contains many methods which we requires most often
		values.add(5);
		//values.add("Chiru");
		//values.add(5.3);
		values.add(8);
		values.add(98);
		values.add(36);
		
		Collections.sort(values);
		
		values.add(1,9); // adding element in desired index
		values.forEach(System.out::println);  //Stream API  ..lambda Expression
		
		/*
		for(int i:values) {
			System.out.println(i);
		}
		*/
	}
}
