package Map;
import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// map

		// Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "shruti");
		hm.put(2, "teju");
		hm.put(3, "amrutha");

		System.out.println("\nThe elements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(4, "lokesh");
		ht.put(5, "subu");
		ht.put(6, "bala");
		ht.put(7, "mathew");

		System.out.println("\nThe elements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "kumar");
		map.put(9, "rajesh");
		map.put(10, "nithish");

		System.out.println("\nThe elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}
}