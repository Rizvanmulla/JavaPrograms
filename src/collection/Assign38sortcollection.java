package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assign38sortcollection {
	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<Integer>();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of the elements in your collection");
		int n = s1.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + i + " Element");
			c1.add(s1.nextInt());
		}
		System.out.println("Your Collection is" + c1);
		s1.close();
		Collections.sort(c1);
		System.out.println("and the sorted Collection is" + c1);
	}

}
