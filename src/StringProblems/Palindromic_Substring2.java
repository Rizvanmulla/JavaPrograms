package StringProblems;

//Find the Longest Palindromic Substring	
//A palindrome reads the same forward and backward.
//Given a string, return the longest palindromic substring. 
//Example: "babad" → "bab" or "aba"
import java.util.Scanner;

public class Palindromic_Substring2 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = s1.nextLine();
		System.out.println("Your String is "+str);
	    s1.close();
		String lp = flp(str);
		System.out.println("Longest Palindrome substring is "+lp);
	}
	public static String flp(String str)
	{
		if (str == null || str.length() < 2)
			return str;
		 String longest = "";
	        for (int i = 0; i < str.length(); i++) {
	            // Check for odd-length palindrome
	            String oddPalindrome = expandAroundCenter(str, i, i);
	            // Check for even-length palindrom
	            String evenPalindrome=expandAroundCenter(str,i,i+1);
	            // Update longest palindrome
	            if (oddPalindrome.length() > longest.length()) longest = oddPalindrome;
	            if (evenPalindrome.length() > longest.length()) longest = evenPalindrome;
	        }
	        return longest;
	    }

	    private static String expandAroundCenter(String str, int left, int right) {
	        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	            left--;
	            right++;
	        }
	        return str.substring(left + 1, right); // Extract palindrome
	    }
}
