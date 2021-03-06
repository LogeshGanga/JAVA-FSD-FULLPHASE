package com.Mphasis;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		// map

		// Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Harry");
		hm.put(2, "Thomas");
		hm.put(3, "Ruby");
		System.out.println("\nThe elements of Hashmap are ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(4, "Williams");
		ht.put(5, "Jack");
		ht.put(6, "Jones");
		ht.put(7, "Rick");

		System.out.println("\nThe elements of HashTable are ");
		for (Map.Entry n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Lipa");
		map.put(9, "Carol");
		map.put(10, "Lucy");

		System.out.println("\nThe elements of TreeMap are ");
		for (Map.Entry l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}
}