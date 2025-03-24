package StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class nonrepeatingcharusingmap {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String");
		String name = s1.nextLine();
		s1.close();

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (m1.containsKey(c)) {
				m1.put(c, m1.get(c) + 1);
			} else {
				m1.put(c, 1);
			}
		}
		System.out.println("Your Map is "+m1);
		for (Entry<Character, Integer> entryset	:	m1.entrySet())
		{
			if (entryset.getValue() == 1) {
				System.out.println("First Non repeating Character is "+entryset.getKey());
				break;
			}
		}
	}
}
