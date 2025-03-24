package collection; // Package declaration
import java.util.Stack;
public class Assign46Stackproperties {
	public static void main(String[] args) {
		// ********** Creating a Stack **********
		Stack<Integer> stack = new Stack<>(); // Creating a Stack of Integer type

		// ********** Pushing Elements onto the Stack **********
		stack.push(10); // Pushes 10 onto the stack
		stack.push(20); // Pushes 20 onto the stack
		stack.push(30); // Pushes 30 onto the stack
		stack.push(40); // Pushes 40 onto the stack
		stack.push(50); // Pushes 50 onto the stack

		// Displaying the stack elements
		System.out.println("Stack after pushing elements: " + stack);

		// ********** Peeking the Top Element of the Stack **********
		System.out.println("Top element (peek): " + stack.peek()); // Retrieves the top element without removing it

		// ********** Popping Elements from the Stack **********
		System.out.println("Popped element: " + stack.pop()); // Removes and returns the top element (50)
		System.out.println("Stack after pop operation: " + stack);

		// ********** Peeking After Popping **********
		System.out.println("Top element after pop (peek): " + stack.peek()); // Retrieves the new top element (40)

		// ********** Checking if the Stack is Empty **********
		System.out.println("Is the stack empty? " + stack.isEmpty());

		// ********** Checking the Size of the Stack **********
		System.out.println("Current size of the stack: " + stack.size());
	}
}
