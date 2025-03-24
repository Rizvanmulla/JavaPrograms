package StringProblems;

import java.util.Scanner;

public class NonRepeatingCharacter {
	public static char ffnrc(String str) {
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (str.indexOf(current) == str.lastIndexOf(current)) {
				return current;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String");
		String name = s1.nextLine();
		s1.close();
		char result = ffnrc(name);
		if (result != 0) {
			System.out.println("The first non repeating character is " + result);
		} else {
			System.out.println("There is no non repeating Character in the String");
		}
	}
}