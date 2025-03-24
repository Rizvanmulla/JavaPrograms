package Module3Strings;

import java.util.Scanner;

public class Assign36specificdigit {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size of Your Array");
		int Size = s1.nextInt();
		int array[] = new int[Size];
		for (int i = 0; i < Size; i++) {
			System.out.println("Enter the value at index position " + i + " of Your Array");
			array[i] = s1.nextInt();
		}
		s1.close();
		int numbertocheck = 24;
		for (int i = 0; i < array.length; i++) 
			{
			if (numbertocheck == array[i]) {
				System.out.println("The numbers is present in the array at index position " + i);
			} else {
				System.out.println("The numbers is not present in the array at index position "+i);
			}
		}
	}
}
