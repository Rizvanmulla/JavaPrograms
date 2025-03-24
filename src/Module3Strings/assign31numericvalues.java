package Module3Strings;

import java.util.Scanner;

public class assign31numericvalues {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = s1.nextLine();
		System.out.println("Your String is " + str);
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Number of numeric values in the string: " + count);
		s1.close();
	}
}