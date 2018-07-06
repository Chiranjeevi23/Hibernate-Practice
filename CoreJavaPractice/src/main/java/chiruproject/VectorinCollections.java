package chiruproject;

import java.util.ArrayList;

//Vectotr -> it is a Dynamic Array
public class VectorinCollections {
	public static void main(String[] args) {

		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(5);
		v.add(2);
		v.add(8);
		v.add(5);
		v.add(21);
		// 50% increase in capacity helps in memory saving
		// ArrayList are not ThreadSafe
		// ArrayLists are fast
		// Prefer ArrayList over Vectors

		/*
		 * Vector<Integer> v = new Vector<Integer>(); // 100% increase in capacity its
		 * wasting the memory // Vectors are theoretically ThreadSafe but not
		 * practically because every method is synchronized in vector collection //
		 * Vectors are slow v.add(5); v.add(2); v.add(8); v.add(5); v.add(21); v.add(2);
		 * v.add(8); v.add(3); v.remove(0); //it takes index number here 5 will be
		 * removes as it is present at 0index
		 */
		System.out.println(v);

		for (int i : v) {
			System.out.println(i);
		}

		/*
		 * System.out.println(v.capacity()); default capacity of "vector" i.e index is
		 * 10 if we exceed 10 then it will automatically have 20 as index and so on i.e
		 * it increases the index by 100% which is simply wasting the memory... ..so we
		 * need to use "ArrayList"
		 * 
		 * in ArrayList it will increase the index size by 50% which is somewhat better
		 * because its not wasting that much memory.
		 */
	}

}
