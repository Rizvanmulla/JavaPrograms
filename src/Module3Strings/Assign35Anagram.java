package Module3Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assign35Anagram {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter First String");
		String first = s1.nextLine();
		System.out.println("Enter Second String");
		String second = s1.nextLine();
		s1.close();
		if (first.length() != second.length()) {
			System.out.println("The Given Strings cant be ANAGRAM as length does not match");
		} else {
			first=first.toLowerCase();
			second=second.toLowerCase();
			char[] ch1 = first.toCharArray();
			char[] ch2 = second.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("Strings are ANAGRAM");
			} else {
				System.out.println("Strings are not ANAGRAM");
			}
		}
	}
}
