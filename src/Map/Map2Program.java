package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map2Program {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Sugar", 100);
		m1.put("Wheat", 50);
		m1.put("Tea", 52);
		System.out.println("the Map is " + m1);

		System.out.println("Fetching all Keys");// using keyset method
		for (String s1 : m1.keySet()) {
			System.out.println(s1);
		}

		System.out.println("Fetching all Values");// using values method
		for (Integer i1 : m1.values()) {
			System.out.println(i1);
		}
		System.out.println("Fetching all Values in pair");// using entryset method
		for (Entry<String, Integer> e1 : m1.entrySet()) {
			System.out.println(e1);
		}
		System.out.println("Fetching all Values in pair using Iterator");// using entryset method
		Set<Entry<String, Integer>> s1 = m1.entrySet();
		Iterator<Entry<String, Integer>> i = s1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}