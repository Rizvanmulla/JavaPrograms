package Module3Arrays;

import java.util.Arrays;

public class arrayAnagram {
	/*
	 * for checking its anagram or not we have to sort,sort it alphabetically as
	 * after sorting the code can check whether they are anagram or not, not
	 * available in string function sorting is available in char array function
	 */
	public static void main(String[] args) {
		String input1 = "earth";
		String input2 = "heart";

		if (input1.length() != input2.length()) {
			System.out.println("NO ANAGRAM as length is different of given strings");
		} else {
			System.out.println("lets find out they are ANAGRAM or not");
			char c1[] = input1.toCharArray();// [e,a,r,t,h] we converted the input 1 and 2 into characters and stored in
												// variables
			char c2[] = input2.toCharArray();// [h,e,a,r,t,h]
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting> " + Arrays.toString(c1));// here we printed the char array c1 using to
																		// string
			System.out.println("After sorting> " + Arrays.toString(c2));// arrays.tostring write it alphabetically
//now we will check whether they equal or not using if condition and array equals
			if (Arrays.equals(c1, c2) == true) {
				System.out.println("given inputs are ANAGRAM");
			} else {
				System.out.println("given inputs are not ANAGRAM");
			}
		}
	}
}
