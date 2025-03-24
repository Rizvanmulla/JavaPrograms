package Module3Strings;

import java.util.Scanner;

public class Assign32Stringalphas {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = s1.nextLine();
		System.out.println("Your String is " + str);
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				count++;
			}
		}
		System.out.println("Number of Alphabet values in the string: " + count);
		s1.close();
	}
}