package collection; // Package declaration

import java.util.Vector;

public class Assign45Vectorclass {
	public static void main(String[] args) {
		// ********** Creating a Vector **********
		Vector<Integer> numbers = new Vector<>(); // Creating a Vector of Integer type

		// ********** Adding Elements using addElement() **********
		numbers.addElement(10);
		numbers.addElement(20);
		numbers.addElement(30);
		numbers.addElement(40);
		numbers.addElement(50);

		// Displaying the vector elements
		System.out.println("Vector Elements: " + numbers);

		// ********** Checking the First and Last Element **********
		System.out.println("First Element: " + numbers.firstElement()); // Retrieves first element
		System.out.println("Last Element: " + numbers.lastElement()); // Retrieves last element

		// ********** Removing an Element using removeElement() **********
		numbers.removeElement(30); // Removes the first occurrence of 30
		System.out.println("Vector after removing element 30: " + numbers);

		// ********** Removing an Element at a Specific Index using removeElementAt()
		// **********
		numbers.removeElementAt(2); // Removes element at index 2
		System.out.println("Vector after removing element at index 2: " + numbers);

		// ********** Checking the Capacity of Vector **********
		System.out.println("Current Capacity of Vector: " + numbers.capacity());

		// ********** Removing All Elements using removeAllElements() **********
		numbers.removeAllElements(); // Clears all elements from the vector
		System.out.println("Vector after removing all elements: " + numbers);

		// ********** Checking if Vector is Empty **********
		System.out.println("Is the Vector empty? " + numbers.isEmpty());
	}
}
