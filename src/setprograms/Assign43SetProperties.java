package setprograms;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assign43SetProperties {
    public static void main(String[] args) {
        // ********** HashSet Demonstration **********
        Set<String> hashSet = new HashSet<>(); // Creating a HashSet
        hashSet.add("Apple");   // Adding elements to HashSet
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Banana");  // Duplicate element (ignored)
        hashSet.add("Grapes");

        // HashSet does NOT maintain insertion order and does NOT allow duplicates
        System.out.println("HashSet (Unordered, No Duplicates): " + hashSet);

        // ********** LinkedHashSet Demonstration **********
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Creating a LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); // Duplicate element (ignored)
        linkedHashSet.add("Grapes");

        // LinkedHashSet maintains insertion order and does NOT allow duplicates
        System.out.println("LinkedHashSet (Insertion Order Maintained, No Duplicates): " + linkedHashSet);

        // ********** TreeSet Demonstration **********
        Set<String> treeSet = new TreeSet<>(); // Creating a TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana"); // Duplicate element (ignored)
        treeSet.add("Grapes");

        // TreeSet maintains elements in sorted (ascending) order and does NOT allow duplicates
        System.out.println("TreeSet (Sorted Order, No Duplicates): " + treeSet);

        // ********** Set Methods Demonstration **********
        // Checking if an element exists in HashSet
        System.out.println("HashSet contains 'Apple'? " + hashSet.contains("Apple"));

        // Removing an element from HashSet
        hashSet.remove("Mango");
        System.out.println("HashSet after removing 'Mango': " + hashSet);

        // Getting the size of HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clearing all elements from HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing all elements: " + hashSet);

        // Checking if HashSet is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
    }
}
