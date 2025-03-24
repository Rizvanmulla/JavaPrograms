package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Assign44Map {
	public static void main(String[] args) {
		// ********** 1. Name and Bodyweight (Using HashMap) **********
		Map<String, Double> nameWeightMap = new HashMap<>(); // Creating a HashMap
		nameWeightMap.put("Rijwan", 95.5);
		nameWeightMap.put("Najnin", 85.0);
		nameWeightMap.put("Aafia", 35.2);
		nameWeightMap.put("Ozair", 20.7);

		// HashMap does not maintain order
		System.out.println("Name and Bodyweight (HashMap - Unordered): " + nameWeightMap);

		// ********** 2. BankName and Bank Account ID (Using LinkedHashMap) **********
		Map<String, String> bankAccountMap = new LinkedHashMap<>(); // Creating a LinkedHashMap
		bankAccountMap.put("HDFC Bank", "ACC123456");
		bankAccountMap.put("SBI Bank", "ACC987654");
		bankAccountMap.put("ICICI Bank", "ACC654321");
		bankAccountMap.put("Axis Bank", "ACC789012");

		// LinkedHashMap maintains insertion order
		System.out.println("BankName and Bank Account ID (LinkedHashMap - Ordered): " + bankAccountMap);

		// ********** 3. Firstname and Lastname (Using TreeMap) **********
		Map<String, String> firstLastNameMap = new TreeMap<>(); // Creating a TreeMap
		firstLastNameMap.put("Rijwan", "Mulla");
		firstLastNameMap.put("Najnin", "Mulla");
		firstLastNameMap.put("Aafia", "Mulla");
		firstLastNameMap.put("Ozair", "Mulla");

		// TreeMap sorts the keys in ascending order
		System.out.println("Firstname and Lastname (TreeMap - Sorted by Firstname): " + firstLastNameMap);

		// ********** 4. Household Items and Quantities (Using HashMap) **********
		Map<String, Integer> householdItems = new HashMap<>(); // Creating a HashMap
		householdItems.put("Rice", 5);
		householdItems.put("Sugar", 2);
		householdItems.put("Milk Packets", 10);
		householdItems.put("Detergent", 3);

		// HashMap stores household items and their quantities (unordered)
		System.out.println("Household Items and Quantities (HashMap - Unordered): " + householdItems);

		// ********** Demonstrating Map Methods **********
		// Retrieving a value using key
		System.out.println("Weight of Ozair: " + nameWeightMap.get("Ozair"));

		// Checking if a key exists
		System.out.println("Does SBI Bank exist? " + bankAccountMap.containsKey("SBI Bank"));

		// Checking if a value exists
		System.out.println("Is ACC123456 present? " + bankAccountMap.containsValue("ACC123456"));

		// Removing an entry
		householdItems.remove("Detergent");
		System.out.println("Household Items after removing Detergent: " + householdItems);

		// Iterating over a Map using a for-each loop
		System.out.println("Iterating over Firstname and Lastname (TreeMap):");
		for (Map.Entry<String, String> entry : firstLastNameMap.entrySet()) {
			System.out.println("Firstname: " + entry.getKey() + ", Lastname: " + entry.getValue());
		}

		// Getting the size of a map
		System.out.println("Number of Household Items: " + householdItems.size());

		// Clearing all elements from a map
		nameWeightMap.clear();
		System.out.println("Is Name and Bodyweight map empty? " + nameWeightMap.isEmpty());
	}
}
