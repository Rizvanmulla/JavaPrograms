package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class assign28copyarray {

	public static void main(String[] args) {
		int arr1[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the array");
			arr1[i] = s1.nextInt();
		}
		System.out.println("The given Arrays is " + Arrays.toString(arr1));
		int arr2[] = new int[arr1.length];

		for (int j = 0; j < arr1.length; j++) {
			arr2[j] = arr1[j];
		}
		System.out.println("The copied Array is " + Arrays.toString(arr2));
		s1.close();
	}

}
