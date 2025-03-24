package ListProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Assign42listproperites {
    public static void main(String[] args) {
        // ************ Demonstrating List Properties with Heterogeneous Data ************
        List<Object> li = new ArrayList<>(); // Upcasting: Using List reference for ArrayList object
        li.add("Rijwan");   // Adding String
        li.add(37);         // Adding Integer
        li.add(5.4);        // Adding Double
        li.add('M');        // Adding Character
        li.add("Program");  // Adding another String
        li.add(true);       // Adding Boolean
        li.add(null);       // Adding null value

        // 1. Lists allow heterogeneous data (mix of different data types)
        System.out.println("Heterogeneous List: " + li);

        // 2. Iterator (Forward Iteration - Only Forward Movement)
        System.out.println("\nForward Iteration using Iterator:");
        Iterator<Object> i1 = li.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        // Iterator only allows forward iteration; it does not support backward traversal.

        // ************ Demonstrating List Properties with Homogeneous Data (Sorting, Iteration) ************
        List<Integer> numbers = new ArrayList<>(); // Homogeneous list (only Integers)
        numbers.add(9);
        numbers.add(103);
        numbers.add(130);
        numbers.add(14);
        numbers.add(150);

        System.out.println("Original List (Homogeneous Data): " + numbers);

        // 3. Sorting a List (Only possible for homogeneous data)
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // 4. ListIterator (Supports both Forward & Backward Iteration)
        ListIterator<Integer> listIterator = numbers.listIterator();

        System.out.println("Forward Iteration using ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Iteration using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // ************ Additional Properties of List ************

        // 5. Random Access - Lists allow direct access using index
        System.out.println("Element at index 2: " + numbers.get(2));

        // 6. Modifying Elements - Lists allow updating elements
        numbers.set(2, 200);
        System.out.println("List after modification: " + numbers);

        // 7. Removing Elements - Elements can be removed using index or value
        numbers.remove(3); // Removes element at index 3
        System.out.println("List after removing index 3: " + numbers);

        numbers.remove(Integer.valueOf(9)); // Removes the element with value 9
        System.out.println("List after removing value 9: " + numbers);

        // 8. Checking if an element exists
        System.out.println("List contains 103? " + numbers.contains(103));

        // 9. Size of the list (number of elements)
        System.out.println("Size of List: " + numbers.size());

        // 10. Clearing all elements from the list
        numbers.clear();
        System.out.println("List after clearing all elements: " + numbers);

        // 11. Checking if the list is empty
        System.out.println("Is the list empty? " + numbers.isEmpty());
    }
}
