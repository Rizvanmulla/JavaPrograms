package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minimizedassign29 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int arr1[] = new int[4], arr2[] = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr1[i] = s1.nextInt();
        }
        s1.close();

        for (int i = 0; i < 4; i++)
            arr2[i] = arr1[3 - i]; // Directly accessing the reversed index

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Reversed Array: " + Arrays.toString(arr2));
    }
}
