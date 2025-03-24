package Module3Strings;

import java.util.Scanner;

public class assign25revpalin {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a word to check if its palindrome or not");
		String word = s1.next();
		System.out.println("You have entered " + word + " Now Lets check its palindrom or not");
		String reversed = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			reversed = reversed + c;

		}
		System.out.println("Reversed word is " + reversed);
		if (word.equals(reversed)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is Not Palindrome");
		}
		s1.close();
	}

}
