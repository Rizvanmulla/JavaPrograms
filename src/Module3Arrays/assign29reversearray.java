package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to create an array of size 4 which belongs to int type and 
//copy its values into a new array in reverse order
public class assign29reversearray {
	public static void main(String[] args) {
		int arr1[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the Value of Array1 at Index position " + i);
			arr1[i] = s1.nextInt();
		}
		System.out.println("The Given Array 1 is " + Arrays.toString(arr1));
		s1.close();
		// now lets copy the Array to another Array in reverse order
		int arr2[] = new int[arr1.length];
		for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
			arr2[j] = arr1[i];
		}
		System.out.println("The Copied Array 1 in reverse order is " + Arrays.toString(arr2));
	}

}
