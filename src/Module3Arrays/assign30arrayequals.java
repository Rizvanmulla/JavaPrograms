package Module3Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class assign30arrayequals {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of your first array");
		int[] array1 = new int[s1.nextInt()];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter the element of your first Array at index position " + i);
			array1[i] = s1.nextInt();
		}
		System.out.println("Enter the size of your Second array");
		int[] array2 = new int[s1.nextInt()];

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Enter the element of your second Array at index position " + i);
			array2[i] = s1.nextInt();
		}

		System.out.println("Your Array1 is " + Arrays.toString(array1));
		System.out.println("Your Array2 is " + Arrays.toString(array2));
		if (Arrays.equals(array1, array2) == true) {
			System.out.println("Both the Arrays are Equal");
		} else {
			System.out.println("Arryas are not Equal");
		}

		s1.close();
	}

}
