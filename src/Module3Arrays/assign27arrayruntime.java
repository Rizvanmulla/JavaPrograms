package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class assign27arrayruntime {

	public static void main(String[] args) {
		int[] arr = new int[4];
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter index Value " + i + " Digit");
			arr[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		s1.close();
	}

}
