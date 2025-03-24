package Module3Strings;
import java.util.Scanner;
public class reversepalindromstring {
public static void main(String[] args) {
	//Reveres a string
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a Word");
	String word=s1.next();
	System.out.println("Word was "+word);
	//System.out.println(word.length());
	String reversed="";
	for(int i=word.length()-1;i>=0;i--)
	{
		char c=word.charAt(i);
		reversed=reversed+c;
	}
	System.out.println("The Word after reversing is: "+reversed);
	
	  if (word.equalsIgnoreCase(reversed)) {
          System.out.println("Word is Palindrome");
      } else {
          System.out.println("Word is not Palindrome");
      }
	  s1.close();
  }
}