package Module3Strings;

import java.util.Scanner;

public class assign25reversestring {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String");
		String word = s1.next();
		System.out.println("Your String is " + word);

		String revword = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			revword = revword + c;
		}
		System.out.println("Your String is Reversed as " + revword);
		s1.close();
	}

}
