package Module3Strings;

import java.util.Scanner;

public class Assign34specialchars {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your email id");
		String str = s1.nextLine();
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)
					&& !Character.isLetter(ch))
				count++;
		}

		System.out.println("The Count of special characters is " + count);
		s1.close();
	}

}
