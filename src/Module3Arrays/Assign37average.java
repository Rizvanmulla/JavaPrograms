package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check the average of the given numbers which are present in your array Average=(2+4+6+8)/4
public class Assign37average {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The size of your array");
		int size = s1.nextInt();
		int arr1[] = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the Value of your array at index position " + i);
			arr1[i] = s1.nextInt();
		}
		s1.close();
		System.out.println("Your array is " + (Arrays.toString(arr1)));
		System.out.println("Now lets calculate the avaerage of your Array Elements");
		double sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println("the sum of your array elements is " + sum);
		double average = sum / size;
		System.out.println("the Average of your array elements is " + average);
	}

}
