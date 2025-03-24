package String_buffer_builder;

public class Assign41StringBuilder {

	 public static void main(String[] args) {
	        // Create a StringBuilder object
	        StringBuilder sb = new StringBuilder("Hello");

	        // 1. append() - Add text at the end
	        sb.append(" World");
	        System.out.println("After append: " + sb);

	        // 2. insert() - Insert text at a specific index
	        sb.insert(5, " Java");
	        System.out.println("After insert: " + sb);

	        // 3. replace() - Replace a portion of the string
	        sb.replace(6, 10, "Program");
	        System.out.println("After replace: " + sb);

	        // 4. delete() - Remove part of the string
	        sb.delete(6, 13);
	        System.out.println("After delete: " + sb);

	        // 5. reverse() - Reverse the string
	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        // Restore original order by reversing again
	        sb.reverse();

	        // 6. capacity() - Check the current capacity
	        System.out.println("Current capacity: " + sb.capacity());

	        // 7. charAt() - Get character at a specific index
	        System.out.println("Character at index 4: " + sb.charAt(4));

	        // 8. length() - Get the length of the string
	        System.out.println("Length of string: " + sb.length());

	        // 9. substring(int start) - Get substring from start index to end
	        System.out.println("Substring from index 6: " + sb.substring(6));

	        // 10. substring(int start, int end) - Get substring within range
	        System.out.println("Substring from index 0 to 5: " + sb.substring(0, 5));
	    }
	}