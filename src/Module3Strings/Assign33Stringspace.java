package Module3Strings;

import java.util.Scanner;

public class Assign33Stringspace {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your name");
		String str = s1.nextLine();
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isWhitespace(ch))
				count++;
		}
		System.out.println("The number of times space used in the name is " + count);
		s1.close();
	}
}
